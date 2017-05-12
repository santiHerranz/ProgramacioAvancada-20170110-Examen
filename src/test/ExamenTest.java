package test;

import demo.Solucio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by santi on 12/05/2017.
 */
class ExamenTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void OneTest() {
        Solucio s = new Solucio(1);
        System.out.println(s.mostraAlumnes());
        s.backSolucio(0, null);
        System.out.println(s.toString());
    }

    @Test
    void TwoTest() {
        Solucio s = new Solucio(2);
        System.out.println(s.mostraAlumnes());
        s.backSolucio(0, null);
        System.out.println(s.toString());
    }


    @Test
    void FiveTest() {
        Solucio s = new Solucio(5);
        System.out.println(s.mostraAlumnes());
        s.backSolucio(0, null);
        System.out.println(s.toString());
    }


}