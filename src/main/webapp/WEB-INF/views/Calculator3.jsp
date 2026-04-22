<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Calculator</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
	<div class="container">
		<center>
			<h1>Calculator</h1>
			<form action="calculate" method="post">
				<label for="operation">Operation:</label>
				<select name="operation"><br><br>
					<option value="addition">Addition</option>
					<option value="subtraction">Subtraction</option>
					<option value="multiplication">Multiplication</option>
					<option value="division">Division</option>
				</select>
				<br><br>
				<label for="num1">Number1:</label>
				<input type="number" name="num1">
				<br><br>
				<label for="num2">Number2:</label>
				<input type="number" name="num2">
				<br><br>
				<input type="submit" value="Calculate">
			</form>
		</center>
	</div>
</body>
</html>