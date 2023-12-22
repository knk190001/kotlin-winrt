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

@ABIMarker(IClaimedCashDrawer2.ABI::class)
@Signature("{9cbab5a2-de42-4d5b-b0c1-9b57a2ba89c3}")
@Guid("9cbab5a2de424d5bb0c19b57a2ba89c3")
@WinRTInterface("9cbab5a2de424d5bb0c19b57a2ba89c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedCashDrawer2.ByReference::class)
public interface IClaimedCashDrawer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<ClaimedCashDrawer?,
      ClaimedCashDrawerClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedCashDrawer2> {
    public override fun getValue() = ABI.makeIClaimedCashDrawer2(pointer.getPointer(0))

    public fun setValue(value: IClaimedCashDrawer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedCashDrawer2 {
    public val __31162574_Ptr: Pointer?

    public val _31162574_VtblPtr: Pointer?
      get() = __31162574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<ClaimedCashDrawer?,
        ClaimedCashDrawerClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _31162574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__31162574_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _31162574_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__31162574_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClaimedCashDrawer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __31162574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedCashDrawer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cbab5a2de424d5bb0c19b57a2ba89c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedCashDrawer2(ptr: Pointer?): WithDefault = IClaimedCashDrawer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedCashDrawer2 {
      val address = segment.toRawLongValue()
      return makeIClaimedCashDrawer2(Pointer(address))
    }

    public override fun toNative(obj: IClaimedCashDrawer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__31162574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedCashDrawer2): Array<IClaimedCashDrawer2?> =
        (elements as
        Array<IClaimedCashDrawer2?>).castToImpl<IClaimedCashDrawer2,IClaimedCashDrawer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedCashDrawer2?> =
        arrayOfNulls<IClaimedCashDrawer2_Impl>(size) as Array<IClaimedCashDrawer2?>
  }
}
