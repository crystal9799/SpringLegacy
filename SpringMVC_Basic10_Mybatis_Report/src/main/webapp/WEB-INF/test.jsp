<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-pzjw8f+ua4z9p5j3k3/x6dHNJOv+LwKbeX+o2PRhTXaCyb+Q/l70tkGupa/nW1b1" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        <h2>Edit Employee</h2>
        <form action="updateEmp" method="post">
            <input type="hidden" name="empno" value="${emp.empno}" />
            <div class="form-group">
                <label for="ename">Name</label>
                <input type="text" class="form-control" id="ename" name="ename" value="${emp.ename}" required>
            </div>
            <div class="form-group">
                <label for="job">Job</label>
                <input type="text" class="form-control" id="job" name="job" value="${emp.job}" required>
            </div>
            <div class="form-group">
                <label for="mgr">Manager</label>
                <input type="number" class="form-control" id="mgr" name="mgr" value="${emp.mgr}" required>
            </div>
            <div class="form-group">
                <label for="hiredate">Hire Date</label>
                <input type="date" class="form-control" id="hiredate" name="hiredate" value="${emp.hiredate}" required>
            </div>
            <div class="form-group">
                <label for="sal">Salary</label>
                <input type="number" class="form-control" id="sal" name="sal" value="${emp.sal}" required>
            </div>
            <div class="form-group">
                <label for="comm">Commission</label>
                <input type="number" class="form-control" id="comm" name="comm" value="${emp.comm}" required>
            </div>
            <div class="form-group">
                <label for="deptno">Department Number</label>
                <input type="number" class="form-control" id="deptno" name="deptno" value="${emp.deptno}" required>
            </div>
            <button type="submit" class="btn btn-primary">Update</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.min.js"
        integrity="sha384-pzjw8f+ua4z9p5j3k3/x6dHNJOv+LwKbeX+o2PRhTXaCyb+Q/l70tkGupa/nW1b1"
        crossorigin="anonymous"></script>
</body>
</html>
