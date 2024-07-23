package Patron_Sigleton;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        config.setPuerto(8080);
        config.setDataBaseName("Base_Datos_Abdiel_Alonzo");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("El puerto del servidor es: " + config.getPuerto());
        System.out.println("La bse de datos es: " + config.getDataBaseName());
        System.out.println("configuracion1 y configuracion2 son las mismas instancias: " + (config == config2));
    }
}