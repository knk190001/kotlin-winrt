package Windows.UI.Notifications

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IToastNotificationManagerForUser3.ABI::class)
@Signature("{3efcb176-6cc1-56dc-973b-251f7aacb1c5}")
@Guid("3efcb1766cc156dc973b251f7aacb1c5")
@WinRTInterface("3efcb1766cc156dc973b251f7aacb1c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerForUser3.ByReference::class)
public interface IToastNotificationManagerForUser3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NotificationMode(): ToastNotificationMode?

  @InterfaceMethod(1)
  public
      fun add_NotificationModeChanged(handler: TypedEventHandler<ToastNotificationManagerForUser?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_NotificationModeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerForUser3> {
    public override fun getValue() =
        ABI.makeIToastNotificationManagerForUser3(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerForUser3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerForUser3 {
    public val __879001258_Ptr: Pointer?

    public val _879001258_VtblPtr: Pointer?
      get() = __879001258_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NotificationMode(): ToastNotificationMode? {
      val fnPtr = _879001258_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotificationMode>()
      val hr = fn.invokeHR(arrayOf(__879001258_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotificationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_NotificationModeChanged(handler: TypedEventHandler<ToastNotificationManagerForUser?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _879001258_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__879001258_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_NotificationModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _879001258_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__879001258_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotificationManagerForUser3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __879001258_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerForUser3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3efcb1766cc156dc973b251f7aacb1c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerForUser3(ptr: Pointer?): WithDefault =
        IToastNotificationManagerForUser3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerForUser3 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerForUser3(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerForUser3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__879001258_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerForUser3):
        Array<IToastNotificationManagerForUser3?> = (elements as
        Array<IToastNotificationManagerForUser3?>).castToImpl<IToastNotificationManagerForUser3,IToastNotificationManagerForUser3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerForUser3?> =
        arrayOfNulls<IToastNotificationManagerForUser3_Impl>(size) as
        Array<IToastNotificationManagerForUser3?>
  }
}
