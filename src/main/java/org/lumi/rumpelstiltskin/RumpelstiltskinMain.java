package org.lumi.rumpelstiltskin;

import java.io.IOException;

/**
 * Created by lumi (A.K.A. John Tsantilis) on 19/2/2016.
 */

public class RumpelstiltskinMain {
    public static void main(String[] args) throws IOException {
        Rumpelstiltskin yolo = new Rumpelstiltskin();
        try{
            yolo.buildOSVImage("/home/lumi/IdeaProjects/springbootapp/", "springbootapp.jar");

        }
        catch (InterruptedException ie) {
            System.out.println(ie);

        }

    }

}
