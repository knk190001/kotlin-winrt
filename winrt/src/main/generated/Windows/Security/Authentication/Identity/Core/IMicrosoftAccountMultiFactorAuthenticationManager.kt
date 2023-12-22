package Windows.Security.Authentication.Identity.Core

import Windows.Foundation.Collections.IIterable
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMicrosoftAccountMultiFactorAuthenticationManager.ABI::class)
@Signature("{0fd340a5-f574-4320-a08e-0a19a82322aa}")
@Guid("0fd340a5f5744320a08e0a19a82322aa")
@WinRTInterface("0fd340a5f5744320a08e0a19a82322aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicrosoftAccountMultiFactorAuthenticationManager.ByReference::class)
public interface IMicrosoftAccountMultiFactorAuthenticationManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetOneTimePassCodeAsync(userAccountId: String?, codeLength: WinDef.UINT):
      IAsyncOperation<MicrosoftAccountMultiFactorOneTimeCodedInfo?>?

  @InterfaceMethod(1)
  public fun AddDeviceAsync(
    userAccountId: String?,
    authenticationToken: String?,
    wnsChannelId: String?
  ): IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  @InterfaceMethod(2)
  public fun RemoveDeviceAsync(userAccountId: String?):
      IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  @InterfaceMethod(3)
  public fun UpdateWnsChannelAsync(userAccountId: String?, channelUri: String?):
      IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  @InterfaceMethod(4)
  public fun GetSessionsAsync(userAccountIdList: IIterable<String?>?):
      IAsyncOperation<MicrosoftAccountMultiFactorGetSessionsResult?>?

  @InterfaceMethod(5)
  public fun GetSessionsAndUnregisteredAccountsAsync(userAccountIdList: IIterable<String?>?):
      IAsyncOperation<MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?>?

  @InterfaceMethod(6)
  public
      fun ApproveSessionAsync(sessionAuthentictionStatus: MicrosoftAccountMultiFactorSessionAuthenticationStatus?,
      authenticationSessionInfo: MicrosoftAccountMultiFactorSessionInfo?):
      IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  @InterfaceMethod(7)
  public fun ApproveSessionAsync(
    sessionAuthentictionStatus: MicrosoftAccountMultiFactorSessionAuthenticationStatus?,
    userAccountId: String?,
    sessionId: String?,
    sessionAuthenticationType: MicrosoftAccountMultiFactorAuthenticationType?
  ): IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  @InterfaceMethod(8)
  public fun DenySessionAsync(authenticationSessionInfo: MicrosoftAccountMultiFactorSessionInfo?):
      IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  @InterfaceMethod(9)
  public fun DenySessionAsync(
    userAccountId: String?,
    sessionId: String?,
    sessionAuthenticationType: MicrosoftAccountMultiFactorAuthenticationType?
  ): IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicrosoftAccountMultiFactorAuthenticationManager> {
    public override fun getValue() =
        ABI.makeIMicrosoftAccountMultiFactorAuthenticationManager(pointer.getPointer(0))

    public fun setValue(value: IMicrosoftAccountMultiFactorAuthenticationManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicrosoftAccountMultiFactorAuthenticationManager {
    public val __345523207_Ptr: Pointer?

    public val _345523207_VtblPtr: Pointer?
      get() = __345523207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetOneTimePassCodeAsync(userAccountId: String?, codeLength: WinDef.UINT):
        IAsyncOperation<MicrosoftAccountMultiFactorOneTimeCodedInfo?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorOneTimeCodedInfo?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountId), codeLength,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorOneTimeCodedInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddDeviceAsync(
      userAccountId: String?,
      authenticationToken: String?,
      wnsChannelId: String?
    ): IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountId),
          marshalToNative(authenticationToken), marshalToNative(wnsChannelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RemoveDeviceAsync(userAccountId: String?):
        IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UpdateWnsChannelAsync(userAccountId: String?, channelUri: String?):
        IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountId),
          marshalToNative(channelUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetSessionsAsync(userAccountIdList: IIterable<String?>?):
        IAsyncOperation<MicrosoftAccountMultiFactorGetSessionsResult?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorGetSessionsResult?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountIdList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorGetSessionsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun GetSessionsAndUnregisteredAccountsAsync(userAccountIdList: IIterable<String?>?):
        IAsyncOperation<MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountIdList), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun ApproveSessionAsync(sessionAuthentictionStatus: MicrosoftAccountMultiFactorSessionAuthenticationStatus?,
        authenticationSessionInfo: MicrosoftAccountMultiFactorSessionInfo?):
        IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(sessionAuthentictionStatus),
          marshalToNative(authenticationSessionInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ApproveSessionAsync(
      sessionAuthentictionStatus: MicrosoftAccountMultiFactorSessionAuthenticationStatus?,
      userAccountId: String?,
      sessionId: String?,
      sessionAuthenticationType: MicrosoftAccountMultiFactorAuthenticationType?
    ): IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(sessionAuthentictionStatus),
          marshalToNative(userAccountId), marshalToNative(sessionId),
          marshalToNative(sessionAuthenticationType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun DenySessionAsync(authenticationSessionInfo: MicrosoftAccountMultiFactorSessionInfo?):
        IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(authenticationSessionInfo),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DenySessionAsync(
      userAccountId: String?,
      sessionId: String?,
      sessionAuthenticationType: MicrosoftAccountMultiFactorAuthenticationType?
    ): IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>? {
      val fnPtr = _345523207_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__345523207_Ptr, marshalToNative(userAccountId),
          marshalToNative(sessionId), marshalToNative(sessionAuthenticationType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MicrosoftAccountMultiFactorServiceResponse?>>(result.getValue())
      return resultValue
    }
  }

  public class IMicrosoftAccountMultiFactorAuthenticationManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __345523207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicrosoftAccountMultiFactorAuthenticationManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0fd340a5f5744320a08e0a19a82322aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicrosoftAccountMultiFactorAuthenticationManager(ptr: Pointer?): WithDefault =
        IMicrosoftAccountMultiFactorAuthenticationManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMicrosoftAccountMultiFactorAuthenticationManager {
      val address = segment.toRawLongValue()
      return makeIMicrosoftAccountMultiFactorAuthenticationManager(Pointer(address))
    }

    public override fun toNative(obj: IMicrosoftAccountMultiFactorAuthenticationManager):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__345523207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicrosoftAccountMultiFactorAuthenticationManager):
        Array<IMicrosoftAccountMultiFactorAuthenticationManager?> = (elements as
        Array<IMicrosoftAccountMultiFactorAuthenticationManager?>).castToImpl<IMicrosoftAccountMultiFactorAuthenticationManager,IMicrosoftAccountMultiFactorAuthenticationManager_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMicrosoftAccountMultiFactorAuthenticationManager?> =
        arrayOfNulls<IMicrosoftAccountMultiFactorAuthenticationManager_Impl>(size) as
        Array<IMicrosoftAccountMultiFactorAuthenticationManager?>
  }
}
