/* 
 * @(#)file      SnmpGenericMetaServer.java 
 * @(#)author    Sun Microsystems, Inc. 
 * @(#)version   1.8 
 * @(#)date      06/11/29 
 * 
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 

package com.sun.jmx.snmp.agent;

// jmx imports
//
import com.sun.jmx.snmp.SnmpValue;
import com.sun.jmx.snmp.SnmpStatusException;

/**
 * <p>
 * This interface defines the methods that must be implemented by an
 * SNMP metadata object that needs to interact with an
 * {@link com.sun.jmx.snmp.agent.SnmpGenericObjectServer} object.
 * </p>
 *
 * <p>
 * All these methods are usually generated by <code>mibgen</code> when
 * run in generic-metadata mode.
 * </p>
 *
 * <p><b><i>
 * This interface is used internally between the generated Metadata and 
 * the SNMP runtime and you shouldn't need to worry about it, because 
 * you will never have to use it directly.
 * </b></i></p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject 
 * to change without notice.</b></p>
 **/ 
public interface SnmpGenericMetaServer {

    /**
     * Construct an attribute value (as returned by Attribute::getValue())
     * from an SnmpValue. The returned attribute value can be used to 
     * construct an Attribute object.
     *
     * @param id The OID arc identifying the variable for which the
     *           value is constructed.
     * @param value The SnmpValue from which the Attribute::value will be
     *              constructed.
     * @return The attribute value built from the given <code>value</code>.
     * @exception SnmpStatusException if the attribute value cannot be built 
     *            from the given SnmpValue <code>value</code>.
     * 
     */
    Object buildAttributeValue(long id, SnmpValue value)
	throws SnmpStatusException;

    /**
     * Construct an SnmpValue from an Attribute value as returned by 
     * Attribute::getValue(). 
     *
     * @param id The OID arc identifying the variable for which the
     *           value is constructed.
     * @param value The attribute value as returned by Attribute::getValue().
     *
     * @return The SnmpValue built from the given <code>value</code>.
     * @exception SnmpStatusException if the SnmpValue cannot be built from
     *            the given <code>value</code>.
     **/
    SnmpValue buildSnmpValue(long id, Object value)
	throws SnmpStatusException;

    /**
     * Return the name of the attribute corresponding to the 
     * SNMP variable identified by the given <code>id</code>.
     *
     * @param id The OID arc identifying the variable.
     *
     * @return The name of the variable identified by the given 
     *         <code>id</code>.
     *
     * @exception SnmpStatusException if the given <code>id</code> does not
     *            correspond to a known variable.
     */
    String getAttributeName(long id)
	throws SnmpStatusException;

    /**
     * Check the access rights for a SET operation. 
     * 
     * @param x  The new requested value.
     * @param id The OID arc identifying the variable for which the SET is
     *           requested.
     * @param data A contextual object containing user-data.
     *           This object is allocated through the <code>
     *           {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *           for each incoming SNMP request.
     * @exception SnmpStatusException if the SET operation must be rejected.
     */
    void checkSetAccess(SnmpValue x, long id, Object data) 
	throws SnmpStatusException;
    
    /**
     * Check the access rights for a GET operation. 
     * 
     * @param id The OID arc identifying the variable for which the SET is
     *           requested.
     * @param data A contextual object containing user-data.
     *           This object is allocated through the <code>
     *           {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *           for each incoming SNMP request.
     * @exception SnmpStatusException if the SET operation must be rejected.
     */
    void checkGetAccess(long id, Object data) 
	throws SnmpStatusException;
    
}

