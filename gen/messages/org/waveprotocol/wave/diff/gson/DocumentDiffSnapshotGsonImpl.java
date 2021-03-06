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
import org.waveprotocol.wave.diff.DocumentDiffSnapshot;
import org.waveprotocol.wave.diff.DocumentDiffSnapshotUtil;
import org.waveprotocol.wave.diff.impl.DocumentDiffSnapshotImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl;
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
 * Pojo implementation of DocumentDiffSnapshot with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/wave/diff/diff.proto. Do not edit.
 */
public final class DocumentDiffSnapshotGsonImpl extends DocumentDiffSnapshotImpl
    implements GsonSerializable {
  public DocumentDiffSnapshotGsonImpl() {
    super();
  }

  public DocumentDiffSnapshotGsonImpl(DocumentDiffSnapshot message) {
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
  public static JsonElement toGsonHelper(DocumentDiffSnapshot message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    json.add("1", new JsonPrimitive(message.getDocumentId()));
    if (message.hasState()) {
      json.add("2", ProtocolDocumentOperationGsonImpl.toGsonHelper(message.getState(), raw, gson));
    }
    if (message.hasDiff()) {
      json.add("21", ProtocolDocumentOperationGsonImpl.toGsonHelper(message.getDiff(), raw, gson));
    }
    json.add("3", new JsonPrimitive(message.getAuthor()));
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getContributorSize(); i++) {
        array.add(new JsonPrimitive(message.getContributor(i)));
      }
      json.add("4", array);
    }
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getAddedContributorSize(); i++) {
        array.add(new JsonPrimitive(message.getAddedContributor(i)));
      }
      json.add("22", array);
    }
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getRemovedContributorSize(); i++) {
        array.add(new JsonPrimitive(message.getRemovedContributor(i)));
      }
      json.add("23", array);
    }
    json.add("5", new JsonPrimitive(message.getLastModifiedVersion()));
    json.add("6", new JsonPrimitive(message.getLastModifiedTime()));
    return json;
  }

  @Override
  public void fromGson(JsonElement json, Gson gson, RawStringData raw) throws GsonException {
    reset();
    JsonObject jsonObject = json.getAsJsonObject();
    // NOTE: always check with has(...) as the json might not have all required
    // fields set.
    if (jsonObject.has("1")) {
      setDocumentId(jsonObject.get("1").getAsString());
    }
    if (jsonObject.has("2")) {
      JsonElement elem = jsonObject.get("2");
      if (!elem.isJsonNull()) {
        ProtocolDocumentOperationGsonImpl payload = new ProtocolDocumentOperationGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setState(payload);
      }
    }
    if (jsonObject.has("21")) {
      JsonElement elem = jsonObject.get("21");
      if (!elem.isJsonNull()) {
        ProtocolDocumentOperationGsonImpl payload = new ProtocolDocumentOperationGsonImpl();
        GsonUtil.extractJsonObject(payload, elem, gson, raw);
        setDiff(payload);
      }
    }
    if (jsonObject.has("3")) {
      setAuthor(jsonObject.get("3").getAsString());
    }
    if (jsonObject.has("4")) {
      JsonArray array = jsonObject.get("4").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        addContributor(array.get(i).getAsString());
      }
    }
    if (jsonObject.has("22")) {
      JsonArray array = jsonObject.get("22").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        addAddedContributor(array.get(i).getAsString());
      }
    }
    if (jsonObject.has("23")) {
      JsonArray array = jsonObject.get("23").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        addRemovedContributor(array.get(i).getAsString());
      }
    }
    if (jsonObject.has("5")) {
      setLastModifiedVersion(jsonObject.get("5").getAsDouble());
    }
    if (jsonObject.has("6")) {
      setLastModifiedTime(jsonObject.get("6").getAsDouble());
    }
  }

}