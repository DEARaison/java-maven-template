package com.github.dearaison.template.version;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * Created by IntelliJ on Thursday, 06 January 2022 at 12:02.
 *
 * @author DEA Raison
 */
class VersionTest {
    @Test
    public void getInstance() {
        assertInstanceOf(Version.class, Version.getInstance());
    }

    @Test
    public void getVersion() throws IOException {
        String version = Version.getInstance().getVersion();
        assertEquals("1.0.0-SNAPSHOT", version, "Current version should be 1.0.0-SNAPSHOT");
        System.out.println("Current version: " + version);
    }
}
