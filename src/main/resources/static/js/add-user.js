const addUserForm = document.getElementById('formControl')
let nameInput = document.getElementById('nameInput')
let surnameInput = document.getElementById('surnameInput')
let emailInput = document.getElementById('emailInput')

addUserForm.addEventListener("submit", (event) => {
    event.preventDefault();

    let close = document.getElementById('btnClose')
    close.setAttribute("data-dismiss" ,'modal')
    close.click()

    fetch('http://localhost:8044/api/users/save-user', {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            name: nameInput.value,
            surname: surnameInput.value,
            email: emailInput.value,
        })
    })
        .then((response) => {
            console.log(response.json());

        })
        .then((response)=>{
            location.reload()
        })
});


