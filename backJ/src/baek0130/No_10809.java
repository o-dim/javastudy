package baek0130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class No_10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> alphabetMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabetMap.put('a' + i, -1);
        }

        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i);
            if (alphabetMap.get(index) == -1) {
                alphabetMap.put(index, i);
            }
        }

        alphabetMap.forEach((key, value) -> {
            sb.append(value).append(" ");
        });
        System.out.println(sb);
	}
}
