const displayCount = document.getElementById("Display-Numbers");
const displayResult = document.getElementById("Display-Result");

function appendToDisplay(input) {
    displayCount.textContent += input;
    
}

function clearDisplay() {
    displayCount.textContent = "";
    displayResult.textContent = "";
}

function calculate() {
    try {
        displayResult.textContent = eval(displayCount.textContent);
    } catch {
        displayCount.textContent = "Error";
    }
}