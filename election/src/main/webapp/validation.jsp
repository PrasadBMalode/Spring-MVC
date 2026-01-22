function validateForm() {
    let partyName = document.getElementById("name").value.trim();
    let candidateName = document.getElementById("candidateName").value.trim();
    let age = document.getElementById("age").value;
    let email = document.getElementById("mail").value.trim();
    let phoneNumber = document.getElementById("number").value.trim();

    if (partyName === "" || partyName.length >= 5) {
        alert("Party Name must be less than 5 characters");
        return false;
    }

    if (candidateName === "" || candidateName.length >= 10) {
        alert("Candidate Name must be less than 10 characters");
        return false;
    }

    if (age <= 19 || age >= 60) {
        alert("Age must be between 20 and 59");
        return false;
    }

    if (!email.includes("@gmail.com")) {
        alert("Email must be a Gmail address");
        return false;
    }

    if (phoneNumber.length !== 10 || isNaN(phoneNumber)) {
        alert("Phone number must be exactly 10 digits");
        return false;
    }

    return true;
}