package org.lumi.rumpelstiltskin.util;

import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */
public class Repository {
    public void createNewRepo() {

    }

    /*Constructor*/
    public Repository(URL osvUrl, Path confPath) {
        this.osvUrl = osvUrl;
        this.confPath = confPath;
        images = new ArrayList<Image>();

    }

    /*Setters & Getters*/
    public URL getOsvUrl() {
        return osvUrl;

    }

    public void setOsvUrl(URL osvUrl) {
        this.osvUrl = osvUrl;

    }

    public Path getConfPath() {
        return confPath;

    }

    public void setConfPath(Path confPath) {
        this.confPath = confPath;

    }

    public List<Image> getImages() {
        return images;

    }

    public void setImages(List<Image> images) {
        this.images = images;

    }

    /*Repository related variables*/
    private URL osvUrl;
    private Path confPath;
    private List<Image> images;

}
