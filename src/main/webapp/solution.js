function getSelectedOption() {
    var selectedOption = document.querySelector('input[name="options"]:checked');

    if (selectedOption) {
        alert("Вибраний варіант: " + selectedOption.value);
    } else {
        alert("Виберіть варіант");
    }
}