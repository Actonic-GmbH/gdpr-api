package de.actonic.gdpr.api;

import java.util.*;

public interface IGDPRAnonymizer {
    List<GDPRAnonymizeObject> search(List<String> sourceUsers);
    List<GDPRAnonymizeObject> anonymize(List<String> sourceUsers, String targetUser);
    void stop();
    String getPluginName();
    String getName();
}
