package org.lumi.rumpelstiltskin;

import org.lumi.rumpelstiltskin.util.IOThreadHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */

public class Rumpelstiltskin {
    public void buildOSVImage(String pathToJar, String jarName) throws InterruptedException, IOException {
        ProcessBuilder pb = new ProcessBuilder("capstan", "build", "-v", jarName);
        pb.directory(new File(pathToJar));
        Process process = pb.start();
        IOThreadHandler outputHandler = new IOThreadHandler(process.getInputStream());
        outputHandler.start();
        process.waitFor();
        System.out.println(outputHandler.getOutput());

    }

    public void importOSVBaseImage() {
        //

    }

    public void deployOSVImage() {
        //

    }

    private String getCapstanfile(ProcessBuilder pb) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append("base: ").append("cloudius/osv-openjdk8").append("\n\n");
        sb.append("cmdline: ").append("/java.so -jar ").append("yolo").append("\n\n");
        sb.append("files:\n");
        sb.append("  yolo").append("\n");

        return sb.toString();

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
    private static final Path PATH_ROOT = Paths.get(File.separator);
    //
    private String FINAL_IMAGE_BUILD_PATH;
}