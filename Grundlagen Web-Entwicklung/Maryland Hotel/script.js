var current_slide = 0;

/*Aufruf nächster/vorheriger slide*/
function nextslide(n) { // n = 1 oder n = -1
  current_slide += n;
  update();
}

function update() {
  var slides = document.getElementsByClassName("slide");
  console.log(slides)
  
  var max_slides = slides.length - 1; //slides von 0-2, aber länge = 3
  console.log(max_slides) // fängt mit 0 an deswegen 2

  if (current_slide > max_slides) {
    current_slide = 0;
  }
  if (current_slide < 0) {
    current_slide = max_slides;
  }
  for (var i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  slides[current_slide].style.display = "block";
}

// Contact Location
function mapBlock() {
    var map = document.querySelector('.map');
    map.style.display = 'block';
}

// Mit getElementsByClassName
// function mapBlock() {
//     var map = document.getElementsByClassName('map')[0];
//     map.style.display = 'block';
// }


function showMessage() {
  alert("Thank you for your message, we will get in touch with you as soon as possible.")
}
