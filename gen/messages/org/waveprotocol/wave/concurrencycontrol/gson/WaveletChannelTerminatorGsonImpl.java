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

package org.waveprotocol.wave.concurrencycontrol.gson;

// Import order matters here due to what looks like a javac bug.
// Eclipse doesn't seem to have this problem.
import org.waveprotocol.wave.communication.gson.GsonSerializable;
import org.waveprotocol.wave.concurrencycontrol.WaveletChannelTerminator;
import org.waveprotocol.wave.concurrencycontrol.WaveletChannelTerminatorUtil;
import org.waveprotocol.wave.concurrencycontrol.impl.WaveletChannelTerminatorImpl;
import org.waveprotocol.wave.concurrencycontrol.ResponseStatus;
import org.waveprotocol.wave.concurrencycontrol.gson.ResponseStatusGsonImpl;
import org.waveprotocol.wave.communication.Blob;
import org.waveprotocol.wave.communication.ProtoEnums;
import org.waveprotocol.wave.communication.gson.GsonException;
import org.waveprotocol.wave.communication.gson.GsonUtil;
import org.waveprotocol.wave.communication.json.RawStringData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

/**
 * Pojo implementation of WaveletChannelTerminator with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class WaveletChannelTerminatorGsonImpl extends WaveletChannelTerminatorImpl
    implements GsonSerializable {
  public WaveletChannelTerminatorGsonImpl() {
    super();
  }

  public WaveletChannelTerminatorGsonImpl(WaveletChannelTerminator message) {
    super(message);
  }

  @Override
  public JsonElement toGson(RawStringData raw, Gson gson) {
    return toGsonHelper(this, raw, gson);
  }

  /**
   * Static implementation-independent GSON serializer. Call this from
   * {@link #toGson} to avoid subclassing issues with inner message types.
   */
  public static JsonElement toGsonHelper(WaveletChannelTerminator message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    json.add("1", ResponseStatusGsonImpl.toGsonHelper(message.getStatus(), raw, gson));
    return json;
  }

  @Override
  public void fromGson(JsonElement json, Gson gson, RawStringData raw) throws GsonException {
    reset();
    JsonObject jsonObject = json.getAsJsonObject();
    // NOTE: always check with has(...) as the json might not have all required
    // fields set.
    if (jsonObject.has("1")) {
      ResponseStatusGsonImpl payload = new ResponseStatusGsonImpl();
      GsonUtil.extractJsonObject(payload, jsonObject.get("1"), gson, raw);
      setStatus(payload);
    }
  }

}