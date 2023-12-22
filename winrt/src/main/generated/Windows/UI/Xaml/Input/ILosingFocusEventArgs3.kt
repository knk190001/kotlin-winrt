package Windows.UI.Xaml.Input

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

@ABIMarker(ILosingFocusEventArgs3.ABI::class)
@Signature("{c98900bd-0b79-566e-ad1f-436fa513ae22}")
@Guid("c98900bd0b79566ead1f436fa513ae22")
@WinRTInterface("c98900bd0b79566ead1f436fa513ae22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILosingFocusEventArgs3.ByReference::class)
public interface ILosingFocusEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILosingFocusEventArgs3> {
    public override fun getValue() = ABI.makeILosingFocusEventArgs3(pointer.getPointer(0))

    public fun setValue(value: ILosingFocusEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILosingFocusEventArgs3 {
    public val __60775060_Ptr: Pointer?

    public val _60775060_VtblPtr: Pointer?
      get() = __60775060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _60775060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__60775060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class ILosingFocusEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60775060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILosingFocusEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c98900bd0b79566ead1f436fa513ae22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILosingFocusEventArgs3(ptr: Pointer?): WithDefault =
        ILosingFocusEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILosingFocusEventArgs3 {
      val address = segment.toRawLongValue()
      return makeILosingFocusEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: ILosingFocusEventArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60775060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILosingFocusEventArgs3): Array<ILosingFocusEventArgs3?> =
        (elements as
        Array<ILosingFocusEventArgs3?>).castToImpl<ILosingFocusEventArgs3,ILosingFocusEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILosingFocusEventArgs3?> =
        arrayOfNulls<ILosingFocusEventArgs3_Impl>(size) as Array<ILosingFocusEventArgs3?>
  }
}
