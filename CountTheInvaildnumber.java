public class CountTheInvaildnumber {
    public static void main(String a[]) {

        int sum = 0;
        int invalidNumber = 0;

        for (int i=0;i<a.length;i++) {
             try {
                sum += Integer.parseInt(a[i]);
                } 
             catch (NumberFormatException e) {
                ++invalidNumber;
                }
        }

        System.out.println("Total no.of arguments: "+a.length);
        System.out.println("Invalid Integers: "+invalidNumber);
        System.out.println("Sum: "+sum);

        }
    }

