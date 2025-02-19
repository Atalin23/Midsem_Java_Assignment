public class Largestelement {
    public static void main(String[] args) {
            // Example array
            int[] array = {13, 20, 5, 45, 30, 80, 25};
            
            // Initialize the first element as the largest
            int largest = array[0];
            
            for (int i = 1; i < array.length; i++) {
                if (array[i] > largest) {
                    largest = array[i];
                }
            }
            
            System.out.println("The largest element in the array is: " + largest);
        }
}
