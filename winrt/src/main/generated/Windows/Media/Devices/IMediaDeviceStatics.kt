package Windows.Media.Devices

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaDeviceStatics.ABI::class)
@Signature("{aa2d9a40-909f-4bba-bf8b-0c0d296f14f0}")
@Guid("aa2d9a40909f4bbabf8b0c0d296f14f0")
@WinRTInterface("aa2d9a40909f4bbabf8b0c0d296f14f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaDeviceStatics.ByReference::class)
public interface IMediaDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAudioCaptureSelector(): String?

  @InterfaceMethod(1)
  public fun GetAudioRenderSelector(): String?

  @InterfaceMethod(2)
  public fun GetVideoCaptureSelector(): String?

  @InterfaceMethod(3)
  public fun GetDefaultAudioCaptureId(role: AudioDeviceRole?): String?

  @InterfaceMethod(4)
  public fun GetDefaultAudioRenderId(role: AudioDeviceRole?): String?

  @InterfaceMethod(5)
  public fun add_DefaultAudioCaptureDeviceChanged(handler: TypedEventHandler<IUnknown?,
      DefaultAudioCaptureDeviceChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_DefaultAudioCaptureDeviceChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_DefaultAudioRenderDeviceChanged(handler: TypedEventHandler<IUnknown?,
      DefaultAudioRenderDeviceChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_DefaultAudioRenderDeviceChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaDeviceStatics> {
    public override fun getValue() = ABI.makeIMediaDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaDeviceStatics {
    public val __1272706580_Ptr: Pointer?

    public val _1272706580_VtblPtr: Pointer?
      get() = __1272706580_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAudioCaptureSelector(): String? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAudioRenderSelector(): String? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetVideoCaptureSelector(): String? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDefaultAudioCaptureId(role: AudioDeviceRole?): String? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr, marshalToNative(role), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDefaultAudioRenderId(role: AudioDeviceRole?): String? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr, marshalToNative(role), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_DefaultAudioCaptureDeviceChanged(handler: TypedEventHandler<IUnknown?,
        DefaultAudioCaptureDeviceChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_DefaultAudioCaptureDeviceChanged(cookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_DefaultAudioRenderDeviceChanged(handler: TypedEventHandler<IUnknown?,
        DefaultAudioRenderDeviceChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_DefaultAudioRenderDeviceChanged(cookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1272706580_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1272706580_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1272706580_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa2d9a40909f4bbabf8b0c0d296f14f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaDeviceStatics(ptr: Pointer?): WithDefault = IMediaDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIMediaDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1272706580_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaDeviceStatics): Array<IMediaDeviceStatics?> =
        (elements as
        Array<IMediaDeviceStatics?>).castToImpl<IMediaDeviceStatics,IMediaDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaDeviceStatics?> =
        arrayOfNulls<IMediaDeviceStatics_Impl>(size) as Array<IMediaDeviceStatics?>
  }
}
