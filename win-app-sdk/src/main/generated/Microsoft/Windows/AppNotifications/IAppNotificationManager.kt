package Microsoft.Windows.AppNotifications

import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppNotificationManager.ABI::class)
@Signature("{55129688-b4bd-550b-ae6b-c24061954d91}")
@Guid("55129688b4bd550bae6bc24061954d91")
@WinRTInterface("55129688b4bd550bae6bc24061954d91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationManager.ByReference::class)
public interface IAppNotificationManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Register(): Unit

  @InterfaceMethod(1)
  public fun Unregister(): Unit

  @InterfaceMethod(2)
  public fun UnregisterAll(): Unit

  @InterfaceMethod(3)
  public fun add_NotificationInvoked(handler: TypedEventHandler<AppNotificationManager?,
      AppNotificationActivatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_NotificationInvoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Show(notification: AppNotification?): Unit

  @InterfaceMethod(6)
  public fun UpdateAsync(
    `data`: AppNotificationProgressData?,
    tag: String?,
    group: String?
  ): IAsyncOperation<AppNotificationProgressResult?>?

  @InterfaceMethod(7)
  public fun UpdateAsync(`data`: AppNotificationProgressData?, tag: String?):
      IAsyncOperation<AppNotificationProgressResult?>?

  @InterfaceMethod(8)
  public fun get_Setting(): AppNotificationSetting?

  @InterfaceMethod(9)
  public fun RemoveByIdAsync(notificationId: WinDef.UINT): IAsyncAction?

  @InterfaceMethod(10)
  public fun RemoveByTagAsync(tag: String?): IAsyncAction?

  @InterfaceMethod(11)
  public fun RemoveByTagAndGroupAsync(tag: String?, group: String?): IAsyncAction?

  @InterfaceMethod(12)
  public fun RemoveByGroupAsync(group: String?): IAsyncAction?

  @InterfaceMethod(13)
  public fun RemoveAllAsync(): IAsyncAction?

  @InterfaceMethod(14)
  public fun GetAllAsync(): IAsyncOperation<IVector<AppNotification?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationManager> {
    public override fun getValue() = ABI.makeIAppNotificationManager(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationManager {
    public val __629340648_Ptr: Pointer?

    public val _629340648_VtblPtr: Pointer?
      get() = __629340648_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Register(): Unit {
      val fnPtr = _629340648_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Unregister(): Unit {
      val fnPtr = _629340648_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun UnregisterAll(): Unit {
      val fnPtr = _629340648_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_NotificationInvoked(handler: TypedEventHandler<AppNotificationManager?,
        AppNotificationActivatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_NotificationInvoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _629340648_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Show(notification: AppNotification?): Unit {
      val fnPtr = _629340648_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(notification),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun UpdateAsync(
      `data`: AppNotificationProgressData?,
      tag: String?,
      group: String?
    ): IAsyncOperation<AppNotificationProgressResult?>? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppNotificationProgressResult?>>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(data), marshalToNative(tag),
          marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppNotificationProgressResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun UpdateAsync(`data`: AppNotificationProgressData?, tag: String?):
        IAsyncOperation<AppNotificationProgressResult?>? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppNotificationProgressResult?>>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(data), marshalToNative(tag),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppNotificationProgressResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Setting(): AppNotificationSetting? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationSetting>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun RemoveByIdAsync(notificationId: WinDef.UINT): IAsyncAction? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, notificationId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun RemoveByTagAsync(tag: String?): IAsyncAction? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(tag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun RemoveByTagAndGroupAsync(tag: String?, group: String?): IAsyncAction? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(tag), marshalToNative(group),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun RemoveByGroupAsync(group: String?): IAsyncAction? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr, marshalToNative(group), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun RemoveAllAsync(): IAsyncAction? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetAllAsync(): IAsyncOperation<IVector<AppNotification?>?>? {
      val fnPtr = _629340648_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<AppNotification?>?>>()
      val hr = fn.invokeHR(arrayOf(__629340648_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<AppNotification?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629340648_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55129688b4bd550bae6bc24061954d91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationManager(ptr: Pointer?): WithDefault =
        IAppNotificationManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationManager {
      val address = segment.toRawLongValue()
      return makeIAppNotificationManager(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629340648_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationManager): Array<IAppNotificationManager?>
        = (elements as
        Array<IAppNotificationManager?>).castToImpl<IAppNotificationManager,IAppNotificationManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationManager?> =
        arrayOfNulls<IAppNotificationManager_Impl>(size) as Array<IAppNotificationManager?>
  }
}
