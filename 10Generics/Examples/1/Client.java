/*
    What is backward compatibility :
        New code should not break older implementation.
        Example : Introduction of Hashmap did not break Pair class implementation.
 */

class Client {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Vishal");
        // Above will apply compile check also and make sure respective datatype
        // is only set to the parameters.
        System.out.println(p1.getFirst() + " -> " + p1.getSecond());
    }
}