/*
 * - Se agrega interfaz IArbolTrie para que en caso de utilizar el TDA asi 
 * y luego querer usar otro, sea mas sencillo.
 * - Se modifico el constructor para que inicialice siempre la raiz del arbol
 * con el nodo "".
 * - Se modifico el isertar para que no inserte si la palabra es "" o si es null
 */
package trie.grupal.inaki;

/**
 *
 * @author Luis Tito
 */
public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;
    
    /**
     * Constructor
     */
    public TArbolTrie(){
        this.raiz = new TNodoTrie("");
    }

    /**
     * @author Luis Tito Inserta al trie una palabra, si no existe, lo crea.
     * @param palabra
     */
    @Override
    public void insertar(String palabra) {
        if ((palabra != null) && (palabra != "")) {
            String aux = palabra.toLowerCase();// Verifica si está en minúscula
            raiz.insertar(aux);
        } else {
            System.out.println("La palabra no puede ser vacia (\"\") o null");
        }
    }

    /**
     * @author Luis Tito Imprime las etiquetas del trie
     * @return 
     */
    @Override
    public String imprimir() {
        if (raiz != null) {
            return raiz.imprimir();
        }
        return "";
    }

    /**
     * @author Luis Tito Busca una palabra en el trie. si la encuentra = True;
     * si no = False;
     * @param palabra
     * @return
     */
    @Override
    public boolean buscar(String palabra) {
        return raiz.buscar(palabra);
    }
    
    /**
     * SOLO PARA CASOS DE PRUEBA
     */
    public void setRaiz(TNodoTrie nodo){
        this.raiz = nodo;
    }
}
