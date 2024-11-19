const body = document.getElementsByTagName("body")[0];

function setColor(color) {
  body.style.backgroundColor = color;
}

function random() {
  const red = Math.floor(Math.random() * 255);
  const green = Math.floor(Math.random() * 255);
  const blue = Math.floor(Math.random() * 255);
  const color = `rgb(${red}, ${green}, ${blue})`;
  body.style.backgroundColor = color;
}

function sleep(ms) {
  return new Promise(function (resolve) {
    setTimeout(resolve, ms);
  });
}

async function disco() {
  for (let i = 0; i < 20; i++) {
    const red = Math.floor(Math.random() * 255);
    const green = Math.floor(Math.random() * 255);
    const blue = Math.floor(Math.random() * 255);
    const color = `rgb(${red}, ${green}, ${blue})`;
    body.style.backgroundColor = color;
    await sleep(100);
  }
}
