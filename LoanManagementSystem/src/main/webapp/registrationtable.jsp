<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.84.0">
    <title>registrationtable</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    

    <!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">
  </head>
  <body>
    
<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="#">Loan Management System</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
   <form action="/tableview" method="post">
  <button type="submit"  formaction="/caltableview" class="btn btn-dark" >Printed Loans</button>
  <button type="submit" formaction="/regtableview" class="btn btn-dark">Customer Details</button>
   <button type="submit" formaction="/aplytableview" class="btn btn-dark">Applicants Details</button>
   <button type="submit" formaction="/apptableview" class="btn btn-dark">Approved Loans</button>
  </form>
  <div class="navbar-nav">
    <div class="nav-item text-nowrap">
      <a class="nav-link px-3" href="login.jsp">Sign out</a>
    </div>
  </div>
</header>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="position-sticky pt-3">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/showdashboard">
              <span data-feather="home"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/calview">
              <span data-feather="file"></span>
            EMI Calculator
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="registration.jsp">
              <span data-feather="shopping-cart"></span>
             Customer Registration
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="applyloan.jsp">
              <span data-feather="users"></span>
             Apply for Loan
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="loanaproval.jsp">
              <span data-feather="users"></span>
             Loan Aproval
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="customerprofile.jsp">
              <span data-feather="bar-chart-2"></span>
              Customer Profile
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/payment">
              <span data-feather="bar-chart-2"></span>
              Payment
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="paymentstatus.jsp">
              <span data-feather="layers"></span>
              Payment Status
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="withdrawn.jsp">
              <span data-feather="layers"></span>
             Withdrawn
             <hr>
            </a>
          </li>
              <li class="nav-item">
            <a class="nav-link" href="/dataview">
              <span data-feather="layers"></span>
              Loan Information
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/CollectionsPayments">
              <span data-feather="layers"></span>
              All Collections
            </a>
          </li>
        </ul>
        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
         
        </h6>
        </ul>
      </div>
    </nav>

    <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
      <div class=" pt-3 pb-2 mb-3 border-bottom text-center">
        <h1 class="h2">Customer Details</h1>
        </div>
        
        <div>
	 <form action="/searchregitem" method="post">
     <button type="submit" class="btn btn-dark  w-10  p-3" >Search</button>
     <input type="text" class="w-15  p-3" id="serach" name="id" placeholder="enter customer id" >
     </form>
    </div>
    
     <div class="shadow-none p-3 mb-5 bg-light rounded">
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th scope="col">Customer Id</th>
                    <th scope="col">Full Name</th>
                    <th scope="col">NID Number</th>
                    <th scope="col">Email</th>
                    <th scope="col">Mobile</th>
                    <th scope="col">Address</th>
                    <th scope="col">Gender</th>
                    <th scope="col">Age</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="r" items="${rr}">
                  <tr>
                    <td>${r.id}</td>
                    <td>${r.name}</td>
                    <td>${r.nid}</td>
                    <td>${r.email}</td>
                    <td>${r.mobile}</td>
                    <td>${r.address}</td>
                    <td>${r.gender}</td>
                    <td>${r.age}</td>
                    <td><form action="/updatereg/${r.getId()}"><button type="submit" class="btn btn-success">Update</button></form></td>
                    <td><form action="/deletereg/${r.getId()}"><button type="submit" class="btn btn-danger">Delete</button></form></td>
                  </tr>
                  </c:forEach>
                  
                 
                </tbody>
              </table>
            </div>
        
        
        
        
      </div>
    </main>
  </div>
</div>
</body>
<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</html>
