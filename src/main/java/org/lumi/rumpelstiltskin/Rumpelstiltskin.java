package org.lumi.rumpelstiltskin;

import org.lumi.rumpelstiltskin.util.RuntimeExec;

import java.io.File;
import java.io.IOException;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */

public class Rumpelstiltskin {
    public void buildOSVImage(String pathToJar) {
        Runtime rt = Runtime.getRuntime();
        RuntimeExec rte = new RuntimeExec();
        RuntimeExec.StreamWrapper error, output;

        try {
            Process proc = rt.exec("capstan build -v springbootapp");// Enter capstan command
            error = rte.getStreamWrapper(proc.getErrorStream(), "ERROR");
            output = rte.getStreamWrapper(proc.getInputStream(), "OUTPUT");
            int exitVal = 0;

            error.start();
            output.start();
            error.join(3000);
            output.join(3000);
            exitVal = proc.waitFor();
            System.out.println("Output: " + output.getMessage() + "\nError: " + error.getMessage());

        }
        catch (IOException e) {
            e.printStackTrace();

        }
        catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    public void importOSVBaseImage() {
        //

    }

    public void deployOSVImage() {
        //

    }

    private void generateCapstanFile(String baseImageName, String cmdLine, String ListOfFiles) {
        //

    }

    private void createDirectory(String directoryName) {
        File theDir = new File(directoryName);

        // if the directory does not exist, create it
        if (!theDir.exists()) {
            System.out.println("creating directory: " + directoryName);
            boolean result = false;

            try{
                theDir.mkdir();
                result = true;

            }
            catch(SecurityException se){
                System.out.println(se);

            }
            if(result) {
                System.out.println("DIR created");

            }

        }
        else {
            System.out.println("DIR already exists");

        }

    }

    /*Constructor*/
    public Rumpelstiltskin() {
        createDirectory(DEFAULT_CONFIG_PATH);
        createDirectory(DEFAULT_REPOSITORY_PATH);
        createDirectory(DEFAULT_IMAGES_PATH);
        createDirectory(DEFAULT_CAPSTAN_PATH);

    }

    /*Default paths are hardcoded (for ease reasons)*/
    private static final String DEFAULT_HOME = System.getProperty("user.home");
    private static final String DEFAULT_CONFIG_PATH = DEFAULT_HOME + "/.capstan";
    private static final String DEFAULT_REPOSITORY_PATH = DEFAULT_CONFIG_PATH+ "/repository";
    private static final String DEFAULT_IMAGES_PATH = DEFAULT_REPOSITORY_PATH + "/cloudius";
    private static final String DEFAULT_CAPSTAN_PATH = DEFAULT_HOME + "/bin";
    //
    private String FINAL_IMAGE_BUILD_PATH;
}