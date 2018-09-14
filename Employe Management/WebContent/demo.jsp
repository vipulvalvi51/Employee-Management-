<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.pojo.org.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
       <% List<Degree> list=(ArrayList<Degree>)request.getAttribute("list"); %>
	<div class="container">
		<h2>Get Data from Database</h2>
		<form>
			Email<input type="text" name="" class="form-control"><br>
			Password<input type="text" name="" class="form-control"><br>
			Degree:<select class="form-control" onchange="myfun(this.value)">
				<option>----Select Degree-----</option>
				<%for(Degree degree:list)
				{
				%>
					<option value="<%=degree.getMid()%>"><%=degree.getDegree()%></option>
				<%
				}%>
	
			</select><br>
			Class:<select class="form-control" id="dataget">
			<option>----Select Class-----</option>
			</select><br>
				<button type="submit" class="btn btn-primary">submit</button>
		</form>
		</div>
		
		<script type="text/javascript">
			function myfun(datavalue){
				
				$.ajax({
					url:'GetData',
					type:'get',
					data:{ datapost : datavalue},
					success:function(result)
					{
						$("#dataget").empty();
						var obj=JSON.parse(result);
						$("#dataget").append("<option>----Select Class-----</option>");
						$.each(obj,function(){
							$("#dataget").append(
									$('<option/>',{
										value:this.id,
										html:this.classes
									}));
		

						});
						
					}
				});
			}
			
		</script>
		
</body>
</html>