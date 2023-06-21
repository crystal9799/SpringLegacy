<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Edit Employee</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h2>Edit Employee</h2>
  <form action="" method="post">
    <div class="form-group">
      <label for="empno">Employee Number:</label>
      <span class="form-control">${emp.empno}</span>
    </div>
    <div class="form-group">
      <label for="ename">Employee Name:</label>
      <span class="form-control">${emp.ename}</span>
    </div>
    <div class="form-group">
      <label for="job">Job:</label>
      <input type="text" class="form-control" id="job" placeholder="Enter Job" name="job" value="${emp.job}" required>
    </div>
    <div class="form-group">
      <label for="mgr">Manager:</label>
      <input type="number" class="form-control" id="mgr" placeholder="Enter Manager ID" name="mgr" value="${emp.mgr}" required>
    </div>
    <div class="form-group">
      <label for="hiredate">Hire Date:</label>
      <span class="form-control">${emp.hiredate}</span>
    </div>
    <div class="form-group">
      <label for="sal">Salary:</label>
      <input type="number" class="form-control" id="sal" placeholder="Enter Salary" name="sal" value="${emp.sal}" required>
    </div>
    <div class="form-group">
      <label for="comm">Commission:</label>
      <input type="number" class="form-control" id="comm" placeholder="Enter Commission" name="comm" value="${emp.comm}" required>
    </div>
    <div class="form-group">
      <label for="deptno">Department Number:</label>
      <input type="number" class="form-control" id="deptno" placeholder="Enter Department Number" name="deptno" value="${emp.deptno}" required>
    </div>
    <input type="submit" value="수정완료" class="btn-save button">
  </form>
  	<a
		class="btn-cancel button"
		href="deleteEmp.htm?empno=${emp.empno}">삭제</a>
</div>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
