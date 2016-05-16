function toClick() {
			$.ajax({
				url : "http://localhost:9090/myProject/api/v1/print/mybatis"
			}).done(function(data) {
				var text = "<tr><th>name</th><th>age</th><th>sex</th><tr>";
				for(var i=0;i<data.length;i++){
					text = text + "<tr><td>" + data[i].name + "</td>"+"<td>" + data[i].age + "</td>" + "<td>" + data[i].sex + "</td><tr>";
				}
				$("#table").html(text);
			});
		}