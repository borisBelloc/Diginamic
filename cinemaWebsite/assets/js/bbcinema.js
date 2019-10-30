// Navbar shadow on scroll
$(window).scroll(function () {
  if ($(window).scrollTop() > 500) {
    $('.navbar').addClass('floatingNav');
    $('.navbar').removeClass('transparent');
    $('.navbar-nav').removeClass('displayNone');
  } else {
    // $('.navbar').removeClass('floatingNav');
  }
  if ($(window).scrollTop() < 500) {
    $('.navbar').addClass('transparent');
    $('.navbar-nav').addClass('displayNone');
    $('.navbar').removeClass('floatingNav');
  }
});


/* ********************************** */
/* BTN TO TOP */
/* ********************************** */
//Get the button:
mybutton = document.getElementById("btnToTop");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function () {
  scrollFunction()
};

function scrollFunction() {
  if (document.body.scrollTop > 500 || document.documentElement.scrollTop > 500) {
    // BTN after timeline; because JS animation make the button jump @timeline /resolution 1024px->1167px
    // if (document.body.scrollTop > 3800 || document.documentElement.scrollTop > 3800) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}
// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
}