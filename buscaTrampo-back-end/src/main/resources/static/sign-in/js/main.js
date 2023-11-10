(function ($) {
    "use strict";

    /*==================================================================
    [ Focus Contact2 ]*/
    $('.input100').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() != "") {
                $(this).addClass('has-val');
            }
            else {
                $(this).removeClass('has-val');
            }
        })    
    })
  
    /*==================================================================
    [ Validate ]*/
    var input = $('.validate-input .input100');

    // Limpar campos quando a página é carregada
    input.each(function() {
        $(this).val(''); // Define o valor do campo como vazio
        hideValidate(this); // Remove quaisquer mensagens de validação
    });

    $('.validate-form').on('submit',function(e){
        e.preventDefault(); // Evita o envio do formulário padrão
        var check = true;

        input.each(function() {
            if (!validate($(this))) {
                check = false;
            }
        });

        if (check) {
            // Redireciona para o arquivo HTML desejado após a validação
            window.location.href = "index.html";
        }
    });

    input.focus(function() {
        hideValidate(this);
    });

    function validate(input) {
        var validationMessage = input.attr('data-validate');
        var value = input.val().trim();

        if (value === '') {
            showValidate(input, validationMessage);
            return false;
        }

        // Validar campos de email
        if (input.attr('name') === 'email') {
            if (value.match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                showValidate(input, "Email inválido");
                return false;
            }
        }

        // Validar campos de senha
        if (input.attr('name') === 'pass') {
            if (value.length < 8) {
                showValidate(input, "A senha deve ter pelo menos 8 caracteres");
                return false;
            }
        }

        // Remova o erro de validação, se houver
        hideValidate(input);

        return true;
    }

    function showValidate(input, message) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');

        if (message) {
            $(thisAlert).attr('alert-validate', message);
        }
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).removeClass('alert-validate');
        $(thisAlert).removeAttr('alert-validate');
    }

})(jQuery);
