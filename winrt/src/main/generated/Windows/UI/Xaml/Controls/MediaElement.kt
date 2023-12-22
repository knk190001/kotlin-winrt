package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaElement.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MediaElement;{a38ed2cf-13de-4299-ade2-ae18f74ed353})")
@WinRTByReference(brClass = MediaElement.ByReference::class)
public class MediaElement(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IMediaElement.WithDefault, IMediaElement2.WithDefault,
    IMediaElement3.WithDefault, IWinRTObject {
  private val __281644908_Interface: IMediaElement.WithDefault by lazy {
    as_281644908()
  }


  private val __141057506_Interface: IMediaElement2.WithDefault by lazy {
    as_141057506()
  }


  private val __141057505_Interface: IMediaElement3.WithDefault by lazy {
    as_141057505()
  }


  public override val __281644908_Ptr: JNAPointer? by lazy {
    __281644908_Interface.__281644908_Ptr
  }


  public override val __141057506_Ptr: JNAPointer? by lazy {
    __141057506_Interface.__141057506_Ptr
  }


  public override val __141057505_Ptr: JNAPointer? by lazy {
    __141057505_Interface.__141057505_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__281644908_Interface, __141057506_Interface, __141057505_Interface)

  public constructor() : this(ABI.activate())

  private fun as_281644908(): IMediaElement.WithDefault {
    if(pointer == NULL) {
      return(IMediaElement.ABI.makeIMediaElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaElement.ABI.makeIMediaElement(ref.value))
  }

  private fun as_141057506(): IMediaElement2.WithDefault {
    if(pointer == NULL) {
      return(IMediaElement2.ABI.makeIMediaElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaElement2.ABI.makeIMediaElement2(ref.value))
  }

  private fun as_141057505(): IMediaElement3.WithDefault {
    if(pointer == NULL) {
      return(IMediaElement3.ABI.makeIMediaElement3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaElement3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaElement3.ABI.makeIMediaElement3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaElement> {
    public override fun getValue() = MediaElement(pointer.getPointer(0))

    public fun setValue(value: MediaElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaElement, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMediaElementStatics2_Instance: IMediaElementStatics2 by lazy {
      createIMediaElementStatics2()
    }


    public val IMediaElementStatics_Instance: IMediaElementStatics by lazy {
      createIMediaElementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaElement".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIMediaElementStatics2(): IMediaElementStatics2 {
      val refiid = Guid.REFIID(IMediaElementStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaElement".toHandle(),refiid,interfacePtr)
      val result = IMediaElementStatics2.ABI.makeIMediaElementStatics2(interfacePtr.value)
      return result
    }

    public fun createIMediaElementStatics(): IMediaElementStatics {
      val refiid = Guid.REFIID(IMediaElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaElement".toHandle(),refiid,interfacePtr)
      val result = IMediaElementStatics.ABI.makeIMediaElementStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaElement {
      val address = segment.toRawLongValue()
      return MediaElement(Pointer(address))
    }

    public override fun toNative(obj: MediaElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AreTransportControlsEnabledProperty() =
        ABI.IMediaElementStatics2_Instance.get_AreTransportControlsEnabledProperty()

    public fun get_StretchProperty() = ABI.IMediaElementStatics2_Instance.get_StretchProperty()

    public fun get_IsFullWindowProperty() =
        ABI.IMediaElementStatics2_Instance.get_IsFullWindowProperty()

    public fun get_PlayToPreferredSourceUriProperty() =
        ABI.IMediaElementStatics2_Instance.get_PlayToPreferredSourceUriProperty()

    public fun get_PosterSourceProperty() =
        ABI.IMediaElementStatics_Instance.get_PosterSourceProperty()

    public fun get_SourceProperty() = ABI.IMediaElementStatics_Instance.get_SourceProperty()

    public fun get_IsMutedProperty() = ABI.IMediaElementStatics_Instance.get_IsMutedProperty()

    public fun get_IsAudioOnlyProperty() =
        ABI.IMediaElementStatics_Instance.get_IsAudioOnlyProperty()

    public fun get_AutoPlayProperty() = ABI.IMediaElementStatics_Instance.get_AutoPlayProperty()

    public fun get_VolumeProperty() = ABI.IMediaElementStatics_Instance.get_VolumeProperty()

    public fun get_BalanceProperty() = ABI.IMediaElementStatics_Instance.get_BalanceProperty()

    public fun get_NaturalVideoHeightProperty() =
        ABI.IMediaElementStatics_Instance.get_NaturalVideoHeightProperty()

    public fun get_NaturalVideoWidthProperty() =
        ABI.IMediaElementStatics_Instance.get_NaturalVideoWidthProperty()

    public fun get_NaturalDurationProperty() =
        ABI.IMediaElementStatics_Instance.get_NaturalDurationProperty()

    public fun get_PositionProperty() = ABI.IMediaElementStatics_Instance.get_PositionProperty()

    public fun get_DownloadProgressProperty() =
        ABI.IMediaElementStatics_Instance.get_DownloadProgressProperty()

    public fun get_BufferingProgressProperty() =
        ABI.IMediaElementStatics_Instance.get_BufferingProgressProperty()

    public fun get_DownloadProgressOffsetProperty() =
        ABI.IMediaElementStatics_Instance.get_DownloadProgressOffsetProperty()

    public fun get_CurrentStateProperty() =
        ABI.IMediaElementStatics_Instance.get_CurrentStateProperty()

    public fun get_CanSeekProperty() = ABI.IMediaElementStatics_Instance.get_CanSeekProperty()

    public fun get_CanPauseProperty() = ABI.IMediaElementStatics_Instance.get_CanPauseProperty()

    public fun get_AudioStreamCountProperty() =
        ABI.IMediaElementStatics_Instance.get_AudioStreamCountProperty()

    public fun get_AudioStreamIndexProperty() =
        ABI.IMediaElementStatics_Instance.get_AudioStreamIndexProperty()

    public fun get_PlaybackRateProperty() =
        ABI.IMediaElementStatics_Instance.get_PlaybackRateProperty()

    public fun get_IsLoopingProperty() = ABI.IMediaElementStatics_Instance.get_IsLoopingProperty()

    public fun get_PlayToSourceProperty() =
        ABI.IMediaElementStatics_Instance.get_PlayToSourceProperty()

    public fun get_DefaultPlaybackRateProperty() =
        ABI.IMediaElementStatics_Instance.get_DefaultPlaybackRateProperty()

    public fun get_AspectRatioWidthProperty() =
        ABI.IMediaElementStatics_Instance.get_AspectRatioWidthProperty()

    public fun get_AspectRatioHeightProperty() =
        ABI.IMediaElementStatics_Instance.get_AspectRatioHeightProperty()

    public fun get_RealTimePlaybackProperty() =
        ABI.IMediaElementStatics_Instance.get_RealTimePlaybackProperty()

    public fun get_AudioCategoryProperty() =
        ABI.IMediaElementStatics_Instance.get_AudioCategoryProperty()

    public fun get_AudioDeviceTypeProperty() =
        ABI.IMediaElementStatics_Instance.get_AudioDeviceTypeProperty()

    public fun get_ProtectionManagerProperty() =
        ABI.IMediaElementStatics_Instance.get_ProtectionManagerProperty()

    public fun get_Stereo3DVideoPackingModeProperty() =
        ABI.IMediaElementStatics_Instance.get_Stereo3DVideoPackingModeProperty()

    public fun get_Stereo3DVideoRenderModeProperty() =
        ABI.IMediaElementStatics_Instance.get_Stereo3DVideoRenderModeProperty()

    public fun get_IsStereo3DVideoProperty() =
        ABI.IMediaElementStatics_Instance.get_IsStereo3DVideoProperty()

    public fun get_ActualStereo3DVideoPackingModeProperty() =
        ABI.IMediaElementStatics_Instance.get_ActualStereo3DVideoPackingModeProperty()
  }
}
