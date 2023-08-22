<html>
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
<b>confirm password</b>
<input type="password" name = "confirmPassword">
<br>
<br>
<input type="submit" value = "register">
</form>
<?php

if(empty( $_GET["password"]) == false && empty( $_GET["confirmPassword"]) == false  &&($_GET["password"].="\n") == ($_GET["confirmPassword"].="\n")){
$myfile = fopen("account.txt", "w");
fwrite($myfile,$_GET["username"]);
fwrite($myfile,"\n");
fwrite($myfile,$_GET["password"]);
fwrite($myfile,"\n");
fclose($myfile);
header("Location:Login.php");
}

?>
</body>
</html>
