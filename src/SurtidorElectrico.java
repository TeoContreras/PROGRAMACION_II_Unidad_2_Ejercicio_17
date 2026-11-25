public class SurtidorElectrico {
    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos) {
        for (int i = 1; i <= minutos; i++) {
            if (vehiculo.getNivelActual() >= vehiculo.getCapacidadBateria()) {
                System.out.println("Batería al 100%. Se detuvo la carga.");
                break;
            }
            vehiculo.recibirCarga(2);
            System.out.printf("Minuto %d - Carga: %.1f / %.1f%n",
                    i, vehiculo.getNivelActual(), vehiculo.getCapacidadBateria());
        }
    }
}
