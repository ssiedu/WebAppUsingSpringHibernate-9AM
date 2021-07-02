<%@page isELIgnored="false" %>
<html>
<body>
	<h3>Product Details</h3>
	<hr>
	<table border="2">
		<tr>
			<td>Code</td>
			<td>${product.pcode}</td>
		<tr>
		<tr>
			<td>Name</td>
			<td>${product.pname}</td>
		<tr>
		<tr>
			<td>Price</td>
			<td>${product.price}</td>
		<tr>
		<tr>
			<td>Disc</td>
			<td>${product.discount}</td>
		<tr>
	</table>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>