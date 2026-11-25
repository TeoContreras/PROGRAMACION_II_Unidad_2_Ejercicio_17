public class main {
    public static void main(String[] args) {
        VehiculoElectrico auto = new VehiculoElectrico(60, 45);
        SurtidorElectrico surtidor = new SurtidorElectrico();

        surtidor.iniciarCarga(auto, 10);
        System.out.println("Nivel final de batería: " + auto.getNivelActual());
    }
}
