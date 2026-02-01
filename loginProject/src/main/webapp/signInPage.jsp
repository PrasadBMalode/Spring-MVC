<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In Page</title>
</head>
<style>
        body {
           background-image:url("resource/images/login.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            height: 100vh;
            margin: 0;
        }
    </style>

<div style="margin:auto;
                     text-align:center;
                     width: 400px;
                     border: 2px solid black;
                     padding: 20px;
                     border-radius: 10px;
                     background-color: rgb(176,196,222);">
<form action="getSignIn" method="get">

    <label for="username">Username : </label>
    <input type="text" placeholder="Enter your username" name="userName" id="username"><br><br>

    <label for="password">Password : </label>
    <input type="text" placeholder="Enter your password" name="password" id="password"><br><br>

    <button type="submit">Submit</button>

</form>
</div>

</body>
</html>