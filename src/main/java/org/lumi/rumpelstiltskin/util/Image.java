package org.lumi.rumpelstiltskin.util;

/**
 * Created by John Tsantilis (A.K.A lumi) on 20/2/2016.
 */
public class Image {

    /*Constructor*/
    public Image(String name, String hypervisor) {
        this.name = name;
        this.hypervisor = hypervisor;

    }

    /*Setters & Getters*/
    public String getName() {
        return name;

    }

    public void setName(String name) {
        name = name;

    }

    public String getHypervisor() {
        return hypervisor;

    }

    public void setHypervisor(String hypervisor) {
        hypervisor = hypervisor;

    }

    /*ImageInfo related variables*/
    private String name;
    private String hypervisor;

}
