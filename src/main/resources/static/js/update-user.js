let url1 = ("http://localhost:8044/api/users");

let inputName = document.getElementById('nameInputUpdate')
let inputSurname = document.getElementById('surnameInputUpdate')
let inputEmail = document.getElementById('emailInputUpdate')
let form = document.getElementById('formControlUpdate')

function onGetId(id, name, surname, email) {
    id = id
    inputName.value = name;
    inputSurname.value = surname;
    inputEmail.value = email;

    form.addEventListener("submit", e => {
        fetch(url1 + '/update', {
            method: "PUT",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(
                {
                    id: id,
                    name: inputName.value,
                    surname: inputSurname.value,
                    email: inputEmail.value,
                }
            )
        }).then(res => res.json()
        )
    })
}
