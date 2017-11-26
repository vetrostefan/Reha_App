package de.programmierenlernenhq.reha_app;

/**
 * Created by Vetro on 26.11.2017.
 */

public class RehaMemo {

    private String gerätename;
    private String buchstabe;
    private int zahl;
    private long id;


    public RehaMemo(String gerätename, String buchstabe, int zahl, long id) {
        this.gerätename = gerätename;
        this.buchstabe = buchstabe;
        this.zahl = zahl;
        this.id = id;
    }


    public String getGerätename() {
        return gerätename;
    }

    public void setGerätename(String gerätename) {
        this.gerätename = gerätename;
    }


    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getBuchstabe() {
        return buchstabe;
    }

    public void setBuchstabe(String buchstabe) {
        this.buchstabe = buchstabe;
    }




    @Override
    public String toString() {
        String output = gerätename + buchstabe + zahl;

        return output;
    }
}