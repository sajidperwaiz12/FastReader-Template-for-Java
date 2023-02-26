// Importing java.io.package for using BufferedReader class and handling IOException
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // FastReader class for taking input
    static class FastReader {
        BufferedReader br;
        // Used for separating string input with space
        StringTokenizer st;

        // This will create an object of BufferedReader class
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        byte nextByte() { return Byte.parseByte(next()); }

        short nextShort() { return Short.parseShort(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

        float nextFloat() { return Float.parseFloat(next()); }

        boolean nextBoolean() {
            String str = in.next();
            if (str.matches("true")) {
                return true;
            } else {
                return false;
            }
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
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
        String name = in.nextLine();
        int roll = in.nextInt();
        double pocketMoney = in.nextDouble();
        out.println("Name of the student: " + name);
        out.println("His roll no: " + roll);
        out.println("His pocket money: " + pocketMoney);
        out.close(); // Remember to close writer class after printing all the inputs
    }
}