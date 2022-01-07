package com.github.dearaison.template.version;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by IntelliJ on Thursday, 06 January 2022 at 11:57.
 *
 * @author DEA Raison
 */
class Version {
    private static final Version INSTANCE = new Version();

    /**
     * Get the singleton class's instance
     *
     * @return the singleton class's instance
     */
    static Version getInstance() {
        return INSTANCE;
    }

    /**
     * Get the current version which is defined in pom.xml.
     *
     * @return the current version
     * @throws IOException if an error occurred when reading from the input stream.
     */
    String getVersion() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getResourceAsStream("/project.properties"));
        return properties.getProperty("project.version");
    }
}
