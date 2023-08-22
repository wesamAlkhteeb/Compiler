<html>
<header>
<?php
$myfile = fopen("account.txt", "r");
$usernameH  =  fgets($myfile);
$password  =  fgets($myfile);
fclose($myfile);


?>
</header>
<body>
<form action= ""   method="get">
<input type="image" name="null", src = "123.jpg" , width=100 height=100  >
<br>
<br>
<b>username</b>
<input type="text" name = "username">
<br>
<br>
<b>password</b>
<input type="password" name = "password">
<br>
<br>
<input type="submit" value = "login">
</form>
<a href = "Register.php">register</a>
<?php

if(empty( $_GET["username"]) == false && empty($usernameH ) == false  &&($_GET["username"].="\n") == $usernameH and empty( $_GET["password"]) == false && empty($password) == false  &&($_GET["password"].="\n") == $password){
header("Location:Home.php");
}

?>
</body>
</html>
