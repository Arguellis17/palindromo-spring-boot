package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
Explicacion de las anotaciones

1. @RestController
Marca la clase como un controlador REST, lo que signfica que manejara solicitudes
HTTP y devolvera respuestas en formato JSON o texto

2. @GetMapping
Se usa para obtener una respuesta de un metodo especificado en nuestra clase

3. @PathVariable
Captura valores dinamicos en la URL

 */
@RestController
public class LogicaRestController {

    // Se indica el metodo get para obtener respuesta de la clase
    @GetMapping("/palindromo/{palabra}")
    // Se agrega la anotacion PathVariable para hacer dinamico la toma de datos
    public String esPalindromo(@PathVariable String palabra){

        /*
        Permite que al ser ingresada una palabra con espacios en blancos, sean eliminados los
        espacios y se agrupen
        Ejemplo: Anita Lava La Tina -> AnitaLavaLaTina
        Por ultimo, convierte esa palabra a minisculas
        AnitaLavaLaTina -> anitalavalatina
         */
        String palabraLimpia = palabra.replaceAll("\\s+","").toLowerCase();

        /*
        Toma la palabra anterior y se asigna a un objeto StringBuilder, de forma que el propio
        objeto ya tiene un metodo para invertir palabras, se hace uso de ese metodo
         */
        String reversa = new StringBuilder(palabraLimpia).reverse().toString();


        // Validaciones con if para comprobar la palabra
        if(palabraLimpia.equals(reversa)) {
            return palabra + " es un palindromo";
        } else {
            return palabra + " no es un palindromo";
        }

    }


}
