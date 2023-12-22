package Windows.Networking.PushNotifications

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IPushNotificationChannelManagerStatics4.ABI::class)
@Signature("{bc540efb-7820-5a5b-9c01-b4757f774025}")
@Guid("bc540efb78205a5b9c01b4757f774025")
@WinRTInterface("bc540efb78205a5b9c01b4757f774025")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannelManagerStatics4.ByReference::class)
public interface IPushNotificationChannelManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ChannelsRevoked(handler: EventHandler<PushNotificationChannelsRevokedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ChannelsRevoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannelManagerStatics4> {
    public override fun getValue() =
        ABI.makeIPushNotificationChannelManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannelManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannelManagerStatics4 {
    public val __1543256456_Ptr: Pointer?

    public val _1543256456_VtblPtr: Pointer?
      get() = __1543256456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ChannelsRevoked(handler: EventHandler<PushNotificationChannelsRevokedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1543256456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1543256456_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ChannelsRevoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1543256456_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1543256456_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPushNotificationChannelManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1543256456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannelManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc540efb78205a5b9c01b4757f774025")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannelManagerStatics4(ptr: Pointer?): WithDefault =
        IPushNotificationChannelManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPushNotificationChannelManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannelManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannelManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1543256456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannelManagerStatics4):
        Array<IPushNotificationChannelManagerStatics4?> = (elements as
        Array<IPushNotificationChannelManagerStatics4?>).castToImpl<IPushNotificationChannelManagerStatics4,IPushNotificationChannelManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannelManagerStatics4?> =
        arrayOfNulls<IPushNotificationChannelManagerStatics4_Impl>(size) as
        Array<IPushNotificationChannelManagerStatics4?>
  }
}
