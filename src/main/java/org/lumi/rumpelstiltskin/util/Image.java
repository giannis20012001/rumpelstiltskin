package org.lumi.rumpelstiltskin.util;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */
public class Image {

    /*Constructor*/
    public Image(String formatVersion, String version, String created, String description, String build) {
        this.formatVersion = formatVersion;
        this.version = version;
        this.created = created;
        this.description = description;
        this.build = build;

    }

    /*Setters & Getters*/
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

    /*ImageInfo related variables*/
    private String formatVersion;
    private String version;
    private String created;
    private String description;
    private String build;

}
