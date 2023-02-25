// Importing java.io.package for using BufferedReader class and handling IOException
import java.io.*;

public class Main {
    // FastReader class for taking input
    static class FastReader {
        BufferedReader br;

        // It will create the object of BufferedReader class
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        // for taking input of type integer
        int nextInt() throws IOException {
            return Integer.parseInt(br.readLine());
        }

        // for taking input of type long
        long nextLong() throws IOException {
            return Long.parseLong(br.readLine());
        }

        // for taking input of type double
        double nextDouble() throws IOException {
            return Double.parseDouble(br.readLine());
        }

        // for taking input of type byte
        byte nextByte() throws IOException {
            return Byte.parseByte(br.readLine());
        }

        // for taking input of type short
        short nextShort() throws IOException {
            return Short.parseShort(br.readLine());
        }

        // for taking input of type float
        float nextFloat() throws IOException {
            return Float.parseFloat(br.readLine());
        }

        // for taking input of type character
        char nextChar() throws IOException {
            return (char) br.readLine().charAt(0);
        }

        // for taking input of type string
        String nextString() throws IOException {
            return br.readLine();
        }

        // for taking input of type boolean
        boolean nextBoolean() throws IOException {
            String str = in.nextString();
            if (str.matches("true")) {
                return true;
            } else {
                return false;
            }
        }

        // for taking integer array input
        int[] nextIntLine() throws IOException {
            int size = in.nextInt();
            int[] arr = new int[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            return arr;
        }

        // for taking long array input
        long[] nextLongLine() throws IOException {
            int size = in.nextInt();
            long[] arr = new long[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(nums[i]);
            }
            return arr;
        }

        // for taking float array input
        float[] nextFloatLine() throws IOException {
            int size = in.nextInt();
            float[] arr = new float[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Float.parseFloat(nums[i]);
            }
            return arr;
        }

        // for taking double array input
        double[] nextDoubleLine() throws IOException {
            int size = in.nextInt();
            double[] arr = new double[size];
            String[] nums = br.readLine().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(nums[i]);
            }
            return arr;
        }
    }

    // FastWriter class for printing output
    static class FastWriter {
        private final BufferedWriter bw;

        // This will create object of BufferedWriter class
        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        // for printing object in same line
        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        // for printing object in different line
        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        // Make sure to close BufferedWriter object
        public void close() throws IOException {
            bw.close();
        }
    }

    // Method to create object of FastReader class
    static FastReader in = new FastReader();

    // Method to create object of FastWriter class
    static FastWriter out = new FastWriter();
    public static void main(String[] args) throws IOException {
        // Program to take input of a student name, roll, and monthly pocket money (in decimal)
        String name = in.nextString();
        int roll = in.nextInt();
        double pocketMoney = in.nextDouble();
        out.println("Name of the student: " + name);
        out.println("His roll no: " + roll);
        out.println("His pocket money: " + pocketMoney);
        out.close(); // Remember to close writer class after printing all the inputs
    }
}