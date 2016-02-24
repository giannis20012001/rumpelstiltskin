package org.lumi.rumpelstiltskin;

import java.io.File;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */
public class Rumpelstiltskin {
    public void buildOSVImage(String imageName) {
        System.out.printf("%s %s...\n", "Building", imageName);
        System.out.println("yolo");

    }

    public void deployOSVImageLocally() {
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

    }

    /*Default paths are hardcoded ( for ease reasons)*/
    private static final String DEFAULT_HOME = System.getProperty("user.home");
    private static final String DEFAULT_CONFIG_PATH = DEFAULT_HOME + "/.capstan";
    private static final String DEFAULT_REPOSITORY_PATH = DEFAULT_CONFIG_PATH+ "/repository";
    private static final String DEFAULT_IMAGES_PATH = DEFAULT_REPOSITORY_PATH + "/cloudius";
    //
    private String BUILD_IMAGE_PATH;
}