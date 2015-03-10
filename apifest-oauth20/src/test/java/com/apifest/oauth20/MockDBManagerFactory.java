/*
 * Copyright 2013-2014, ApiFest project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apifest.oauth20;

import static org.mockito.Mockito.mock;

/**
 * @author Rossitsa Borissova
 */
public class MockDBManagerFactory extends DBManagerFactory {

    public static void install() {
        DBManagerFactory.dbManager = mock(DBManager.class);
    }

    public static void deinstall() {
        DBManagerFactory.dbManager = null;
    }
}
