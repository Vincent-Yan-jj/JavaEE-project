<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>MOMA</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/droid_sans_400-droid_sans_700.font.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
<script type="text/javascript" src="js/formstyle.js"></script>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="slider">
        <div id="coin-slider"> <a href="#"><img src="images/slide1.jpg" alt="" /> </a> <a href="#"><img src="images/slide2.jpg" width="960" height="500" alt="" /> </a> <a href="#"><img src="images/slide3.jpg" width="960" height="500" alt="" /> </a> </div>
      </div>
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.html"><span>Home Page</span></a></li>
          <li><a href="support.html"><span>Support</span></a></li>
          <li><a href="about.html"><span>About Us</span></a></li>
          <li><a href="blog.html"><span>Blog</span></a></li>
          <li><a href="contact.html"><span>Contact Us</span></a></li>
        </ul>
      </div>
      <div class="logo">
        <h1><a href="index.html"><span>m.O.m.A</span> <small>mAy oUr mEmory aLive</small></a></h1>
      </div>
        <div class="login-in" style="background-image: url(images/form1.jpg); background-position: 50% 50%; ">
           
            <form method="post" id="Form" >
                <dl>
                    <dt>
                        <label for="email"></label>
                    </dt>
                    <dd style="border-top-color: rgb(142,150,161); border-right-color:rgb(142,150,161); 
                        border-left-color: rgb(142,150,161); border-bottom-color: rgb(142,150,161);">
                        <strong style="color: hotpink; ">Account: </strong><input type="text" 
                                            name="email" value="Email / User Name" style="color: rgb(136,136,136);" onfocus="accFocus()" onblur="accBlur()" />
                    </dd>
                </dl>
                
                <dl>
                    <dt>
                        <label for="password"></label>
                    </dt>
                    <dd style="border-top-color: rgb(142,150,161); border-right-color:rgb(142,150,161); 
                        border-left-color: rgb(142,150,161); border-bottom-color: rgb(142,150,161);">
                        <strong style="color: hotpink;">Password:</strong><input type="text" 
                                            name="email" value="Please input password" style="color: rgb(136,136,136); " onfocus="accFocus()" onblur="accBlur()" />
                    </dd>
                </dl>
                
                <dl>
                    <dt>
                        <label title="To ensure information security , please don't let this item be checked in public place!"
                               for="autologin">
                        <input type="checkbox" name="autologin" value="true" style="margin-left: 15px; margin-top: -5px; " />
                        <small>AutoLogin</small>
                        </label>
                    </dt>
                    <dd>
                        <span class="getpassword" >
                            <a href="findPass.jsp">Forget Password?</a>
                        </span>
                    </dd>
                </dl>
                
                
                <dl>
                    <dd>
                        <input class="Submit1_style1"  type="submit" value="login" 
                               onmouseover=" this.className='Submit1_style2' " onmouseout="this.className='Submit1_style1'" />
                    </dd>
                </dl>
           </form>
            <hr style="margin-left: 0px; margin-top: 55px;" />
            
            <input class="Submit2_style1" type="button" onclick="window.location='newReg.jsp'" value="register" 
                   onmouseover=" this.className='Submit2_style2' "  onmouseout="this.className='Submit2_style1'"  />
           
            
      </div>
        
        
      <div class="clr"></div>
    </div>
  </div>
 
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2><span>Image</span> Gallery</h2>
        <a href="#"><img src="images/gal1.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal2.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal3.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal4.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal5.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal6.jpg" width="75" height="75" alt="" class="gal" /></a> </div>
      <div class="col c2">
        <h2><span>Services</span> Overview</h2>
        <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>
        <ul class="fbg_ul">
          <li><a href="#">Lorem ipsum dolor labore et dolore.</a></li>
          <li><a href="#">Excepteur officia deserunt.</a></li>
          <li><a href="#">Integer tellus ipsum tempor sed.</a></li>
        </ul>
      </div>
      <div class="col c3">
        <h2><span>Contact</span> Us</h2>
        <p>Nullam quam lorem, tristique non vestibulum nec, consectetur in risus. Aliquam a quam vel leo gravida gravida eu porttitor dui.</p>
        <p class="contact_info"> <span>Address:</span> 1458 TemplateAccess, USA<br />
          <span>Telephone:</span> +123-1234-5678<br />
          <span>FAX:</span> +458-4578<br />
          <span>Others:</span> +301 - 0125 - 01258<br />
          <span>E-mail:</span> <a href="#">mail@yoursitename.com</a> </p>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="#">Domain Name</a>. All Rights Reserved</p>
      <p class="rf">Get More <a target="_blank" href="http://www.ingping.com/">????</a> By <a target="_blank" href="http://www.dreamtemplate.com/">DreamTemplate</a></p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>
</body>
</html>
