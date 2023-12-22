package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IAppBroadcastBackgroundService.ABI::class)
@Signature("{bad1e72a-fa94-46f9-95fc-d71511cda70b}")
@Guid("bad1e72afa9446f995fcd71511cda70b")
@WinRTInterface("bad1e72afa9446f995fcd71511cda70b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastBackgroundService.ByReference::class)
public interface IAppBroadcastBackgroundService : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_PlugInState(value: AppBroadcastPlugInState?): Unit

  @InterfaceMethod(1)
  public fun get_PlugInState(): AppBroadcastPlugInState?

  @InterfaceMethod(2)
  public fun put_SignInInfo(value: AppBroadcastBackgroundServiceSignInInfo?): Unit

  @InterfaceMethod(3)
  public fun get_SignInInfo(): AppBroadcastBackgroundServiceSignInInfo?

  @InterfaceMethod(4)
  public fun put_StreamInfo(value: AppBroadcastBackgroundServiceStreamInfo?): Unit

  @InterfaceMethod(5)
  public fun get_StreamInfo(): AppBroadcastBackgroundServiceStreamInfo?

  @InterfaceMethod(6)
  public fun get_AppId(): String?

  @InterfaceMethod(7)
  public fun get_BroadcastTitle(): String?

  @InterfaceMethod(8)
  public fun put_ViewerCount(value: WinDef.UINT): Unit

  @InterfaceMethod(9)
  public fun get_ViewerCount(): WinDef.UINT

  @InterfaceMethod(10)
  public fun TerminateBroadcast(reason: AppBroadcastTerminationReason?,
      providerSpecificReason: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun add_HeartbeatRequested(handler: TypedEventHandler<AppBroadcastBackgroundService?,
      AppBroadcastHeartbeatRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_HeartbeatRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun get_TitleId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastBackgroundService> {
    public override fun getValue() = ABI.makeIAppBroadcastBackgroundService(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastBackgroundService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastBackgroundService {
    public val __870405391_Ptr: Pointer?

    public val _870405391_VtblPtr: Pointer?
      get() = __870405391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PlugInState(value: AppBroadcastPlugInState?): Unit {
      val fnPtr = _870405391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PlugInState(): AppBroadcastPlugInState? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPlugInState>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPlugInState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_SignInInfo(value: AppBroadcastBackgroundServiceSignInInfo?): Unit {
      val fnPtr = _870405391_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SignInInfo(): AppBroadcastBackgroundServiceSignInInfo? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastBackgroundServiceSignInInfo>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppBroadcastBackgroundServiceSignInInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_StreamInfo(value: AppBroadcastBackgroundServiceStreamInfo?): Unit {
      val fnPtr = _870405391_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_StreamInfo(): AppBroadcastBackgroundServiceStreamInfo? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastBackgroundServiceStreamInfo>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AppBroadcastBackgroundServiceStreamInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AppId(): String? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_BroadcastTitle(): String? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_ViewerCount(value: WinDef.UINT): Unit {
      val fnPtr = _870405391_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ViewerCount(): WinDef.UINT {
      val fnPtr = _870405391_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun TerminateBroadcast(reason: AppBroadcastTerminationReason?,
        providerSpecificReason: WinDef.UINT): Unit {
      val fnPtr = _870405391_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, marshalToNative(reason),
          providerSpecificReason,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override
        fun add_HeartbeatRequested(handler: TypedEventHandler<AppBroadcastBackgroundService?,
        AppBroadcastHeartbeatRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_HeartbeatRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _870405391_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_TitleId(): String? {
      val fnPtr = _870405391_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__870405391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAppBroadcastBackgroundService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __870405391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastBackgroundService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bad1e72afa9446f995fcd71511cda70b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastBackgroundService(ptr: Pointer?): WithDefault =
        IAppBroadcastBackgroundService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastBackgroundService {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastBackgroundService(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastBackgroundService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__870405391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastBackgroundService):
        Array<IAppBroadcastBackgroundService?> = (elements as
        Array<IAppBroadcastBackgroundService?>).castToImpl<IAppBroadcastBackgroundService,IAppBroadcastBackgroundService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastBackgroundService?> =
        arrayOfNulls<IAppBroadcastBackgroundService_Impl>(size) as
        Array<IAppBroadcastBackgroundService?>
  }
}
