 package unit3;

class X {
    void sum(int a, int b) {
        a = a + 5;
        b = b + 5;
    }
}

public class PassingValueToMethod {
    public static void main(String args[]) {
        int m = 10;
        int n = 20;
        X obj = new X();
        System.out.println("Before method call: m=" + m + " n=" + n);
        obj.sum(m, n);
        System.out.println("After method call: m=" + m + " n=" + n);
    }
}
