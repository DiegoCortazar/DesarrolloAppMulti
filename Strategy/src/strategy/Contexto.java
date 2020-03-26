/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author DiegoCortazar
 */
public class Contexto {
    
    private ICiframiento estrategia;

    public Contexto(ICiframiento estrategia) {
        this.estrategia = estrategia;
    }
    
    public void ejecutar(String msg) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        this.estrategia.cifrar(msg);
    }
   
}
