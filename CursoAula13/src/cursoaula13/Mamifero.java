/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoaula13;

/**
 *
 * @author eduardo.borges
 */
public class Mamifero extends Animal{
    protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
}
