import jdk.incubator.vector.*;

public class VectorApiExample {
    public static void main(String[] args) {
        VectorSpecies<Integer> SPECIES = IntVector.SPECIES_256;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] c = new int[a.length];

        IntVector va = IntVector.fromArray(SPECIES, a, 0);
        IntVector vb = IntVector.fromArray(SPECIES, b, 0);
        IntVector vc = va.add(vb);
        vc.intoArray(c, 0);

        System.out.println("Result of vector addition: " + java.util.Arrays.toString(c));
    }
}
