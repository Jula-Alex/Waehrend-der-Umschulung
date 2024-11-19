const input = document.getElementById("input");
const result = document.getElementById("result");

function reverseString(str) {
    return str.split("").reverse().join("");
}

function check() {
    const value = input.value;
    const reverse = reverseString(value);
    if(value === reverse) {
        result.innerHTML = "P A L I N D R O M E !"
    } else {
        result.innerHTML = "It's not a palindrome !"
    }
}
