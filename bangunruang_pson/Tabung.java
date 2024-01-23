
package bangunruang_pson;


public class Tabung extends BangunRuang{
     double t;
     int r;
    double volume(){
    double volume = 22.0/7.0*r*r*t;
        System.out.println("Volume tabung:"+volume+"cm3");
        return volume;
}
}
