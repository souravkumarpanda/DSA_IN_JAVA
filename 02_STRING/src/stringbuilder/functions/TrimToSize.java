// 14.
package stringbuilder.functions;

public class TrimToSize {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("Java");
        System.out.println("Before Trim: ");
        System.out.println("Length: "+sb.length());
        System.out.println("Capacity: "+sb.capacity());
        sb.trimToSize();
        System.out.println("\nAfter Trim: ");
        System.out.println("Length: "+sb.length());
        System.out.println("Capacity: "+sb.capacity());
    }
}
