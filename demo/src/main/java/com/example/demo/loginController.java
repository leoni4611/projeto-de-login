package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


public class loginController {
    
    @GetMapping("/")
    public String exibirLogin() {
        return "login";
    }
    //recebe os dados que o usuario digitou no formulario HTML.
    @PostMapping("/efetuar-login")
    @ResponseBody  //retorna um texto direto na tela.
    public String processarLogin(@RequestParam("usuario") String usuario, @RequestParam(" Senha") String senha){

        if("admin".equals(usuario) && "1234".equals(senha)){
            return "<h1> Login bem sucedido! </h1>";
        } else {
            return "<h1> Usuário ou senha invalidos. </h1>";
        }
    }
    
}
