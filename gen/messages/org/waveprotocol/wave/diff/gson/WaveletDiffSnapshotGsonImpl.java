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

package org.waveprotocol.wave.diff.gson;

// Import order matters here due to what looks like a javac bug.
// Eclipse doesn't seem to have this problem.
import org.waveprotocol.wave.communication.gson.GsonSerializable;
import org.waveprotocol.wave.diff.WaveletDiffSnapshot;
import org.waveprotocol.wave.diff.WaveletDiffSnapshotUtil;
import org.waveprotocol.wave.diff.impl.WaveletDiffSnapshotImpl;
import org.waveprotocol.wave.diff.DocumentDiffSnapshot;
import org.waveprotocol.wave.federation.ProtocolHashedVersion;
import org.waveprotocol.wave.diff.gson.DocumentDiffSnapshotGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolHashedVersionGsonImpl;
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
 * Pojo implementation of WaveletDiffSnapshot with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/wave/diff/diff.proto. Do not edit.
 */
public final class WaveletDiffSnapshotGsonImpl extends WaveletDiffSnapshotImpl
    implements GsonSerializable {
  public WaveletDiffSnapshotGsonImpl() {
    super();
  }

  public WaveletDiffSnapshotGsonImpl(WaveletDiffSnapshot message) {
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
  public static JsonElement toGsonHelper(WaveletDiffSnapshot message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    json.add("1", new JsonPrimitive(message.getWaveletId()));
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getParticipantSize(); i++) {
        array.add(new JsonPrimitive(message.getParticipant(i)));
      }
      json.add("2", array);
    }
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getAddedParticipantSize(); i++) {
        array.add(new JsonPrimitive(message.getAddedParticipant(i)));
      }
      json.add("21", array);
    }
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getRemovedParticipantSize(); i++) {
        array.add(new JsonPrimitive(message.getRemovedParticipant(i)));
      }
      json.add("22", array);
    }
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getDocumentSize(); i++) {
        // NOTE(kalman): if multistage parsing worked, we would add split points here.
        array.add(DocumentDiffSnapshotGsonImpl.toGsonHelper(message.getDocument(i), raw, gson));
      }
      json.add("3", array);
    }
    json.add("4", ProtocolHashedVersionGsonImpl.toGsonHelper(message.getVersion(), raw, gson));
    json.add("5", new JsonPrimitive(message.getLastModifiedTime()));
    json.add("6", new JsonPrimitive(message.getCreator()));
    json.add("7", new JsonPrimitive(message.getCreationTime()));
    return json;
  }

  @Override
  public void fromGson(JsonElement json, Gson gson, RawStringData raw) throws GsonException {
    reset();
    JsonObject jsonObject = json.getAsJsonObject();
    // NOTE: always check with has(...) as the json might not have all required
    // fields set.
    if (jsonObject.has("1")) {
      setWaveletId(jsonObject.get("1").getAsString());
    }
    if (jsonObject.has("2")) {
      JsonArray array = jsonObject.get("2").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        addParticipant(array.get(i).getAsString());
      }
    }
    if (jsonObject.has("21")) {
      JsonArray array = jsonObject.get("21").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        addAddedParticipant(array.get(i).getAsString());
      }
    }
    if (jsonObject.has("22")) {
      JsonArray array = jsonObject.get("22").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        addRemovedParticipant(array.get(i).getAsString());
      }
    }
    if (jsonObject.has("3")) {
      JsonArray array = jsonObject.get("3").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        DocumentDiffSnapshotGsonImpl payload = new DocumentDiffSnapshotGsonImpl();
        GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
        addDocument(payload);
      }
    }
    if (jsonObject.has("4")) {
      ProtocolHashedVersionGsonImpl payload = new ProtocolHashedVersionGsonImpl();
      GsonUtil.extractJsonObject(payload, jsonObject.get("4"), gson, raw);
      setVersion(payload);
    }
    if (jsonObject.has("5")) {
      setLastModifiedTime(jsonObject.get("5").getAsDouble());
    }
    if (jsonObject.has("6")) {
      setCreator(jsonObject.get("6").getAsString());
    }
    if (jsonObject.has("7")) {
      setCreationTime(jsonObject.get("7").getAsDouble());
    }
  }

}