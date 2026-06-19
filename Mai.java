class cla {
    int id;
    String n;

    public cla(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

public class Mai {
    public static void main(String[] args) {
        cla s1 = new cla(10, "Alice");
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
} 
