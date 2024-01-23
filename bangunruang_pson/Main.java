
package bangunruang_pson;


public class Main {
    public static void main(String[] args) {
    
    BangunRuang bangunruang_pson = new BangunRuang();

    Bola bola = new Bola();
    bola.r = 4;
    bola.volume();

    Kubus kubus = new Kubus();
    kubus.s = 6;
    kubus.volume();

    Tabung tabung = new Tabung();
    tabung.r = 21;
    tabung.t = 34;
    tabung.volume();

    LimasSegitiga limassegitiga = new LimasSegitiga();
    limassegitiga.la = 13;
    limassegitiga.t = 9;
    limassegitiga.volume();

    }
}
