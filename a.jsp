<html>
<head>
<title>Hello World</title>
<link rel="stylesheet" type="text/css" href="a.css">

<script src="http://code.jquery.com/jquery-1.12.0.min.js"></script>

</head>

<body>
	<script>
		function toClick() {
			$.ajax({
				url : "http://localhost:8080/myProject/api/v1/print/mybatis"
			}).done(function(data) {
				$("#name").html("<div>" + data[0].name + "</div>");
				$("#age").html("<div>" + data[0].age + "</div>");
				$("#sex").html("<div>" + data[0].sex + "</div>");
			});
		}
	</script>

	<p>Hello World!</p>
	<p>This paragraph is styled with CSS.</p>
	<button onclick="javascript:toClick()">Submit</button>
	<div id="body"></div>
	
	<table>
		<tr>
			<td>name</td>
			<td>age</td>
			<td>sex</td>
		</tr>
		<tr>
			<td id = "name"></td>
			<td id = "age"></td>
			<td id = "sex"></td>
		</tr>
	</table>

</body>
</html>