alert(imputNames());

function imputNames() {
    let name = prompt('Как вас зовут?')
    while (name) {
        let l = name.length;
        if (l > 15) {
            alert(`Длина превышает 15 символов! Введите снова.`);
            return imputNames();
        } else if (l < 2) {
            alert(`Очень короткое имя. Длина больше 2 символов! Введите снова.`);
            return imputNames();
        } else {
            return (`Привет: ${name}`);
        }
    }
}
