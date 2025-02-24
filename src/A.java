class a {
    a() {
        System.out.println("in a");
    }

    void show() {
        System.out.println("show.....");
    }
}

class b extends a {
    b() {
        System.out.println("in b"); // Corrected to print "in b"
    }

    void pri() {
        System.out.println("pri.....");
        String string = toString();// Corrected to print "pri....."
    }
}

public class A {
    public static void main(String[] args) {
        b B = new b();
    }
}
