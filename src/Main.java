import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        String command = "";
        int push = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            switch (command) {
                case "push" :
                    push = Integer.parseInt(st.nextToken());
                    arrDeq.add(push);
                    break;

                case "pop" :
                    if (arrDeq.isEmpty()) {
                        bw.write("-1" + "\n");
                    }
                    else {
                        bw.write(String.valueOf(arrDeq.pop()) + "\n");
                    }
                    break;

                case "size" :
                    bw.write(String.valueOf(arrDeq.size()) + "\n");
                    break;

                case "empty" :
                    bw.write(arrDeq.isEmpty() ? "1" + "\n" : "0" + "\n");
                    break;

                case "front" :
                    bw.write(arrDeq.isEmpty() ? "-1" + "\n" : String.valueOf(arrDeq.peek()) + "\n");
                    break;

                default :
                    bw.write(arrDeq.isEmpty() ? "-1" + "\n" : String.valueOf(arrDeq.peekLast()) + "\n");
                    break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

