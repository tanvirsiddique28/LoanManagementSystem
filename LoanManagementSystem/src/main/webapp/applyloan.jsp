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
    <title>Loan Application</title>

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
        <h1 class="h2"> Apply for Loan</h1>
        </div>
        
         <div class="container">
         <form action="/searchcustomer" method="post">
          <div class="row">
            <div class="col col-md-2">
              <button type="submit"  class="btn btn-dark">Search</button>
            </div>
            <div class="col col-md-3">
              <input type="text" class="form-control" id="id" name="id" placeholder="enter customer id"  >
            </div>
             <div class="col col-md-3">
          <input type="text" class="form-control" id="pid" name="pid" placeholder="enter print id"  >
          </div>
          </div>
          </form>
          </div>
<hr>
  <div class="container">
  
  <form action="/applyl" method="post">
  
      <div class="row mt-4">
      
            <div class="col col-md-2">
              <label for="customerid" class="form-label">Customer Id</label>
            </div>
            <div class="col col-md-2">
              <input type="text" class="form-control" id="customerid" name="customerid" value="${cid}"   >
            </div>
            <div class="col col-md-2">
              <label for="name" class="form-label">Customer Name</label>
            </div>
            <div class="col col-md-2">
              <input type="text" class="form-control" id="name" name="name" value="${name}" >
            </div>
            <div class="col col-md-2">
              <label for="nid" class="form-label">NID number</label>
            </div>
            <div class="col col-md-2">
              <input type="text" class="form-control" id="nid" name="nid"  value="${nid}" >
            </div>
       
       </div>
       
       <div class="row mt-4">
        
            <div class="col col-md-2">
              <label for="age" class="form-label">Age</label>
            </div>
            <div class="col col-md-2">
              <input type="text" class="form-control" id="age" name="age"  value="${age}" >
            </div>
     
       </div>
       
       <hr>
       
       <div class="row mt-4">
    
  <div class="col col-md-2">
    <label for="tin" class="form-label">TIN Number</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="tin" name="tin"   >
  </div>
  <div class="col col-md-2">
    <label for="netincome" class="form-label">Net Income</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="netincome" name="netincome" value="0"  >
  </div>

</div>

<div class="row mt-4">
  <div class="col col-md-2">
    <label for="gurantor" class="form-label">Guarantor Name</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="gurantor" name="gurantor" >
  </div>
  <div class="col col-md-2">
    <label for="gurantornid" class="form-label">Guarantor NID Number</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" type="gurantornid" id="gnid"  name="gurantornid"  >
  </div>
</div>

<hr>

<div class="row mt-4">

  <div class="col col-md-2">
    <label for="loantype" class="form-label">Loan Type</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="loantype" name="loantype"  value="${ltp}" >
  </div>
  <div class="col col-md-2">
    <label for="loanamount" class="form-label">Loan Amount</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="loanamount" name="loanamount"   value="${la}"  >
  </div>
 
</div>

<div class="row mt-4">

  <div class="col col-md-2">
    <label for="months" class="form-label">Number of Months</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="months" name="months"  value="${nm}">
  </div>
  <div class="col col-md-2">
    <label for="interestrate" class="form-label">Interest Rate</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="interestrate" name="interestrate"  value="${ir}"  >
  </div>

</div>

<div class="row mt-4">

  <div class="col col-md-2">
    <label for="interestamount" class="form-label">Interest Amount</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="interestamount" name="interestamount"  value="${ia}" >
  </div>
  <div class="col col-md-2">
    <label for="monthlypayble" class="form-label">Monthly Payble</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="monthlypayble" name="monthlypayble"  value="${mp}" >
  </div>

</div>
       
      
       <div class="row mt-4">

  <div class="col col-md-2">
    <label for="totalpayble" class="form-label">Total Payble</label>
  </div>
  <div class="col col-md-3">
    <input type="text" class="form-control" id="totalpayble" name="totalpayble" value="${tp}"  >
  </div>
  
  <div class="col col-md-2">
    
  </div>
  <div class="col col-md-3">
    <button type="submit" class="btn btn-dark">Submit</button>
  </div>
  <div class="col col-md-2">
   
  </div>
 
</div>

<hr>
       
 </form>      
       
       
       
       
       
       <!-- container end -->
    </div>
      




     </main>
   </div>


<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>
