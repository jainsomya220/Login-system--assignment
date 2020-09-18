<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>

<title> Login Please</title>
</head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">  
<body>

            <!--  add a search box -->
            
            
               <c:if test="${param.success eq false}" >
                 <div class="alert alert-danger">Login Details incorrect</div>
               </c:if>
            
            <form:form action="welcome" modelAttribute="logindet" method="POST">
                 
                  <div class="form-group">
				    <label for="exampleInputEmail1">Email address</label>
				    <form:input path="email" type="email" class="form-control" id="exampleInputEmail1" name="email"  placeholder="Enter email" />
				    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1">Password</label>
				    <form:input path="password" type="password" class="form-control" id="exampleInputPassword1"  name="password" placeholder="Password" />
				  </div>
				     <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
    
 
    <br><br>
</body>

</html>