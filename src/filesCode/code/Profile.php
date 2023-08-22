<html>
<header>
<?php
$myfile = fopen("account.txt", "r");
$username  =  fgets($myfile);
$password  =  fgets($myfile);
fclose($myfile);


?>
</header>
<body>
<h6>Profile Page</h6>
<b>username</b>
<?php
 echo $username;
 ?>
<b>password</b>
<?php
 echo $password;
 ?>
<br>
<a href = "Home.php">go to home</a>
</body>
</html>
