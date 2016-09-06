package org.lumi.rumpelstiltskin.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by John Tsantilis (A.K.A lumi) on 25/2/2016.
 */
public class IOThreadHandler extends Thread {
    @Override
    public void run() {
        Scanner br = null;
        try{
            br = new Scanner(new InputStreamReader(inputStream));
            String line = null;

            while (br.hasNextLine()) {
                line = br.nextLine();
                output.append(line + System.getProperty("line.separator"));

            }

        }
        finally {
            br.close();

        }

    }

    public StringBuilder getOutput() {
        return output;

    }

    public IOThreadHandler(InputStream inputStream) {
        this.inputStream = inputStream;

    }

    private InputStream inputStream;
    private StringBuilder output = new StringBuilder();

}
