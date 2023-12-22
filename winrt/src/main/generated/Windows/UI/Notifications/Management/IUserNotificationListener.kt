package Windows.UI.Notifications.Management

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.UI.Notifications.NotificationKinds
import Windows.UI.Notifications.UserNotification
import Windows.UI.Notifications.UserNotificationChangedEventArgs
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IUserNotificationListener.ABI::class)
@Signature("{62553e41-8a06-4cef-8215-6033a5be4b03}")
@Guid("62553e418a064cef82156033a5be4b03")
@WinRTInterface("62553e418a064cef82156033a5be4b03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserNotificationListener.ByReference::class)
public interface IUserNotificationListener : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<UserNotificationListenerAccessStatus?>?

  @InterfaceMethod(1)
  public fun GetAccessStatus(): UserNotificationListenerAccessStatus?

  @InterfaceMethod(2)
  public fun add_NotificationChanged(handler: TypedEventHandler<UserNotificationListener?,
      UserNotificationChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_NotificationChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun GetNotificationsAsync(kinds: NotificationKinds?):
      IAsyncOperation<IVectorView<UserNotification?>?>?

  @InterfaceMethod(5)
  public fun GetNotification(notificationId: WinDef.UINT): UserNotification?

  @InterfaceMethod(6)
  public fun ClearNotifications(): Unit

  @InterfaceMethod(7)
  public fun RemoveNotification(notificationId: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserNotificationListener> {
    public override fun getValue() = ABI.makeIUserNotificationListener(pointer.getPointer(0))

    public fun setValue(value: IUserNotificationListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserNotificationListener {
    public val __117565755_Ptr: Pointer?

    public val _117565755_VtblPtr: Pointer?
      get() = __117565755_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync():
        IAsyncOperation<UserNotificationListenerAccessStatus?>? {
      val fnPtr = _117565755_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserNotificationListenerAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UserNotificationListenerAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAccessStatus(): UserNotificationListenerAccessStatus? {
      val fnPtr = _117565755_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserNotificationListenerAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserNotificationListenerAccessStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_NotificationChanged(handler: TypedEventHandler<UserNotificationListener?,
        UserNotificationChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _117565755_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_NotificationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _117565755_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetNotificationsAsync(kinds: NotificationKinds?):
        IAsyncOperation<IVectorView<UserNotification?>?>? {
      val fnPtr = _117565755_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<UserNotification?>?>>()
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr, marshalToNative(kinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<UserNotification?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetNotification(notificationId: WinDef.UINT): UserNotification? {
      val fnPtr = _117565755_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserNotification>()
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr, notificationId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserNotification>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ClearNotifications(): Unit {
      val fnPtr = _117565755_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun RemoveNotification(notificationId: WinDef.UINT): Unit {
      val fnPtr = _117565755_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__117565755_Ptr, notificationId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserNotificationListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __117565755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserNotificationListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62553e418a064cef82156033a5be4b03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserNotificationListener(ptr: Pointer?): WithDefault =
        IUserNotificationListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserNotificationListener {
      val address = segment.toRawLongValue()
      return makeIUserNotificationListener(Pointer(address))
    }

    public override fun toNative(obj: IUserNotificationListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__117565755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotificationListener):
        Array<IUserNotificationListener?> = (elements as
        Array<IUserNotificationListener?>).castToImpl<IUserNotificationListener,IUserNotificationListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotificationListener?> =
        arrayOfNulls<IUserNotificationListener_Impl>(size) as Array<IUserNotificationListener?>
  }
}
