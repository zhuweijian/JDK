/*
 * $Id: SOAPBodyElement.java,v 1.2 2004/04/02 01:24:17 ofung Exp $
 * $Revision: 1.2 $
 * $Date: 2004/04/02 01:24:17 $
 */

/*
 * Copyright 2005 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package javax.xml.soap;

/**
 * A <code>SOAPBodyElement</code> object represents the contents in 
 * a <code>SOAPBody</code> object.  The <code>SOAPFault</code> interface
 * is a <code>SOAPBodyElement</code> object that has been defined.
 * <P>
 * A new <code>SOAPBodyElement</code> object can be created and added
 * to a <code>SOAPBody</code> object with the <code>SOAPBody</code>
 * method <code>addBodyElement</code>. In the following line of code,
 * <code>sb</code> is a <code>SOAPBody</code> object, and 
 * <code>myName</code> is a <code>Name</code> object.
 * <PRE>
 *    SOAPBodyElement sbe = sb.addBodyElement(myName);
 * </PRE>
 */
public interface SOAPBodyElement extends SOAPElement {
}
