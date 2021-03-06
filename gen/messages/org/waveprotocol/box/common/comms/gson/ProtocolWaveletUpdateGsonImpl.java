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

package org.waveprotocol.box.common.comms.gson;

// Import order matters here due to what looks like a javac bug.
// Eclipse doesn't seem to have this problem.
import org.waveprotocol.wave.communication.gson.GsonSerializable;
import org.waveprotocol.box.common.comms.ProtocolWaveletUpdate;
import org.waveprotocol.box.common.comms.ProtocolWaveletUpdateUtil;
import org.waveprotocol.box.common.comms.impl.ProtocolWaveletUpdateImpl;
import org.waveprotocol.wave.federation.ProtocolWaveletDelta;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.box.common.comms.WaveletSnapshot;
import org.waveprotocol.wave.federation.gson.ProtocolWaveletDeltaGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolHashedVersionGsonImpl;
import org.waveprotocol.box.common.comms.gson.WaveletSnapshotGsonImpl;
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
 * Pojo implementation of ProtocolWaveletUpdate with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/box/common/comms/waveclient-rpc.proto. Do not edit.
 */
public final class ProtocolWaveletUpdateGsonImpl extends ProtocolWaveletUpdateImpl
    implements GsonSerializable {
  public ProtocolWaveletUpdateGsonImpl() {
    super();
  }

  public ProtocolWaveletUpdateGsonImpl(ProtocolWaveletUpdate message) {
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
  public static JsonElement toGsonHelper(ProtocolWaveletUpdate message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    json.add("1", new JsonPrimitive(message.getWaveletName()));
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getAppliedDeltaSize(); i++) {
        // NOTE(kalman): if multistage parsing worked, we would add split points here.
        array.add(ProtocolWaveletDeltaGsonImpl.toGsonHelper(message.getAppliedDelta(i), raw, gson));
      }
      json.add("2", array);
    }
    if (message.hasCommitNotice()) {
      json.add("3", ProtocolHashedVersionGsonImpl.toGsonHelper(message.getCommitNotice(), raw, gson));
    }
    if (message.hasResultingVersion()) {
      json.add("4", ProtocolHashedVersionGsonImpl.toGsonHelper(message.getResultingVersion(), raw, gson));
    }
    if (message.hasSnapshot()) {
      json.add("5", WaveletSnapshotGsonImpl.toGsonHelper(message.getSnapshot(), raw, gson));
    }
    if (message.hasMarker()) {
      json.add("6", new JsonPrimitive(message.getMarker()));
    }
    if (message.hasChannelId()) {
      json.add("7", new JsonPrimitive(message.getChannelId()));
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
      setWaveletName(jsonObject.get("1").getAsString());
    }
    if (jsonObject.has("2")) {
      JsonArray array = jsonObject.get("2").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        ProtocolWaveletDeltaGsonImpl payload = new ProtocolWaveletDeltaGsonImpl();
        GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
        addAppliedDelta(payload);
      }
    }
    if (jsonObject.has("3")) {
      JsonElement elem = jsonObject.get("3");
      if (!elem.isJsonNull()) {
        ProtocolHashedVersionGsonImpl payload = new ProtocolHashedVersionGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setCommitNotice(payload);
      }
    }
    if (jsonObject.has("4")) {
      JsonElement elem = jsonObject.get("4");
      if (!elem.isJsonNull()) {
        ProtocolHashedVersionGsonImpl payload = new ProtocolHashedVersionGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setResultingVersion(payload);
      }
    }
    if (jsonObject.has("5")) {
      JsonElement elem = jsonObject.get("5");
      if (!elem.isJsonNull()) {
        WaveletSnapshotGsonImpl payload = new WaveletSnapshotGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setSnapshot(payload);
      }
    }
    if (jsonObject.has("6")) {
      JsonElement elem = jsonObject.get("6");
      if (!elem.isJsonNull()) {
        setMarker(elem.getAsBoolean());
      }
    }
    if (jsonObject.has("7")) {
      JsonElement elem = jsonObject.get("7");
      if (!elem.isJsonNull()) {
        setChannelId(elem.getAsString());
      }
    }
  }

}