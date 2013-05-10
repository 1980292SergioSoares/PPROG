/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author soaressf
 */

public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        setTempo(hora, minuto, segundo);
    }

    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    public Tempo() {
        this(0, 0, 0);
    }

    public Tempo(Tempo t) {
        hora=t.hora;
        minuto=t.minuto;
        segundo=t.segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
    }

    public void setMinuto(int minuto) {
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
    }

    public void setSegundo(int segundo) {
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    public void setTempo(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String toStringHHMMSS() {
        return String.format("%02d%02d%02d", hora, minuto, segundo);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d %s", (hora == 12 || hora == 0) ? 12 : hora % 12, minuto, segundo, hora < 12 ? "AM" : "PM");
    }

    public void tick() {
        segundo = ++segundo % 60;
        if (segundo == 0) {
            minuto = ++minuto % 60;
            if (minuto == 0) {
                hora = ++hora % 24;
            }
        }
    }

    public int diferencaEmSegundos(Tempo t) {
        return Math.abs(segundos() - t.segundos());
    }

    private int segundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public boolean maior(Tempo t){
         if ( hora>t.hora ||
             (hora==t.hora && minuto>t.minuto) ||
             (hora==t.hora && minuto==t.minuto && segundo>t.segundo ))
            return true;
         return false;
    }
   
    public Tempo diferencaEmTempo(Tempo t) {
        int dif = diferencaEmSegundos(t);
        int s = dif % 60;
        dif = dif / 60;
        int m = dif % 60;
        int h = dif / 60;
        return new Tempo(h, m, s);
    }
}