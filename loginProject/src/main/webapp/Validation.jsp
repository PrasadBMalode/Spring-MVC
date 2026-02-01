function registerValidation() {
    let name = document.getElementById("username").value.trim();
    let number = document.getElementById("phoneNumber").value.trim();
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();
    let confirmPassword = document.getElementById("confirmPassword").value.trim();


    if (name === "" || number === "" || email === "" || password === "" || confirmPassword === "") {
        alert("All fields should be filled...!");
        return false;
    }

    if (name.length < 4 || name.length > 14) {
        alert("Username should be 4 to 14 characters long...!");
        return false;
    }

    if (number.length !== 10 || isNaN(number)) {
        alert("Number should be exactly 10 digits...!");
        return false;
    }

    if (!email.includes("@gmail.com") || email.length < 14 || email.length > 24) {
        alert("Email should be a valid Gmail address (14-24 characters)!");
        return false;
    }

    if (password.length !== 8) {
        alert("Password should be exactly 8 characters long...!");
        return false;
    }

    if (password.charAt(0) !== password.charAt(0).toUpperCase()) {
        alert("Password should start with an uppercase letter...!");
        return false;
    }

    let specialCharCount = password.replace(/[a-zA-Z0-9]/g, "").length;
    if (specialCharCount < 2) {
        alert("Password should contain at least 2 special characters...!");
        return false;
    }

    if (password !== confirmPassword) {
        alert("Password and Confirm Password do not match...!");
        return false;
    }

    alert("Validation passed! You can submit the form.");
    return true;
}
