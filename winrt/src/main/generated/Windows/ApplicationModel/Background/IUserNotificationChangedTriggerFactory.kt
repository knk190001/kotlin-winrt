package Windows.ApplicationModel.Background

import Windows.UI.Notifications.NotificationKinds
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

@ABIMarker(IUserNotificationChangedTriggerFactory.ABI::class)
@Signature("{cad4436c-69ab-4e18-a48a-5ed2ac435957}")
@Guid("cad4436c69ab4e18a48a5ed2ac435957")
@WinRTInterface("cad4436c69ab4e18a48a5ed2ac435957")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserNotificationChangedTriggerFactory.ByReference::class)
public interface IUserNotificationChangedTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(notificationKinds: NotificationKinds?): UserNotificationChangedTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserNotificationChangedTriggerFactory> {
    public override fun getValue() =
        ABI.makeIUserNotificationChangedTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IUserNotificationChangedTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserNotificationChangedTriggerFactory {
    public val __965290497_Ptr: Pointer?

    public val _965290497_VtblPtr: Pointer?
      get() = __965290497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(notificationKinds: NotificationKinds?):
        UserNotificationChangedTrigger? {
      val fnPtr = _965290497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserNotificationChangedTrigger>()
      val hr = fn.invokeHR(arrayOf(__965290497_Ptr, marshalToNative(notificationKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserNotificationChangedTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IUserNotificationChangedTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965290497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserNotificationChangedTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cad4436c69ab4e18a48a5ed2ac435957")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserNotificationChangedTriggerFactory(ptr: Pointer?): WithDefault =
        IUserNotificationChangedTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserNotificationChangedTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIUserNotificationChangedTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IUserNotificationChangedTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965290497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserNotificationChangedTriggerFactory):
        Array<IUserNotificationChangedTriggerFactory?> = (elements as
        Array<IUserNotificationChangedTriggerFactory?>).castToImpl<IUserNotificationChangedTriggerFactory,IUserNotificationChangedTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserNotificationChangedTriggerFactory?> =
        arrayOfNulls<IUserNotificationChangedTriggerFactory_Impl>(size) as
        Array<IUserNotificationChangedTriggerFactory?>
  }
}
