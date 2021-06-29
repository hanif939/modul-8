package Stack;

public class TumpukanApp {
public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(10);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long top = tumpukan.pop();
        System.out.println("nilai = "+ top);
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
        
    }
}
