package Windows.Media.Editing

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.TimeSpan
import Windows.Graphics.Imaging.ImageStream
import Windows.Media.Core.MediaStreamSource
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Media.Transcoding.TranscodeFailureReason
import Windows.Storage.IStorageFile
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaComposition.ABI::class)
@Signature("{2e06e605-dc71-41d6-b837-2d2bc14a2947}")
@Guid("2e06e605dc7141d6b8372d2bc14a2947")
@WinRTInterface("2e06e605dc7141d6b8372d2bc14a2947")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaComposition.ByReference::class)
public interface IMediaComposition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_Clips(): IVector<MediaClip?>?

  @InterfaceMethod(2)
  public fun get_BackgroundAudioTracks(): IVector<BackgroundAudioTrack?>?

  @InterfaceMethod(3)
  public fun get_UserData(): IMap<String?, String?>?

  @InterfaceMethod(4)
  public fun Clone(): MediaComposition?

  @InterfaceMethod(5)
  public fun SaveAsync(`file`: IStorageFile?): IAsyncAction?

  @InterfaceMethod(6)
  public fun GetThumbnailAsync(
    timeFromStart: TimeSpan?,
    scaledWidth: Int,
    scaledHeight: Int,
    framePrecision: VideoFramePrecision?
  ): IAsyncOperation<ImageStream?>?

  @InterfaceMethod(7)
  public fun GetThumbnailsAsync(
    timesFromStart: IIterable<TimeSpan?>?,
    scaledWidth: Int,
    scaledHeight: Int,
    framePrecision: VideoFramePrecision?
  ): IAsyncOperation<IVectorView<ImageStream?>?>?

  @InterfaceMethod(8)
  public fun RenderToFileAsync(destination: IStorageFile?):
      IAsyncOperationWithProgress<TranscodeFailureReason?, Double>?

  @InterfaceMethod(9)
  public fun RenderToFileAsync(destination: IStorageFile?,
      trimmingPreference: MediaTrimmingPreference?):
      IAsyncOperationWithProgress<TranscodeFailureReason?, Double>?

  @InterfaceMethod(10)
  public fun RenderToFileAsync(
    destination: IStorageFile?,
    trimmingPreference: MediaTrimmingPreference?,
    encodingProfile: MediaEncodingProfile?
  ): IAsyncOperationWithProgress<TranscodeFailureReason?, Double>?

  @InterfaceMethod(11)
  public fun CreateDefaultEncodingProfile(): MediaEncodingProfile?

  @InterfaceMethod(12)
  public fun GenerateMediaStreamSource(): MediaStreamSource?

  @InterfaceMethod(13)
  public fun GenerateMediaStreamSource(encodingProfile: MediaEncodingProfile?): MediaStreamSource?

  @InterfaceMethod(14)
  public fun GeneratePreviewMediaStreamSource(scaledWidth: Int, scaledHeight: Int):
      MediaStreamSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaComposition> {
    public override fun getValue() = ABI.makeIMediaComposition(pointer.getPointer(0))

    public fun setValue(value: IMediaComposition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaComposition {
    public val __1927667436_Ptr: Pointer?

    public val _1927667436_VtblPtr: Pointer?
      get() = __1927667436_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Clips(): IVector<MediaClip?>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MediaClip?>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MediaClip?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundAudioTracks(): IVector<BackgroundAudioTrack?>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<BackgroundAudioTrack?>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<BackgroundAudioTrack?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_UserData(): IMap<String?, String?>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun Clone(): MediaComposition? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaComposition>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaComposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SaveAsync(`file`: IStorageFile?): IAsyncAction? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetThumbnailAsync(
      timeFromStart: TimeSpan?,
      scaledWidth: Int,
      scaledHeight: Int,
      framePrecision: VideoFramePrecision?
    ): IAsyncOperation<ImageStream?>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ImageStream?>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(timeFromStart), scaledWidth,
          scaledHeight, marshalToNative(framePrecision), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ImageStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetThumbnailsAsync(
      timesFromStart: IIterable<TimeSpan?>?,
      scaledWidth: Int,
      scaledHeight: Int,
      framePrecision: VideoFramePrecision?
    ): IAsyncOperation<IVectorView<ImageStream?>?>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ImageStream?>?>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(timesFromStart), scaledWidth,
          scaledHeight, marshalToNative(framePrecision), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ImageStream?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun RenderToFileAsync(destination: IStorageFile?):
        IAsyncOperationWithProgress<TranscodeFailureReason?, Double>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<TranscodeFailureReason?,
          Double>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<TranscodeFailureReason?,
          Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun RenderToFileAsync(destination: IStorageFile?,
        trimmingPreference: MediaTrimmingPreference?):
        IAsyncOperationWithProgress<TranscodeFailureReason?, Double>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<TranscodeFailureReason?,
          Double>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(destination),
          marshalToNative(trimmingPreference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<TranscodeFailureReason?,
          Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun RenderToFileAsync(
      destination: IStorageFile?,
      trimmingPreference: MediaTrimmingPreference?,
      encodingProfile: MediaEncodingProfile?
    ): IAsyncOperationWithProgress<TranscodeFailureReason?, Double>? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<TranscodeFailureReason?,
          Double>>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(destination),
          marshalToNative(trimmingPreference), marshalToNative(encodingProfile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<TranscodeFailureReason?,
          Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateDefaultEncodingProfile(): MediaEncodingProfile? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GenerateMediaStreamSource(): MediaStreamSource? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GenerateMediaStreamSource(encodingProfile: MediaEncodingProfile?):
        MediaStreamSource? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, marshalToNative(encodingProfile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GeneratePreviewMediaStreamSource(scaledWidth: Int, scaledHeight: Int):
        MediaStreamSource? {
      val fnPtr = _1927667436_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__1927667436_Ptr, scaledWidth, scaledHeight, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaComposition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1927667436_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaComposition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e06e605dc7141d6b8372d2bc14a2947")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaComposition(ptr: Pointer?): WithDefault = IMediaComposition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaComposition {
      val address = segment.toRawLongValue()
      return makeIMediaComposition(Pointer(address))
    }

    public override fun toNative(obj: IMediaComposition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1927667436_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaComposition): Array<IMediaComposition?> = (elements
        as Array<IMediaComposition?>).castToImpl<IMediaComposition,IMediaComposition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaComposition?> =
        arrayOfNulls<IMediaComposition_Impl>(size) as Array<IMediaComposition?>
  }
}
