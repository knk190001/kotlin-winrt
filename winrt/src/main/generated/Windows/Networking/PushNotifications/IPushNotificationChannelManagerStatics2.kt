package Windows.Networking.PushNotifications

import Windows.System.User
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

@ABIMarker(IPushNotificationChannelManagerStatics2.ABI::class)
@Signature("{b444a65d-a7e9-4b28-950e-f375a907f9df}")
@Guid("b444a65da7e94b28950ef375a907f9df")
@WinRTInterface("b444a65da7e94b28950ef375a907f9df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannelManagerStatics2.ByReference::class)
public interface IPushNotificationChannelManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): PushNotificationChannelManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannelManagerStatics2> {
    public override fun getValue() =
        ABI.makeIPushNotificationChannelManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannelManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannelManagerStatics2 {
    public val __1543256454_Ptr: Pointer?

    public val _1543256454_VtblPtr: Pointer?
      get() = __1543256454_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): PushNotificationChannelManagerForUser? {
      val fnPtr = _1543256454_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationChannelManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1543256454_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationChannelManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationChannelManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1543256454_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannelManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b444a65da7e94b28950ef375a907f9df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannelManagerStatics2(ptr: Pointer?): WithDefault =
        IPushNotificationChannelManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPushNotificationChannelManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannelManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannelManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1543256454_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannelManagerStatics2):
        Array<IPushNotificationChannelManagerStatics2?> = (elements as
        Array<IPushNotificationChannelManagerStatics2?>).castToImpl<IPushNotificationChannelManagerStatics2,IPushNotificationChannelManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannelManagerStatics2?> =
        arrayOfNulls<IPushNotificationChannelManagerStatics2_Impl>(size) as
        Array<IPushNotificationChannelManagerStatics2?>
  }
}
