
    function validateForm() {

        let studentId = document.getElementById("studentId").value;
        let studentName = document.getElementById("studentName").value;
        let cllgName = document.getElementById("cllgName").value;
        let phone = document.getElementById("studentPhoneNumber").value;
        let email = document.getElementById("studentEmail").value;


        if (studentId.length !== 5) {
            alert("Student ID must be exactly 5 digits");
            return false;
        }


        if (studentName === null || studentName.trim().length <= 3) {
            alert("Student Name must be more than 3 characters");
            return false;
        }


        if (cllgName === null || cllgName.trim().length <= 5) {
            alert("College Name must be more than 5 characters");
            return false;
        }


        if (phone.length !== 10 || isNaN(phone)) {
            alert("Mobile Number must be exactly 10 digits");
            return false;
        }


        if (!email.includes("@gmail.com")) {
            alert("Email must be a Gmail address (@gmail.com)");
            return false;
        }

        return true;
    }

