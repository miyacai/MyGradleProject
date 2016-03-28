<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h1>this is Title1</h1>
	<p>this is body</p>
	<p id="demo">this is demo</p>
	<button onclick="myFunction()">click it</button>
	<button onclick="fu2()">click it2</button>

	<table>
		<tr>
			<td>name</td>
			<td>age</td>
			<td>sex</td>
		</tr>
		<tr>
			<td>miya</td>
			<td>16</td>
			<td>nv</td>
		</tr>
		<tr>
			<td>cai</td>
			<td>18</td>
			<td>nan</td>
		</tr>
	</table>
	<script type="text/javascript">
		function myFunction() {
			document.write(new Date());
		}
		function fu2() {
			document.getElementById("demo").innerHTML = "has changed";
		}
	</script>
</body>
</html>