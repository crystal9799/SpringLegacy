<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
	<body>
		<form action="${pageContext.request.contextPath}/Emp/getEmp.htm">
		    <div class="col-auto">
		        <label class="sr-only" for="inlineFormInput">이름 검색</label>
		        <input type="text" class="form-control mb-2" id="inlineFormInput" name="search">
		        <input type="submit" class="btn btn-primary mb-2" value="검색">
		    </div>
		</form>

		<table class="table table-borderless">
		  <thead>
		    <tr>
		      <th scope="col">EMPNO</th>
		      <th scope="col">ENAME</th>
		      <th scope="col">JOB</th>
		      <th scope="col">MGR</th>
		      <th scope="col">HIREDATE</th>
		      <th scope="col">SAL</th>
		      <th scope="col">COMM</th>
		      <th scope="col">DEPTNO</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach var="emp" items="${list}">
		  		<tr>
		  			<td class="empno"><a href="editEmp.htm?empno=${emp.empno}">${emp.empno}</a></td>
		  			<td class="ename">${emp.ename}</td>
		  			<td class="job">${emp.job}</td>
		  			<td class="mgr">${emp.mgr}</td>
		  			<td class="hiredate">${emp.hiredate}</td>
		  			<td class="sal">${emp.sal}</td>
		  			<td class="comm">${emp.comm}</td>
		  			<td class="deptno">${emp.deptno}</td>
		  		</tr>
		  	</c:forEach>
		  </tbody>
		</table>
		<a href="insertEmp.htm" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Emp 추가</a>

	</body>
</html>
