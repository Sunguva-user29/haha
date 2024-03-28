 package unit3;

class PassingReferenceToMethod {
    int a = 5;
    int b = 10;

    void add(PassingReferenceToMethod ob) {
        ob.a = ob.a + 3;
        ob.b = ob.b + 3;
    }

    public static void main(String args[]) {
        PassingReferenceToMethod obj = new PassingReferenceToMethod();
        System.out.println("Before method call: a = " + obj.a + ", b = " + obj.b);
        obj.add(obj);
        System.out.println("After method call: a = " + obj.a + ", b = " + obj.b);
    }
}
