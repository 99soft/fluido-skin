/*
 *    Copyright 2009-2010 Simone Tripodi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.googlecode.fluido;

import java.io.InputStream;
import java.util.Properties;

/**
 * Just prints the fluido-skin version.
 *
 * @version $Id: FluidoSkin.java 67 2010-06-04 10:19:26Z simone.tripodi $
 */
public final class FluidoSkin {

    /**
     * Just prints the fluido-skin version.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream input = FluidoSkin.class.getResourceAsStream("/META-INF/maven/com.googlecode.fluido-skin/fluido-skin/pom.properties");
        properties.load(input);
        input.close();

        System.out.println("Using fluido-skin " + properties);
    }

}
