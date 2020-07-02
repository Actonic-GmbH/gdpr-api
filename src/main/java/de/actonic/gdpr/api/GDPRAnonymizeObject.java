package de.actonic.gdpr.api;

public final class GDPRAnonymizeObject {
    String name;
    String type;
    String link;

    /**
     * Creates an object that represents a unit of search / anonymization results.
     *
     * @param name name of found / anonymized object
     * @param type type of found / anonymized object
     */
    public GDPRAnonymizeObject(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Creates an object that represents a unit of search / anonymization results.
     *
     * @param name name of found / anonymized object
     * @param type type of found / anonymized object
     * @param link link to the found / anonymized object (if possible)
     */
    public GDPRAnonymizeObject(String name, String type, String link) {
        this.name = name;
        this.type = type;
        this.link = link;
    }

    /**
     * Returns the name of the found / anonymized object.
     *
     * @return name of found / anonymized object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the found / anonymized object.
     *
     * @param name name of found / anonymized object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the type of the found / anonymized object.
     *
     * @return type of found / anonymized object
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the found / anonymized object.
     *
     * @param type type of found / anonymized object
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the link to the found / anonymized object.
     *
     * @return link to the found / anonymized object
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the link to the found / anonymized object.
     *
     * @param link link to the found / anonymized object
     */
    public void setLink(String link) {
        this.link = link;
    }
}
