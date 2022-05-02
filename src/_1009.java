import java.io.*;
import java.util.StringTokenizer;

public class _1009 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int calc(int n, int r){
        switch(n%10) {
            case 0 : return 10;  // 0,0,0,0...
            case 1 : return 1;  // 1,1,1,1...
            case 2 : return (int)Math.pow(2,r%4+4)%10;   // 2,4,8,6...
            case 3 : return (int)Math.pow(3,r%4+4)%10;   // 3,9,7,1...
            case 4 : return (int)Math.pow(4,r%2+2)%10;   // 4,6,4,6...
            case 5 : return 5;  // 5,5,5,5...
            case 6 : return 6;  // 6,6,6,6...
            case 7 : return (int)Math.pow(7,r%4+4)%10;   // 7,9,3,1...
            case 8 : return (int)Math.pow(8,r%4+4)%10;   // 8,4,2,6...
            case 9 : return (int)Math.pow(9,r%2+2)%10;   // 9,1,9,1...
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write(String.valueOf(calc(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())))+"\n");
        }
        bw.flush();
    }
}
