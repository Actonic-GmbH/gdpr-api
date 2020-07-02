package de.actonic.gdpr.api;

public interface IGDPRAnonymizeService {

    /**
     * Adds anonymizer to the list of service anonymizers.
     *
     * @param anonymizer the custom anonymizer
     */
    void addAnonymizer(IGDPRAnonymizer anonymizer);

    /**
     * Removes anonymizer from the list of service anonymizers.
     *
     * @param anonymizer the custom anonymizer
     */
    void removeAnonymizer(IGDPRAnonymizer anonymizer);
}
