/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pltobytecode;

import java.util.HashMap;

/**
 *
 * @author Shu
 */
public class TabelaSimbolos {
    
    TabelaSimbolos pai;
    HashMap<String, Token.Type> tabela = new HashMap<>();
    
    public TabelaSimbolos(){
        
    }
    
    public TabelaSimbolos(TabelaSimbolos pai) {
        this.pai = pai;
    }
    
    public Object lookup(String varNome) throws Exception {
        if (tabela.get(varNome) != null) {
            return tabela.get(varNome);
        } else if (pai != null){
            return pai.lookup(varNome);
        } else {
            throw new Exception();
        }
    }
    
    public void addId(String id, Token.Type tipo) {
        tabela.put(id, tipo);
    }   
    
}
