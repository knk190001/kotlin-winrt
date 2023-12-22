package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Media.Devices.CameraStreamState
import Windows.Media.Devices.MediaCapturePauseBehavior
import Windows.Media.Effects.IAudioEffectDefinition
import Windows.Media.Effects.IVideoEffectDefinition
import Windows.Media.IMediaExtension
import Windows.Media.MediaProperties.ImageEncodingProperties
import Windows.Media.VideoFrame
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

@ABIMarker(IMediaCapture4.ABI::class)
@Signature("{bacd6fd6-fb08-4947-aea2-ce14eff0ce13}")
@Guid("bacd6fd6fb084947aea2ce14eff0ce13")
@WinRTInterface("bacd6fd6fb084947aea2ce14eff0ce13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture4.ByReference::class)
public interface IMediaCapture4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddAudioEffectAsync(definition: IAudioEffectDefinition?):
      IAsyncOperation<IMediaExtension?>?

  @InterfaceMethod(1)
  public fun AddVideoEffectAsync(definition: IVideoEffectDefinition?,
      mediaStreamType: MediaStreamType?): IAsyncOperation<IMediaExtension?>?

  @InterfaceMethod(2)
  public fun PauseRecordAsync(behavior: MediaCapturePauseBehavior?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ResumeRecordAsync(): IAsyncAction?

  @InterfaceMethod(4)
  public fun add_CameraStreamStateChanged(handler: TypedEventHandler<MediaCapture?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_CameraStreamStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_CameraStreamState(): CameraStreamState?

  @InterfaceMethod(7)
  public fun GetPreviewFrameAsync(): IAsyncOperation<VideoFrame?>?

  @InterfaceMethod(8)
  public fun GetPreviewFrameAsync(destination: VideoFrame?): IAsyncOperation<VideoFrame?>?

  @InterfaceMethod(9)
  public fun add_ThermalStatusChanged(handler: TypedEventHandler<MediaCapture?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ThermalStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun get_ThermalStatus(): MediaCaptureThermalStatus?

  @InterfaceMethod(12)
  public fun PrepareAdvancedPhotoCaptureAsync(encodingProperties: ImageEncodingProperties?):
      IAsyncOperation<AdvancedPhotoCapture?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture4>
      {
    public override fun getValue() = ABI.makeIMediaCapture4(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture4 {
    public val __1535274202_Ptr: Pointer?

    public val _1535274202_VtblPtr: Pointer?
      get() = __1535274202_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddAudioEffectAsync(definition: IAudioEffectDefinition?):
        IAsyncOperation<IMediaExtension?>? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMediaExtension?>>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(definition), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMediaExtension?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddVideoEffectAsync(definition: IVideoEffectDefinition?,
        mediaStreamType: MediaStreamType?): IAsyncOperation<IMediaExtension?>? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMediaExtension?>>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(definition),
          marshalToNative(mediaStreamType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMediaExtension?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PauseRecordAsync(behavior: MediaCapturePauseBehavior?): IAsyncAction? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ResumeRecordAsync(): IAsyncAction? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_CameraStreamStateChanged(handler: TypedEventHandler<MediaCapture?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_CameraStreamStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CameraStreamState(): CameraStreamState? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraStreamState>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraStreamState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetPreviewFrameAsync(): IAsyncOperation<VideoFrame?>? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VideoFrame?>>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VideoFrame?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetPreviewFrameAsync(destination: VideoFrame?):
        IAsyncOperation<VideoFrame?>? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VideoFrame?>>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VideoFrame?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_ThermalStatusChanged(handler: TypedEventHandler<MediaCapture?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ThermalStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ThermalStatus(): MediaCaptureThermalStatus? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureThermalStatus>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureThermalStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override
        fun PrepareAdvancedPhotoCaptureAsync(encodingProperties: ImageEncodingProperties?):
        IAsyncOperation<AdvancedPhotoCapture?>? {
      val fnPtr = _1535274202_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdvancedPhotoCapture?>>()
      val hr = fn.invokeHR(arrayOf(__1535274202_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<AdvancedPhotoCapture?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapture4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535274202_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bacd6fd6fb084947aea2ce14eff0ce13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture4(ptr: Pointer?): WithDefault = IMediaCapture4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture4 {
      val address = segment.toRawLongValue()
      return makeIMediaCapture4(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535274202_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture4): Array<IMediaCapture4?> = (elements as
        Array<IMediaCapture4?>).castToImpl<IMediaCapture4,IMediaCapture4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture4?> =
        arrayOfNulls<IMediaCapture4_Impl>(size) as Array<IMediaCapture4?>
  }
}
