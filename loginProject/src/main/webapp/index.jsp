<!DOCTYPE html>
<html>
<head>
    <title>Home</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet">


        <style>
            body {
                        background-color: white;
                        color: white;
                        background-image:url("resource/images/bg.jpg");
                        background-size: cover;
                        background-position: center;
                        background-repeat: no-repeat;
                        height: 400px;
                        display: flex;
                        justify-content: center;
                        align-items: flex-start;
                        padding-top: 50px;

                    }
        </style>
</head>

<body>

<!-- =====================Left div tag====================== -->

<div style="position: fixed; top: 0; left: 0; margin: 10px; color: black;">
    <h1><b>X-Workz</b></h1>
</div>


<!-- =====================Right div tag====================== -->
<div class="position-absolute top-0 end-0 m-3">

    <form action="signUp" method="get">
        <button type="submit" class="btn btn-primary">Sign Up</button>
    </form>

    <br>

    <form action="signIn" method="get">
        <button type="submit" class="btn btn-secondary">Sign In</button>
    </form>

</div>


</body>

</html>