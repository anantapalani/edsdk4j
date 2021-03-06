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
public class EdsPictureStyleDesc extends Structure {

    /// C type : EdsInt32
    public NativeLong contrast;
    /// C type : EdsUInt32
    public NativeLong sharpness;
    /// C type : EdsInt32
    public NativeLong saturation;
    /// C type : EdsInt32
    public NativeLong colorTone;
    /// C type : EdsUInt32
    public NativeLong filterEffect;
    /// C type : EdsUInt32
    public NativeLong toningEffect;

    public EdsPictureStyleDesc() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder( new String[] { "contrast", "sharpness", "saturation",
                                     "colorTone", "filterEffect",
                                     "toningEffect" } );
    }

    /**
     * @param contrast C type : EdsInt32<br>
     * @param sharpness C type : EdsUInt32<br>
     * @param saturation C type : EdsInt32<br>
     * @param colorTone C type : EdsInt32<br>
     * @param filterEffect C type : EdsUInt32<br>
     * @param toningEffect C type : EdsUInt32
     */
    public EdsPictureStyleDesc( final NativeLong contrast,
                                final NativeLong sharpness,
                                final NativeLong saturation,
                                final NativeLong colorTone,
                                final NativeLong filterEffect,
                                final NativeLong toningEffect ) {
        super();
        this.contrast = contrast;
        this.sharpness = sharpness;
        this.saturation = saturation;
        this.colorTone = colorTone;
        this.filterEffect = filterEffect;
        this.toningEffect = toningEffect;
        initFieldOrder();
    }

    public EdsPictureStyleDesc( final Pointer pointer ) {
        super( pointer );
        read();
    }

    public static class ByReference extends EdsPictureStyleDesc implements Structure.ByReference {

    };

    public static class ByValue extends EdsPictureStyleDesc implements Structure.ByValue {

    };
}
