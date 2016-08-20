/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenericoT1;

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
    public boolean insertar(INodoArbolGenericoT1<T> unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
