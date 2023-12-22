package Windows.Graphics.Printing

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

@ABIMarker(IPrintTaskRequestedDeferral.ABI::class)
@Signature("{cfefb3f0-ce3e-42c7-9496-64800c622c44}")
@Guid("cfefb3f0ce3e42c7949664800c622c44")
@WinRTInterface("cfefb3f0ce3e42c7949664800c622c44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskRequestedDeferral.ByReference::class)
public interface IPrintTaskRequestedDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskRequestedDeferral> {
    public override fun getValue() = ABI.makeIPrintTaskRequestedDeferral(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskRequestedDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskRequestedDeferral {
    public val __413563645_Ptr: Pointer?

    public val _413563645_VtblPtr: Pointer?
      get() = __413563645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _413563645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413563645_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintTaskRequestedDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __413563645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskRequestedDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfefb3f0ce3e42c7949664800c622c44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskRequestedDeferral(ptr: Pointer?): WithDefault =
        IPrintTaskRequestedDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskRequestedDeferral {
      val address = segment.toRawLongValue()
      return makeIPrintTaskRequestedDeferral(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskRequestedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__413563645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskRequestedDeferral):
        Array<IPrintTaskRequestedDeferral?> = (elements as
        Array<IPrintTaskRequestedDeferral?>).castToImpl<IPrintTaskRequestedDeferral,IPrintTaskRequestedDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskRequestedDeferral?> =
        arrayOfNulls<IPrintTaskRequestedDeferral_Impl>(size) as Array<IPrintTaskRequestedDeferral?>
  }
}
