import java.util.Random;

public class LampadaComPotencialEVoltagem {
    private boolean ligada;
    private int potencia;
    private int voltagem;

    public LampadaComPotencialEVoltagem(int potencia, int voltagem) {
        this.potencia = potencia;
        this.voltagem = voltagem;
    }

    public void ligar() {
        if (checarSeQueima()) {
            System.out.println("A lâmpada queimou ao ser ligada!");
            ligada = false;
        } else {
            ligada = true;
        }
    }

    public void desligar() {
        ligada = false;
    }

    public boolean estaLigada() {
        return ligada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    private boolean checarSeQueima(){
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance < 15;
    }
}
