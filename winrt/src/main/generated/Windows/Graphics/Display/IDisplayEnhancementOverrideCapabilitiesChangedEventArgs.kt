package Windows.Graphics.Display

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.ABI::class)
@Signature("{db61e664-15fa-49da-8b77-07dbd2af585d}")
@Guid("db61e66415fa49da8b7707dbd2af585d")
@WinRTInterface("db61e66415fa49da8b7707dbd2af585d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IDisplayEnhancementOverrideCapabilitiesChangedEventArgs.ByReference::class)
public interface IDisplayEnhancementOverrideCapabilitiesChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Capabilities(): DisplayEnhancementOverrideCapabilities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIDisplayEnhancementOverrideCapabilitiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDisplayEnhancementOverrideCapabilitiesChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayEnhancementOverrideCapabilitiesChangedEventArgs {
    public val __689250798_Ptr: Pointer?

    public val _689250798_VtblPtr: Pointer?
      get() = __689250798_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capabilities(): DisplayEnhancementOverrideCapabilities? {
      val fnPtr = _689250798_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayEnhancementOverrideCapabilities>()
      val hr = fn.invokeHR(arrayOf(__689250798_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayEnhancementOverrideCapabilities>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayEnhancementOverrideCapabilitiesChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __689250798_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db61e66415fa49da8b7707dbd2af585d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayEnhancementOverrideCapabilitiesChangedEventArgs(ptr: Pointer?):
        WithDefault = IDisplayEnhancementOverrideCapabilitiesChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDisplayEnhancementOverrideCapabilitiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDisplayEnhancementOverrideCapabilitiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDisplayEnhancementOverrideCapabilitiesChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__689250798_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayEnhancementOverrideCapabilitiesChangedEventArgs):
        Array<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs?> = (elements as
        Array<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs?>).castToImpl<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs,IDisplayEnhancementOverrideCapabilitiesChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs?> =
        arrayOfNulls<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs_Impl>(size) as
        Array<IDisplayEnhancementOverrideCapabilitiesChangedEventArgs?>
  }
}
