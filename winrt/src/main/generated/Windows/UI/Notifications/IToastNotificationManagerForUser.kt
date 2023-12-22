package Windows.UI.Notifications

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

@ABIMarker(IToastNotificationManagerForUser.ABI::class)
@Signature("{79ab57f6-43fe-487b-8a7f-99567200ae94}")
@Guid("79ab57f643fe487b8a7f99567200ae94")
@WinRTInterface("79ab57f643fe487b8a7f99567200ae94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationManagerForUser.ByReference::class)
public interface IToastNotificationManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateToastNotifier(): ToastNotifier?

  @InterfaceMethod(1)
  public fun CreateToastNotifier(applicationId: String?): ToastNotifier?

  @InterfaceMethod(2)
  public fun get_History(): ToastNotificationHistory?

  @InterfaceMethod(3)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationManagerForUser> {
    public override fun getValue() = ABI.makeIToastNotificationManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationManagerForUser {
    public val __664381783_Ptr: Pointer?

    public val _664381783_VtblPtr: Pointer?
      get() = __664381783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateToastNotifier(): ToastNotifier? {
      val fnPtr = _664381783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__664381783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateToastNotifier(applicationId: String?): ToastNotifier? {
      val fnPtr = _664381783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__664381783_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_History(): ToastNotificationHistory? {
      val fnPtr = _664381783_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotificationHistory>()
      val hr = fn.invokeHR(arrayOf(__664381783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotificationHistory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_User(): User? {
      val fnPtr = _664381783_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__664381783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __664381783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79ab57f643fe487b8a7f99567200ae94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationManagerForUser(ptr: Pointer?): WithDefault =
        IToastNotificationManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationManagerForUser {
      val address = segment.toRawLongValue()
      return makeIToastNotificationManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__664381783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationManagerForUser):
        Array<IToastNotificationManagerForUser?> = (elements as
        Array<IToastNotificationManagerForUser?>).castToImpl<IToastNotificationManagerForUser,IToastNotificationManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationManagerForUser?> =
        arrayOfNulls<IToastNotificationManagerForUser_Impl>(size) as
        Array<IToastNotificationManagerForUser?>
  }
}
