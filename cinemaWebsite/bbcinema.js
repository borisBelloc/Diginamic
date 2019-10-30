// Navbar shadow on scroll
$(window).scroll(function () {
  if ($(window).scrollTop() > 500) {
    $('.navbar').addClass('floatingNav');
    $('.navbar').removeClass('transparent');
    $('.nav-link').removeClass('displayNone');
  } else {
    // $('.navbar').removeClass('floatingNav');
  }
  if ($(window).scrollTop() < 500) {
    $('.navbar').addClass('transparent');
    $('.nav-link').addClass('displayNone');
    $('.navbar').removeClass('floatingNav');
  }
});