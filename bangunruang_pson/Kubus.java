
package bangunruang_pson;


public class Kubus extends BangunRuang {
    
    int s;
    double volume(){
    double volume = s*s*s;
        System.out.println("Volume kubus:"+volume+"cm3");
        return volume;
}
}
