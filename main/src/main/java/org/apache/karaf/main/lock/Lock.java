/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.karaf.main.lock;

public interface Lock {

    /**
     * A KeepAlive function to maintain the lock. 
     * Indicates whether or not the lock could be aquired.
     * 
     * @return true if connection lock retained, false otherwise.
     * @throws Exception
     */
    boolean lock() throws Exception;

    /**
     * Terminate the lock connection safely.
     * 
     * @throws Exception
     */
    void release() throws Exception;

    /**
     * Indicates whether or not the lock still exists.
     * 
     * @return true, if the lock still exists, otherwise false.
     * @throws Exception
     */
    boolean isAlive() throws Exception;
}
