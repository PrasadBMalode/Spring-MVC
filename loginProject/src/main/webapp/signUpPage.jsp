<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign Up Page</title>

    <style>
        body {
           background-image:url("resource/images/register.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            height: 100vh;
            margin: 0;
        }
    </style>
</head>

<body>

<div style="margin:auto;
            text-align:center;
            width: 400px;
            border: 2px solid black;
            padding: 20px;
            border-radius: 10px;
            background-color: rgb(176,196,222);
            margin-top: 120px;">

<form action="getSignUp" method="get" onsubmit="return registerValidation()">

    <label for="username">Username : </label>
    <input type="text" placeholder="Enter your username" name="userName" id="userame"><br><br>

    <label for="phoneNumber">Phone Number : </label>
    <input type="number" placeholder="Enter your phoneNumber" name="number" id="phoneNumber"><br><br>

    <label for="email">Email : </label>
    <input type="email" placeholder="Enter your email" name="email" id="email"><br><br>

    <label for="password">Password : </label>
    <input type="password" placeholder="Enter your password" name="password" id="password"><br><br>

    <label for="confirmPassword">Confirm Password : </label>
    <input type="password" placeholder="Confirm your Password" name="confirmPassword" id="confirmPassword"><br><br>

    <button type="submit">Submit</button>

</form>

</div>

<script src="Validation.jsp"></script>

</body>
</html>
