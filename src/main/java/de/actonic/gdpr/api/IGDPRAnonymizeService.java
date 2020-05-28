package de.actonic.gdpr.api;

public interface IGDPRAnonymizeService {
    void addAnonymizer(IGDPRAnonymizer anonymizer);
    void removeAnonymizer(IGDPRAnonymizer anonymizer);
}
