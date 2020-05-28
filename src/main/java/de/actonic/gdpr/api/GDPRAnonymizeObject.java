package de.actonic.gdpr.api;

public final class GDPRAnonymizeObject {
    String name;
    String type;
    String link;

    public GDPRAnonymizeObject(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public GDPRAnonymizeObject(String name, String type, String link) {
        this.name = name;
        this.type = type;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
