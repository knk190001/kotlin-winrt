package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
import Windows.Security.Authentication.Web.WebAuthenticationResult
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

@ABIMarker(IAppBroadcastBackgroundServiceSignInInfo.ABI::class)
@Signature("{5e735275-88c8-4eca-89ba-4825985db880}")
@Guid("5e73527588c84eca89ba4825985db880")
@WinRTInterface("5e73527588c84eca89ba4825985db880")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastBackgroundServiceSignInInfo.ByReference::class)
public interface IAppBroadcastBackgroundServiceSignInInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SignInState(): AppBroadcastSignInState?

  @InterfaceMethod(1)
  public fun put_OAuthRequestUri(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_OAuthRequestUri(): Uri?

  @InterfaceMethod(3)
  public fun put_OAuthCallbackUri(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_OAuthCallbackUri(): Uri?

  @InterfaceMethod(5)
  public fun get_AuthenticationResult(): WebAuthenticationResult?

  @InterfaceMethod(6)
  public fun put_UserName(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_UserName(): String?

  @InterfaceMethod(8)
  public
      fun add_SignInStateChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceSignInInfo?,
      AppBroadcastSignInStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SignInStateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastBackgroundServiceSignInInfo> {
    public override fun getValue() =
        ABI.makeIAppBroadcastBackgroundServiceSignInInfo(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastBackgroundServiceSignInInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastBackgroundServiceSignInInfo {
    public val __1150025215_Ptr: Pointer?

    public val _1150025215_VtblPtr: Pointer?
      get() = __1150025215_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SignInState(): AppBroadcastSignInState? {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastSignInState>()
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastSignInState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_OAuthRequestUri(value: Uri?): Unit {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OAuthRequestUri(): Uri? {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OAuthCallbackUri(value: Uri?): Unit {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OAuthCallbackUri(): Uri? {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AuthenticationResult(): WebAuthenticationResult? {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAuthenticationResult>()
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAuthenticationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_UserName(value: String?): Unit {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_UserName(): String? {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun add_SignInStateChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceSignInInfo?,
        AppBroadcastSignInStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SignInStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1150025215_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1150025215_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastBackgroundServiceSignInInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1150025215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastBackgroundServiceSignInInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e73527588c84eca89ba4825985db880")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastBackgroundServiceSignInInfo(ptr: Pointer?): WithDefault =
        IAppBroadcastBackgroundServiceSignInInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastBackgroundServiceSignInInfo {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastBackgroundServiceSignInInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastBackgroundServiceSignInInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1150025215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastBackgroundServiceSignInInfo):
        Array<IAppBroadcastBackgroundServiceSignInInfo?> = (elements as
        Array<IAppBroadcastBackgroundServiceSignInInfo?>).castToImpl<IAppBroadcastBackgroundServiceSignInInfo,IAppBroadcastBackgroundServiceSignInInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastBackgroundServiceSignInInfo?> =
        arrayOfNulls<IAppBroadcastBackgroundServiceSignInInfo_Impl>(size) as
        Array<IAppBroadcastBackgroundServiceSignInInfo?>
  }
}
