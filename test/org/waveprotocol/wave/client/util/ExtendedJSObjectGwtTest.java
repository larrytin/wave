/**
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.wave.client.util;

import org.junit.Ignore;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Tests for ExtendedJSObject
 *
 */

@Ignore
public class ExtendedJSObjectGwtTest extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "org.waveprotocol.wave.client.util.ClientFlags";
  }

  private static final native ExtendedJSObject getExtendedJSO() /*-{
    return {booleanValue:true, stringValue:'hello'};
  }-*/;

  public void testNonExistent() {
    ExtendedJSObject jsObj = getExtendedJSO();
    assertFalse(jsObj.hasKey("nonexistent"));
  }

  public void testTypechecking() {
    ExtendedJSObject jsObj = getExtendedJSO();
    assertFalse(jsObj.hasBoolean("stringValue"));
    assertFalse(jsObj.hasNumber("stringValue"));
    assertTrue(jsObj.hasString("stringValue"));
  }

  public void testGetterMethods() {
    ExtendedJSObject jsObj = getExtendedJSO();
    assertEquals(true, jsObj.getBooleanUnchecked("booleanValue"));
    assertEquals("hello", jsObj.getStringUnchecked("stringValue"));
  }
}
