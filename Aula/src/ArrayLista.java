import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista implements UmMonteDeNumero {
    private ArrayList<Integer> lista;

    public ArrayLista() {
        this.lista= new ArrayList<>();
    }

    @Override
    public int buscar(int n) {
        return lista.indexOf(n);
    }
 
    @Override
    public void inserir(int n) {
        lista.add(n);
        
    }

    @Override
    public int numero(int index) {
       
        return lista.get(index);
    }

    @Override
    public void ordenar() {
       Collections.sort(lista);
        
    }

    @Override
    public int tamanho() {
        
        return lista.size();
    }

}
