public class Jogo {
    public static void main(String[] args) {
        // Criando os personagens
        Guerreiro guerreiro = new Guerreiro("Biel", 100, 20);
        Mago mago = new Mago("Vitu", 80, 15, 30);

        // Loop de batalha
        while (guerreiro.estaVivo() && mago.estaVivo()) {
            // Guerreiro ataca o Mago
            guerreiro.atacar(mago);
            if (!mago.estaVivo()) {
                System.out.println(mago.getNome() + " foi derrotado!");
                break;
            }

            // Mago ataca o Guerreiro
            mago.atacar(guerreiro);
            if (!guerreiro.estaVivo()) {
                System.out.println(guerreiro.getNome() + " foi derrotado!");
                break;
            }

            System.out.println(); // Linha em branco para melhor leitura da batalha
        }
    }
}