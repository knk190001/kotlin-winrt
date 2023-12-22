package Windows.UI.Notifications

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IToastNotifier.ABI::class)
@Signature("{75927b93-03f3-41ec-91d3-6e5bac1b38e7}")
@Guid("75927b9303f341ec91d36e5bac1b38e7")
@WinRTInterface("75927b9303f341ec91d36e5bac1b38e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotifier.ByReference::class)
public interface IToastNotifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Show(notification: ToastNotification?): Unit

  @InterfaceMethod(1)
  public fun Hide(notification: ToastNotification?): Unit

  @InterfaceMethod(2)
  public fun get_Setting(): NotificationSetting?

  @InterfaceMethod(3)
  public fun AddToSchedule(scheduledToast: ScheduledToastNotification?): Unit

  @InterfaceMethod(4)
  public fun RemoveFromSchedule(scheduledToast: ScheduledToastNotification?): Unit

  @InterfaceMethod(5)
  public fun GetScheduledToastNotifications(): IVectorView<ScheduledToastNotification?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IToastNotifier>
      {
    public override fun getValue() = ABI.makeIToastNotifier(pointer.getPointer(0))

    public fun setValue(value: IToastNotifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotifier {
    public val __783793789_Ptr: Pointer?

    public val _783793789_VtblPtr: Pointer?
      get() = __783793789_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Show(notification: ToastNotification?): Unit {
      val fnPtr = _783793789_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__783793789_Ptr, marshalToNative(notification),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Hide(notification: ToastNotification?): Unit {
      val fnPtr = _783793789_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__783793789_Ptr, marshalToNative(notification),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Setting(): NotificationSetting? {
      val fnPtr = _783793789_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationSetting>()
      val hr = fn.invokeHR(arrayOf(__783793789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun AddToSchedule(scheduledToast: ScheduledToastNotification?): Unit {
      val fnPtr = _783793789_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__783793789_Ptr, marshalToNative(scheduledToast),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RemoveFromSchedule(scheduledToast: ScheduledToastNotification?): Unit {
      val fnPtr = _783793789_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__783793789_Ptr, marshalToNative(scheduledToast),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetScheduledToastNotifications():
        IVectorView<ScheduledToastNotification?>? {
      val fnPtr = _783793789_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ScheduledToastNotification?>>()
      val hr = fn.invokeHR(arrayOf(__783793789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ScheduledToastNotification?>>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __783793789_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75927b9303f341ec91d36e5bac1b38e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotifier(ptr: Pointer?): WithDefault = IToastNotifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotifier {
      val address = segment.toRawLongValue()
      return makeIToastNotifier(Pointer(address))
    }

    public override fun toNative(obj: IToastNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__783793789_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotifier): Array<IToastNotifier?> = (elements as
        Array<IToastNotifier?>).castToImpl<IToastNotifier,IToastNotifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotifier?> =
        arrayOfNulls<IToastNotifier_Impl>(size) as Array<IToastNotifier?>
  }
}
