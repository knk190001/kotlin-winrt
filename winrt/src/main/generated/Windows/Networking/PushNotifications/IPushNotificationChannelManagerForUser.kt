package Windows.Networking.PushNotifications

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPushNotificationChannelManagerForUser.ABI::class)
@Signature("{a4c45704-1182-42c7-8890-f563c4890dc4}")
@Guid("a4c45704118242c78890f563c4890dc4")
@WinRTInterface("a4c45704118242c78890f563c4890dc4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPushNotificationChannelManagerForUser.ByReference::class)
public interface IPushNotificationChannelManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePushNotificationChannelForApplicationAsync():
      IAsyncOperation<PushNotificationChannel?>?

  @InterfaceMethod(1)
  public fun CreatePushNotificationChannelForApplicationAsync(applicationId: String?):
      IAsyncOperation<PushNotificationChannel?>?

  @InterfaceMethod(2)
  public fun CreatePushNotificationChannelForSecondaryTileAsync(tileId: String?):
      IAsyncOperation<PushNotificationChannel?>?

  @InterfaceMethod(3)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPushNotificationChannelManagerForUser> {
    public override fun getValue() =
        ABI.makeIPushNotificationChannelManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IPushNotificationChannelManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPushNotificationChannelManagerForUser {
    public val __576040091_Ptr: Pointer?

    public val _576040091_VtblPtr: Pointer?
      get() = __576040091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePushNotificationChannelForApplicationAsync():
        IAsyncOperation<PushNotificationChannel?>? {
      val fnPtr = _576040091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__576040091_Ptr,  result))
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
      val fnPtr = _576040091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__576040091_Ptr, marshalToNative(applicationId), result))
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
      val fnPtr = _576040091_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PushNotificationChannel?>>()
      val hr = fn.invokeHR(arrayOf(__576040091_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PushNotificationChannel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_User(): User? {
      val fnPtr = _576040091_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__576040091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IPushNotificationChannelManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __576040091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPushNotificationChannelManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4c45704118242c78890f563c4890dc4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPushNotificationChannelManagerForUser(ptr: Pointer?): WithDefault =
        IPushNotificationChannelManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPushNotificationChannelManagerForUser {
      val address = segment.toRawLongValue()
      return makeIPushNotificationChannelManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IPushNotificationChannelManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__576040091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPushNotificationChannelManagerForUser):
        Array<IPushNotificationChannelManagerForUser?> = (elements as
        Array<IPushNotificationChannelManagerForUser?>).castToImpl<IPushNotificationChannelManagerForUser,IPushNotificationChannelManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPushNotificationChannelManagerForUser?> =
        arrayOfNulls<IPushNotificationChannelManagerForUser_Impl>(size) as
        Array<IPushNotificationChannelManagerForUser?>
  }
}
