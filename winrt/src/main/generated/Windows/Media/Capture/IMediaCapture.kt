package Windows.Media.Capture

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Media.Devices.AudioDeviceController
import Windows.Media.Devices.VideoDeviceController
import Windows.Media.IMediaExtension
import Windows.Media.MediaProperties.ImageEncodingProperties
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaCapture.ABI::class)
@Signature("{c61afbb4-fb10-4a34-ac18-ca80d9c8e7ee}")
@Guid("c61afbb4fb104a34ac18ca80d9c8e7ee")
@WinRTInterface("c61afbb4fb104a34ac18ca80d9c8e7ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture.ByReference::class)
public interface IMediaCapture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InitializeAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public
      fun InitializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings?):
      IAsyncAction?

  @InterfaceMethod(2)
  public fun StartRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile?,
      `file`: IStorageFile?): IAsyncAction?

  @InterfaceMethod(3)
  public fun StartRecordToStreamAsync(encodingProfile: MediaEncodingProfile?,
      stream: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(4)
  public fun StartRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile?,
      customMediaSink: IMediaExtension?): IAsyncAction?

  @InterfaceMethod(5)
  public fun StartRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile?,
    customSinkActivationId: String?,
    customSinkSettings: IPropertySet?
  ): IAsyncAction?

  @InterfaceMethod(6)
  public fun StopRecordAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun CapturePhotoToStorageFileAsync(type: ImageEncodingProperties?, `file`: IStorageFile?):
      IAsyncAction?

  @InterfaceMethod(8)
  public fun CapturePhotoToStreamAsync(type: ImageEncodingProperties?,
      stream: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(9)
  public fun AddEffectAsync(
    mediaStreamType: MediaStreamType?,
    effectActivationID: String?,
    effectSettings: IPropertySet?
  ): IAsyncAction?

  @InterfaceMethod(10)
  public fun ClearEffectsAsync(mediaStreamType: MediaStreamType?): IAsyncAction?

  @InterfaceMethod(11)
  public fun SetEncoderProperty(
    mediaStreamType: MediaStreamType?,
    propertyId: com.sun.jna.platform.win32.Guid.GUID?,
    propertyValue: IUnknown?
  ): Unit

  @InterfaceMethod(12)
  public fun GetEncoderProperty(mediaStreamType: MediaStreamType?,
      propertyId: com.sun.jna.platform.win32.Guid.GUID?): IUnknown?

  @InterfaceMethod(13)
  public fun add_Failed(errorEventHandler: MediaCaptureFailedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_Failed(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public
      fun add_RecordLimitationExceeded(recordLimitationExceededEventHandler: RecordLimitationExceededEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_RecordLimitationExceeded(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun get_MediaCaptureSettings(): MediaCaptureSettings?

  @InterfaceMethod(18)
  public fun get_AudioDeviceController(): AudioDeviceController?

  @InterfaceMethod(19)
  public fun get_VideoDeviceController(): VideoDeviceController?

  @InterfaceMethod(20)
  public fun SetPreviewMirroring(value: Boolean): Unit

  @InterfaceMethod(21)
  public fun GetPreviewMirroring(): Boolean

  @InterfaceMethod(22)
  public fun SetPreviewRotation(value: VideoRotation?): Unit

  @InterfaceMethod(23)
  public fun GetPreviewRotation(): VideoRotation?

  @InterfaceMethod(24)
  public fun SetRecordRotation(value: VideoRotation?): Unit

  @InterfaceMethod(25)
  public fun GetRecordRotation(): VideoRotation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture>
      {
    public override fun getValue() = ABI.makeIMediaCapture(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture {
    public val __1573545626_Ptr: Pointer?

    public val _1573545626_VtblPtr: Pointer?
      get() = __1573545626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InitializeAsync(): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun InitializeAsync(mediaCaptureInitializationSettings: MediaCaptureInitializationSettings?):
        IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,
          marshalToNative(mediaCaptureInitializationSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile?,
        `file`: IStorageFile?): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(encodingProfile),
          marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StartRecordToStreamAsync(encodingProfile: MediaEncodingProfile?,
        stream: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(encodingProfile),
          marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun StartRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile?,
        customMediaSink: IMediaExtension?): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(encodingProfile),
          marshalToNative(customMediaSink), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun StartRecordToCustomSinkAsync(
      encodingProfile: MediaEncodingProfile?,
      customSinkActivationId: String?,
      customSinkSettings: IPropertySet?
    ): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(encodingProfile),
          marshalToNative(customSinkActivationId), marshalToNative(customSinkSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun StopRecordAsync(): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CapturePhotoToStorageFileAsync(type: ImageEncodingProperties?,
        `file`: IStorageFile?): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(type), marshalToNative(file),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CapturePhotoToStreamAsync(type: ImageEncodingProperties?,
        stream: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(type), marshalToNative(stream),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun AddEffectAsync(
      mediaStreamType: MediaStreamType?,
      effectActivationID: String?,
      effectSettings: IPropertySet?
    ): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(mediaStreamType),
          marshalToNative(effectActivationID), marshalToNative(effectSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ClearEffectsAsync(mediaStreamType: MediaStreamType?): IAsyncAction? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(mediaStreamType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun SetEncoderProperty(
      mediaStreamType: MediaStreamType?,
      propertyId: com.sun.jna.platform.win32.Guid.GUID?,
      propertyValue: IUnknown?
    ): Unit {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(mediaStreamType),
          marshalToNative(propertyId), marshalToNative(propertyValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun GetEncoderProperty(mediaStreamType: MediaStreamType?,
        propertyId: com.sun.jna.platform.win32.Guid.GUID?): IUnknown? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(mediaStreamType),
          marshalToNative(propertyId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun add_Failed(errorEventHandler: MediaCaptureFailedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(errorEventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_Failed(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override
        fun add_RecordLimitationExceeded(recordLimitationExceededEventHandler: RecordLimitationExceededEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,
          marshalToNative(recordLimitationExceededEventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_RecordLimitationExceeded(eventCookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_MediaCaptureSettings(): MediaCaptureSettings? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCaptureSettings>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCaptureSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_AudioDeviceController(): AudioDeviceController? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceController>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_VideoDeviceController(): VideoDeviceController? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceController>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoDeviceController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun SetPreviewMirroring(value: Boolean): Unit {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun GetPreviewMirroring(): Boolean {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun SetPreviewRotation(value: VideoRotation?): Unit {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun GetPreviewRotation(): VideoRotation? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoRotation>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoRotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun SetRecordRotation(value: VideoRotation?): Unit {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun GetRecordRotation(): VideoRotation? {
      val fnPtr = _1573545626_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoRotation>()
      val hr = fn.invokeHR(arrayOf(__1573545626_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoRotation>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1573545626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c61afbb4fb104a34ac18ca80d9c8e7ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture(ptr: Pointer?): WithDefault = IMediaCapture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture {
      val address = segment.toRawLongValue()
      return makeIMediaCapture(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1573545626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture): Array<IMediaCapture?> = (elements as
        Array<IMediaCapture?>).castToImpl<IMediaCapture,IMediaCapture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture?> =
        arrayOfNulls<IMediaCapture_Impl>(size) as Array<IMediaCapture?>
  }
}
