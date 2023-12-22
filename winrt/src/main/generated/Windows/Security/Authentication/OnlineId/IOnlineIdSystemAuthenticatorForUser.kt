package Windows.Security.Authentication.OnlineId

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOnlineIdSystemAuthenticatorForUser.ABI::class)
@Signature("{5798befb-1de4-4186-a2e6-b563f86aaf44}")
@Guid("5798befb1de44186a2e6b563f86aaf44")
@WinRTInterface("5798befb1de44186a2e6b563f86aaf44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdSystemAuthenticatorForUser.ByReference::class)
public interface IOnlineIdSystemAuthenticatorForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTicketAsync(request: OnlineIdServiceTicketRequest?):
      IAsyncOperation<OnlineIdSystemTicketResult?>?

  @InterfaceMethod(1)
  public fun put_ApplicationId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(2)
  public fun get_ApplicationId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdSystemAuthenticatorForUser> {
    public override fun getValue() =
        ABI.makeIOnlineIdSystemAuthenticatorForUser(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdSystemAuthenticatorForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdSystemAuthenticatorForUser {
    public val __2042988774_Ptr: Pointer?

    public val _2042988774_VtblPtr: Pointer?
      get() = __2042988774_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTicketAsync(request: OnlineIdServiceTicketRequest?):
        IAsyncOperation<OnlineIdSystemTicketResult?>? {
      val fnPtr = _2042988774_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OnlineIdSystemTicketResult?>>()
      val hr = fn.invokeHR(arrayOf(__2042988774_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<OnlineIdSystemTicketResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ApplicationId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _2042988774_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2042988774_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ApplicationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _2042988774_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__2042988774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_User(): User? {
      val fnPtr = _2042988774_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__2042988774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IOnlineIdSystemAuthenticatorForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042988774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdSystemAuthenticatorForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5798befb1de44186a2e6b563f86aaf44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdSystemAuthenticatorForUser(ptr: Pointer?): WithDefault =
        IOnlineIdSystemAuthenticatorForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdSystemAuthenticatorForUser {
      val address = segment.toRawLongValue()
      return makeIOnlineIdSystemAuthenticatorForUser(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdSystemAuthenticatorForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042988774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdSystemAuthenticatorForUser):
        Array<IOnlineIdSystemAuthenticatorForUser?> = (elements as
        Array<IOnlineIdSystemAuthenticatorForUser?>).castToImpl<IOnlineIdSystemAuthenticatorForUser,IOnlineIdSystemAuthenticatorForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdSystemAuthenticatorForUser?> =
        arrayOfNulls<IOnlineIdSystemAuthenticatorForUser_Impl>(size) as
        Array<IOnlineIdSystemAuthenticatorForUser?>
  }
}
