<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<body style="background-color: black">
    <div style="margin:auto;
                text-align:center;
                width: 400px;
                border: 2px solid black;
                padding: 20px;
                border-radius: 10px;
                background-color: rgb(128, 219, 245);">
        <h1>Election</h1>
        <form action="electionDetails" method="post" onsubmit="return validateForm()">

            <label for="name">Party Name: </label>
            <input type="text" id="name" placeholder="party Name" name="partyName" /><br> <br>

            <label for="candidateName">Candidate Name</label>
            <input type="text" id="candidateName" placeholder="Candidate Name" name="candidateName" /><br><br>

            <label for="age">Enter Age: </label>
            <input type="number" id="age" placeholder="Age" name="age" /><br><br>

            <label for="mail">Enter E-mail</label>
            <input type="email" id="mail" placeholder="Email" name="email" /><br><br>

            <label for="number">Phone Number: </label>
            <input type="text" id="number" placeholder="Number" name="phoneNumber" /><br> <br>

            <div style="text-align: right;">
                <input type="submit" value="Submit" />
            </div>

        </form>
    </div>
    <script src="validation.jsp"></script>
</body>

</html>