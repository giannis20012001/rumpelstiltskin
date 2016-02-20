package org.lumi.rumpelstiltskin.util;

import java.net.URL;
import java.nio.file.Path;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */
public class Repository {


    public Repository() {
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

    public String getFormatVersion() {
        return formatVersion;

    }

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;

    }

    public String getVersion() {
        return version;

    }

    public void setVersion(String version) {
        this.version = version;

    }

    public String getCreated() {
        return created;

    }

    public void setCreated(String created) {
        this.created = created;

    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description = description;

    }

    public String getBuild() {
        return build;

    }

    public void setBuild(String build) {
        this.build = build;

    }

    /*Repository related variables*/
    private URL url;
    private Path path;
    /*ImageInfo related variables*/
    String formatVersion;
    String version;
    String created;
    String description;
    String build;

}
