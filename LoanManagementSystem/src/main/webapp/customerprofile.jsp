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
    <title>Dashboard</title>

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
  <button type="submit"  formaction="/caltableview"class="btn btn-dark" >Printed Loans</button>
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
        <h1 class="h2">Customer Profile</h1>
        </div>
        
         <div class="container">
         <form action="/searchcustome" method="post">
          <div class="row">
            <div class="col col-md-2">
              <button type="submit"  class="btn btn-dark">Search</button>
            </div>
            <div class="col col-md-3">
              <input type="text" class="form-control" id="id" name="customerid" placeholder="enter customer id"  >
            </div>
          </div>
          </form>
          </div>
          <hr>
        <div class="container">
  <div class="row">
    <div class="col col-md-1">
    
    </div>
    <div class="col col-md-6">
      <ul>
      <li><h4>Customer Name:</h4> ${name} </li>
      <li><h5>Customer Id:</h5> ${ci} </li>
      <li><h6>Loan Type:</h6> ${lty} </li>
      <li><h6>Account Status:</h6> ${st} </li>
      </ul>
    </div>
    <div class="col col-md-4">
     <img src="images/demo.jpg"  width="150" height="150">
    </div>
    <div class="col col-md-1">
     
    </div>
  </div>
  
  
    
    <div class="row  mt-5" >
    <div class="col col-md-1">
     
    </div>
    <div class="col col-md-6">
      <ul>
      <li><h6>Loan Amount:</h6> ${la} </li>
      <li><h6>Total Payable:</h6> ${tp} </li>
      <li><h6>Number of Installment:</h6> ${ni} </li>
      </ul>
    </div>
    <div class="col col-md-4">
    <ul>
      <li><h6>Paid Amount:</h6> ${col} </li>
      <li><h6>Remaining Payments:</h6> ${mr} </li>
      <li><h6>Next Payment Date:</h6> Between ${pay1} to ${pay2}   </li>
      </ul>
    </div>
    <div class="col col-md-1">
     
    </div>
    
  </div>
</div>
       
       <hr> 
        
      </div>
    </main>
  </div>
</div>
</body>
<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</html>
