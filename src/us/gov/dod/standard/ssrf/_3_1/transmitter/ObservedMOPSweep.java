/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedMOPSweep (US) contains data describing the parametric information for
 * the period of the Modulation on the Pulse sweep.
 * <p>
 * Element of {@link ObservedMOPAnalysis}
 * <p>
 * Sub-Element is {@link ObservedMOPSequence}
 * <p>
 * Example: See {@link ObservedMOPAnalysis}.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPSweep", propOrder = {
  "mopDutyCycle",
  "mopNumElements",
  "mopStepAM",
  "mopStepCW",
  "mopStepFM",
  "mopStepPM",
  "mopFlyBackInterval",
  "mopSweepPeriod",
  "mopRepetionInterval",
  "observedMOPSequence"
})
public class ObservedMOPSweep {

  /**
   * US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal ratio
   * of the pulse duration to the pulse period.
   */
  @XmlElement(name = "MOPDutyCycle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal mopDutyCycle;
  /**
   * US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   */
  @XmlElement(name = "MOPNumElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger mopNumElements;
  /**
   * US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal mopStepAM;
  /**
   * US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopStepCW;
  /**
   * US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopStepFM;
  /**
   * US:MOPStepPM (US) - The difference between adjacent phase discrete values,
   * within a pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepPM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLE.class)
  private TDecimal mopStepPM;
  /**
   * US:MOPFlyBackInterval (US) - The time duration between the end of a
   * continuous (linear) sweep and the beginning of the next continuous (linear)
   * sweep. Flyback time is included in the Sweep Repetition Interval (SWI) but
   * also may be reported separately.
   */
  @XmlElement(name = "MOPFlyBackInterval", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopFlyBackInterval;
  /**
   * US:MOPSweepPeriod (US) - The time duration from a point in the RF sequence
   * (or continuous variation) to the like point in the next repeating RF
   * sequence (or continuous variation).
   */
  @XmlElement(name = "MOPSweepPeriod", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopSweepPeriod;
  /**
   * US:MOPRepetionInterval - MOP Repetion Interval (Optional)
   * <p>
   * The overall interval which may include multiple Sweep Repetition Intervals
   * (SRI). Fly-back times, and dead times.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "MOPRepetionInterval", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopRepetionInterval;
  /**
   * US:ObservedMOPSequence (Optional)
   * <p>
   * ObservedMOPSequence (US) contains descriptive information about the
   * sequencing used for the Modulation impressed On the Pulse (MOP).
   */
  @XmlElement(name = "ObservedMOPSequence")
  private Set<ObservedMOPSequence> observedMOPSequence;

  /**
   * Get US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @return the MOPDutyCycle value in a {@link TDecimal} data type
   */
  public TDecimal getMOPDutyCycle() {
    return mopDutyCycle;
  }

  /**
   * Set US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @param value the MOPDutyCycle value in a {@link TDecimal} data type
   */
  public void setMOPDutyCycle(TDecimal value) {
    this.mopDutyCycle = value;
  }

  /**
   * Determine if the MOPDutyCycle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPDutyCycle() {
    return (this.mopDutyCycle != null ? this.mopDutyCycle.isSetValue() : false);
  }

  /**
   * Get US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @return the MOPNumElements value in a {@link TInteger} data type
   */
  public TInteger getMOPNumElements() {
    return mopNumElements;
  }

  /**
   * Set US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @param value the MOPNumElements value in a {@link TInteger} data type
   */
  public void setMOPNumElements(TInteger value) {
    this.mopNumElements = value;
  }

  /**
   * Determine if the MOPNumElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPNumElements() {
    return (this.mopNumElements != null ? this.mopNumElements.isSetValue() : false);
  }

  /**
   * Get US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepAM() {
    return mopStepAM;
  }

  /**
   * Set US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepAM value in a {@link TDecimal} data type
   */
  public void setMOPStepAM(TDecimal value) {
    this.mopStepAM = value;
  }

  /**
   * Determine if the MOPStepAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepAM() {
    return (this.mopStepAM != null ? this.mopStepAM.isSetValue() : false);
  }

  /**
   * Get US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepCW() {
    return mopStepCW;
  }

  /**
   * Set US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepCW value in a {@link TDecimal} data type
   */
  public void setMOPStepCW(TDecimal value) {
    this.mopStepCW = value;
  }

  /**
   * Determine if the MOPStepCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepCW() {
    return (this.mopStepCW != null ? this.mopStepCW.isSetValue() : false);
  }

  /**
   * Get US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepFM() {
    return mopStepFM;
  }

  /**
   * Set US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepFM value in a {@link TDecimal} data type
   */
  public void setMOPStepFM(TDecimal value) {
    this.mopStepFM = value;
  }

  /**
   * Determine if the MOPStepFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepFM() {
    return (this.mopStepFM != null ? this.mopStepFM.isSetValue() : false);
  }

  /**
   * Get US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepPM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepPM() {
    return mopStepPM;
  }

  /**
   * Set US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepPM value in a {@link TDecimal} data type
   */
  public void setMOPStepPM(TDecimal value) {
    this.mopStepPM = value;
  }

  /**
   * Determine if the MOPStepPM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepPM() {
    return (this.mopStepPM != null ? this.mopStepPM.isSetValue() : false);
  }

  /**
   * Get US:MOPFlyBackInterval (US) - The time duration between the end of a
   * continuous (linear) sweep and the beginning of the next continuous (linear)
   * sweep. Flyback time is included in the Sweep Repetition Interval (SWI) but
   * also may be reported separately.
   * <p>
   * @return the MOPFlyBackInterval value in a {@link TDecimal} data type
   */
  public TDecimal getMOPFlyBackInterval() {
    return mopFlyBackInterval;
  }

  /**
   * Set US:MOPFlyBackInterval (US) - The time duration between the end of a
   * continuous (linear) sweep and the beginning of the next continuous (linear)
   * sweep. Flyback time is included in the Sweep Repetition Interval (SWI) but
   * also may be reported separately.
   * <p>
   * @param value the MOPFlyBackInterval value in a {@link TDecimal} data type
   */
  public void setMOPFlyBackInterval(TDecimal value) {
    this.mopFlyBackInterval = value;
  }

  /**
   * Determine if the MOPFlyBackInterval is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPFlyBackInterval() {
    return (this.mopFlyBackInterval != null ? this.mopFlyBackInterval.isSetValue() : false);
  }

  /**
   * Get US:MOPSweepPeriod (US) - The time duration from a point in the RF
   * sequence (or continuous variation) to the like point in the next repeating
   * RF sequence (or continuous variation).
   * <p>
   * @return the MOPSweepPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getMOPSweepPeriod() {
    return mopSweepPeriod;
  }

  /**
   * Set US:MOPSweepPeriod (US) - The time duration from a point in the RF
   * sequence (or continuous variation) to the like point in the next repeating
   * RF sequence (or continuous variation).
   * <p>
   * @param value the MOPSweepPeriod value in a {@link TDecimal} data type
   */
  public void setMOPSweepPeriod(TDecimal value) {
    this.mopSweepPeriod = value;
  }

  /**
   * Determine if the MOPSweepPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPSweepPeriod() {
    return (this.mopSweepPeriod != null ? this.mopSweepPeriod.isSetValue() : false);
  }

  /**
   * Get the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @return the MOPRepetionInterval value in a {@link TDecimal} data type
   */
  public TDecimal getMOPRepetionInterval() {
    return mopRepetionInterval;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value the MOPRepetionInterval value in a {@link TDecimal} data type
   */
  public void setMOPRepetionInterval(TDecimal value) {
    this.mopRepetionInterval = value;
  }

  /**
   * Determine if the MOPRepetionInterval is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPRepetionInterval() {
    return (this.mopRepetionInterval != null ? this.mopRepetionInterval.isSetValue() : false);
  }

  /**
   * Get the US:ObservedMOPSequence
   * <p>
   * Complex element ObservedMOPSequence (US) contains descriptive information
   * about the sequencing used for the Modulation impressed On the Pulse (MOP).
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedMOPSequence}
   *         instances
   */
  public Set<ObservedMOPSequence> getObservedMOPSequence() {
    if (observedMOPSequence == null) {
      observedMOPSequence = new HashSet<>();
    }
    return this.observedMOPSequence;
  }

  /**
   * Determine if the ObservedMOPSequence is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedMOPSequence() {
    return ((this.observedMOPSequence != null) && (!this.observedMOPSequence.isEmpty()));
  }

  /**
   * Clear the ObservedMOPSequence field. This sets the field to null.
   */
  public void unsetObservedMOPSequence() {
    this.observedMOPSequence = null;
  }

  /**
   * Set US:MOPDutyCycle (US), enter as a percentage, the minimum or nominal
   * ratio of the pulse duration to the pulse period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPDutyCycle(Double value) {
    setMOPDutyCycle(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPNumElements (US) - The number of discrete FREQ/PHASE/AMP values
   * transmitted in a patterned sequence (i.e., any repeated values are counted
   * each time)
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPNumElements(Integer value) {
    setMOPNumElements(new TInteger(value));
    return this;
  }

  /**
   * Set US:MOPStepAM (US) - The difference between adjacent amplitude discrete
   * power values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPStepAM(Double value) {
    setMOPStepAM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepCW(US) - The difference between adjacent continuous wave
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPStepCW(Double value) {
    setMOPStepCW(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepFM (US) - The difference between adjacent frequency discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPStepFM(Double value) {
    setMOPStepFM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPStepPM (US) - The difference between adjacent phase discrete
   * values, within a pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPStepPM(Double value) {
    setMOPStepPM(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPFlyBackInterval (US) - The time duration between the end of a
   * continuous (linear) sweep and the beginning of the next continuous (linear)
   * sweep. Flyback time is included in the Sweep Repetition Interval (SWI) but
   * also may be reported separately.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPFlyBackInterval(Double value) {
    setMOPFlyBackInterval(new TDecimal(value));
    return this;
  }

  /**
   * Set US:MOPSweepPeriod (US) - The time duration from a point in the RF
   * sequence (or continuous variation) to the like point in the next repeating
   * RF sequence (or continuous variation).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPSweepPeriod(Double value) {
    setMOPSweepPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withMOPRepetionInterval(Double value) {
    setMOPRepetionInterval(new TDecimal(value));
    return this;
  }

  /**
   * Set the US:ObservedMOPSequence
   * <p>
   * Complex element ObservedMOPSequence (US) contains descriptive information
   * about the sequencing used for the Modulation impressed On the Pulse (MOP).
   * <p>
   * @param values One or more instances of type {@link ObservedMOPSequence}
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withObservedMOPSequence(ObservedMOPSequence... values) {
    if (values != null) {
      getObservedMOPSequence().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:ObservedMOPSequence
   * <p>
   * Complex element ObservedMOPSequence (US) contains descriptive information
   * about the sequencing used for the Modulation impressed On the Pulse (MOP).
   * <p>
   * @param values A collection of {@link ObservedMOPSequence} instances
   * @return The current ObservedMOPSweep object instance
   */
  public ObservedMOPSweep withObservedMOPSequence(Set<ObservedMOPSequence> values) {
    if (values != null) {
      getObservedMOPSequence().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedMOPSweep instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedMOPSweep {"
      + (mopNumElements != null ? " mopNumElements [" + mopNumElements + "]" : "")
      + (mopRepetionInterval != null ? " mopRepetionInterval [" + mopRepetionInterval + "]" : "")
      + (mopSweepPeriod != null ? " mopSweepPeriod [" + mopSweepPeriod + "]" : "")
      + (mopStepAM != null ? " mopStepAM [" + mopStepAM + "]" : "")
      + (mopStepCW != null ? " mopStepCW [" + mopStepCW + "]" : "")
      + (mopDutyCycle != null ? " mopDutyCycle [" + mopDutyCycle + "]" : "")
      + (mopFlyBackInterval != null ? " mopFlyBackInterval [" + mopFlyBackInterval + "]" : "")
      + (mopStepPM != null ? " mopStepPM [" + mopStepPM + "]" : "")
      + (observedMOPSequence != null ? " observedMOPSequence [" + observedMOPSequence + "]" : "")
      + (mopStepFM != null ? " mopStepFM [" + mopStepFM + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPSweep} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
