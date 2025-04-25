
public class stringCompression3 {

    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            //Assigning work
            chars[index] = currentChar;
            index++;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index] = c;
                    index++;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);

        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
}
