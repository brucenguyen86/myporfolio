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
  <title>About Me</title>
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

    <!-- About me -->

      <div class="col-lg-9 mt-3">
        <!-- Eduction table-->
        <table class="table table-hover">
        <tr>
          <td colspan="3" style="text-align: center;background-color: powderblue;font-weight: bold">Education</td>
        </tr>
          <tr>
           <th>University or School</th>
            <th>GPA</th>
            <th>Graducation Year</th>
          </tr>
          <tr>
            <td>Hanoi University of Technology</td>
            <td>7.14</td>
            <td>2012</td>
          </tr>
          <tr>
            <td>Hanoi Open University</td>
            <td>7.95</td>
            <td>2015</td>
          </tr>
          <tr>
            <td>Lam Son Gifted High School</td>
            <td>9.0</td>
            <td>2004</td>
          </tr>
        </table>
        <!-- Experience table-->
        <table class="table table-hover">
          <tr>
            <td colspan="2" style="text-align: center;background-color: powderblue;font-weight: bold">Business-related Experience</td>
          </tr>
          <tr>
            <th style="width: 30%;text-align: center">Time</th>
            <th style="width: 70%;text-align: center">Detailed</th>
          </tr>

            <!-- Company 1-->
          <tr>
            <td style="width: 30%;text-align: left;">February 2021 until now</td>
            <td style="width: 70%;text-align: left">
              <strong>Online English teacher at B-Star English Center </strong> </br>
              Taught English online to primary, secondary and high school students </br>
              Built my own teaching materials </br>
              Promoted my teaching to students and parents from all over the country by using social media </br>
              <strong>My achievement :</strong> </br>
              Had students from many provinces and cities in the country
            </td>
          </tr>
          <!-- Company 2-->
          <tr>
          <td style="width: 30%;text-align: left;">December 2014 to February 2021</td>
          <td style="width: 70%;text-align: left;">

            <strong>Director and English teacher at B-Star English Center</strong> </br>
            As a director : </br>
            Managed and operated all activites of the center </br>
            Suggested sales and marketing  plans </br>
            Built successfully the teaching materials and plans </br>
            Make a good relationship with other organizations and groups. </br>
            Traind  the teachers at the center </br>
            As an English teacher : </br>
            Taught English to young learners aged from 3 to 16 </br>

          </td>
          </tr>
          <!-- Company 3-->
          <tr>
          <td style="width: 30%;text-align: left;">October 2017 to January 2019</td>
          <td style="width: 70%;text-align: left;">

            Deputy Director at Ames English Thanh Hoa </br>
            Managed and operated all activites of the center , including  finance, human resources, </br>
              teaching plans,etc. </br>
            Managed sales and marketing activities </br>
            Built up successfully the teaching material system which was suitable for most students </br>
            Established a good relationship with other organizations and groups. </br>
            Traind the teachers and other employees regularly </br>
            My achievement : in 2018, the center has achieved 90% of its annual sales target  and 100% </br>
              students had got the expected results </br>

          </td>
          </tr>
          <!-- Company 4-->
          <tr>
          <td style="width: 30%;text-align: left;">March 2012 to November 2013: </td>
          <td style="width: 70%;text-align: left;">

            Deputy Director at Viet An Trading and Services Company limited </br>
            Manager at Neverland Fastfood and coffe, 36 Hang Than, Thanh Hoa City
            www.facebook.com/neverland36  </br>
            A fastfood and coffee restaurant selling fried chicken, coffee and noodle soups
            - Managed and operated all the acitivies of the restaurant </br>
            1. Built our company brand: used social media such as facebook, a company’s website, zalo,
              messenger to reach out the prospective and current customer base. </br>
            Launched many marketing campaigns to improve the restaurant’s image. </br>
            2. Boost sales and increased profits: </br>
            Kept in touch with customers </br>
            Used many sales strategies, for example :implementing a referral program, using future discounts,
              rewards points, special access, and freebies, etc. </br>

            3. Trained staff members and built up company culture : Get the employees trained weekly and
              regularly set up many connection activitives to bring people close together. </br>
            4. Manage finance and deal with suppliers. </br>
            My Achievements:
            1.  The monthly revenues increased from 450 million VNĐ to 550 million VNĐ, especially in February
              2013 that figure even rose to 850 million VNĐ. </br>
            2.  successfully built a pretty independent system that could work acceptably well
              without my management,
              especially during the holidays and festivals. </br>

          </td>
          </tr>
          <!-- Company 5-->
          <tr>
          <td style="width: 30%;text-align: left;">June 2009  – January 2012</td>
          <td style="width: 70%;text-align: left;">

            Deputy Manager and Co-Founder of LeGia Computer Limited Company </br>
            23 Yen Hoa, Trung Hoa Precinct , Cau Giay District , Ha Noi </br>
            http://www.legiaitc.vn </br>
            Le Gia is a company which sells  desktop Computers , Laptops and accessories. </br>
            1. Establish the company: </br>
            a. Do research and make the business plans. </br>
            b. Train employees </br>
            d. Make sales and marketing plans </br>
            2. Manage and operate the company : </br>
            -  motivate employees </br>
            -  train employees regularly </br>
            - buil company culture. </br>
            3. Build good relationship with other business partners </br>
            -  Join some football group to make the company well-known </br>
            My achievements: </br>
            Took very high responsibility for the company’s growth. Set up successfully </br>
              the company that works very well. </br>

          </td>
          </tr>
          <!-- Company 6-->
          <tr>
          <td style="width: 30%;text-align: left;">October 2010 to January 2012 :</td>
          <td style="width: 70%;text-align: left;">

            Sales executive </br>
            CMC Distribution Limited Company, CMC Tower, Duy Tan, Cau Giay, Ha Noi -  www.cmc.com.vn </br>
            of CMC Group which distributes IT’s products </br>
            1.Gain market share: Beside making the relationships with Ha Noi’s IT dealers
              ( such as Tran Anh, Phuc Anh, Pico, Topcare, Mediamart, Ben,..) ,
              I also took care of extending distribution channels into the north area such as Hai Phong, Quang Ninh… </br>
            2. Increase sales: By making the intensive relationships with my customers and
              being good at analyzing the market, I could regularly increase sales each month. </br>
            3. Develop products: Combine with the product agency to launch marketing campaigns,
              for example photographic contests or game contests….By way of taking part frequently
              in many product conferences for IT dealers, I widened my relationships to promote my company’s products. </br>
            My achievements: </br>
            1. Reached sales targets for two quarters, especially I have achieved the highest
              quarterly sale target among all sales executives in the company. </br>

          </td>
          </tr>
          <!-- Company 7-->
          <tr>
          <td style="width: 30%;text-align: left;">August 2009 – September 2010:
            </td>
          <td style="width: 70%;text-align: left;">

            Sales Executive   </br>
            Vision Computer joint - Stock Company –  www.viscom.vn </br>
            No.6  – Lot 1A, Trung Yen 1 Street, Trung Hoa Precinct, Cau Giay District, Ha Noi. </br>

            1. Gain market share: Through widening the relationships with directors and staffs of
              Hanoi’s IT companies trading computer equipments. </br>
            2. Increase sales: By persuading customers to buy my products regularly in large quantities,
              I contributed to my company’s success in increasing revenues. </br>
            3.  Develop products: By means of taking part frequently in the product conferences for
              IT dealers, I helped my company to promote its products. </br>
            My achievements: </br>
            1. Have had 3 new customers every month </br>
            2. Have reached sales target for 3 months, particularly reached 150% of </br>

          </td>
          </tr>
          <!-- Company 8-->
          <tr>
            <%
            int a=5;

            %>
          <td style="width: 30%;text-align: left;">December 2007 – July 2009: </td>
          <td style="width: 70%;text-align: left;">

              <b>Sales Executive & Manager & Occupational health and counsellor</b> </br>
            TIENS Viet Nam Corporation </br>
            1. Get in touch, looked for new customers, assisted in marketing and PR work. </br>
            2.	Build my own multi level marketing network. </br>
            3.	Recruite PGs for promotion programs. </br>
            4.	Pulled together, motivated my distributors. </br>
            5.	Organize the company events such as meetings, seminars, training programs, exhibitions,
              performances, new products launches.... </br>
            6.	Made lecture slides and promotional materials for the company </br>
            7.	Develop products in some domestic provinces such as Quang Ninh, Thanh Hoa, Nghe An, Hai Duong … </br>
            8.	Brought my distributors to Beijing China in order to get trained, in January 2009, and Nanning in April 2009. </br>
            My achievements: </br>
            1. Have achieved many awards for the excellent sales executives. </br>
            2. Have achieved the annual sales target of 65000$. </br>
            3. Have become a shareholder of Banner joint-stock company which is a subsidiary company of Tiens Corporation. </br>

          </td>
          </tr>
        </table>
          <table class="table table-hover">
            <!--IT-related skills-->
            <tr>
            <td colspan="2" style="text-align: center;background-color: powderblue;font-weight: bold">IT-related skils</td>
            </tr>
            <tr>
              <th style="width: 30%;text-align: center">Skill Type</th>
              <th style="width: 70%;text-align: center">Detailed</th>
            </tr>
            <tr>
              <td style="width: 30%;text-align: left;">Programming languages </td>
              <td style="width: 70%;text-align: left;">HTML, CSS, Javascript, C, Java, JSP, Servlet, SQL </td>
            </tr>
            <tr>
              <td style="width: 30%;text-align: left;">Frameworks </td>
              <td style="width: 70%;text-align: left;"> </td>
            </tr>
            <tr>
              <td style="width: 30%;text-align: left;">Tools </td>
              <td style="width: 70%;text-align: left;">HTML, CSS, Javascript, C, Java, JSP, Servlet, </td>
            </tr>
            <tr>
              <td style="width: 30%;text-align: left;">Other skills</td>
              <td style="width: 70%;text-align: left;">HTML, CSS, Javascript, C, Java, JSP, Servlet, </td>
            </tr>
            <!--Business-related skills-->
            <tr>
              <td colspan="2" style="text-align: center;background-color: powderblue;font-weight: bold">Business-related skils</td>
            </tr>
            <tr>
              <th style="width: 30%;text-align: center">Skill Type</th>
              <th style="width: 70%;text-align: center">Detailed</th>
            </tr>
            <tr>
              <td style="width: 30%;text-align: left;">December 2007 – July 2009: </td>
              <td style="width: 70%;text-align: left;"></td>
            </tr>


              <!--Business-related skills-->
            <tr>
              <td colspan="2" style="text-align: center;background-color: powderblue;font-weight: bold">Certificates</td>
            </tr>
            <tr>
              <th style="width: 30%;text-align: center">Names</th>
              <th style="width: 70%;text-align: center">Time of aquirement</th>
            </tr>
            <tr>
              <td style="width: 30%;text-align: left;">December 2007 – July 2009: </td>
              <td style="width: 70%;text-align: left;"></td>
            </tr>
          </table>
        <!-- Skills Table -->

    <!-- End : About me -->

    <!--content ended-->


        </div>
  </div>
</div>




<!--include footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!--include footer ended -->
</body>
</html>
