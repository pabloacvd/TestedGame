package ar.com.xeven.testedgame;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestedGameApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TestedGameApplication.class, args);

        Integer vidas = 6;
        List<Personaje> personajes = List.of(
            new Personaje("pablo", 0, vidas),
            new Personaje("natalia", 0, vidas),
            new Personaje("juli", 0, vidas)
        );

        for(Personaje personaje: personajes){
            Personaje personajeDespuesDeJugar = jugar(personaje);
            System.out.println(personajeDespuesDeJugar.getResultados());
            if(personajeDespuesDeJugar.puedeSeguirJugando())
                System.out.println(personaje.getNombre()+" ganó!");
            else
                System.out.println(personaje.getNombre()+" perdió!");
        }
    }

    public static Personaje jugar(Personaje personaje){
        for(int ronda = 0; ronda < 11; ronda++){
            int tipoJugada = (int) (Math.random()*100);

            if(!personaje.jugar(tipoJugada % 2 == 0)){
                return personaje;
            }
        }
        return personaje;
    }

}
