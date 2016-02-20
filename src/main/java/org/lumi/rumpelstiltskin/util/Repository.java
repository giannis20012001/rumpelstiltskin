package org.lumi.rumpelstiltskin.util;

import java.net.URL;
import java.nio.file.Path;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */
public class Repository {


    public Repository(URL url, Path path) {
        //

    }

    /*Setters & Getters*/
    public URL getUrl() {
        return url;

    }

    public void setUrl(URL url) {
        this.url = url;

    }

    public Path getPath() {
        return path;

    }

    public void setPath(Path path) {
        this.path = path;

    }

    /*Repository related variables*/
    private URL url;
    private Path path;

}
