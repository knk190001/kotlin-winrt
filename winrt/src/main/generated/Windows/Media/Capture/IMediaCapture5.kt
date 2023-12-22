package Windows.Media.Capture

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Graphics.Imaging.BitmapSize
import Windows.Media.Capture.Frames.MediaFrameReader
import Windows.Media.Capture.Frames.MediaFrameSource
import Windows.Media.Devices.MediaCapturePauseBehavior
import Windows.Media.IMediaExtension
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

@ABIMarker(IMediaCapture5.ABI::class)
@Signature("{da787c22-3a9b-4720-a71e-97900a316e5a}")
@Guid("da787c223a9b4720a71e97900a316e5a")
@WinRTInterface("da787c223a9b4720a71e97900a316e5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture5.ByReference::class)
public interface IMediaCapture5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RemoveEffectAsync(effect: IMediaExtension?): IAsyncAction?

  @InterfaceMethod(1)
  public fun PauseRecordWithResultAsync(behavior: MediaCapturePauseBehavior?):
      IAsyncOperation<MediaCapturePauseResult?>?

  @InterfaceMethod(2)
  public fun StopRecordWithResultAsync(): IAsyncOperation<MediaCaptureStopResult?>?

  @InterfaceMethod(3)
  public fun get_FrameSources(): IMapView<String?, MediaFrameSource?>?

  @InterfaceMethod(4)
  public fun CreateFrameReaderAsync(inputSource: MediaFrameSource?):
      IAsyncOperation<MediaFrameReader?>?

  @InterfaceMethod(5)
  public fun CreateFrameReaderAsync(inputSource: MediaFrameSource?, outputSubtype: String?):
      IAsyncOperation<MediaFrameReader?>?

  @InterfaceMethod(6)
  public fun CreateFrameReaderAsync(
    inputSource: MediaFrameSource?,
    outputSubtype: String?,
    outputSize: BitmapSize?
  ): IAsyncOperation<MediaFrameReader?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture5>
      {
    public override fun getValue() = ABI.makeIMediaCapture5(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture5 {
    public val __1535274203_Ptr: Pointer?

    public val _1535274203_VtblPtr: Pointer?
      get() = __1535274203_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RemoveEffectAsync(effect: IMediaExtension?): IAsyncAction? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr, marshalToNative(effect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PauseRecordWithResultAsync(behavior: MediaCapturePauseBehavior?):
        IAsyncOperation<MediaCapturePauseResult?>? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaCapturePauseResult?>>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr, marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaCapturePauseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StopRecordWithResultAsync(): IAsyncOperation<MediaCaptureStopResult?>? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaCaptureStopResult?>>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaCaptureStopResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FrameSources(): IMapView<String?, MediaFrameSource?>? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, MediaFrameSource?>>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, MediaFrameSource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateFrameReaderAsync(inputSource: MediaFrameSource?):
        IAsyncOperation<MediaFrameReader?>? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameReader?>>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr, marshalToNative(inputSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaFrameReader?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateFrameReaderAsync(inputSource: MediaFrameSource?,
        outputSubtype: String?): IAsyncOperation<MediaFrameReader?>? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameReader?>>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr, marshalToNative(inputSource),
          marshalToNative(outputSubtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaFrameReader?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateFrameReaderAsync(
      inputSource: MediaFrameSource?,
      outputSubtype: String?,
      outputSize: BitmapSize?
    ): IAsyncOperation<MediaFrameReader?>? {
      val fnPtr = _1535274203_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameReader?>>()
      val hr = fn.invokeHR(arrayOf(__1535274203_Ptr, marshalToNative(inputSource),
          marshalToNative(outputSubtype), marshalToNative(outputSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaFrameReader?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapture5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535274203_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da787c223a9b4720a71e97900a316e5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture5(ptr: Pointer?): WithDefault = IMediaCapture5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture5 {
      val address = segment.toRawLongValue()
      return makeIMediaCapture5(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535274203_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture5): Array<IMediaCapture5?> = (elements as
        Array<IMediaCapture5?>).castToImpl<IMediaCapture5,IMediaCapture5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture5?> =
        arrayOfNulls<IMediaCapture5_Impl>(size) as Array<IMediaCapture5?>
  }
}
