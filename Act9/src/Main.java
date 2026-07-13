public class Main {

    public static void main(String[] args) {

        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"}, // <- Error Numérico

            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"}, // Cantidad de canciones < 5
            
            {"Duki", "Trap", "500000", "14", null}
        };

        for (int i = 0; i < datosCantantes.length; i++) {

            try {

                Cantante cantante = new Cantante(
                        datosCantantes[i][0],
                        datosCantantes[i][1],
                        Integer.parseInt(datosCantantes[i][2]),
                        Integer.parseInt(datosCantantes[i][3]),
                        datosCantantes[i][4]
                );

                cantante.mostrarManager();
                cantante.asignarEscenario("Escenario Alternativo");
                cantante.liquidarHonorarios(10);
                cantante.realizarSoundcheck();

            } catch (NumberFormatException e) {
                System.out.println("El cachet tiene que ser númerico.");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (EspectaculoCortoException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Ya se probaron los catch del cantante lol");
            }
        }
        System.out.println("Fin del festival.");
    }
}

