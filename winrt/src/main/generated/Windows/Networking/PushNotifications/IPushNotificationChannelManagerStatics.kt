package Windows.Networking.PushNotifications

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPushNotificationChannelManagerStatics.ABI::class)
@Signature("{8baf9b65-77a1-4588-bd19-861529a9dcf0}")
@Guid("8baf9b6577a14588bd19861529a9dcf0")
@WinRTInterface("8baf9b6577a14588bd19861529a9dcf0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannelManagerStatics.ByReference::class)
public interface IPushNotificationChannelManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePushNotificationChannelForApplicationAsync():
      IAsyncOperation<PushNotificationChannel?>?

  @InterfaceMethod(1)
  public fun CreatePushNotificationChannelForApplicationAsync(applicationId: String?):
      IAsyncOperation<PushNotificationChannel?>?

  @InterfaceMethod(2)
  public fun CreatePushNotificationChannelForSecondaryTileAsync(tileId: String?):
      IAsyncOperation<PushNotificationChannel?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannelManagerStatics> {
    public override fun getValue() =
        ABI.makeIPushNotificationChannelManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannelManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannelManagerStatics {
    public val __642954196_Ptr: Pointer?

    public val _642954196_VtblPtr: Pointer?
      get() = __642954196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePushNotificationChannelForApplicationAsync():
        IAsyncOperation<PushNotificationChannel?>? {
      val fnPtr = _642954196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__642954196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PushNotificationChannel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreatePushNotificationChannelForApplicationAsync(applicationId: String?):
        IAsyncOperation<PushNotificationChannel?>? {
      val fnPtr = _642954196_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__642954196_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PushNotificationChannel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreatePushNotificationChannelForSecondaryTileAsync(tileId: String?):
        IAsyncOperation<PushNotificationChannel?>? {
      val fnPtr = _642954196_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__642954196_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PushNotificationChannel?>>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationChannelManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __642954196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannelManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8baf9b6577a14588bd19861529a9dcf0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannelManagerStatics(ptr: Pointer?): WithDefault =
        IPushNotificationChannelManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationChannelManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannelManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannelManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__642954196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannelManagerStatics):
        Array<IPushNotificationChannelManagerStatics?> = (elements as
        Array<IPushNotificationChannelManagerStatics?>).castToImpl<IPushNotificationChannelManagerStatics,IPushNotificationChannelManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannelManagerStatics?> =
        arrayOfNulls<IPushNotificationChannelManagerStatics_Impl>(size) as
        Array<IPushNotificationChannelManagerStatics?>
  }
}
