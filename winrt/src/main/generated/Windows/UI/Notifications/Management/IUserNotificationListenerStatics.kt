package Windows.UI.Notifications.Management

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

@ABIMarker(IUserNotificationListenerStatics.ABI::class)
@Signature("{ff6123cf-4386-4aa3-b73d-b804e5b63b23}")
@Guid("ff6123cf43864aa3b73db804e5b63b23")
@WinRTInterface("ff6123cf43864aa3b73db804e5b63b23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserNotificationListenerStatics.ByReference::class)
public interface IUserNotificationListenerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): UserNotificationListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserNotificationListenerStatics> {
    public override fun getValue() = ABI.makeIUserNotificationListenerStatics(pointer.getPointer(0))

    public fun setValue(value: IUserNotificationListenerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserNotificationListenerStatics {
    public val __448783882_Ptr: Pointer?

    public val _448783882_VtblPtr: Pointer?
      get() = __448783882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): UserNotificationListener? {
      val fnPtr = _448783882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserNotificationListener>()
      val hr = fn.invokeHR(arrayOf(__448783882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserNotificationListener>(result.getValue())
      return resultValue
    }
  }

  public class IUserNotificationListenerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __448783882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserNotificationListenerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff6123cf43864aa3b73db804e5b63b23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserNotificationListenerStatics(ptr: Pointer?): WithDefault =
        IUserNotificationListenerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserNotificationListenerStatics {
      val address = segment.toRawLongValue()
      return makeIUserNotificationListenerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserNotificationListenerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__448783882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotificationListenerStatics):
        Array<IUserNotificationListenerStatics?> = (elements as
        Array<IUserNotificationListenerStatics?>).castToImpl<IUserNotificationListenerStatics,IUserNotificationListenerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotificationListenerStatics?> =
        arrayOfNulls<IUserNotificationListenerStatics_Impl>(size) as
        Array<IUserNotificationListenerStatics?>
  }
}
