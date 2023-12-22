package Microsoft.UI.Xaml.Media.Imaging

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISvgImageSourceOpenedEventArgs.ABI::class)
@Signature("{1c9860d5-38d0-5b21-8d48-072f1e254e39}")
@Guid("1c9860d538d05b218d48072f1e254e39")
@WinRTInterface("1c9860d538d05b218d48072f1e254e39")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISvgImageSourceOpenedEventArgs.ByReference::class)
public interface ISvgImageSourceOpenedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISvgImageSourceOpenedEventArgs> {
    public override fun getValue() = ABI.makeISvgImageSourceOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISvgImageSourceOpenedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISvgImageSourceOpenedEventArgs {
    public val __517841077_Ptr: Pointer?

    public val _517841077_VtblPtr: Pointer?
      get() = __517841077_Ptr?.getPointer(0)
  }

  public class ISvgImageSourceOpenedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __517841077_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISvgImageSourceOpenedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c9860d538d05b218d48072f1e254e39")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISvgImageSourceOpenedEventArgs(ptr: Pointer?): WithDefault =
        ISvgImageSourceOpenedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISvgImageSourceOpenedEventArgs {
      val address = segment.toRawLongValue()
      return makeISvgImageSourceOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISvgImageSourceOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__517841077_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISvgImageSourceOpenedEventArgs):
        Array<ISvgImageSourceOpenedEventArgs?> = (elements as
        Array<ISvgImageSourceOpenedEventArgs?>).castToImpl<ISvgImageSourceOpenedEventArgs,ISvgImageSourceOpenedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISvgImageSourceOpenedEventArgs?> =
        arrayOfNulls<ISvgImageSourceOpenedEventArgs_Impl>(size) as
        Array<ISvgImageSourceOpenedEventArgs?>
  }
}
