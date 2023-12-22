package Windows.Devices.PointOfService

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IClaimedLineDisplay3.ABI::class)
@Signature("{642ecd92-e9d4-4ecc-af75-329c274cd18f}")
@Guid("642ecd92e9d44eccaf75329c274cd18f")
@WinRTInterface("642ecd92e9d44eccaf75329c274cd18f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedLineDisplay3.ByReference::class)
public interface IClaimedLineDisplay3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<ClaimedLineDisplay?,
      ClaimedLineDisplayClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedLineDisplay3> {
    public override fun getValue() = ABI.makeIClaimedLineDisplay3(pointer.getPointer(0))

    public fun setValue(value: IClaimedLineDisplay3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedLineDisplay3 {
    public val __1926415297_Ptr: Pointer?

    public val _1926415297_VtblPtr: Pointer?
      get() = __1926415297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<ClaimedLineDisplay?,
        ClaimedLineDisplayClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1926415297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1926415297_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1926415297_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1926415297_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedLineDisplay3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1926415297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedLineDisplay3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("642ecd92e9d44eccaf75329c274cd18f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedLineDisplay3(ptr: Pointer?): WithDefault = IClaimedLineDisplay3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedLineDisplay3 {
      val address = segment.toRawLongValue()
      return makeIClaimedLineDisplay3(Pointer(address))
    }

    public override fun toNative(obj: IClaimedLineDisplay3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1926415297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedLineDisplay3): Array<IClaimedLineDisplay3?> =
        (elements as
        Array<IClaimedLineDisplay3?>).castToImpl<IClaimedLineDisplay3,IClaimedLineDisplay3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedLineDisplay3?> =
        arrayOfNulls<IClaimedLineDisplay3_Impl>(size) as Array<IClaimedLineDisplay3?>
  }
}
