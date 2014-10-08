/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.ssreply;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringMEMO;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Comment contains the comment provided by the Host Nation or Administration
 * regarding an equipment supportability.
 * <p>
 * Element of {@link CommentSource}
 * <p>
 * Example: See {@link CommentSource}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comment", propOrder = {
  "value"
})
public class Comment extends AMetadata<Comment> implements Comparable<Comment> {

  /**
   * Comment (Required)
   * <p>
   * The comment provided by the Host Nation or Administration regarding
   * equipment supportability.
   * <p>
   * Format is MEMO
   */
  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringMEMO.class)
  private String value;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each Comment used by this Dataset.
   * <p>
   * Once an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlTypeValidator(type = String.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * Comment constructor. Automatically sets the {@link #idx} value.
   */
  public Comment() {
    this.idx = SSRFUtility.nextIndex();
  }

  /**
   * Get the comment.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the comment.
   * <p>
   * @param value a {@link String} instance
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Get a unique index for each Comment used by this Dataset.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Comment used by this Dataset.
   * <p>
   * @param value a {@link BigInteger} instance
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set the comment.
   * <p>
   * Format is MEMO
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Comment object instance
   */
  public Comment withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set a unique index for each Comment used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Comment object instance
   */
  public Comment withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Get a string representation of this Comment instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Comment {"
      + (idx != null ? " idx [" + idx + "]" : "")
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Comment} requires {@link ListCCL cls} and
   * {@link BigInteger idx}, {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetIdx() && isSetValue();
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the index "idx" number.
   * <p>
   * @return an object hash code value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.idx);
    return hash;
  }

  /**
   * Equality is based upon the index "idx" number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are the same class and have a matching index
   *         value
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.idx, ((Comment) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(Comment o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
