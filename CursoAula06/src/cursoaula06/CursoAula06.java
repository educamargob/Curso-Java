/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula06;

/**
 *
 * @author eduardo.borges
 */
public class CursoAula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
    }
    
}
