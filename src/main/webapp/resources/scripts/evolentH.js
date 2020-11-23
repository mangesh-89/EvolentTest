function addEmployee(){
	$.ajax({
		url:"/EvolentH/add",
		data:{"firstName":$("#first_name").val(),"lastName":$("#last_name").val(),"phone_number":$("#phone_number").val(),"email":$("#email").val()},
		success:function(response){
			if(response>0){
				 loadEmployees();
			}else{
				alert('Error in adding record')
			}
		}
	})
	
	
}
function editscr(id){
	$("#empId").val(id);
	$("#addUserScreen").hide();
	$("#editUserScreen").show();
}
function editEmployee(){
	$.ajax({
		url:"/EvolentH/edit",
		data:{"id":$("#empId").val(),"firstName":$("#first_nameE").val(),"lastName":$("#last_nameE").val(),"phone_number":$("#phone_numberE").val(),"email":$("#emailE").val()},
		success:function(response){
			if(response>0){
				 loadEmployees();
			}else{
				alert('Error in adding record')
			}
		}
	})
	
	
}

function deleteEmployee(id){
	$.ajax({
		url:"/EvolentH/delete",
		data:{"id":id},
		success:function(response){
			if(response>0){
				 loadEmployees();
			}else{
				alert('Error in deleting record')
			}
		}
	})
}


function activateEmployee(id){
	$.ajax({
		url:"/EvolentH/activate",
		data:{"id":id},
		success:function(response){
			if(response>0){
				 loadEmployees();
			}else{
				alert('Error in activating record')
			}
		}
	})
}

function loadEmployees(){
	$.ajax({
		url:"/EvolentH/list",
		success:function(response){
			$("#empMaster > tbody").html("");
		
			$.each(response,function( key, value ) {
				var statusU='<a href=# onclick=activateEmployee('+value.id+')>Activate</a>';;
				 if(value.status==true){
					 statusU='<a href=# onclick=deleteEmployee('+value.id+')>Deactivate</a>';
				 }
				  $("#empMaster > tbody").append('<tr><td>'+value.firstName+'<td>'+value.lastName+'</td><td>'+value.email+'</td><td>'+value.phone_number+'</td><td>'+value.status+'</td><td><a href=# onclick=editscr('+value.id+') >edit</a> / '+statusU+'</td></tr>')
		}
			)
		}
	})
}