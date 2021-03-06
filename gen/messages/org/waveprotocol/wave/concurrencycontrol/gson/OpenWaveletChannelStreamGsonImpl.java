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
import org.waveprotocol.wave.concurrencycontrol.OpenWaveletChannelStream;
import org.waveprotocol.wave.concurrencycontrol.OpenWaveletChannelStreamUtil;
import org.waveprotocol.wave.concurrencycontrol.impl.OpenWaveletChannelStreamImpl;
import org.waveprotocol.wave.concurrencycontrol.WaveletUpdate;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.wave.concurrencycontrol.WaveletChannelTerminator;
import org.waveprotocol.wave.concurrencycontrol.gson.WaveletUpdateGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolHashedVersionGsonImpl;
import org.waveprotocol.wave.concurrencycontrol.gson.WaveletChannelTerminatorGsonImpl;
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
 * Pojo implementation of OpenWaveletChannelStream with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/wave/concurrencycontrol/clientserver.proto. Do not edit.
 */
public final class OpenWaveletChannelStreamGsonImpl extends OpenWaveletChannelStreamImpl
    implements GsonSerializable {
  public OpenWaveletChannelStreamGsonImpl() {
    super();
  }

  public OpenWaveletChannelStreamGsonImpl(OpenWaveletChannelStream message) {
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
  public static JsonElement toGsonHelper(OpenWaveletChannelStream message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    if (message.hasChannelId()) {
      json.add("1", new JsonPrimitive(message.getChannelId()));
    }
    if (message.hasDelta()) {
      json.add("2", WaveletUpdateGsonImpl.toGsonHelper(message.getDelta(), raw, gson));
    }
    if (message.hasCommitVersion()) {
      json.add("3", ProtocolHashedVersionGsonImpl.toGsonHelper(message.getCommitVersion(), raw, gson));
    }
    if (message.hasTerminator()) {
      json.add("4", WaveletChannelTerminatorGsonImpl.toGsonHelper(message.getTerminator(), raw, gson));
    }
    return json;
  }

  @Override
  public void fromGson(JsonElement json, Gson gson, RawStringData raw) throws GsonException {
    reset();
    JsonObject jsonObject = json.getAsJsonObject();
    // NOTE: always check with has(...) as the json might not have all required
    // fields set.
    if (jsonObject.has("1")) {
      JsonElement elem = jsonObject.get("1");
      if (!elem.isJsonNull()) {
        setChannelId(elem.getAsString());
      }
    }
    if (jsonObject.has("2")) {
      JsonElement elem = jsonObject.get("2");
      if (!elem.isJsonNull()) {
        WaveletUpdateGsonImpl payload = new WaveletUpdateGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setDelta(payload);
      }
    }
    if (jsonObject.has("3")) {
      JsonElement elem = jsonObject.get("3");
      if (!elem.isJsonNull()) {
        ProtocolHashedVersionGsonImpl payload = new ProtocolHashedVersionGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setCommitVersion(payload);
      }
    }
    if (jsonObject.has("4")) {
      JsonElement elem = jsonObject.get("4");
      if (!elem.isJsonNull()) {
        WaveletChannelTerminatorGsonImpl payload = new WaveletChannelTerminatorGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setTerminator(payload);
      }
    }
  }

}