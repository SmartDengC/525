var slideIndex = 0;
showSlides();
function showSlides() {
    var dots = document.getElementsByClassName("dot");
    var i;
    var slides = document.getElementsByClassName("mySlides");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"; 
    }
    slideIndex++;
    if (slideIndex> slides.length) {slideIndex = 1} 
    slides[slideIndex-1].style.display = "block"; 
    for (var j= 0; j< dots.length; j++) {
        dots[j].className = dots[j].className.replace(" active", "");
    }
    dots[slideIndex-1].className += " active";
    setTimeout('showSlides()', 5000); // 间隔两秒后修改图片
}
var slideIndex = 1;
showSlidesa(slideIndex);
 
function plusSlides(n) {
  showSlidesa(slideIndex += n);
 }
 
function currentSlide(n) {
  showSlidesa(slideIndex = n);}
 
function showSlidesa(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1} 
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none"; 
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block"; 
  dots[slideIndex-1].className += " active";
}