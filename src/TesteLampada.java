public class TesteLampada {
    public static void main(String[] args) throws Exception {
        LampadaComPotencialEVoltagem lampada = new LampadaComPotencialEVoltagem(60, 220);
        System.out.println("Estado da lampada - Ligada: " + lampada.estaLigada() + ", Potencia: "
                + lampada.getPotencia() + ", Voltagem: " + lampada.getVoltagem());

        lampada.ligar();

        System.out.println("Estado da lâmpada - Ligada: " + lampada.estaLigada() + ", Potência: "
                + lampada.getPotencia() + ", Voltagem: " + lampada.getVoltagem());
    }
}
