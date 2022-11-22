<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculation</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

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
        <h1 class="h2 " >Emi Calculator</h1>
      </div>
      
     
      <form action="/save" method = "post">
      <div class="container">
        <div class="row">
          <div class="col">
           <select class="form-select" aria-label="Default select example" name="loantype" >
              
                <option selected>Select Loan Type</option>
                
                <c:forEach var="s" items="${loantypes}">
                <option value="${s.loantype}">${s.loantype}</option>
                </c:forEach>
              </select>
          </div>
          <div class="col">
           <div class="mb-3">
               <input type="text" class="form-control" id="loan" name="loan" value="${loan}">
               </div>
          </div>
        </div>
        
            <div class="row">
            <div class="col">
              <h2>Loan Amount:</h2>
            </div>
            <div class="col">
                <div class="mb-3">
                    <input type="text" class="form-control" id="amount" name="amount" value="${amt}">
                    <span style="color:red;">${war}</span>
                  </div>
            </div>
          </div>
          <div class="row">
            <div class="col">
              <h2>Number Of Months:</h2>
            </div>
            <div class="col">
                <div class="mb-3">
                    <input type="text" class="form-control" id="months" name="months" value="${mon}">
                  </div>
            </div>
          </div>
           <div class="row">
            <div class="col">
              
              <button type="submit" class="btn btn-dark" formaction="/caltu">Calculate:</button>
            </div>
          </div>
          
          <div class="row">
            <div class="col">
              
             <h2>Interest Rate(%):</h2>
            </div>
            <div class="col">
                <div class="mb-3">
                    <input type="text" class="form-control" id="amount" name="intrate" value="${ir}">
                  </div>
            </div>
          </div>
          
               <div class="row">
            <div class="col">
              <h2>Interest Amount:</h2>
             
            </div>
            <div class="col">
                <div class="mb-3">
                    <input type="text" class="form-control" id="amount" name="intamount" value="${iamt}">
                  </div>
            </div>
          </div>
          <div class="row">
            <div class="col">
              <h2>Monthly Payble:</h2>
             
            </div>
            <div class="col">
                <div class="mb-3">
                    <input type="text" class="form-control" id="amount" name="monamount" value="${monamt}" >
                  </div>
            </div>
          </div>
          
           <div class="row">
            <div class="col">
               <h2>Total Payble:</h2>
             
            </div>
            <div class="col">
                <div class="mb-3">
                    <input type="text" class="form-control" id="amount" name="totalamount" value="${totamt}">
                  </div>
         </div>
          </div>
          
                  <div class="row">
            <div class="col">
               
<button type="Submit" class="btn btn-dark" >Print</button>

<hr>

 <div class="shadow-none p-3 mb-5 bg-light rounded">
            <table class="table ">
         
                <tbody>
                  
                  <tr>
                    <td>${lid}</td>
                    <td>${ltt}</td>
                    <td>${la}</td>
                    <td>${lm}</td>
                    <td>${lir}</td>
                    <td>${lia}</td>
                    <td>${lmp}</td>
                    <td>${ltp}</td>
                  </tr>
                 
                  
                </tbody>
              </table>
            </div>

<div class="input-group mb-3 w-25">
      
     
   </div>

             
            </div>
          </div>
         
          <!-- container end -->
          
           </div>
           <!-- Button trigger modal -->



    </form>
    </main>
  </div>
</div>



   
</body>
 <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
      
    

</html>