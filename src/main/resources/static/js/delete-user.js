let url = ("http://localhost:8044/api/users");

function del(id)//Любая функция
{
    if (confirm('Delete?'))
        /*функция со всплывающим окном
        с выбором действий "ок" или "отмена"*/
    {


            fetch(url + "/delete/" + id, {
                method: "DELETE",
            })
                .then((response) => {
                    location.reload()
                })
        }

};