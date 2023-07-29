<%--
  Created by IntelliJ IDEA.
  User: Brucenguyen
  Date: 03/05/2023
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="mainStyle.css">
  <script src="script.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script
          src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous">
  </script>
  <title>Sign in</title>
</head>
<body>
<!--include header -->
<jsp:include page="header.jsp"></jsp:include>
<!--include header ended -->

<div class="container" id="my_signin_page">
  <div class="row">
    <!--include left Menu -->
    <jsp:include page="leftmenu.jsp"></jsp:include>
    <!--include left Menu ended -->

    <!--content -->
    <!--Sign in-->
   <div class="col-lg-9 mt-3">
    <section class="background-radial-gradient overflow-hidden" id="singinselection" >

      <div class="container px-4 py-5 px-md-5 text-center text-lg-start my-5" id="signindiv">
        <div class="row gx-lg-5 align-items-center mb-5">
          <div class="col-lg-6 mb-5 mb-lg-0" style="z-index: 10">
            <h1 class="my-5 display-5 fw-bold ls-tight" style="color: #F6BA6F">
              The best programming course <br />
              <span style="color: hsl(218, 81%, 75%)">for your web developing careeer</span>
            </h1>
            <p class="mb-4 opacity-70" style="color: #F6BA6F;font-size:x-large;">
              Learn everything about web developing from the basic
              Let's sign up to take the advantage of my courses.
            </p>
          </div>

          <div class="col-lg-6 mb-5 mb-lg-0 position-relative">
            <div id="radius-shape-1" class="position-absolute rounded-circle shadow-5-strong"></div>
            <div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>

            <div class="card bg-glass">
              <div class="card-body px-4 py-5 px-md-5">
                  <!-- 2 column grid layout with text inputs for the first and last names -->
                  <form action="register" method="get">
                  <div class="row">
                    <div class="col-md-6 mb-4">
                      <div class="form-outline">
                        <label class="form-label" for="form3Example1" name="firstname1">First name</label>
                        <input type="text" id="form3Example1" class="form-control" name="firstname" />

                      </div>
                    </div>
                    <div class="col-md-6 mb-4">
                      <div class="form-outline">
                        <label class="form-label" for="form3Example2" name="lastname1">Last name</label>
                        <input type="text" id="form3Example2" class="form-control" name="lastname" />
                      </div>
                    </div>
                  </div>


                  <!-- Email input -->
                  <div class="form-outline mb-2">
                    <label class="form-label" for="form3Example3" name="email" id="email1">Email address</label>
                    <input type="email" id="form3Example3" class="form-control" name="email" >
                  </div>
                  <!-- Username input -->
                  <div class="form-outline mb-2">
                    <label class="form-label" for="form3Example5" id="username" name="username1">Username</label>
                    <input type="text" id="form3Example5" class="form-control" name="username" >
                  </div>
                  <!-- Password input -->
                  <div class="form-outline mb-2">
                    <label class="form-label" for="form3Example6" id="password" name="password1">Password</label>
                    <input type="password" id="form3Example6" class="form-control" name="password">
                  </div>
                    <!-- Password input -->
                    <div class="form-outline mb-2">
                      <label class="form-label" for="form3Example10" id="re-password" name="re-password1">Confirm Your Password</label>
                      <input type="password" id="form3Example10" class="form-control" name="re_password">
                    </div>

                  <!-- Phonenumber input -->
                  <div class="form-outline mb-2">
                    <label class="form-label" for="form3Example7" name="phonenumber1"> Phone Number</label>
                    <input type="text" id="form3Example7" class="form-control" name="phonenumber" />
                  </div>

                  <!-- Birthday input -->
                  <div class="form-outline mb-2">
                    <label class="form-label" for="form3Example8" name="birthday1">Birthday</label>
                    <input type="text" id="form3Example8" class="form-control" name="birthday" >
                  </div>
                  <!-- Address input -->
                  <div class="form-outline mb-2">
                    <label class="form-label" for="form3Example9" name="address">Address</label>
                    <input type="text" id="form3Example9" class="form-control" name="address" >
                  </div>

                  <!-- Checkbox -->
                  <div class="form-check d-flex justify-content-center mb-4">
                    <input class="form-check-input me-2" type="checkbox" value="" id="form2Example33" checked />
                    <label class="form-check-label" for="form2Example33">
                      Agree with our rules
                    </label>
                  </div>

                  <!-- Submit button -->
                  <div class="text-center">
                  <input type="submit" value="Sign up" />

                  </input>
                  </div>
                  <!-- Register buttons -->
                  <div class="text-center">
                    <p>or sign up with:</p>
                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-facebook-f"></i>
                    </button>

                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-google"></i>
                    </button>

                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-twitter"></i>
                    </button>

                    <button type="button" class="btn btn-link btn-floating mx-1">
                      <i class="fab fa-github"></i>
                    </button>
                  </div>
                </form>
                  <form action="hello-servlet" method="get">
                      <h1> Dang nhap</h1>
                      User name <input type="text" name="username"/></br>
                      password <input type="password" name="password"/></br>
                      email <input type="text" name="email"/></br>
                      phonenumber <input type="text" name="phonenumber"/></br>
                      address <input type="text" name="address"/></br>
                      firstname <input type="text" name="firstname"/></br>
                      lastname <input type="text" name="lastname"/></br>

                      <input type="submit" value="Sign in">
                  </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
   </div>
  </div>

    <!--Sign in -->

    <!--content ended-->


  </div>


<!--include footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!--include footer ended -->
</body>
</html>
