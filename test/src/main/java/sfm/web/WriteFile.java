package sfm.web;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        File outputFile = new File("rebate-award");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outputFile),
                StandardCharsets.UTF_8));

        long openId = 3035766404974664711L;
        int count = 0;
        while (count < 1000) {
            String line;
            if (count == 99) {
                line = "sfm511,101";
            } else {
                openId += count;
                var a = Math.random() > 0.5 ? 1 : 0;
                var b = Math.random() > 0.5 ? 1 : 0;
                var c = Math.random() > 0.5 ? 1 : 0;
                var rebate = c * 100 + b * 10 + a;
                if (rebate == 0)
                    continue;
                line = openId + "," + rebate;
            }
            writer.write(line);
            writer.newLine();
            count++;
        }
        writer.flush();
        writer.close();
    }

}
