package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    public String home() {
        return "index";
    }

    @RequestMapping("/mensagem")
    public String mensagem(@RequestParam int opcao, Model ui) {
        String texto="";
        switch (opcao){
            case 1:
                texto=" Bom Dia!";
                break;
            case 2:
                texto= "Boa Tarde!";
                break;
            case 3:
                texto= "Boa Noite!";
                break;
            default:
                texto="Ola";
                break;
        }
        ui.addAttribute("texto", texto);
        return "mensagem";
    }
}
