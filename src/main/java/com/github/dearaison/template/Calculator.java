package com.github.dearaison.template;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by IntelliJ on Sunday, 20 September, 2020 at 11:21.
 *
 * @author Joseph Maria
 */
class Calculator {
    private final int a;
    private final int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static String getVersion() throws IOException {
        Properties properties = new Properties();
        properties.load(Calculator.class.getResourceAsStream("/project.properties"));
        return properties.getProperty("project.version");
    }

    int sumOfTwoNumbers() {
        return a + b;
    }
}
