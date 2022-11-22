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
      <div class="pt-3 pb-2 mb-3 border-bottom text-center">
        <h1 class="h2">Insert New And Update or Delete Existing Loan</h1>
        </div>
        
        <div class="container">
         <form action="/datainsert" method="post">
         <div class="row">
    <div class="col">
        <div class="col col-md-3">
       <div class="form-outline">
       <input type="text" id="id" name="id" class="form-control form-control-lg" value="${l.getId()}" />
       <label class="form-label" for="nid">Id</label>
        </div>
    </div>
    </div>
    </div>
  <div class="row">
    <div class="col">
        <div class="col">
       <div class="form-outline">
       <input type="text" id="nid" name="loantype" class="form-control form-control-lg" value="${l.getLoantype()}" />
       <label class="form-label" for="nid"  >Loan Type</label>
        </div>
    </div>
    </div>
    <div class="col">
     <div class="col">
     <div class="form-outline">
                                <input type="text" id="name"  name="minamount" class="form-control form-control-lg" value="${l.getMinamount()}"/>
                                <label class="form-label" for="name" >Minimum Amount</label>
                              </div>
    </div>
    </div>
    <div class="col">
      <div class="col">
                             <div class="form-outline mb-4">
                            <input type="text" id="nid" name="maxamount" class="form-control form-control-lg" value="${l.getMaxamount()}" />
                            <label class="form-label" for="nid"  >Maximum Amount</label>
                          </div>
    </div>
    </div>
  </div>

        
        
       
  <div class="row">
    <div class="col">
      <div class="col">
      <div class="form-outline mb-4">
                           <input type="text" id="nid" name="minmonths" class="form-control form-control-lg" value="${l.getMinmonths()}" />
                           <label class="form-label" for="nid"  >Minimum Months</label>
                          </div>
    </div>
    </div>
    <div class="col">
     <div class="col">
      <div class="form-outline mb-4">
                            <input type="text" id="nid" name="maxmonths" class="form-control form-control-lg" value="${l.getMaxmonths()}"/>
                            <label class="form-label" for="nid"  >Maximum Months</label>
                          </div>
    </div>
    </div>
    <div class="col">
      <div class="col">
       <div class="form-outline">
                                <input type="text" id="email" name="interestrate" class="form-control form-control-lg"value="${l.getInterestrate()}" />
                                <label class="form-label" for="email"  >Interest Rate</label>
                              </div>
    </div>
    </div>
    </div>
 


  <div class="row">
    <div class="col">
      <div class="col">
         <div class="form-outline mb-4">
                            <input type="text" id="nid" name="minage" class="form-control form-control-lg" value="${l.getMinage()}" />
                            <label class="form-label" for="nid"  >Minimum Age</label>
                          </div>
    </div>
    </div>
    <div class="col">
      <div class="col">
     
                             <div class="form-outline mb-4">
                            <input type="text" id="nid" name="minnetincome" class="form-control form-control-lg" value="${l.getMinnetincome()}" />
                            <label class="form-label" for="nid"  >Minimum Net Income</label>
                          </div>
                        
    </div>
    </div>
   
     <div class="col">
     
                             <div class="form-outline mb-4">
                            <input type="text" id="nid" name="maxnetincome" class="form-control form-control-lg" value="${l.getMaxnetincome()}" />
                            <label class="form-label" for="nid"  >Maximum Net Income</label>
                          </div>
                        
    </div>
    </div>
     <button type="submit"  class="btn btn-dark">Save</button>
   </form>
  </div>

 <hr>
 <div class="shadow-none p-3 mb-5 bg-light rounded">
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Loan Type</th>
                    <th scope="col">Minimum Amount</th>
                    <th scope="col">Maximum Amount</th>
                    <th scope="col">Minimum Months</th>
                    <th scope="col">Maximum Months</th>
                    <th scope="col">Interest Rate</th>
                    <th scope="col">Minimum Age</th>
                    <th scope="col">Minimum Netincome</th>
                    <th scope="col">Maximum Netincome</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="l" items="${ll}">
                  <tr>
                    <td>${l.id}</td>
                    <td>${l.loantype}</td>
                    <td>${l.minamount}</td>
                    <td>${l.maxamount}</td>
                    <td>${l.minmonths}</td>
                    <td>${l.maxmonths}</td>
                    <td>${l.interestrate}</td>
                    <td>${l.minage}</td>
                    <td>${l.minnetincome}</td>
                    <td>${l.maxnetincome}</td>
                    <td><form action="/updatedata/${l.getId()}"><button type="submit" class="btn btn-success">Update</button></form></td>
                    <td><form action="/deletedata/${l.getId()}"><button type="submit" class="btn btn-danger">Delete</button></form></td>
                  </tr>
                  </c:forEach>
                  
                 
                </tbody>
              </table>
            </div>
        
            
            <hr>
  
  </div>
  
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
