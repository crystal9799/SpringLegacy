<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Insert Employee</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h2>Insert Employee</h2>
  <form action="" method="post">
    <div class="form-group">
      <label for="empno">Employee Number:</label>
      <input type="number" class="form-control" id="empno" name="empno" value="${emp.empno}" required>
    </div>
    <div class="form-group">
      <label for="ename">Employee Name:</label>
      <input type="text" class="form-control" id="ename" name="ename" value="${emp.ename}" required>
    </div>
    <div class="form-group">
      <label for="job">Job:</label>
      <input type="text" class="form-control" id="job" name="job" value="${emp.job}" required>
    </div>
    <div class="form-group">
      <label for="mgr">Manager:</label>
      <input type="number" class="form-control" id="mgr" name="mgr" value="${emp.mgr}" required>
    </div>
    <div class="form-group">
      <label for="hiredate">Hire Date:</label>
      <input type="date" class="form-control" id="hiredate" name="hiredate" value="${emp.hiredate}" required>
    </div>
    <div class="form-group">
      <label for="sal">Salary:</label>
      <input type="number" class="form-control" id="sal" name="sal" value="${emp.sal}" required>
    </div>
    <div class="form-group">
      <label for="comm">Commission:</label>
      <input type="number" class="form-control" id="comm" name="comm" value="${emp.comm}" required>
    </div>
    <div class="form-group">
      <label for="deptno">Department Number:</label>
      <input type="number" class="form-control" id="deptno" name="deptno" value="${emp.deptno}" required>
    </div>
    <input type="submit" value="등록" class="btn-save button">
  </form>
</div>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
