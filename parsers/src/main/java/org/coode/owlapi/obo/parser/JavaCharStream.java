/* Generated By:JavaCC: Do not edit this line. JavaCharStream.java Version 5.0 */
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.coode.owlapi.obo.parser;

/** Wrapper for the common JavaCharStream for all parsers. This is needed because
 * we have a request to support UTF-8 files that have an initial BOM. UTF-8 does
 * not need BOMs but some tools insist adding them. Java on the other hand won't
 * support it, and JavaCC does not have an override for this. The result is that
 * the support must be added by hand, and it's easier to have it in one place.
 * This stops JavaCC from rebuilding the wrong files and minimizes duplicated
 * code. */
@SuppressWarnings("javadoc")
public class JavaCharStream extends uk.ac.manchester.cs.BOMSafeJavaCharStream {
    /** Constructor. */
    public JavaCharStream(java.io.Reader dstream, int startline, int startcolumn) {
        super(dstream, startline, startcolumn, 4096);
    }

    /** Constructor. */
    public JavaCharStream(java.io.InputStream dstream, String encoding, int startline,
            int startcolumn) throws java.io.UnsupportedEncodingException {
        super(dstream, encoding, startline, startcolumn, 4096);
    }
}
/* JavaCC - OriginalChecksum=f1025eb27ba5551cf81f1a3596357a73 (do not edit this line) */
