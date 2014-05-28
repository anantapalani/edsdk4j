package edsdk.bindings;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * <i>native declaration : EDSDK\Header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsImageInfo extends Structure {

    /// C type : EdsUInt32
    public NativeLong width;
    /// C type : EdsUInt32
    public NativeLong height;
    /// C type : EdsUInt32
    public NativeLong numOfComponents;
    /// C type : EdsUInt32
    public NativeLong componentDepth;
    /// C type : EdsRect
    public EdsRect effectiveRect;
    /// C type : EdsUInt32
    public NativeLong reserved1;
    /// C type : EdsUInt32
    public NativeLong reserved2;

    public EdsImageInfo() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder( new String[] { "width", "height", "numOfComponents",
                                     "componentDepth", "effectiveRect",
                                     "reserved1", "reserved2" } );
    }

    /**
     * @param width C type : EdsUInt32<br>
     * @param height C type : EdsUInt32<br>
     * @param numOfComponents C type : EdsUInt32<br>
     * @param componentDepth C type : EdsUInt32<br>
     * @param effectiveRect C type : EdsRect<br>
     * @param reserved1 C type : EdsUInt32<br>
     * @param reserved2 C type : EdsUInt32
     */
    public EdsImageInfo( final NativeLong width, final NativeLong height,
                         final NativeLong numOfComponents,
                         final NativeLong componentDepth,
                         final EdsRect effectiveRect,
                         final NativeLong reserved1, final NativeLong reserved2 ) {
        super();
        this.width = width;
        this.height = height;
        this.numOfComponents = numOfComponents;
        this.componentDepth = componentDepth;
        this.effectiveRect = effectiveRect;
        this.reserved1 = reserved1;
        this.reserved2 = reserved2;
        initFieldOrder();
    }

    public EdsImageInfo( final Pointer pointer ) {
        super( pointer );
        read();
    }

    public static class ByReference extends EdsImageInfo implements Structure.ByReference {

    };

    public static class ByValue extends EdsImageInfo implements Structure.ByValue {

    };
}
