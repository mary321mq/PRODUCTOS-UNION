import java.util.Scanner;
public class union_prueba {
    Scanner scanner = new Scanner(System.in);
    public void opciones() {
        String opcionPV, opcionU, opcionEn;
        System.out.println("PUNTOS DE VENTA");
        System.out.println("Conoce las ubicaciones donde puedes encontrar nuestros productos");
        System.out.println("\uD83D\uDED2Supermercados");
        System.out.println("⛟Bodegas y distribuidores");
        System.out.println("1. Conoce más");
        System.out.println("2. Entrega");
        opcionPV = scanner.nextLine();
        switch (opcionPV) {
            case "1":
                System.out.println("Ingrese su ubicación");
                System.out.println("Lima");
                System.out.println("Arequipa");
                System.out.println("Juliaca");
                System.out.println("Huanuco");
                System.out.println("Pucallpa");
                System.out.println("Chimbote");
                System.out.println("Trujillo");
                System.out.println("Piura");
                System.out.println("Jaèn");
                System.out.println("Tarapoto");
                System.out.println("Iquitos");
                opcionU = scanner.nextLine();
                switch (opcionU) {
                    case "Lima":
                        System.out.println("Salida | Universidad de la Unión Peruana");
                        System.out.println("Carretera Central Km 19.5 Hermana\n" +
                                "Chosica, Lima");
                        break;
                    case "Arequipa":
                        System.out.println("Av. La Marina 123, Cayma, Arequipa");
                        break;
                    case "Juliaca":
                        System.out.println("Jr. San Román 345, Juliaca, Puno");
                        break;
                    case "Huanuco":
                        System.out.println("Jr. 2 de Mayo 456, Huanuco");
                        break;
                    case "Pucallpa":
                        System.out.println("Av. Centenario 123, Pucallpa, Ucayali");
                        break;
                    case "Chimbote":
                        System.out.println("Av. José Gálvez 345, Chimbote, Ancash");
                        break;
                    case "Trujillo":
                        System.out.println("Jr. Independencia 456, Trujillo, La Libertad");
                        break;
                    case "Piura":
                        System.out.println("Av. Sullana 123, Piura");
                        break;
                    case "Jaèn":
                        System.out.println("Jr. Amazonas 345, Jaèn, Cajamarquilla");
                        break;
                    case "Tarapoto":
                        System.out.println("Av. Tarapoto 456, Tarapoto, San Martín");
                        break;
                    case "Iquitos":
                        System.out.println("Av. La Marina 123, Iquitos, Loreto");
                        break;
                }
                break;
            case "2":
                System.out.println("Ingrese su dirección de entrega");
                opcionEn = scanner.nextLine();
                System.out.println("Su pedido será entregado a " + opcionEn);
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
    public static void main(String[] args) {
        union_prueba union = new union_prueba();
        union.opciones();
    }
}