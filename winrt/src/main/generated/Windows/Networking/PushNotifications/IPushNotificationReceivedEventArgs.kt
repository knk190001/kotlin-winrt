package Windows.Networking.PushNotifications

import Windows.UI.Notifications.BadgeNotification
import Windows.UI.Notifications.TileNotification
import Windows.UI.Notifications.ToastNotification
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPushNotificationReceivedEventArgs.ABI::class)
@Signature("{d1065e0c-36cd-484c-b935-0a99b753cf00}")
@Guid("d1065e0c36cd484cb9350a99b753cf00")
@WinRTInterface("d1065e0c36cd484cb9350a99b753cf00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationReceivedEventArgs.ByReference::class)
public interface IPushNotificationReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun get_NotificationType(): PushNotificationType?

  @InterfaceMethod(3)
  public fun get_ToastNotification(): ToastNotification?

  @InterfaceMethod(4)
  public fun get_TileNotification(): TileNotification?

  @InterfaceMethod(5)
  public fun get_BadgeNotification(): BadgeNotification?

  @InterfaceMethod(6)
  public fun get_RawNotification(): RawNotification?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIPushNotificationReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationReceivedEventArgs {
    public val __2025634009_Ptr: Pointer?

    public val _2025634009_VtblPtr: Pointer?
      get() = __2025634009_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_NotificationType(): PushNotificationType? {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationType>()
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ToastNotification(): ToastNotification? {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotification>()
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TileNotification(): TileNotification? {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileNotification>()
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_BadgeNotification(): BadgeNotification? {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeNotification>()
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RawNotification(): RawNotification? {
      val fnPtr = _2025634009_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RawNotification>()
      val hr = fn.invokeHR(arrayOf(__2025634009_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RawNotification>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2025634009_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1065e0c36cd484cb9350a99b753cf00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationReceivedEventArgs(ptr: Pointer?): WithDefault =
        IPushNotificationReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPushNotificationReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2025634009_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationReceivedEventArgs):
        Array<IPushNotificationReceivedEventArgs?> = (elements as
        Array<IPushNotificationReceivedEventArgs?>).castToImpl<IPushNotificationReceivedEventArgs,IPushNotificationReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationReceivedEventArgs?> =
        arrayOfNulls<IPushNotificationReceivedEventArgs_Impl>(size) as
        Array<IPushNotificationReceivedEventArgs?>
  }
}
