package Windows.Phone.Media.Devices

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioRoutingManager.ABI::class)
@Signature("{79340d20-71cc-4526-9f29-fc8d2486418b}")
@Guid("79340d2071cc45269f29fc8d2486418b")
@WinRTInterface("79340d2071cc45269f29fc8d2486418b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioRoutingManager.ByReference::class)
public interface IAudioRoutingManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAudioEndpoint(): AudioRoutingEndpoint?

  @InterfaceMethod(1)
  public fun SetAudioEndpoint(endpoint: AudioRoutingEndpoint?): Unit

  @InterfaceMethod(2)
  public fun add_AudioEndpointChanged(endpointChangeHandler: TypedEventHandler<AudioRoutingManager?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_AudioEndpointChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_AvailableAudioEndpoints(): AvailableAudioRoutingEndpoints?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioRoutingManager> {
    public override fun getValue() = ABI.makeIAudioRoutingManager(pointer.getPointer(0))

    public fun setValue(value: IAudioRoutingManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioRoutingManager {
    public val __1632141916_Ptr: Pointer?

    public val _1632141916_VtblPtr: Pointer?
      get() = __1632141916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAudioEndpoint(): AudioRoutingEndpoint? {
      val fnPtr = _1632141916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioRoutingEndpoint>()
      val hr = fn.invokeHR(arrayOf(__1632141916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioRoutingEndpoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetAudioEndpoint(endpoint: AudioRoutingEndpoint?): Unit {
      val fnPtr = _1632141916_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632141916_Ptr, marshalToNative(endpoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_AudioEndpointChanged(endpointChangeHandler: TypedEventHandler<AudioRoutingManager?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1632141916_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1632141916_Ptr, marshalToNative(endpointChangeHandler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_AudioEndpointChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1632141916_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632141916_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AvailableAudioEndpoints(): AvailableAudioRoutingEndpoints? {
      val fnPtr = _1632141916_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AvailableAudioRoutingEndpoints>()
      val hr = fn.invokeHR(arrayOf(__1632141916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AvailableAudioRoutingEndpoints>(result.getValue())
      return resultValue
    }
  }

  public class IAudioRoutingManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632141916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioRoutingManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79340d2071cc45269f29fc8d2486418b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioRoutingManager(ptr: Pointer?): WithDefault = IAudioRoutingManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioRoutingManager {
      val address = segment.toRawLongValue()
      return makeIAudioRoutingManager(Pointer(address))
    }

    public override fun toNative(obj: IAudioRoutingManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632141916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioRoutingManager): Array<IAudioRoutingManager?> =
        (elements as
        Array<IAudioRoutingManager?>).castToImpl<IAudioRoutingManager,IAudioRoutingManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioRoutingManager?> =
        arrayOfNulls<IAudioRoutingManager_Impl>(size) as Array<IAudioRoutingManager?>
  }
}
