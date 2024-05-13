public interface UmMonteDeNumero {
    //"Contrato", uma promessa, uma ESPECIFICAÇÃO..

    // Método para inserir um número NOVO....
    public boolean inserir(int n);

    // Método para buscar um número (verificar se ele existe)
    public int buscar(int n);

    // Método para me dizer o tamanho da estrutura de "um monte de número"
    // Em bom mineirês: qual é o tamanho do "trem"?
    public int tamanho();

    // Método que ordena o "trem" ou esse "monte de número"
    public void ordenar();

    // Método que eu passo um "índice" e ele me devolve o número guardado no "trem"
    public int numero(int index);

    public void imprimir();
}