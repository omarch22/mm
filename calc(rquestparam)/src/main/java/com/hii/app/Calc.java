package com.hii.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc {

    @RequestMapping("/")
    public String root() {
        return "Hola";
    }

    @GetMapping("/calc-param")
    public String calc(
            @RequestParam String oper,
            @RequestParam  float n1,
            @RequestParam  float n2) {

        float resultado=0;

       if(oper.equals("suma")){
            resultado=n1+n2;
        }
        else if(oper.equals("multiplicacion")){
            resultado=n1*n2;
        }
        else if(oper.equals("division")){
            resultado=n1/n2;
        }
        else if(oper.equals("resta")){
            resultado=n1-n2;
        }
       

       

        return "Resultado: "+resultado;
    }
    

}
