<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<body style="background-color:black;">
    <div style="margin:auto;
                text-align:center;
                width: 400px;
                border: 2px solid black;
                padding: 20px;
                border-radius: 10px;
                background-color: rgb(248, 248, 141);">
        <h1>ADMISSION FORM</h1>
        <form action="studentDetails" method="post" onsubmit="return validateForm()">

            <label for="studentId">Student ID: </label>
            <input type="text" id="studentId" placeholder="student Id" name="studentId" /><br><br>

            <label for="studentName">Student Name: </label>
            <input type="text" id="studentName" placeholder="Student Name" name="studentName" /><br> <br>

            <label for="cllgName">College Name: </label>
            <input type="text" id="cllgName" placeholder="cllg Name" name="cllgName" /><br> <br>


            <label for="studentPhoneNumber">Mobile Number</label>
            <input type="text" id="studentPhoneNumber" placeholder="phone number" name="studentPhoneNumber" /><br><br>

            <label for="studentEmail">Enter E-mail</label>
            <input type="email" id="studentEmail" placeholder="Email" name="studentEmail" /><br><br>

            <input type="submit" placeholder="Admit">
        </form>
    </div>

    <script src="validation.jsp"> </script>
</body>


</html>