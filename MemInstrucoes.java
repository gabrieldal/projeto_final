public class MemInstrucoes {
    private int[] memoria = new int[128];

    public MemInstrucoes() {
        for (int i = 0; i < memoria.length; i++) {
            memoria[i] = 0;
        }
    }

    public void setInstrucao(int posicao, int valor) {
        memoria[posicao] = valor;
    }

    public int getInstrucao(int posicao) {
        return memoria[posicao];
    }

    public String getInstructions() {
        String instructions = new String("");

        for (int i = 0; i < 128; i++) {
            // System.out.println(memoria[i]);
            if (i<=9){
                instructions += "   Posicao [00" + i + "]->    " + memoria[i] + "\n";
            }else if (i<=99){
                instructions += "   Posicao [0" + i + "]->    " + memoria[i] + "\n";
            }else{
                instructions += "   Posicao [" + i + "]->    " + memoria[i] + "\n";
            }
        }
        return instructions;
    }
}
