/*
 * @(#)file      JDMTrapItem.java
 * @(#)author    Sun Microsystems, Inc.
 * @(#)version   4.9
 * @(#)date      06/11/29
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */


/* Generated By:JJTree: Do not edit this line. JDMTrapItem.java */

package com.sun.jmx.snmp.IPAcl;

/** 
 * @version     4.9     11/17/05 
 * @author      Sun Microsystems, Inc. 
 */ 
class JDMTrapItem extends SimpleNode {
  protected JDMTrapCommunity comm = null;
  
  JDMTrapItem(int id) {
    super(id);
  }

  JDMTrapItem(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JDMTrapItem(id);
  }

  public static Node jjtCreate(Parser p, int id) {
      return new JDMTrapItem(p, id);
  }
  
  public JDMTrapCommunity getCommunity(){
	return comm;
  }
}
