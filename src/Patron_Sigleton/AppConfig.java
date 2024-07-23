package Patron_Sigleton;

public class AppConfig {
    private  static AppConfig instance;
    private String ServerUrl;
    private int puerto;
    private String dataBaseName;

    private AppConfig(){

    }
    public static synchronized AppConfig getInstance(){
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return ServerUrl;
    }

    public void setServerUrl(String serverUrl) {
        ServerUrl = serverUrl;
    }

    public static void setInstance(AppConfig instance) {
        AppConfig.instance = instance;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }
}