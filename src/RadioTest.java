import java.io.*;

/**
 * Created by dfn on 15/9/28.
 */
public class RadioTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = RadioTest.class.getResourceAsStream("radio.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line;

        while ( (line = br.readLine()) != null) {
            String[] fields = line.replaceAll("^\\s+","").split("\\s+");
            if (fields.length == 1) {
                System.out.println("save city"+fields[0]);
            } else if (fields.length == 3) {
                System.out.println("save fm" + fields[ 0 ] + "," + fields[1]+","+fields[2] );
            } else {
                System.err.printf("row data error:%s\n", line);
            }
        }
    }

    public void  test(){

    }
}
