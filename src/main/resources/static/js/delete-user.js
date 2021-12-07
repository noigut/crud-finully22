let url = ("http://localhost:8044/api/users");

let btn = document.getElementById('deletebtn')

function del(id) {
    btn.addEventListener('click', () => {
        fetch(url + '/delete/' + id, {
            method: "DELETE",
            body: {id}
        }).then((response) => {
    location.reload()
})
    })

};








