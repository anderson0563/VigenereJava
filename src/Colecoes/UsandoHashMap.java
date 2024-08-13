/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecoes;

import java.util.HashMap;

/**
 *
 * @author anderson
 */
public class UsandoHashMap {
    HashMap lista;
    public UsandoHashMap(){
        lista = new HashMap();
    }
    public boolean Colocar(String login, String senha){
        lista.put(login, senha);
        return lista.containsKey(login);
    }
    public String PegarSenha(String login){
        return (String)lista.get(login);
    }
    public boolean Apagar(String login){
        return lista.remove(login, lista.get(login));
    }
    public static void main(String[] args) {
        UsandoHashMap um = new UsandoHashMap();
        um.Colocar("facebook", "123456");
        um.Colocar("linkedin", "09876");
        um.Colocar("windows", "123");
        System.out.println(um.PegarSenha("linkedin"));
        System.out.println(um.PegarSenha("facebook"));
        System.out.println(um.PegarSenha("windows"));
        um.Apagar("facebook");
        System.out.println(um.PegarSenha("windows"));
        System.out.println(um.PegarSenha("facebook"));
    }
}
