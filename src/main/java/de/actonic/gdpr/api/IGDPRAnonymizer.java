package de.actonic.gdpr.api;

import java.util.*;

public interface IGDPRAnonymizer {

    /**
     * Searches data for keys and returns results.
     *
     * @param sourceUserKeys the list of source user keys
     * @return the search results as a list of objects of type GDPRAnonymizeObject
     */
    List<GDPRAnonymizeObject> search(List<String> sourceUserKeys);

    /**
     * Anonymizes the data found and returns results.
     *
     * @param sourceUserKeys the list of source user keys
     * @param targetUserKey the target user key
     * @return the anonymize results as a list of objects of type GDPRAnonymizeObject
     */
    List<GDPRAnonymizeObject> anonymize(List<String> sourceUserKeys, String targetUserKey);

    /**
     * Terminates the search / anonymization process.
     */
    void stop();

    /**
     * Returns the name of the plugin within which the anonymizer is implemented.
     *
     * @return the name of the plugin
     */
    String getPluginName();

    /**
     * Returns the name of this anonymizer.
     *
     * @return the name of this anonymizer
     */
    String getAnonymizerName();
}
