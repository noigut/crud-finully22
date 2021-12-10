let userTable =``;

fetch('http://localhost:8044/user/page')
    .then((response) => {
        return response.json();
    })
    .then( user => {
            userTable = `
            <td >${user.id}</td>
            <td >${user.name}</td>
            <td> ${user.surname}</td>
            <td >${user.email}</td>

    `;
            document.getElementById("updatePage").innerHTML = userTable;
    });

