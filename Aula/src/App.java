public class App {
    public static void main(String[] args) {
        ArrayLista minhaLista = new ArrayLista();
       System.out.println(minhaLista.tamanho());
        minhaLista.inserir(8);
        System.out.println(minhaLista.tamanho());
        System.out.println(minhaLista.numero(0));
    }
}
