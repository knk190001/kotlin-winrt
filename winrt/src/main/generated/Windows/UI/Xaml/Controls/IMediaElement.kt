package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.Uri
import Windows.Media.PlayTo.PlayToSource
import Windows.Media.Protection.MediaProtectionManager
import Windows.Storage.Streams.IRandomAccessStream
import Windows.UI.Xaml.Duration
import Windows.UI.Xaml.ExceptionRoutedEventHandler
import Windows.UI.Xaml.Media.AudioCategory
import Windows.UI.Xaml.Media.AudioDeviceType
import Windows.UI.Xaml.Media.ImageSource
import Windows.UI.Xaml.Media.MediaCanPlayResponse
import Windows.UI.Xaml.Media.MediaElementState
import Windows.UI.Xaml.Media.RateChangedRoutedEventHandler
import Windows.UI.Xaml.Media.Stereo3DVideoPackingMode
import Windows.UI.Xaml.Media.Stereo3DVideoRenderMode
import Windows.UI.Xaml.Media.TimelineMarkerCollection
import Windows.UI.Xaml.Media.TimelineMarkerRoutedEventHandler
import Windows.UI.Xaml.RoutedEventHandler
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaElement.ABI::class)
@Signature("{a38ed2cf-13de-4299-ade2-ae18f74ed353}")
@Guid("a38ed2cf13de4299ade2ae18f74ed353")
@WinRTInterface("a38ed2cf13de4299ade2ae18f74ed353")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaElement.ByReference::class)
public interface IMediaElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PosterSource(): ImageSource?

  @InterfaceMethod(1)
  public fun put_PosterSource(value: ImageSource?): Unit

  @InterfaceMethod(2)
  public fun get_Source(): Uri?

  @InterfaceMethod(3)
  public fun put_Source(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_IsMuted(): Boolean

  @InterfaceMethod(5)
  public fun put_IsMuted(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsAudioOnly(): Boolean

  @InterfaceMethod(7)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(8)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_Volume(): Double

  @InterfaceMethod(10)
  public fun put_Volume(value: Double): Unit

  @InterfaceMethod(11)
  public fun get_Balance(): Double

  @InterfaceMethod(12)
  public fun put_Balance(value: Double): Unit

  @InterfaceMethod(13)
  public fun get_NaturalVideoHeight(): Int

  @InterfaceMethod(14)
  public fun get_NaturalVideoWidth(): Int

  @InterfaceMethod(15)
  public fun get_NaturalDuration(): Duration?

  @InterfaceMethod(16)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(17)
  public fun put_Position(value: TimeSpan?): Unit

  @InterfaceMethod(18)
  public fun get_DownloadProgress(): Double

  @InterfaceMethod(19)
  public fun get_BufferingProgress(): Double

  @InterfaceMethod(20)
  public fun get_DownloadProgressOffset(): Double

  @InterfaceMethod(21)
  public fun get_CurrentState(): MediaElementState?

  @InterfaceMethod(22)
  public fun get_Markers(): TimelineMarkerCollection?

  @InterfaceMethod(23)
  public fun get_CanSeek(): Boolean

  @InterfaceMethod(24)
  public fun get_CanPause(): Boolean

  @InterfaceMethod(25)
  public fun get_AudioStreamCount(): Int

  @InterfaceMethod(26)
  public fun get_AudioStreamIndex(): IReference<Int>?

  @InterfaceMethod(27)
  public fun put_AudioStreamIndex(value: IReference<Int>?): Unit

  @InterfaceMethod(28)
  public fun get_PlaybackRate(): Double

  @InterfaceMethod(29)
  public fun put_PlaybackRate(value: Double): Unit

  @InterfaceMethod(30)
  public fun get_IsLooping(): Boolean

  @InterfaceMethod(31)
  public fun put_IsLooping(value: Boolean): Unit

  @InterfaceMethod(32)
  public fun get_PlayToSource(): PlayToSource?

  @InterfaceMethod(33)
  public fun get_DefaultPlaybackRate(): Double

  @InterfaceMethod(34)
  public fun put_DefaultPlaybackRate(value: Double): Unit

  @InterfaceMethod(35)
  public fun get_AspectRatioWidth(): Int

  @InterfaceMethod(36)
  public fun get_AspectRatioHeight(): Int

  @InterfaceMethod(37)
  public fun get_RealTimePlayback(): Boolean

  @InterfaceMethod(38)
  public fun put_RealTimePlayback(value: Boolean): Unit

  @InterfaceMethod(39)
  public fun get_AudioCategory(): AudioCategory?

  @InterfaceMethod(40)
  public fun put_AudioCategory(value: AudioCategory?): Unit

  @InterfaceMethod(41)
  public fun get_AudioDeviceType(): AudioDeviceType?

  @InterfaceMethod(42)
  public fun put_AudioDeviceType(value: AudioDeviceType?): Unit

  @InterfaceMethod(43)
  public fun get_ProtectionManager(): MediaProtectionManager?

  @InterfaceMethod(44)
  public fun put_ProtectionManager(value: MediaProtectionManager?): Unit

  @InterfaceMethod(45)
  public fun get_Stereo3DVideoPackingMode(): Stereo3DVideoPackingMode?

  @InterfaceMethod(46)
  public fun put_Stereo3DVideoPackingMode(value: Stereo3DVideoPackingMode?): Unit

  @InterfaceMethod(47)
  public fun get_Stereo3DVideoRenderMode(): Stereo3DVideoRenderMode?

  @InterfaceMethod(48)
  public fun put_Stereo3DVideoRenderMode(value: Stereo3DVideoRenderMode?): Unit

  @InterfaceMethod(49)
  public fun get_IsStereo3DVideo(): Boolean

  @InterfaceMethod(50)
  public fun add_MediaOpened(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(51)
  public fun remove_MediaOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(52)
  public fun add_MediaEnded(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(53)
  public fun remove_MediaEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(54)
  public fun add_MediaFailed(handler: ExceptionRoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(55)
  public fun remove_MediaFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(56)
  public fun add_DownloadProgressChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(57)
  public fun remove_DownloadProgressChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(58)
  public fun add_BufferingProgressChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(59)
  public fun remove_BufferingProgressChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(60)
  public fun add_CurrentStateChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(61)
  public fun remove_CurrentStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(62)
  public fun add_MarkerReached(handler: TimelineMarkerRoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(63)
  public fun remove_MarkerReached(token: EventRegistrationToken?): Unit

  @InterfaceMethod(64)
  public fun add_RateChanged(handler: RateChangedRoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(65)
  public fun remove_RateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(66)
  public fun add_VolumeChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(67)
  public fun remove_VolumeChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(68)
  public fun add_SeekCompleted(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(69)
  public fun remove_SeekCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(70)
  public fun Stop(): Unit

  @InterfaceMethod(71)
  public fun Play(): Unit

  @InterfaceMethod(72)
  public fun Pause(): Unit

  @InterfaceMethod(73)
  public fun CanPlayType(type: String?): MediaCanPlayResponse?

  @InterfaceMethod(74)
  public fun SetSource(stream: IRandomAccessStream?, mimeType: String?): Unit

  @InterfaceMethod(75)
  public fun GetAudioStreamLanguage(index: IReference<Int>?): String?

  @InterfaceMethod(76)
  public fun AddAudioEffect(
    effectID: String?,
    effectOptional: Boolean,
    effectConfiguration: IPropertySet?
  ): Unit

  @InterfaceMethod(77)
  public fun AddVideoEffect(
    effectID: String?,
    effectOptional: Boolean,
    effectConfiguration: IPropertySet?
  ): Unit

  @InterfaceMethod(78)
  public fun RemoveAllEffects(): Unit

  @InterfaceMethod(79)
  public fun get_ActualStereo3DVideoPackingMode(): Stereo3DVideoPackingMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaElement>
      {
    public override fun getValue() = ABI.makeIMediaElement(pointer.getPointer(0))

    public fun setValue(value: IMediaElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaElement {
    public val __281644908_Ptr: Pointer?

    public val _281644908_VtblPtr: Pointer?
      get() = __281644908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PosterSource(): ImageSource? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PosterSource(value: ImageSource?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Source(): Uri? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Source(value: Uri?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsMuted(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsMuted(value: Boolean): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsAudioOnly(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Volume(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_Volume(value: Double): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_Balance(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_Balance(value: Double): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_NaturalVideoHeight(): Int {
      val fnPtr = _281644908_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_NaturalVideoWidth(): Int {
      val fnPtr = _281644908_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_NaturalDuration(): Duration? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Position(value: TimeSpan?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_DownloadProgress(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_BufferingProgress(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun get_DownloadProgressOffset(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_CurrentState(): MediaElementState? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaElementState>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaElementState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_Markers(): TimelineMarkerCollection? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimelineMarkerCollection>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimelineMarkerCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_CanSeek(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun get_CanPause(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_AudioStreamCount(): Int {
      val fnPtr = _281644908_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun get_AudioStreamIndex(): IReference<Int>? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_AudioStreamIndex(value: IReference<Int>?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_PlaybackRate(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_PlaybackRate(value: Double): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_IsLooping(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_IsLooping(value: Boolean): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_PlayToSource(): PlayToSource? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToSource>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun get_DefaultPlaybackRate(): Double {
      val fnPtr = _281644908_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun put_DefaultPlaybackRate(value: Double): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun get_AspectRatioWidth(): Int {
      val fnPtr = _281644908_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(36)
    public override fun get_AspectRatioHeight(): Int {
      val fnPtr = _281644908_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun get_RealTimePlayback(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(38)
    public override fun put_RealTimePlayback(value: Boolean): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun get_AudioCategory(): AudioCategory? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioCategory>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(40)
    public override fun put_AudioCategory(value: AudioCategory?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun get_AudioDeviceType(): AudioDeviceType? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceType>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun put_AudioDeviceType(value: AudioDeviceType?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(43)
    public override fun get_ProtectionManager(): MediaProtectionManager? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaProtectionManager>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaProtectionManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun put_ProtectionManager(value: MediaProtectionManager?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(45)
    public override fun get_Stereo3DVideoPackingMode(): Stereo3DVideoPackingMode? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stereo3DVideoPackingMode>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stereo3DVideoPackingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun put_Stereo3DVideoPackingMode(value: Stereo3DVideoPackingMode?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(47)
    public override fun get_Stereo3DVideoRenderMode(): Stereo3DVideoRenderMode? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stereo3DVideoRenderMode>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stereo3DVideoRenderMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun put_Stereo3DVideoRenderMode(value: Stereo3DVideoRenderMode?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(49)
    public override fun get_IsStereo3DVideo(): Boolean {
      val fnPtr = _281644908_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(50)
    public override fun add_MediaOpened(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun remove_MediaOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun add_MediaEnded(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(53)
    public override fun remove_MediaEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun add_MediaFailed(handler: ExceptionRoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun remove_MediaFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(56)
    public override fun add_DownloadProgressChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun remove_DownloadProgressChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(58)
    public override fun add_BufferingProgressChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(59)
    public override fun remove_BufferingProgressChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(65L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(60)
    public override fun add_CurrentStateChanged(handler: RoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(66L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(61)
    public override fun remove_CurrentStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(67L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(62)
    public override fun add_MarkerReached(handler: TimelineMarkerRoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(68L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(63)
    public override fun remove_MarkerReached(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(69L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(64)
    public override fun add_RateChanged(handler: RateChangedRoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(70L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(65)
    public override fun remove_RateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(71L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(66)
    public override fun add_VolumeChanged(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(72L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(67)
    public override fun remove_VolumeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(73L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(68)
    public override fun add_SeekCompleted(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(74L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(69)
    public override fun remove_SeekCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(75L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(70)
    public override fun Stop(): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(76L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(71)
    public override fun Play(): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(77L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(72)
    public override fun Pause(): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(78L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(73)
    public override fun CanPlayType(type: String?): MediaCanPlayResponse? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(79L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCanPlayResponse>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCanPlayResponse>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(74)
    public override fun SetSource(stream: IRandomAccessStream?, mimeType: String?): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(80L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(stream),
          marshalToNative(mimeType),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(75)
    public override fun GetAudioStreamLanguage(index: IReference<Int>?): String? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(81L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(index), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(76)
    public override fun AddAudioEffect(
      effectID: String?,
      effectOptional: Boolean,
      effectConfiguration: IPropertySet?
    ): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(82L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(effectID), effectOptional,
          marshalToNative(effectConfiguration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(77)
    public override fun AddVideoEffect(
      effectID: String?,
      effectOptional: Boolean,
      effectConfiguration: IPropertySet?
    ): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(83L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, marshalToNative(effectID), effectOptional,
          marshalToNative(effectConfiguration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(78)
    public override fun RemoveAllEffects(): Unit {
      val fnPtr = _281644908_VtblPtr!!.getPointer(84L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(79)
    public override fun get_ActualStereo3DVideoPackingMode(): Stereo3DVideoPackingMode? {
      val fnPtr = _281644908_VtblPtr!!.getPointer(85L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stereo3DVideoPackingMode>()
      val hr = fn.invokeHR(arrayOf(__281644908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stereo3DVideoPackingMode>(result.getValue())
      return resultValue
    }
  }

  public class IMediaElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __281644908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a38ed2cf13de4299ade2ae18f74ed353")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaElement(ptr: Pointer?): WithDefault = IMediaElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaElement {
      val address = segment.toRawLongValue()
      return makeIMediaElement(Pointer(address))
    }

    public override fun toNative(obj: IMediaElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__281644908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaElement): Array<IMediaElement?> = (elements as
        Array<IMediaElement?>).castToImpl<IMediaElement,IMediaElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaElement?> =
        arrayOfNulls<IMediaElement_Impl>(size) as Array<IMediaElement?>
  }
}
