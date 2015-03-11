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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.assignment.*;
import us.gov.dod.standard.ssrf._3_1.channelplan.ChannelFreq;
import us.gov.dod.standard.ssrf._3_1.common.Downgrade;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.contact.EMail;
import us.gov.dod.standard.ssrf._3_1.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_1.multiple.RxModeRef;
import us.gov.dod.standard.ssrf._3_1.receiver.EmsClass;
import us.gov.dod.standard.ssrf._3_1.receiver.Installation;
import us.gov.dod.standard.ssrf._3_1.satellite.ServiceArea;
import us.gov.dod.standard.ssrf._3_1.ssreply.Comment;
import us.gov.dod.standard.ssrf._3_1.ssrequest.HostNation;
import us.gov.dod.standard.ssrf._3_1.toa.Country;
import us.gov.dod.standard.ssrf._3_1.toa.StnClass;

/**
 * Enumerated values for fields using the ListCCL type.
 * <p>
 * The classification of a data item. Where declared an attribute/element
 * classification is REQUIRED even if the classification is "U". Also, all
 * elements at all levels below the dataset MUST have a classification lower or
 * equal to the classification indicated in the top level classification.
 * <p>
 * Used in
 * {@link Administrative}, {@link Allotment}, {@link Antenna}, {@link Assignment}, {@link ChannelFreq}, {@link ChannelPlan}, {@link CircuitRemarks}, {@link Comment}, {@link Common}, {@link Contact}, {@link Country}, {@link DCSTrunk}, {@link DetailedFunction}, {@link DocketNum}, {@link Downgrade}, {@link EMail Email}, {@link EmsClass}, {@link ExtReferenceRef}, {@link ExternalReference}, {@link FEDeployment}, {@link ForceElement}, {@link HostDocketNum}, {@link HostNation}, {@link Installation}, {@link IntfReport}, {@link JRFL}, {@link Loadset}, {@link Location}, {@link Message}, {@link Note}, {@link OffTheShelfEquipment}, {@link Organisation}, {@link RFSystem}, {@link RadiationPlan}, {@link Receiver}, {@link Remarks}, {@link Role}, {@link RxModeRef}, {@link SSReply}, {@link SSRequest}, {@link Satellite}, {@link ServiceArea}, {@link StnClass}, {@link TOA}, {@link TelephoneFax}, {@link Transmitter}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCCL")
@XmlEnum
public enum ListCCL {

  /**
   * Unclassified
   */
  U,
  /**
   * Restricted (This classification SHALL NOT be used in USA-created datasets)
   */
  R,
  /**
   * Confidential
   */
  C,
  /**
   * Secret
   */
  S,
  /**
   * Top Secret
   */
  T;

  public String value() {
    return name();
  }

  public static ListCCL fromValue(String v) {
    return valueOf(v);
  }

}