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
package org.apache.sling.discovery;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Used to filter InstanceDescriptions in a TopologyView.
 *
 * @see TopologyView#findInstances(InstanceFilter)
 */
@ConsumerType
public interface InstanceFilter {

    /**
     * Returns true if this InstanceFilter selects the given InstanceDescription.
     *
     * @param instance the InstanceDescription for which to decide if this
     * InstanceFilter accepts it or not.
     * @return true if this InstanceFilter selects the given InstanceDescription
     */
    boolean accept(InstanceDescription instance);
}
