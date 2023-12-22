package Windows.Security.Authentication.OnlineId

import Windows.Foundation.Collections.IIterable
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOnlineIdAuthenticator.ABI::class)
@Signature("{a003f58a-29ab-4817-b884-d7516dad18b9}")
@Guid("a003f58a29ab4817b884d7516dad18b9")
@WinRTInterface("a003f58a29ab4817b884d7516dad18b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdAuthenticator.ByReference::class)
public interface IOnlineIdAuthenticator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AuthenticateUserAsync(request: OnlineIdServiceTicketRequest?):
      UserAuthenticationOperation?

  @InterfaceMethod(1)
  public fun AuthenticateUserAsync(requests: IIterable<OnlineIdServiceTicketRequest?>?,
      credentialPromptType: CredentialPromptType?): UserAuthenticationOperation?

  @InterfaceMethod(2)
  public fun SignOutUserAsync(): SignOutUserOperation?

  @InterfaceMethod(3)
  public fun put_ApplicationId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(4)
  public fun get_ApplicationId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_CanSignOut(): Boolean

  @InterfaceMethod(6)
  public fun get_AuthenticatedSafeCustomerId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdAuthenticator> {
    public override fun getValue() = ABI.makeIOnlineIdAuthenticator(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdAuthenticator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdAuthenticator {
    public val __861768925_Ptr: Pointer?

    public val _861768925_VtblPtr: Pointer?
      get() = __861768925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AuthenticateUserAsync(request: OnlineIdServiceTicketRequest?):
        UserAuthenticationOperation? {
      val fnPtr = _861768925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserAuthenticationOperation>()
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserAuthenticationOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AuthenticateUserAsync(requests: IIterable<OnlineIdServiceTicketRequest?>?,
        credentialPromptType: CredentialPromptType?): UserAuthenticationOperation? {
      val fnPtr = _861768925_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserAuthenticationOperation>()
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr, marshalToNative(requests),
          marshalToNative(credentialPromptType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserAuthenticationOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SignOutUserAsync(): SignOutUserOperation? {
      val fnPtr = _861768925_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SignOutUserOperation>()
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SignOutUserOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ApplicationId(value: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _861768925_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ApplicationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _861768925_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CanSignOut(): Boolean {
      val fnPtr = _861768925_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_AuthenticatedSafeCustomerId(): String? {
      val fnPtr = _861768925_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__861768925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOnlineIdAuthenticator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __861768925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdAuthenticator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a003f58a29ab4817b884d7516dad18b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdAuthenticator(ptr: Pointer?): WithDefault =
        IOnlineIdAuthenticator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdAuthenticator {
      val address = segment.toRawLongValue()
      return makeIOnlineIdAuthenticator(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdAuthenticator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__861768925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdAuthenticator): Array<IOnlineIdAuthenticator?> =
        (elements as
        Array<IOnlineIdAuthenticator?>).castToImpl<IOnlineIdAuthenticator,IOnlineIdAuthenticator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdAuthenticator?> =
        arrayOfNulls<IOnlineIdAuthenticator_Impl>(size) as Array<IOnlineIdAuthenticator?>
  }
}
