/**
 * Copyright 2010 Google Inc.
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

package org.waveprotocol.wave.concurrencycontrol.jso;

import static org.waveprotocol.wave.communication.gwt.JsonHelper.*;
import com.google.gwt.core.client.*;
import org.waveprotocol.wave.concurrencycontrol.EmptyResponse;
import org.waveprotocol.wave.concurrencycontrol.EmptyResponseUtil;
import org.waveprotocol.wave.communication.Blob;
import org.waveprotocol.wave.communication.ProtoEnums;
import org.waveprotocol.wave.communication.gwt.*;
import org.waveprotocol.wave.communication.json.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Client implementation of EmptyResponse backed by a GWT JavaScriptObject.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
// We have to use fully-qualified name of the GsonSerializable class here in order to make it
// visible in case of nested classes.
public final class EmptyResponseJsoImpl extends org.waveprotocol.wave.communication.gwt.JsonMessage
    implements EmptyResponse {
  protected EmptyResponseJsoImpl() {
  }

  public static EmptyResponseJsoImpl create() {
    EmptyResponseJsoImpl instance = (EmptyResponseJsoImpl) JsonMessage.createJsonMessage();
    // Force all lists to start with an empty list rather than no property for
    // the list. This is so that the native JS equality works, since (obviously)
    // {} != {"foo": []} while in the context of messages they should be.
    return instance;
  }

  @Override
  public void copyFrom(EmptyResponse message) {
    super.copyFrom((EmptyResponseJsoImpl) message);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o instanceof EmptyResponseJsoImpl) {
      return nativeIsEqualTo(o);
    } else if (o instanceof EmptyResponse) {
      return EmptyResponseUtil.isEqual(this, (EmptyResponse) o);
    } else {
      return false;
    }
  }

}