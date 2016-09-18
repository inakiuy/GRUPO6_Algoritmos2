/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenericoT1;

import java.util.LinkedList;

/**
 *
 * @author Inaki
 */
public class TArbolGenericoT1<T> implements IArbolGenericoT1<T>{

    private INodoArbolGenericoT1 raiz;
    
    /**
     * Constructor
     */
    public TArbolGenericoT1() {
        raiz = null;
    }
            
    @Override
    public boolean insertar(Comparable etiqueta, Comparable padre) {
        if (esVacio()) {
               raiz = new TNodoArbolGenericoT1(etiqueta);
               return true;
        } else {
            return raiz.insertar(etiqueta, padre);
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz.eliminar(unaEtiqueta);
        }
    }

    @Override
    public INodoArbolGenericoT1<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String preOrden() {
        LinkedList<String> resultado = new LinkedList<>();
        if (this.esVacio()){
            return resultado.toString();
        }
        this.raiz.preOrden(resultado);
        return resultado.toString();
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return 
     */
    @Override
    public int getOrden(){
        int resultado = 0;
        if (this.esVacio()){
            return resultado;
        }
        this.raiz.getOrden(resultado);
        return resultado;
    }
    
    @Override
    public boolean esVacio() {
        return (raiz == null);
    }

    @Override
    public INodoArbolGenericoT1<T> getRaiz() {
        return this.raiz;
    }
    
}
