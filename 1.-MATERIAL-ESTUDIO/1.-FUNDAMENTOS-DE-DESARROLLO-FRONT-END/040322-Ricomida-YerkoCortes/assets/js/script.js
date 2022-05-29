$(document).ready(function(){

  var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
  var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
    return new bootstrap.Tooltip(tooltipTriggerEl)
  })

  $('#enviarCorreo').click(function(){
    alert('El correo fue enviado correctamente...')
  });

  let validate = false;
  $('h3').on('dblclick', function(){
    if( !validate ){
      validate = true;
      $(this).css('color', 'red');
    } else {
      validate = false;
      $(this).css('color', 'black');
    }
  });

  $('.card-title').on('click', function(){
    $(".card-text").toggle("slow");
    //$(this).parent().find('.card-text').toggle("slow");
    //:)
  })

});
