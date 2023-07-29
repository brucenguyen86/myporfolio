        <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

        <!DOCTYPE html>
        <html>
        <head>
            <link rel="stylesheet" href="css/mainstyle.css">
            <script src="script.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
            <script
                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous">
            </script>
            <title>Bruce Nguyen</title>
        </head>
        <body>
        <!--include header -->
<jsp:include page="header.jsp"></jsp:include>
        <!--include header ended -->


        <!--Page Content -->
        <div class="container" id="my_page_content">
            <div class="row">
                <!--include left Menu -->
                <jsp:include page="leftmenu.jsp"></jsp:include>
                <!--include left Menu ended -->
                <div class="col-lg-9 bg-glass mt-3" >
                    <!--Slider on the right -->
                    <div id="carouselExampleIndicators" class="carousel slide">
                        <div class="carousel-indicators">
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                        </div>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="img/Slider/Java01.png" class="d-block w-100" alt="...">
                            </div>
                            <div class="carousel-item">
                                <img src="img/Slider/java02.png" class="d-block w-100" alt="...">
                            </div>
                            <div class="carousel-item">
                                <img src="img/Slider/inteliJ.png" class="d-block w-100" alt="...">
                            </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Next</span>
                        </button>
                    </div>
                    <!--Slider on the right : Ended -->



                    <!-- Products -->
                    <div class="row mb-4 mt-3 " id="productID">
                        <!-- product: 1 -->
                        <div class="col-lg-4 col-md-6 mb-4">
                            <div class="card h-100">
                                <a href="#"><img class="card-img-top"
                                                 src="img/Products/c.png" alt=""></a>
                                <div class="card-body">
                                    <h4 class="card-title">
                                        <a href="#">C Programming</a>
                                    </h4>
                                    <h5>$500</h5>
                                    <p class="card-text">You will learn some basic knowledge about C Programming and understand it easily</p>
                                    <a href="#" class="btn btn-primary">Buy This</a>
                                </div>
                                <div class="card-footer">
                                    <small class="text-muted">&#9733; &#9733; &#9733;
                                        &#9733; &#9734;</small>
                                </div>
                            </div>
                        </div>
                        <!-- product: 1: ended -->
                        <div class="col-lg-4 col-md-6 mb-4">
                            <div class="card h-100">
                                <a href="#"><img class="card-img-top"
                                                 src="img/Products/Core-Java.png" alt=""></a>
                                <div class="card-body">
                                    <h4 class="card-title">
                                        <a href="#">Core Java Programming</a>
                                    </h4>
                                    <h5>$500</h5>
                                    <p class="card-text">You will learn some basic knowledge about Java Programming and understand it easily</p>
                                    <a href="#" class="btn btn-primary">Buy This</a>
                                </div>
                                <div class="card-footer">
                                    <small class="text-muted">&#9733; &#9733; &#9733;
                                        &#9733; &#9734;</small>
                                </div>
                            </div>
                        </div>
                        <!-- product2 : ended -->
                        <!-- product: 3 -->
                        <div class="col-lg-4 col-md-6 mb-4">
                            <div class="card h-100">
                                <a href="#"><img class="card-img-top"
                                                 src="img/Products/javaweb.png" alt=""></a>
                                <div class="card-body">
                                    <h4 class="card-title">
                                        <a href="#"> Java Web </a>
                                    </h4>
                                    <h5>$1000</h5>
                                    <p class="card-text">You will learn how to build a website from Java</p>
                                    <a href="#" class="btn btn-primary">Buy This</a>
                                </div>
                                <div class="card-footer">
                                    <small class="text-muted">&#9733; &#9733; &#9733;
                                        &#9733; &#9734;</small>
                                </div>
                            </div>
                        </div>
                        <!-- product: 3 : ended-->
                        </div>
                    </div>
                </div>

                    <!-- Products Ended-->

                </div>
            </div>
        </div>

                <!--End Page content -->


        <!--include footer -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!--include footer ended -->
        </body>
        </html>

