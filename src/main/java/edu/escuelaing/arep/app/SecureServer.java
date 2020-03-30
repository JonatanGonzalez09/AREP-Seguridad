package edu.escuelaing.arep.app;

import static spark.Spark.*;

public class SecureServer {
    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath, truststorePassword);
        port(getPort());
        secure("Documents/ecikeypair.p12", "keyeci2020", null, null);
        get("/hello", (req, res) -> "Hello World");
    }

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}