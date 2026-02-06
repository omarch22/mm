package com.request_body_calc.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calc {

    @RequestMapping("/")
    public String root() {
        return "Hola";
    }

    @PostMapping("/calc")
    public String calc(@RequestBody Operacion operacion) {

        float resultado;
        String oper=operacion.getOper();

        if (oper.equals("suma")){
            resultado = operacion.getN1()+operacion.getN2();
        } else if (oper.equals("resta")) {
            resultado = operacion.getN1()-operacion.getN2();
        } else if (oper.equals("multiplicacion")) {
            resultado = operacion.getN1()*operacion.getN2();
        } 

        return "Resultado: "+resultado;
    }
}
