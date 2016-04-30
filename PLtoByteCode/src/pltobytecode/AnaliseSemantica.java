/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pltobytecode;

/**
 *
 * @author Shu
 */
public class AnaliseSemantica {
    
    TabelaSimbolos tabelaSimbolo = new TabelaSimbolos();

    public void postOrder(Parser.Node no) {
        
        for (Parser.Node n : no.children) {
            if (n.children != null) {
                postOrder(n);
            }
        }
        switch (no.id) {
            case "BEGIN":
            case "var":
                tabelaSimbolo.addId(null, Token.Type.ID);
                
                
        }
    }


}
