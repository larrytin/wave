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

package org.waveprotocol.box.server.rpc.gson;

// Import order matters here due to what looks like a javac bug.
// Eclipse doesn't seem to have this problem.
import org.waveprotocol.wave.communication.gson.GsonSerializable;
import org.waveprotocol.box.server.rpc.RpcFinished;
import org.waveprotocol.box.server.rpc.RpcFinishedUtil;
import org.waveprotocol.box.server.rpc.impl.RpcFinishedImpl;
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
 * Pojo implementation of RpcFinished with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/box/server/rpc/rpc.proto. Do not edit.
 */
public final class RpcFinishedGsonImpl extends RpcFinishedImpl
    implements GsonSerializable {
  public RpcFinishedGsonImpl() {
    super();
  }

  public RpcFinishedGsonImpl(RpcFinished message) {
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
  public static JsonElement toGsonHelper(RpcFinished message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    json.add("1", new JsonPrimitive(message.getFailed()));
    if (message.hasErrorText()) {
      json.add("2", new JsonPrimitive(message.getErrorText()));
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
      setFailed(jsonObject.get("1").getAsBoolean());
    }
    if (jsonObject.has("2")) {
      JsonElement elem = jsonObject.get("2");
      if (!elem.isJsonNull()) {
        setErrorText(elem.getAsString());
      }
    }
  }

}