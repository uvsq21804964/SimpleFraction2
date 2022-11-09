public class main {
    
    public static void main(String[] args) {

        System.out.println("Hello World");
        fraction f = new fraction();
        assert f.toString().equals("Je suine fraction.") : "toString() ne retoure pas la bonne phrase.";
    }
    
}