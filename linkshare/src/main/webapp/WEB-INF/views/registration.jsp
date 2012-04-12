<%@include file="taglib.jsp"%>
<html>
<head>
	<style>
		label, input { display:block; }
	</style>
	<script>
	$(function() {
		$( "#dob" ).datepicker({dateFormat: 'dd/mm/yy'});
		$( "input:submit" ).button();
	});
	</script>
</head>
<body>
	<div style="width:400px; margin-right:auto; margin-left:auto; border:1px solid #000;">
	
	<form:form action="registration.htm" commandName="user" method="post">
		<table>
			<tbody>							
				<tr>
					<td width="100" align="right">UserName* </td>
					<td><form:input path="userName"></form:input>
					<form:errors cssStyle="color:red" path="userName"/></td>
				</tr>
				<tr>
					<td width="100" align="right">Password* </td>
					<td><form:password path="password"></form:password>
					<form:errors cssStyle="color:red" path="password"/></td>
				</tr>
				<tr>
					<td width="100" align="right">FirstName </td>
					<td><form:input path="firstName"></form:input>
					<form:errors cssStyle="color:red" path="firstName"/></td>
				</tr>
				<tr>
					<td width="100" align="right">LastName</td>
					<td><form:input path="lastName"></form:input>
					<form:errors cssStyle="color:red" path="lastName"/></td>
				</tr>
				<tr>
					<td width="100" align="right">Email </td>
					<td><form:input path="email"></form:input>
					<form:errors cssStyle="color:red" path="email"/></td>
				</tr>						
				<tr>
					<td width="100" align="right">DOB(dd/MM/yyyy) </td>
					<td><input type="text" id="dob" name="dob">
					<form:errors cssStyle="color:red" path="dob"/></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td  width="100" align="right">
						<input name="" value="Register" type="submit">						
					</td>
				</tr>
				<tr>
					<td colspan="2">
					<form:errors cssStyle="color:red" />
					</td>
				</tr>
			</tbody>
		</table>
	</form:form>
	</div>	
</body>
</html>
