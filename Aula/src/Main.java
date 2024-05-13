import java.util.Scanner;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
    }
}

class ListaEncadeada {
    No inicio;

    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

public class Main {
    public static ListaEncadeada lerLista() {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        System.out.print("Digite os valores separados por espaço: ");
        String[] valores = scanner.nextLine().split(" ");
        for (String valor : valores) {
            lista.adicionar(Integer.parseInt(valor));
        }
        return lista;
    }

    public static ListaEncadeada intercalarListas(ListaEncadeada listaA, ListaEncadeada listaB, int z, int y) {
        ListaEncadeada listaC = new ListaEncadeada();
        No ponteiroA = listaA.inicio;
        No ponteiroB = listaB.inicio;
        boolean intercalar = false;

        while (ponteiroA != null || ponteiroB != null) {
            if (ponteiroA != null && ponteiroA.valor == z) {
                intercalar = !intercalar;
            }
            if (intercalar && ponteiroB != null && ponteiroB.valor != y) {
                listaC.adicionar(ponteiroB.valor);
                ponteiroB = ponteiroB.proximo;
            } else if (!intercalar && ponteiroA != null) {
                listaC.adicionar(ponteiroA.valor);
                ponteiroA = ponteiroA.proximo;
            } else {
                break;
            }
        }

        while (ponteiroA != null) {
            listaC.adicionar(ponteiroA.valor);
            ponteiroA = ponteiroA.proximo;
        }

        while (ponteiroB != null) {
            listaC.adicionar(ponteiroB.valor);
            ponteiroB = ponteiroB.proximo;
        }

        return listaC;
    }

    public static void main(String[] args) {
        ListaEncadeada listaA = lerLista();
        ListaEncadeada listaB = lerLista();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor Z: ");
        int z = scanner.nextInt();
        System.out.print("Digite o valor Y: ");
        int y = scanner.nextInt();

        ListaEncadeada listaC = intercalarListas(listaA, listaB, z, y);
        System.out.println("Lista C (intercalada):");
        listaC.exibir();
    }
}
