/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.spi.task.dq.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DqTaskStateTest {

    @Test
    public void testGetCode() {
        assertEquals(0, DqTaskState.DEFAULT.getCode());
        assertEquals(1, DqTaskState.SUCCESS.getCode());
        assertEquals(2, DqTaskState.FAILURE.getCode());
    }

    @Test
    public void testGetDescription() {
        assertEquals("default", DqTaskState.DEFAULT.getDescription());
        assertEquals("success", DqTaskState.SUCCESS.getDescription());
        assertEquals("failure", DqTaskState.FAILURE.getDescription());
    }

    @Test
    public void testOf() {
        assertEquals(DqTaskState.DEFAULT, DqTaskState.of(0));
        assertEquals(DqTaskState.SUCCESS, DqTaskState.of(1));
        assertEquals(DqTaskState.FAILURE, DqTaskState.of(2));
    }
}
