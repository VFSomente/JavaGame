


abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;


    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }


    public abstract void atacar(Personagem alvo);

    // Método para sofrer dano
    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
    }


    public boolean estaVivo() {
        return this.vida > 0;
    }


    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}


class Guerreiro extends Personagem {


    public Guerreiro(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }


    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " ataca com sua espada!");
        alvo.receberDano(this.ataque);
    }
}


class Mago extends Personagem {
    private int mana;


    public Mago(String nome, int vida, int ataque, int mana) {
        super(nome, vida, ataque);
        this.mana = mana;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (this.mana >= 10) {
            System.out.println(this.nome + " lança uma bola de fogo!");
            alvo.receberDano(this.ataque + 5); // Ataque mágico mais forte
            this.mana -= 10;
        } else {
            System.out.println(this.nome + " está sem mana suficiente! Usando ataque básico.");
            alvo.receberDano(this.ataque);
        }
    }

    public int getMana() {
        return mana;
    }
}


