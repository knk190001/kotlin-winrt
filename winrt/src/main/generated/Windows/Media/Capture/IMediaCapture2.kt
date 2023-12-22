package Windows.Media.Capture

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Media.IMediaExtension
import Windows.Media.MediaProperties.IMediaEncodingProperties
import Windows.Media.MediaProperties.ImageEncodingProperties
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Media.MediaProperties.MediaPropertySet
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

@ABIMarker(IMediaCapture2.ABI::class)
@Signature("{9cc68260-7da1-4043-b652-21b8878daff9}")
@Guid("9cc682607da14043b65221b8878daff9")
@WinRTInterface("9cc682607da14043b65221b8878daff9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture2.ByReference::class)
public interface IMediaCapture2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PrepareLowLagRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile?,
      `file`: IStorageFile?): IAsyncOperation<LowLagMediaRecording?>?

  @InterfaceMethod(1)
  public fun PrepareLowLagRecordToStreamAsync(encodingProfile: MediaEncodingProfile?,
      stream: IRandomAccessStream?): IAsyncOperation<LowLagMediaRecording?>?

  @InterfaceMethod(2)
  public fun PrepareLowLagRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile?,
      customMediaSink: IMediaExtension?): IAsyncOperation<LowLagMediaRecording?>?

  @InterfaceMethod(3)
  public fun PrepareLowLagRecordToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile?,
    customSinkActivationId: String?,
    customSinkSettings: IPropertySet?
  ): IAsyncOperation<LowLagMediaRecording?>?

  @InterfaceMethod(4)
  public fun PrepareLowLagPhotoCaptureAsync(type: ImageEncodingProperties?):
      IAsyncOperation<LowLagPhotoCapture?>?

  @InterfaceMethod(5)
  public fun PrepareLowLagPhotoSequenceCaptureAsync(type: ImageEncodingProperties?):
      IAsyncOperation<LowLagPhotoSequenceCapture?>?

  @InterfaceMethod(6)
  public fun SetEncodingPropertiesAsync(
    mediaStreamType: MediaStreamType?,
    mediaEncodingProperties: IMediaEncodingProperties?,
    encoderProperties: MediaPropertySet?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture2>
      {
    public override fun getValue() = ABI.makeIMediaCapture2(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture2 {
    public val __1535274200_Ptr: Pointer?

    public val _1535274200_VtblPtr: Pointer?
      get() = __1535274200_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun PrepareLowLagRecordToStorageFileAsync(encodingProfile: MediaEncodingProfile?,
        `file`: IStorageFile?): IAsyncOperation<LowLagMediaRecording?>? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LowLagMediaRecording?>>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(encodingProfile),
          marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LowLagMediaRecording?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PrepareLowLagRecordToStreamAsync(encodingProfile: MediaEncodingProfile?,
        stream: IRandomAccessStream?): IAsyncOperation<LowLagMediaRecording?>? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LowLagMediaRecording?>>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(encodingProfile),
          marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LowLagMediaRecording?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PrepareLowLagRecordToCustomSinkAsync(encodingProfile: MediaEncodingProfile?,
        customMediaSink: IMediaExtension?): IAsyncOperation<LowLagMediaRecording?>? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LowLagMediaRecording?>>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(encodingProfile),
          marshalToNative(customMediaSink), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LowLagMediaRecording?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun PrepareLowLagRecordToCustomSinkAsync(
      encodingProfile: MediaEncodingProfile?,
      customSinkActivationId: String?,
      customSinkSettings: IPropertySet?
    ): IAsyncOperation<LowLagMediaRecording?>? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LowLagMediaRecording?>>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(encodingProfile),
          marshalToNative(customSinkActivationId), marshalToNative(customSinkSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LowLagMediaRecording?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun PrepareLowLagPhotoCaptureAsync(type: ImageEncodingProperties?):
        IAsyncOperation<LowLagPhotoCapture?>? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LowLagPhotoCapture?>>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LowLagPhotoCapture?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun PrepareLowLagPhotoSequenceCaptureAsync(type: ImageEncodingProperties?):
        IAsyncOperation<LowLagPhotoSequenceCapture?>? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LowLagPhotoSequenceCapture?>>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LowLagPhotoSequenceCapture?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetEncodingPropertiesAsync(
      mediaStreamType: MediaStreamType?,
      mediaEncodingProperties: IMediaEncodingProperties?,
      encoderProperties: MediaPropertySet?
    ): IAsyncAction? {
      val fnPtr = _1535274200_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1535274200_Ptr, marshalToNative(mediaStreamType),
          marshalToNative(mediaEncodingProperties), marshalToNative(encoderProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapture2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535274200_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cc682607da14043b65221b8878daff9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture2(ptr: Pointer?): WithDefault = IMediaCapture2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture2 {
      val address = segment.toRawLongValue()
      return makeIMediaCapture2(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535274200_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture2): Array<IMediaCapture2?> = (elements as
        Array<IMediaCapture2?>).castToImpl<IMediaCapture2,IMediaCapture2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture2?> =
        arrayOfNulls<IMediaCapture2_Impl>(size) as Array<IMediaCapture2?>
  }
}
