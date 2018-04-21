/*******************************************************************************
 * Copyright 2009-2014 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * List Participations
 * API Version: 2011-07-01
 * Library Version: 2014-09-30
 * Generated: Mon Sep 15 19:38:38 GMT 2014
 */
package com.amazonservices.mws.sellers.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ListParticipations complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListParticipations"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Participation" type="{https://mws.amazonservices.com/Sellers/2011-07-01}Participation" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ListParticipations", propOrder={
    "participation"
})
@XmlRootElement(name = "ListParticipations")
public class ListParticipations extends AbstractMwsObject {

    @XmlElement(name="Participation")
    private List<Participation> participation;

    /**
     * Get the value of Participation.
     *
     * @return The value of Participation.
     */
    public List<Participation> getParticipation() {
        if (participation==null) {
            participation = new ArrayList<Participation>();
        }
        return participation;
    }

    /**
     * Set the value of Participation.
     *
     * @param participation
     *            The new value to set.
     */
    public void setParticipation(List<Participation> participation) {
        this.participation = participation;
    }

    /**
     * Clear Participation.
     */
    public void unsetParticipation() {
        this.participation = null;
    }

    /**
     * Check to see if Participation is set.
     *
     * @return true if Participation is set.
     */
    public boolean isSetParticipation() {
        return participation != null && !participation.isEmpty();
    }

    /**
     * Add values for Participation, return this.
     *
     * @param participation
     *             New values to add.
     *
     * @return This instance.
     */
    public ListParticipations withParticipation(Participation... values) {
        List<Participation> list = getParticipation();
        for (Participation value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        participation = r.readList("Participation", Participation.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("Participation", participation);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Sellers/2011-07-01", "ListParticipations",this);
    }

    /** Value constructor. */
    public ListParticipations(List<Participation> participation) {
        this.participation = participation;
    }    
    

    /** Default constructor. */
    public ListParticipations() {
        super();
    }

}
