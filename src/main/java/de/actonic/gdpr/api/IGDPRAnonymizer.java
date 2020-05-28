package de.actonic.gdpr.api;

import java.util.*;

public interface IGDPRAnonymizer {
    List<GDPRAnonymizeObject> search(String sourceUser);
    List<GDPRAnonymizeObject> anonymize(String sourceUser, String targetUser);
    void stop();
    String getPluginName();
    String getName();
}
