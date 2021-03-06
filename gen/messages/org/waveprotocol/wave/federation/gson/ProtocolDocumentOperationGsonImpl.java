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

package org.waveprotocol.wave.federation.gson;

// Import order matters here due to what looks like a javac bug.
// Eclipse doesn't seem to have this problem.
import org.waveprotocol.wave.communication.gson.GsonSerializable;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValuePair;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.KeyValuePairUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.KeyValuePairImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValueUpdate;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.KeyValueUpdateUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.KeyValueUpdateImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ElementStart;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.ElementStartUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.ElementStartImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ReplaceAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.ReplaceAttributesUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.ReplaceAttributesImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.UpdateAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.UpdateAttributesUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.UpdateAttributesImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.AnnotationBoundary;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.AnnotationBoundaryUtil;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.AnnotationBoundaryImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.AnnotationBoundary;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ElementStart;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ReplaceAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.UpdateAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValuePair;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValueUpdate;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl.AnnotationBoundaryGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl.ElementStartGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl.ReplaceAttributesGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl.UpdateAttributesGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl.KeyValuePairGsonImpl;
import org.waveprotocol.wave.federation.gson.ProtocolDocumentOperationGsonImpl.ComponentGsonImpl.KeyValueUpdateGsonImpl;
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
 * Pojo implementation of ProtocolDocumentOperation with gson serialization and deserialization.
 *
 * Generated from org/waveprotocol/wave/federation/federation.protodevel. Do not edit.
 */
public final class ProtocolDocumentOperationGsonImpl extends ProtocolDocumentOperationImpl
    implements GsonSerializable {

  public static final class ComponentGsonImpl extends ComponentImpl
      implements GsonSerializable {

    public static final class KeyValuePairGsonImpl extends KeyValuePairImpl
        implements GsonSerializable {
      public KeyValuePairGsonImpl() {
        super();
      }

      public KeyValuePairGsonImpl(KeyValuePair message) {
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
      public static JsonElement toGsonHelper(KeyValuePair message, RawStringData raw, Gson gson) {
        JsonObject json = new JsonObject();
        json.add("1", new JsonPrimitive(message.getKey()));
        json.add("2", new JsonPrimitive(message.getValue()));
        return json;
      }

      @Override
      public void fromGson(JsonElement json, Gson gson, RawStringData raw) throws GsonException {
        reset();
        JsonObject jsonObject = json.getAsJsonObject();
        // NOTE: always check with has(...) as the json might not have all required
        // fields set.
        if (jsonObject.has("1")) {
          setKey(jsonObject.get("1").getAsString());
        }
        if (jsonObject.has("2")) {
          setValue(jsonObject.get("2").getAsString());
        }
      }

    }

    public static final class KeyValueUpdateGsonImpl extends KeyValueUpdateImpl
        implements GsonSerializable {
      public KeyValueUpdateGsonImpl() {
        super();
      }

      public KeyValueUpdateGsonImpl(KeyValueUpdate message) {
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
      public static JsonElement toGsonHelper(KeyValueUpdate message, RawStringData raw, Gson gson) {
        JsonObject json = new JsonObject();
        json.add("1", new JsonPrimitive(message.getKey()));
        if (message.hasOldValue()) {
          json.add("2", new JsonPrimitive(message.getOldValue()));
        }
        if (message.hasNewValue()) {
          json.add("3", new JsonPrimitive(message.getNewValue()));
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
          setKey(jsonObject.get("1").getAsString());
        }
        if (jsonObject.has("2")) {
          JsonElement elem = jsonObject.get("2");
          if (!elem.isJsonNull()) {
            setOldValue(elem.getAsString());
          }
        }
        if (jsonObject.has("3")) {
          JsonElement elem = jsonObject.get("3");
          if (!elem.isJsonNull()) {
            setNewValue(elem.getAsString());
          }
        }
      }

    }

    public static final class ElementStartGsonImpl extends ElementStartImpl
        implements GsonSerializable {
      public ElementStartGsonImpl() {
        super();
      }

      public ElementStartGsonImpl(ElementStart message) {
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
      public static JsonElement toGsonHelper(ElementStart message, RawStringData raw, Gson gson) {
        JsonObject json = new JsonObject();
        json.add("1", new JsonPrimitive(message.getType()));
        {
          JsonArray array = new JsonArray();
          for (int i = 0; i < message.getAttributeSize(); i++) {
            // NOTE(kalman): if multistage parsing worked, we would add split points here.
            array.add(KeyValuePairGsonImpl.toGsonHelper(message.getAttribute(i), raw, gson));
          }
          json.add("2", array);
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
          setType(jsonObject.get("1").getAsString());
        }
        if (jsonObject.has("2")) {
          JsonArray array = jsonObject.get("2").getAsJsonArray();
          for (int i = 0; i < array.size(); i++) {
            KeyValuePairGsonImpl payload = new KeyValuePairGsonImpl();
            GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
            addAttribute(payload);
          }
        }
      }

    }

    public static final class ReplaceAttributesGsonImpl extends ReplaceAttributesImpl
        implements GsonSerializable {
      public ReplaceAttributesGsonImpl() {
        super();
      }

      public ReplaceAttributesGsonImpl(ReplaceAttributes message) {
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
      public static JsonElement toGsonHelper(ReplaceAttributes message, RawStringData raw, Gson gson) {
        JsonObject json = new JsonObject();
        if (message.hasEmpty()) {
          json.add("1", new JsonPrimitive(message.getEmpty()));
        }
        {
          JsonArray array = new JsonArray();
          for (int i = 0; i < message.getOldAttributeSize(); i++) {
            // NOTE(kalman): if multistage parsing worked, we would add split points here.
            array.add(KeyValuePairGsonImpl.toGsonHelper(message.getOldAttribute(i), raw, gson));
          }
          json.add("2", array);
        }
        {
          JsonArray array = new JsonArray();
          for (int i = 0; i < message.getNewAttributeSize(); i++) {
            // NOTE(kalman): if multistage parsing worked, we would add split points here.
            array.add(KeyValuePairGsonImpl.toGsonHelper(message.getNewAttribute(i), raw, gson));
          }
          json.add("3", array);
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
            setEmpty(elem.getAsBoolean());
          }
        }
        if (jsonObject.has("2")) {
          JsonArray array = jsonObject.get("2").getAsJsonArray();
          for (int i = 0; i < array.size(); i++) {
            KeyValuePairGsonImpl payload = new KeyValuePairGsonImpl();
            GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
            addOldAttribute(payload);
          }
        }
        if (jsonObject.has("3")) {
          JsonArray array = jsonObject.get("3").getAsJsonArray();
          for (int i = 0; i < array.size(); i++) {
            KeyValuePairGsonImpl payload = new KeyValuePairGsonImpl();
            GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
            addNewAttribute(payload);
          }
        }
      }

    }

    public static final class UpdateAttributesGsonImpl extends UpdateAttributesImpl
        implements GsonSerializable {
      public UpdateAttributesGsonImpl() {
        super();
      }

      public UpdateAttributesGsonImpl(UpdateAttributes message) {
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
      public static JsonElement toGsonHelper(UpdateAttributes message, RawStringData raw, Gson gson) {
        JsonObject json = new JsonObject();
        if (message.hasEmpty()) {
          json.add("1", new JsonPrimitive(message.getEmpty()));
        }
        {
          JsonArray array = new JsonArray();
          for (int i = 0; i < message.getAttributeUpdateSize(); i++) {
            // NOTE(kalman): if multistage parsing worked, we would add split points here.
            array.add(KeyValueUpdateGsonImpl.toGsonHelper(message.getAttributeUpdate(i), raw, gson));
          }
          json.add("2", array);
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
            setEmpty(elem.getAsBoolean());
          }
        }
        if (jsonObject.has("2")) {
          JsonArray array = jsonObject.get("2").getAsJsonArray();
          for (int i = 0; i < array.size(); i++) {
            KeyValueUpdateGsonImpl payload = new KeyValueUpdateGsonImpl();
            GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
            addAttributeUpdate(payload);
          }
        }
      }

    }

    public static final class AnnotationBoundaryGsonImpl extends AnnotationBoundaryImpl
        implements GsonSerializable {
      public AnnotationBoundaryGsonImpl() {
        super();
      }

      public AnnotationBoundaryGsonImpl(AnnotationBoundary message) {
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
      public static JsonElement toGsonHelper(AnnotationBoundary message, RawStringData raw, Gson gson) {
        JsonObject json = new JsonObject();
        if (message.hasEmpty()) {
          json.add("1", new JsonPrimitive(message.getEmpty()));
        }
        {
          JsonArray array = new JsonArray();
          for (int i = 0; i < message.getEndSize(); i++) {
            array.add(new JsonPrimitive(message.getEnd(i)));
          }
          json.add("2", array);
        }
        {
          JsonArray array = new JsonArray();
          for (int i = 0; i < message.getChangeSize(); i++) {
            // NOTE(kalman): if multistage parsing worked, we would add split points here.
            array.add(KeyValueUpdateGsonImpl.toGsonHelper(message.getChange(i), raw, gson));
          }
          json.add("3", array);
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
            setEmpty(elem.getAsBoolean());
          }
        }
        if (jsonObject.has("2")) {
          JsonArray array = jsonObject.get("2").getAsJsonArray();
          for (int i = 0; i < array.size(); i++) {
            addEnd(array.get(i).getAsString());
          }
        }
        if (jsonObject.has("3")) {
          JsonArray array = jsonObject.get("3").getAsJsonArray();
          for (int i = 0; i < array.size(); i++) {
            KeyValueUpdateGsonImpl payload = new KeyValueUpdateGsonImpl();
            GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
            addChange(payload);
          }
        }
      }

    }

    public ComponentGsonImpl() {
      super();
    }

    public ComponentGsonImpl(Component message) {
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
    public static JsonElement toGsonHelper(Component message, RawStringData raw, Gson gson) {
      JsonObject json = new JsonObject();
      if (message.hasAnnotationBoundary()) {
        json.add("1", AnnotationBoundaryGsonImpl.toGsonHelper(message.getAnnotationBoundary(), raw, gson));
      }
      if (message.hasCharacters()) {
        json.add("2", new JsonPrimitive(message.getCharacters()));
      }
      if (message.hasElementStart()) {
        json.add("3", ElementStartGsonImpl.toGsonHelper(message.getElementStart(), raw, gson));
      }
      if (message.hasElementEnd()) {
        json.add("4", new JsonPrimitive(message.getElementEnd()));
      }
      if (message.hasRetainItemCount()) {
        json.add("5", new JsonPrimitive(message.getRetainItemCount()));
      }
      if (message.hasDeleteCharacters()) {
        json.add("6", new JsonPrimitive(message.getDeleteCharacters()));
      }
      if (message.hasDeleteElementStart()) {
        json.add("7", ElementStartGsonImpl.toGsonHelper(message.getDeleteElementStart(), raw, gson));
      }
      if (message.hasDeleteElementEnd()) {
        json.add("8", new JsonPrimitive(message.getDeleteElementEnd()));
      }
      if (message.hasReplaceAttributes()) {
        json.add("9", ReplaceAttributesGsonImpl.toGsonHelper(message.getReplaceAttributes(), raw, gson));
      }
      if (message.hasUpdateAttributes()) {
        json.add("10", UpdateAttributesGsonImpl.toGsonHelper(message.getUpdateAttributes(), raw, gson));
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
          AnnotationBoundaryGsonImpl payload = new AnnotationBoundaryGsonImpl();
          GsonUtil.extractJsonObject(payload, elem, gson, raw);
          setAnnotationBoundary(payload);
        }
      }
      if (jsonObject.has("2")) {
        JsonElement elem = jsonObject.get("2");
        if (!elem.isJsonNull()) {
          setCharacters(elem.getAsString());
        }
      }
      if (jsonObject.has("3")) {
        JsonElement elem = jsonObject.get("3");
        if (!elem.isJsonNull()) {
          ElementStartGsonImpl payload = new ElementStartGsonImpl();
          GsonUtil.extractJsonObject(payload, elem, gson, raw);
          setElementStart(payload);
        }
      }
      if (jsonObject.has("4")) {
        JsonElement elem = jsonObject.get("4");
        if (!elem.isJsonNull()) {
          setElementEnd(elem.getAsBoolean());
        }
      }
      if (jsonObject.has("5")) {
        JsonElement elem = jsonObject.get("5");
        if (!elem.isJsonNull()) {
          setRetainItemCount(elem.getAsInt());
        }
      }
      if (jsonObject.has("6")) {
        JsonElement elem = jsonObject.get("6");
        if (!elem.isJsonNull()) {
          setDeleteCharacters(elem.getAsString());
        }
      }
      if (jsonObject.has("7")) {
        JsonElement elem = jsonObject.get("7");
        if (!elem.isJsonNull()) {
          ElementStartGsonImpl payload = new ElementStartGsonImpl();
          GsonUtil.extractJsonObject(payload, elem, gson, raw);
          setDeleteElementStart(payload);
        }
      }
      if (jsonObject.has("8")) {
        JsonElement elem = jsonObject.get("8");
        if (!elem.isJsonNull()) {
          setDeleteElementEnd(elem.getAsBoolean());
        }
      }
      if (jsonObject.has("9")) {
        JsonElement elem = jsonObject.get("9");
        if (!elem.isJsonNull()) {
          ReplaceAttributesGsonImpl payload = new ReplaceAttributesGsonImpl();
          GsonUtil.extractJsonObject(payload, elem, gson, raw);
          setReplaceAttributes(payload);
        }
      }
      if (jsonObject.has("10")) {
        JsonElement elem = jsonObject.get("10");
        if (!elem.isJsonNull()) {
          UpdateAttributesGsonImpl payload = new UpdateAttributesGsonImpl();
          GsonUtil.extractJsonObject(payload, elem, gson, raw);
          setUpdateAttributes(payload);
        }
      }
    }

  }

  public ProtocolDocumentOperationGsonImpl() {
    super();
  }

  public ProtocolDocumentOperationGsonImpl(ProtocolDocumentOperation message) {
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
  public static JsonElement toGsonHelper(ProtocolDocumentOperation message, RawStringData raw, Gson gson) {
    JsonObject json = new JsonObject();
    {
      JsonArray array = new JsonArray();
      for (int i = 0; i < message.getComponentSize(); i++) {
        // NOTE(kalman): if multistage parsing worked, we would add split points here.
        array.add(ComponentGsonImpl.toGsonHelper(message.getComponent(i), raw, gson));
      }
      json.add("1", array);
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
      JsonArray array = jsonObject.get("1").getAsJsonArray();
      for (int i = 0; i < array.size(); i++) {
        ComponentGsonImpl payload = new ComponentGsonImpl();
        GsonUtil.extractJsonObject(payload, array.get(i), gson, raw);
        addComponent(payload);
      }
    }
  }

}