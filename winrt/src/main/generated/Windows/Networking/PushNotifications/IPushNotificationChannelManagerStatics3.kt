package Windows.Networking.PushNotifications

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

@ABIMarker(IPushNotificationChannelManagerStatics3.ABI::class)
@Signature("{4701fefe-0ede-4a3f-ae78-bfa471496925}")
@Guid("4701fefe0ede4a3fae78bfa471496925")
@WinRTInterface("4701fefe0ede4a3fae78bfa471496925")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannelManagerStatics3.ByReference::class)
public interface IPushNotificationChannelManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): PushNotificationChannelManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannelManagerStatics3> {
    public override fun getValue() =
        ABI.makeIPushNotificationChannelManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannelManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannelManagerStatics3 {
    public val __1543256455_Ptr: Pointer?

    public val _1543256455_VtblPtr: Pointer?
      get() = __1543256455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): PushNotificationChannelManagerForUser? {
      val fnPtr = _1543256455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PushNotificationChannelManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1543256455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PushNotificationChannelManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationChannelManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1543256455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannelManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4701fefe0ede4a3fae78bfa471496925")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannelManagerStatics3(ptr: Pointer?): WithDefault =
        IPushNotificationChannelManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPushNotificationChannelManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannelManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannelManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1543256455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannelManagerStatics3):
        Array<IPushNotificationChannelManagerStatics3?> = (elements as
        Array<IPushNotificationChannelManagerStatics3?>).castToImpl<IPushNotificationChannelManagerStatics3,IPushNotificationChannelManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannelManagerStatics3?> =
        arrayOfNulls<IPushNotificationChannelManagerStatics3_Impl>(size) as
        Array<IPushNotificationChannelManagerStatics3?>
  }
}
