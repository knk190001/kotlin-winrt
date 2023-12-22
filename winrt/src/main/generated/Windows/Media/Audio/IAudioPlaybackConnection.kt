package Windows.Media.Audio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAudioPlaybackConnection.ABI::class)
@Signature("{1a4c1dea-cafc-50e7-8718-ea3f81cbfa51}")
@Guid("1a4c1deacafc50e78718ea3f81cbfa51")
@WinRTInterface("1a4c1deacafc50e78718ea3f81cbfa51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioPlaybackConnection.ByReference::class)
public interface IAudioPlaybackConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun StartAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_DeviceId(): String?

  @InterfaceMethod(3)
  public fun get_State(): AudioPlaybackConnectionState?

  @InterfaceMethod(4)
  public fun Open(): AudioPlaybackConnectionOpenResult?

  @InterfaceMethod(5)
  public fun OpenAsync(): IAsyncOperation<AudioPlaybackConnectionOpenResult?>?

  @InterfaceMethod(6)
  public fun add_StateChanged(handler: TypedEventHandler<AudioPlaybackConnection?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioPlaybackConnection> {
    public override fun getValue() = ABI.makeIAudioPlaybackConnection(pointer.getPointer(0))

    public fun setValue(value: IAudioPlaybackConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioPlaybackConnection {
    public val __1522833849_Ptr: Pointer?

    public val _1522833849_VtblPtr: Pointer?
      get() = __1522833849_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StartAsync(): IAsyncAction? {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_State(): AudioPlaybackConnectionState? {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioPlaybackConnectionState>()
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioPlaybackConnectionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Open(): AudioPlaybackConnectionOpenResult? {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioPlaybackConnectionOpenResult>()
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioPlaybackConnectionOpenResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun OpenAsync(): IAsyncOperation<AudioPlaybackConnectionOpenResult?>? {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AudioPlaybackConnectionOpenResult?>>()
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AudioPlaybackConnectionOpenResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_StateChanged(handler: TypedEventHandler<AudioPlaybackConnection?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1522833849_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1522833849_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioPlaybackConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1522833849_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioPlaybackConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a4c1deacafc50e78718ea3f81cbfa51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioPlaybackConnection(ptr: Pointer?): WithDefault =
        IAudioPlaybackConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioPlaybackConnection {
      val address = segment.toRawLongValue()
      return makeIAudioPlaybackConnection(Pointer(address))
    }

    public override fun toNative(obj: IAudioPlaybackConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1522833849_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioPlaybackConnection):
        Array<IAudioPlaybackConnection?> = (elements as
        Array<IAudioPlaybackConnection?>).castToImpl<IAudioPlaybackConnection,IAudioPlaybackConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioPlaybackConnection?> =
        arrayOfNulls<IAudioPlaybackConnection_Impl>(size) as Array<IAudioPlaybackConnection?>
  }
}
