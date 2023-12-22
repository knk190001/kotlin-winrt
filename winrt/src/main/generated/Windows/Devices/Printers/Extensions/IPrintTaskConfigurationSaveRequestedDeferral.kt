package Windows.Devices.Printers.Extensions

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

@ABIMarker(IPrintTaskConfigurationSaveRequestedDeferral.ABI::class)
@Signature("{e959d568-f729-44a4-871d-bd0628696a33}")
@Guid("e959d568f72944a4871dbd0628696a33")
@WinRTInterface("e959d568f72944a4871dbd0628696a33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskConfigurationSaveRequestedDeferral.ByReference::class)
public interface IPrintTaskConfigurationSaveRequestedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskConfigurationSaveRequestedDeferral> {
    public override fun getValue() =
        ABI.makeIPrintTaskConfigurationSaveRequestedDeferral(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskConfigurationSaveRequestedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskConfigurationSaveRequestedDeferral {
    public val __1040153252_Ptr: Pointer?

    public val _1040153252_VtblPtr: Pointer?
      get() = __1040153252_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1040153252_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1040153252_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintTaskConfigurationSaveRequestedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1040153252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskConfigurationSaveRequestedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e959d568f72944a4871dbd0628696a33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskConfigurationSaveRequestedDeferral(ptr: Pointer?): WithDefault =
        IPrintTaskConfigurationSaveRequestedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintTaskConfigurationSaveRequestedDeferral {
      val address = segment.toRawLongValue()
      return makeIPrintTaskConfigurationSaveRequestedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskConfigurationSaveRequestedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1040153252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskConfigurationSaveRequestedDeferral):
        Array<IPrintTaskConfigurationSaveRequestedDeferral?> = (elements as
        Array<IPrintTaskConfigurationSaveRequestedDeferral?>).castToImpl<IPrintTaskConfigurationSaveRequestedDeferral,IPrintTaskConfigurationSaveRequestedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskConfigurationSaveRequestedDeferral?> =
        arrayOfNulls<IPrintTaskConfigurationSaveRequestedDeferral_Impl>(size) as
        Array<IPrintTaskConfigurationSaveRequestedDeferral?>
  }
}
