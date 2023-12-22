package Windows.UI.Notifications

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

@ABIMarker(IToastNotification4.ABI::class)
@Signature("{15154935-28ea-4727-88e9-c58680e2d118}")
@Guid("1515493528ea472788e9c58680e2d118")
@WinRTInterface("1515493528ea472788e9c58680e2d118")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotification4.ByReference::class)
public interface IToastNotification4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): NotificationData?

  @InterfaceMethod(1)
  public fun put_Data(value: NotificationData?): Unit

  @InterfaceMethod(2)
  public fun get_Priority(): ToastNotificationPriority?

  @InterfaceMethod(3)
  public fun put_Priority(value: ToastNotificationPriority?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotification4> {
    public override fun getValue() = ABI.makeIToastNotification4(pointer.getPointer(0))

    public fun setValue(value: IToastNotification4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotification4 {
    public val __108921294_Ptr: Pointer?

    public val _108921294_VtblPtr: Pointer?
      get() = __108921294_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): NotificationData? {
      val fnPtr = _108921294_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationData>()
      val hr = fn.invokeHR(arrayOf(__108921294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: NotificationData?): Unit {
      val fnPtr = _108921294_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921294_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Priority(): ToastNotificationPriority? {
      val fnPtr = _108921294_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotificationPriority>()
      val hr = fn.invokeHR(arrayOf(__108921294_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotificationPriority>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Priority(value: ToastNotificationPriority?): Unit {
      val fnPtr = _108921294_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__108921294_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToastNotification4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108921294_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotification4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1515493528ea472788e9c58680e2d118")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotification4(ptr: Pointer?): WithDefault = IToastNotification4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotification4 {
      val address = segment.toRawLongValue()
      return makeIToastNotification4(Pointer(address))
    }

    public override fun toNative(obj: IToastNotification4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108921294_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotification4): Array<IToastNotification4?> =
        (elements as
        Array<IToastNotification4?>).castToImpl<IToastNotification4,IToastNotification4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotification4?> =
        arrayOfNulls<IToastNotification4_Impl>(size) as Array<IToastNotification4?>
  }
}
