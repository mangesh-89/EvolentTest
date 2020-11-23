<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Home</title>
<script src="resources/scripts/jquery-3.5.1.slim.min.js"></script>

<script
	src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.min.js"></script>
<script src="resources/scripts/evolentH.js"></script>
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.min.css">
</head>
<script>
	$(document).ready(function() {
		$('#empMaster').DataTable();
		
$("#addUserbtn").click(function(){
	$("#addUserScreen").show();
	$("#editUserScreen").hide();
});


$(".cancelAdd").click(function(){
	$("#addUserScreen").hide();
	$("#editUserScreen").hide();
});


		loadEmployees();
	});
</script>
<body>
	<h2>Employee Master!</h2>
	<table id="empMaster" class="display" style="width: 100%">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Status</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table>
	<button id="addUserbtn" onclick="">Add new Employee</button>
	
	<div id="addUserScreen" style="display:none;">
	<br>
	Add User
  <p>First Name :  <input type="text" id="first_name"> &nbsp; &nbsp; |
  Last Name :  <input type="text" id="last_name" name=""><br>
  Phone :&nbsp; &nbsp;&nbsp; &nbsp;<input type="text" id="phone_number" name="phone_number"> &nbsp; &nbsp;|
  email: <input type="text" id="email" name="email"><br>
   <button id="addRecord" onclick="addEmployee()">Add User </button> &nbsp; &nbsp; <button class="cancelAdd" >cancel</button>
  </p>
</div>

<div id="editUserScreen" style="display:none;">
	Edit User
	<input type="hidden" id="empId">
  <p>First Name :  <input type="text" id="first_nameE"> &nbsp; &nbsp; |
  Last Name :  <input type="text" id="last_nameE" name="last_Name"><br>
  Phone :&nbsp; &nbsp;&nbsp; &nbsp;<input type="text" id="phone_numberE" name="phone_number"> &nbsp; &nbsp;|
  email: <input type="text" id="emailE" name="email"><br>
   <button id="edit" onclick="editEmployee()">Save </button> &nbsp; &nbsp; <button class="cancelAdd" >cancel</button>
  </p>
</div>

</body>
</html>
