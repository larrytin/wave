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

package org.waveprotocol.wave.federation.impl;

import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.AnnotationBoundary;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ElementStart;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ReplaceAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.UpdateAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValuePair;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValueUpdate;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.AnnotationBoundaryImpl;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.ElementStartImpl;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.ReplaceAttributesImpl;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.UpdateAttributesImpl;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.KeyValuePairImpl;
import org.waveprotocol.wave.federation.impl.ProtocolDocumentOperationImpl.ComponentImpl.KeyValueUpdateImpl;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValuePair;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.KeyValuePairUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.KeyValueUpdate;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.KeyValueUpdateUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ElementStart;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.ElementStartUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.ReplaceAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.ReplaceAttributesUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.UpdateAttributes;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.UpdateAttributesUtil;
import org.waveprotocol.wave.federation.ProtocolDocumentOperation.Component.AnnotationBoundary;
import org.waveprotocol.wave.federation.ProtocolDocumentOperationUtil.ComponentUtil.AnnotationBoundaryUtil;
import org.waveprotocol.wave.communication.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pojo implementation of ProtocolDocumentOperation.
 *
 * Generated from org/waveprotocol/wave/federation/federation.protodevel. Do not edit.
 */
public class ProtocolDocumentOperationImpl implements ProtocolDocumentOperation {

  public static class ComponentImpl implements Component {

    public static class KeyValuePairImpl implements KeyValuePair {
      private String key;
      private String value;
      public KeyValuePairImpl() {
      }

      public KeyValuePairImpl(KeyValuePair message) {
        copyFrom(message);
      }

      @Override
      public void copyFrom(KeyValuePair message) {
        setKey(message.getKey());
        setValue(message.getValue());
      }

      @Override
      public String getKey() {
        return key;
      }

      @Override
      public void setKey(String value) {
        this.key = value;
      }

      @Override
      public String getValue() {
        return value;
      }

      @Override
      public void setValue(String value) {
        this.value = value;
      }

      /** Provided to subclasses to clear all fields, for example when deserializing. */
      protected void reset() {
        this.key = null;
        this.value = null;
      }

      @Override
      public boolean equals(Object o) {
        return (o instanceof KeyValuePairImpl) && isEqualTo(o);
      }

      @Override
      public boolean isEqualTo(Object o) {
        if (o == this) {
          return true;
        } else if (o instanceof KeyValuePair) {
          return KeyValuePairUtil.isEqual(this, (KeyValuePair) o);
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return KeyValuePairUtil.getHashCode(this);
      }

    }

    public static class KeyValueUpdateImpl implements KeyValueUpdate {
      private String key;
      private String oldValue;
      private String newValue;
      public KeyValueUpdateImpl() {
      }

      public KeyValueUpdateImpl(KeyValueUpdate message) {
        copyFrom(message);
      }

      @Override
      public void copyFrom(KeyValueUpdate message) {
        setKey(message.getKey());
        if (message.hasOldValue()) {
          setOldValue(message.getOldValue());
        } else {
          clearOldValue();
        }
        if (message.hasNewValue()) {
          setNewValue(message.getNewValue());
        } else {
          clearNewValue();
        }
      }

      @Override
      public String getKey() {
        return key;
      }

      @Override
      public void setKey(String value) {
        this.key = value;
      }

      @Override
      public boolean hasOldValue() {
        return oldValue != null;
      }

      @Override
      public void clearOldValue() {
        oldValue = null;
      }

      @Override
      public String getOldValue() {
        return oldValue;
      }

      @Override
      public void setOldValue(String value) {
        this.oldValue = value;
      }

      @Override
      public boolean hasNewValue() {
        return newValue != null;
      }

      @Override
      public void clearNewValue() {
        newValue = null;
      }

      @Override
      public String getNewValue() {
        return newValue;
      }

      @Override
      public void setNewValue(String value) {
        this.newValue = value;
      }

      /** Provided to subclasses to clear all fields, for example when deserializing. */
      protected void reset() {
        this.key = null;
        this.oldValue = null;
        this.newValue = null;
      }

      @Override
      public boolean equals(Object o) {
        return (o instanceof KeyValueUpdateImpl) && isEqualTo(o);
      }

      @Override
      public boolean isEqualTo(Object o) {
        if (o == this) {
          return true;
        } else if (o instanceof KeyValueUpdate) {
          return KeyValueUpdateUtil.isEqual(this, (KeyValueUpdate) o);
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return KeyValueUpdateUtil.getHashCode(this);
      }

    }

    public static class ElementStartImpl implements ElementStart {
      private String type;
      private final List<KeyValuePairImpl> attribute = new ArrayList<KeyValuePairImpl>();
      public ElementStartImpl() {
      }

      public ElementStartImpl(ElementStart message) {
        copyFrom(message);
      }

      @Override
      public void copyFrom(ElementStart message) {
        setType(message.getType());
        clearAttribute();
        for (KeyValuePair field : message.getAttribute()) {
          addAttribute(new KeyValuePairImpl(field));
        }
      }

      @Override
      public String getType() {
        return type;
      }

      @Override
      public void setType(String value) {
        this.type = value;
      }

      @Override
      public List<KeyValuePairImpl> getAttribute() {
        return Collections.unmodifiableList(attribute);
      }

      @Override
      public void addAllAttribute(List<? extends KeyValuePair> messages) {
        for (KeyValuePair message : messages) {
          addAttribute(message);
        }
      }

      @Override
      public KeyValuePairImpl getAttribute(int n) {
        return new KeyValuePairImpl(attribute.get(n));
      }

      @Override
      public void setAttribute(int n, KeyValuePair message) {
        this.attribute.set(n, new KeyValuePairImpl(message));
      }

      @Override
      public int getAttributeSize() {
        return attribute.size();
      }

      @Override
      public void addAttribute(KeyValuePair message) {
        this.attribute.add(new KeyValuePairImpl(message));
      }

      @Override
      public void clearAttribute() {
        attribute.clear();
      }

      /** Provided to subclasses to clear all fields, for example when deserializing. */
      protected void reset() {
        this.type = null;
        this.attribute.clear();
      }

      @Override
      public boolean equals(Object o) {
        return (o instanceof ElementStartImpl) && isEqualTo(o);
      }

      @Override
      public boolean isEqualTo(Object o) {
        if (o == this) {
          return true;
        } else if (o instanceof ElementStart) {
          return ElementStartUtil.isEqual(this, (ElementStart) o);
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return ElementStartUtil.getHashCode(this);
      }

    }

    public static class ReplaceAttributesImpl implements ReplaceAttributes {
      private Boolean empty;
      private final List<KeyValuePairImpl> oldAttribute = new ArrayList<KeyValuePairImpl>();
      private final List<KeyValuePairImpl> newAttribute = new ArrayList<KeyValuePairImpl>();
      public ReplaceAttributesImpl() {
      }

      public ReplaceAttributesImpl(ReplaceAttributes message) {
        copyFrom(message);
      }

      @Override
      public void copyFrom(ReplaceAttributes message) {
        if (message.hasEmpty()) {
          setEmpty(message.getEmpty());
        } else {
          clearEmpty();
        }
        clearOldAttribute();
        for (KeyValuePair field : message.getOldAttribute()) {
          addOldAttribute(new KeyValuePairImpl(field));
        }
        clearNewAttribute();
        for (KeyValuePair field : message.getNewAttribute()) {
          addNewAttribute(new KeyValuePairImpl(field));
        }
      }

      @Override
      public boolean hasEmpty() {
        return empty != null;
      }

      @Override
      public void clearEmpty() {
        empty = null;
      }

      @Override
      public boolean getEmpty() {
        return empty;
      }

      @Override
      public void setEmpty(boolean value) {
        this.empty = value;
      }

      @Override
      public List<KeyValuePairImpl> getOldAttribute() {
        return Collections.unmodifiableList(oldAttribute);
      }

      @Override
      public void addAllOldAttribute(List<? extends KeyValuePair> messages) {
        for (KeyValuePair message : messages) {
          addOldAttribute(message);
        }
      }

      @Override
      public KeyValuePairImpl getOldAttribute(int n) {
        return new KeyValuePairImpl(oldAttribute.get(n));
      }

      @Override
      public void setOldAttribute(int n, KeyValuePair message) {
        this.oldAttribute.set(n, new KeyValuePairImpl(message));
      }

      @Override
      public int getOldAttributeSize() {
        return oldAttribute.size();
      }

      @Override
      public void addOldAttribute(KeyValuePair message) {
        this.oldAttribute.add(new KeyValuePairImpl(message));
      }

      @Override
      public void clearOldAttribute() {
        oldAttribute.clear();
      }

      @Override
      public List<KeyValuePairImpl> getNewAttribute() {
        return Collections.unmodifiableList(newAttribute);
      }

      @Override
      public void addAllNewAttribute(List<? extends KeyValuePair> messages) {
        for (KeyValuePair message : messages) {
          addNewAttribute(message);
        }
      }

      @Override
      public KeyValuePairImpl getNewAttribute(int n) {
        return new KeyValuePairImpl(newAttribute.get(n));
      }

      @Override
      public void setNewAttribute(int n, KeyValuePair message) {
        this.newAttribute.set(n, new KeyValuePairImpl(message));
      }

      @Override
      public int getNewAttributeSize() {
        return newAttribute.size();
      }

      @Override
      public void addNewAttribute(KeyValuePair message) {
        this.newAttribute.add(new KeyValuePairImpl(message));
      }

      @Override
      public void clearNewAttribute() {
        newAttribute.clear();
      }

      /** Provided to subclasses to clear all fields, for example when deserializing. */
      protected void reset() {
        this.empty = null;
        this.oldAttribute.clear();
        this.newAttribute.clear();
      }

      @Override
      public boolean equals(Object o) {
        return (o instanceof ReplaceAttributesImpl) && isEqualTo(o);
      }

      @Override
      public boolean isEqualTo(Object o) {
        if (o == this) {
          return true;
        } else if (o instanceof ReplaceAttributes) {
          return ReplaceAttributesUtil.isEqual(this, (ReplaceAttributes) o);
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return ReplaceAttributesUtil.getHashCode(this);
      }

    }

    public static class UpdateAttributesImpl implements UpdateAttributes {
      private Boolean empty;
      private final List<KeyValueUpdateImpl> attributeUpdate = new ArrayList<KeyValueUpdateImpl>();
      public UpdateAttributesImpl() {
      }

      public UpdateAttributesImpl(UpdateAttributes message) {
        copyFrom(message);
      }

      @Override
      public void copyFrom(UpdateAttributes message) {
        if (message.hasEmpty()) {
          setEmpty(message.getEmpty());
        } else {
          clearEmpty();
        }
        clearAttributeUpdate();
        for (KeyValueUpdate field : message.getAttributeUpdate()) {
          addAttributeUpdate(new KeyValueUpdateImpl(field));
        }
      }

      @Override
      public boolean hasEmpty() {
        return empty != null;
      }

      @Override
      public void clearEmpty() {
        empty = null;
      }

      @Override
      public boolean getEmpty() {
        return empty;
      }

      @Override
      public void setEmpty(boolean value) {
        this.empty = value;
      }

      @Override
      public List<KeyValueUpdateImpl> getAttributeUpdate() {
        return Collections.unmodifiableList(attributeUpdate);
      }

      @Override
      public void addAllAttributeUpdate(List<? extends KeyValueUpdate> messages) {
        for (KeyValueUpdate message : messages) {
          addAttributeUpdate(message);
        }
      }

      @Override
      public KeyValueUpdateImpl getAttributeUpdate(int n) {
        return new KeyValueUpdateImpl(attributeUpdate.get(n));
      }

      @Override
      public void setAttributeUpdate(int n, KeyValueUpdate message) {
        this.attributeUpdate.set(n, new KeyValueUpdateImpl(message));
      }

      @Override
      public int getAttributeUpdateSize() {
        return attributeUpdate.size();
      }

      @Override
      public void addAttributeUpdate(KeyValueUpdate message) {
        this.attributeUpdate.add(new KeyValueUpdateImpl(message));
      }

      @Override
      public void clearAttributeUpdate() {
        attributeUpdate.clear();
      }

      /** Provided to subclasses to clear all fields, for example when deserializing. */
      protected void reset() {
        this.empty = null;
        this.attributeUpdate.clear();
      }

      @Override
      public boolean equals(Object o) {
        return (o instanceof UpdateAttributesImpl) && isEqualTo(o);
      }

      @Override
      public boolean isEqualTo(Object o) {
        if (o == this) {
          return true;
        } else if (o instanceof UpdateAttributes) {
          return UpdateAttributesUtil.isEqual(this, (UpdateAttributes) o);
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return UpdateAttributesUtil.getHashCode(this);
      }

    }

    public static class AnnotationBoundaryImpl implements AnnotationBoundary {
      private Boolean empty;
      private final List<String> end = new ArrayList<String>();
      private final List<KeyValueUpdateImpl> change = new ArrayList<KeyValueUpdateImpl>();
      public AnnotationBoundaryImpl() {
      }

      public AnnotationBoundaryImpl(AnnotationBoundary message) {
        copyFrom(message);
      }

      @Override
      public void copyFrom(AnnotationBoundary message) {
        if (message.hasEmpty()) {
          setEmpty(message.getEmpty());
        } else {
          clearEmpty();
        }
        clearEnd();
        for (String field : message.getEnd()) {
          addEnd(field);
        }
        clearChange();
        for (KeyValueUpdate field : message.getChange()) {
          addChange(new KeyValueUpdateImpl(field));
        }
      }

      @Override
      public boolean hasEmpty() {
        return empty != null;
      }

      @Override
      public void clearEmpty() {
        empty = null;
      }

      @Override
      public boolean getEmpty() {
        return empty;
      }

      @Override
      public void setEmpty(boolean value) {
        this.empty = value;
      }

      @Override
      public List<String> getEnd() {
        return Collections.unmodifiableList(end);
      }

      @Override
      public void addAllEnd(List<String> values) {
        this.end.addAll(values);
      }

      @Override
      public String getEnd(int n) {
        return end.get(n);
      }

      @Override
      public void setEnd(int n, String value) {
        this.end.set(n, value);
      }

      @Override
      public int getEndSize() {
        return end.size();
      }

      @Override
      public void addEnd(String value) {
        this.end.add(value);
      }

      @Override
      public void clearEnd() {
        end.clear();
      }

      @Override
      public List<KeyValueUpdateImpl> getChange() {
        return Collections.unmodifiableList(change);
      }

      @Override
      public void addAllChange(List<? extends KeyValueUpdate> messages) {
        for (KeyValueUpdate message : messages) {
          addChange(message);
        }
      }

      @Override
      public KeyValueUpdateImpl getChange(int n) {
        return new KeyValueUpdateImpl(change.get(n));
      }

      @Override
      public void setChange(int n, KeyValueUpdate message) {
        this.change.set(n, new KeyValueUpdateImpl(message));
      }

      @Override
      public int getChangeSize() {
        return change.size();
      }

      @Override
      public void addChange(KeyValueUpdate message) {
        this.change.add(new KeyValueUpdateImpl(message));
      }

      @Override
      public void clearChange() {
        change.clear();
      }

      /** Provided to subclasses to clear all fields, for example when deserializing. */
      protected void reset() {
        this.empty = null;
        this.end.clear();
        this.change.clear();
      }

      @Override
      public boolean equals(Object o) {
        return (o instanceof AnnotationBoundaryImpl) && isEqualTo(o);
      }

      @Override
      public boolean isEqualTo(Object o) {
        if (o == this) {
          return true;
        } else if (o instanceof AnnotationBoundary) {
          return AnnotationBoundaryUtil.isEqual(this, (AnnotationBoundary) o);
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return AnnotationBoundaryUtil.getHashCode(this);
      }

    }

    private AnnotationBoundaryImpl annotationBoundary;
    private String characters;
    private ElementStartImpl elementStart;
    private Boolean elementEnd;
    private Integer retainItemCount;
    private String deleteCharacters;
    private ElementStartImpl deleteElementStart;
    private Boolean deleteElementEnd;
    private ReplaceAttributesImpl replaceAttributes;
    private UpdateAttributesImpl updateAttributes;
    public ComponentImpl() {
    }

    public ComponentImpl(Component message) {
      copyFrom(message);
    }

    @Override
    public void copyFrom(Component message) {
      if (message.hasAnnotationBoundary()) {
        setAnnotationBoundary(message.getAnnotationBoundary());
      } else {
        clearAnnotationBoundary();
      }
      if (message.hasCharacters()) {
        setCharacters(message.getCharacters());
      } else {
        clearCharacters();
      }
      if (message.hasElementStart()) {
        setElementStart(message.getElementStart());
      } else {
        clearElementStart();
      }
      if (message.hasElementEnd()) {
        setElementEnd(message.getElementEnd());
      } else {
        clearElementEnd();
      }
      if (message.hasRetainItemCount()) {
        setRetainItemCount(message.getRetainItemCount());
      } else {
        clearRetainItemCount();
      }
      if (message.hasDeleteCharacters()) {
        setDeleteCharacters(message.getDeleteCharacters());
      } else {
        clearDeleteCharacters();
      }
      if (message.hasDeleteElementStart()) {
        setDeleteElementStart(message.getDeleteElementStart());
      } else {
        clearDeleteElementStart();
      }
      if (message.hasDeleteElementEnd()) {
        setDeleteElementEnd(message.getDeleteElementEnd());
      } else {
        clearDeleteElementEnd();
      }
      if (message.hasReplaceAttributes()) {
        setReplaceAttributes(message.getReplaceAttributes());
      } else {
        clearReplaceAttributes();
      }
      if (message.hasUpdateAttributes()) {
        setUpdateAttributes(message.getUpdateAttributes());
      } else {
        clearUpdateAttributes();
      }
    }

    @Override
    public boolean hasAnnotationBoundary() {
      return annotationBoundary != null;
    }

    @Override
    public void clearAnnotationBoundary() {
      annotationBoundary = null;
    }

    @Override
    public AnnotationBoundaryImpl getAnnotationBoundary() {
      return new AnnotationBoundaryImpl(annotationBoundary);
    }

    @Override
    public void setAnnotationBoundary(AnnotationBoundary message) {
      this.annotationBoundary = new AnnotationBoundaryImpl(message);
    }

    @Override
    public boolean hasCharacters() {
      return characters != null;
    }

    @Override
    public void clearCharacters() {
      characters = null;
    }

    @Override
    public String getCharacters() {
      return characters;
    }

    @Override
    public void setCharacters(String value) {
      this.characters = value;
    }

    @Override
    public boolean hasElementStart() {
      return elementStart != null;
    }

    @Override
    public void clearElementStart() {
      elementStart = null;
    }

    @Override
    public ElementStartImpl getElementStart() {
      return new ElementStartImpl(elementStart);
    }

    @Override
    public void setElementStart(ElementStart message) {
      this.elementStart = new ElementStartImpl(message);
    }

    @Override
    public boolean hasElementEnd() {
      return elementEnd != null;
    }

    @Override
    public void clearElementEnd() {
      elementEnd = null;
    }

    @Override
    public boolean getElementEnd() {
      return elementEnd;
    }

    @Override
    public void setElementEnd(boolean value) {
      this.elementEnd = value;
    }

    @Override
    public boolean hasRetainItemCount() {
      return retainItemCount != null;
    }

    @Override
    public void clearRetainItemCount() {
      retainItemCount = null;
    }

    @Override
    public int getRetainItemCount() {
      return retainItemCount;
    }

    @Override
    public void setRetainItemCount(int value) {
      this.retainItemCount = value;
    }

    @Override
    public boolean hasDeleteCharacters() {
      return deleteCharacters != null;
    }

    @Override
    public void clearDeleteCharacters() {
      deleteCharacters = null;
    }

    @Override
    public String getDeleteCharacters() {
      return deleteCharacters;
    }

    @Override
    public void setDeleteCharacters(String value) {
      this.deleteCharacters = value;
    }

    @Override
    public boolean hasDeleteElementStart() {
      return deleteElementStart != null;
    }

    @Override
    public void clearDeleteElementStart() {
      deleteElementStart = null;
    }

    @Override
    public ElementStartImpl getDeleteElementStart() {
      return new ElementStartImpl(deleteElementStart);
    }

    @Override
    public void setDeleteElementStart(ElementStart message) {
      this.deleteElementStart = new ElementStartImpl(message);
    }

    @Override
    public boolean hasDeleteElementEnd() {
      return deleteElementEnd != null;
    }

    @Override
    public void clearDeleteElementEnd() {
      deleteElementEnd = null;
    }

    @Override
    public boolean getDeleteElementEnd() {
      return deleteElementEnd;
    }

    @Override
    public void setDeleteElementEnd(boolean value) {
      this.deleteElementEnd = value;
    }

    @Override
    public boolean hasReplaceAttributes() {
      return replaceAttributes != null;
    }

    @Override
    public void clearReplaceAttributes() {
      replaceAttributes = null;
    }

    @Override
    public ReplaceAttributesImpl getReplaceAttributes() {
      return new ReplaceAttributesImpl(replaceAttributes);
    }

    @Override
    public void setReplaceAttributes(ReplaceAttributes message) {
      this.replaceAttributes = new ReplaceAttributesImpl(message);
    }

    @Override
    public boolean hasUpdateAttributes() {
      return updateAttributes != null;
    }

    @Override
    public void clearUpdateAttributes() {
      updateAttributes = null;
    }

    @Override
    public UpdateAttributesImpl getUpdateAttributes() {
      return new UpdateAttributesImpl(updateAttributes);
    }

    @Override
    public void setUpdateAttributes(UpdateAttributes message) {
      this.updateAttributes = new UpdateAttributesImpl(message);
    }

    /** Provided to subclasses to clear all fields, for example when deserializing. */
    protected void reset() {
      this.annotationBoundary = null;
      this.characters = null;
      this.elementStart = null;
      this.elementEnd = null;
      this.retainItemCount = null;
      this.deleteCharacters = null;
      this.deleteElementStart = null;
      this.deleteElementEnd = null;
      this.replaceAttributes = null;
      this.updateAttributes = null;
    }

    @Override
    public boolean equals(Object o) {
      return (o instanceof ComponentImpl) && isEqualTo(o);
    }

    @Override
    public boolean isEqualTo(Object o) {
      if (o == this) {
        return true;
      } else if (o instanceof Component) {
        return ComponentUtil.isEqual(this, (Component) o);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return ComponentUtil.getHashCode(this);
    }

  }

  private final List<ComponentImpl> component = new ArrayList<ComponentImpl>();
  public ProtocolDocumentOperationImpl() {
  }

  public ProtocolDocumentOperationImpl(ProtocolDocumentOperation message) {
    copyFrom(message);
  }

  @Override
  public void copyFrom(ProtocolDocumentOperation message) {
    clearComponent();
    for (Component field : message.getComponent()) {
      addComponent(new ComponentImpl(field));
    }
  }

  @Override
  public List<ComponentImpl> getComponent() {
    return Collections.unmodifiableList(component);
  }

  @Override
  public void addAllComponent(List<? extends Component> messages) {
    for (Component message : messages) {
      addComponent(message);
    }
  }

  @Override
  public ComponentImpl getComponent(int n) {
    return new ComponentImpl(component.get(n));
  }

  @Override
  public void setComponent(int n, Component message) {
    this.component.set(n, new ComponentImpl(message));
  }

  @Override
  public int getComponentSize() {
    return component.size();
  }

  @Override
  public void addComponent(Component message) {
    this.component.add(new ComponentImpl(message));
  }

  @Override
  public void clearComponent() {
    component.clear();
  }

  /** Provided to subclasses to clear all fields, for example when deserializing. */
  protected void reset() {
    this.component.clear();
  }

  @Override
  public boolean equals(Object o) {
    return (o instanceof ProtocolDocumentOperationImpl) && isEqualTo(o);
  }

  @Override
  public boolean isEqualTo(Object o) {
    if (o == this) {
      return true;
    } else if (o instanceof ProtocolDocumentOperation) {
      return ProtocolDocumentOperationUtil.isEqual(this, (ProtocolDocumentOperation) o);
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return ProtocolDocumentOperationUtil.getHashCode(this);
  }

}