<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   
</body>
</html>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
      div.home
      {
        text-align: center;
      }
      div.link
      {
        border: 1px solid;
        margin-top: 20px;
        background-color: aqua;
        display: flex;
        justify-content: space-between;
        /* padding-top: 15px;
        padding-bottom: 15px;
        padding-left: 200px;
        padding-right: 200px; */
        padding: 15px 300px;
      }
      footer
      {
        border: 1px solid;
        height: 35px;
        margin-top: 150px;
        text-align: center;
        padding-bottom: 5px;
        background-color: rgb(214, 245, 235);
      }
      label
      {
         display: inline-block;
         width: 100px;
      }
      form{
         border: 1px solid;
         width: 350px;
         margin: auto;
         padding: 20px;
         text-align: center;
         background-color: rgb(38, 238, 238);
      }
      h1{
        text-align: center;
      }
    </style>
</head>
<body style="background-color: rgb(12, 141, 141);">
    <div class="home">
        <img src="C:\Users\user\Desktop\New folder\sathya.jfif" height="80px" width="250px">
        <h1>Sathya Technologies</h1>
    </div>
    <div class="link">
        <a href="home.html">Home</a>
        <a href="contect.html">Contect</a>
        <a href="login.html">LogIn</a>
        <a href="register.html">Register</a>
    </div>
    <div class="for">
    <h1>Login Form</h1>
    <form>
        <label>Email:</label>
        <input type ="text" name = "user"><p></p>
        <label>Password:</label>
        <input type = "password" name = "psw"><p></p>
        <input type ="submit" value = "Login">
    </form>
</div>
    <footer>
        <p>&#169;Copyrightto-SathyaTech</p>
    </footer>
</body>
</html>