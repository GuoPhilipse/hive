/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.udf;



import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * TestUDFUnbase64.
 */
public class TestUDFUnbase64 {
  @Test
  public void testUnbase64Conversion(){
    Text base64 = new Text();
    // Let's make sure we only read the relevant part of the writable in case of reuse
    base64.set("Garbage 64. Should be ignored.");
    base64.set("c3RyaW5n");

    BytesWritable expected = new BytesWritable("string".getBytes());

    UDFUnbase64 udf = new UDFUnbase64();
    BytesWritable output = udf.evaluate(base64);
    assertEquals(expected, output);
  }
}
