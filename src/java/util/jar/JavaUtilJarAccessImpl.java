/*
 * @(#)JavaUtilJarAccessImpl.java	1.8 09/12/04
 *
 * Copyright 2006-2009 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java.util.jar;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.security.CodeSource;
import java.security.cert.Certificate;
import sun.misc.JavaUtilJarAccess;

class JavaUtilJarAccessImpl implements JavaUtilJarAccess {
    public boolean jarFileHasClassPathAttribute(JarFile jar) throws IOException {
        return jar.hasClassPathAttribute();
    }

    public CodeSource[] getCodeSources(JarFile jar, URL url) {
        return jar.getCodeSources(url);
    }

    public CodeSource getCodeSource(JarFile jar, URL url, String name) {
        return jar.getCodeSource(url, name);
    }

    public Enumeration<String> entryNames(JarFile jar, CodeSource[] cs) {
        return jar.entryNames(cs);
    }

    public Enumeration<JarEntry> entries2(JarFile jar) {
	return jar.entries2();
    }

    public void setEagerValidation(JarFile jar, boolean eager) {
	jar.setEagerValidation(eager);
    }

    public List getManifestDigests(JarFile jar) {
	return jar.getManifestDigests();
    }
}
