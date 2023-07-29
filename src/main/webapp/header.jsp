<%--
  Created by IntelliJ IDEA.
  User: Brucenguyen
  Date: 03/05/2023
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--Navbar started -->


<nav class="navbar sticky-top navbar-expand-lg bg-info-subtle" id="navbarid">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="img/java.png" alt="Logo" width="45" class="d-inline-block align-text-top">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp" >Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            English Teaching
          </a>
          <ul class="dropdown-menu">
            <li id="listC"><a class="dropdown-item" href="#">Ielts g</a></li>
            <li><a class="dropdown-item" href="#">PTE</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">English Communication</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            IT Teaching
          </a>
          <ul class="dropdown-menu">
            <li id="list"><a class="dropdown-item" href="#">C Programming</a></li>
            <li><a class="dropdown-item" href="#">Java Programming</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Web Application</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="mystudies.jsp" >About me</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            My products
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">For English Learners</a></li>
            <li><a class="dropdown-item" href="#">For It Learners</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Others</a></li>
          </ul>
        </li>

      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success me-2" type="submit">Search</button>
        <a class="btn btn-secondary mx-1" style="white-space: nowrap" href="signin.jsp">
          Sign In
        </a>
        <a class="btn btn-secondary" style="white-space: nowrap" href="signup.jsp">
          Sign Up
        </a>
      </form>

    </div>
  </div>
</nav>

<!--Navbar ended -->
