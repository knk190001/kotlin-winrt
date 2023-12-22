package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMediaTransportControlsFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(MediaTransportControls.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MediaTransportControls;{d6f69e7d-0825-49a9-9fce-5586d8694f0c})")
@WinRTByReference(brClass = MediaTransportControls.ByReference::class)
public open class MediaTransportControls(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMediaTransportControls.WithDefault, IMediaTransportControls2.WithDefault,
    IMediaTransportControls3.WithDefault, IMediaTransportControls4.WithDefault, IWinRTObject {
  private val __1882350441_Interface: IMediaTransportControls.WithDefault by lazy {
    as_1882350441()
  }


  private val __1776678523_Interface: IMediaTransportControls2.WithDefault by lazy {
    as_1776678523()
  }


  private val __1776678524_Interface: IMediaTransportControls3.WithDefault by lazy {
    as_1776678524()
  }


  private val __1776678525_Interface: IMediaTransportControls4.WithDefault by lazy {
    as_1776678525()
  }


  public override val __1882350441_Ptr: JNAPointer? by lazy {
    __1882350441_Interface.__1882350441_Ptr
  }


  public override val __1776678523_Ptr: JNAPointer? by lazy {
    __1776678523_Interface.__1776678523_Ptr
  }


  public override val __1776678524_Ptr: JNAPointer? by lazy {
    __1776678524_Interface.__1776678524_Ptr
  }


  public override val __1776678525_Ptr: JNAPointer? by lazy {
    __1776678525_Interface.__1776678525_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1882350441_Interface, __1776678523_Interface, __1776678524_Interface,
        __1776678525_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1882350441(): IMediaTransportControls.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControls.ABI.makeIMediaTransportControls(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControls>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControls.ABI.makeIMediaTransportControls(ref.value))
  }

  private fun as_1776678523(): IMediaTransportControls2.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControls2.ABI.makeIMediaTransportControls2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControls2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControls2.ABI.makeIMediaTransportControls2(ref.value))
  }

  private fun as_1776678524(): IMediaTransportControls3.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControls3.ABI.makeIMediaTransportControls3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControls3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControls3.ABI.makeIMediaTransportControls3(ref.value))
  }

  private fun as_1776678525(): IMediaTransportControls4.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControls4.ABI.makeIMediaTransportControls4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControls4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControls4.ABI.makeIMediaTransportControls4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTransportControls> {
    public override fun getValue() = MediaTransportControls(pointer.getPointer(0))

    public fun setValue(value: MediaTransportControls): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTransportControls, MemoryAddress> {
    public val IMediaTransportControlsStatics4_Instance: IMediaTransportControlsStatics4 by lazy {
      createIMediaTransportControlsStatics4()
    }


    public val IMediaTransportControlsStatics3_Instance: IMediaTransportControlsStatics3 by lazy {
      createIMediaTransportControlsStatics3()
    }


    public val IMediaTransportControlsStatics2_Instance: IMediaTransportControlsStatics2 by lazy {
      createIMediaTransportControlsStatics2()
    }


    public val IMediaTransportControlsStatics_Instance: IMediaTransportControlsStatics by lazy {
      createIMediaTransportControlsStatics()
    }


    public val IMediaTransportControlsFactory_Instance: IMediaTransportControlsFactory by lazy {
      createIMediaTransportControlsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaTransportControlsStatics4(): IMediaTransportControlsStatics4 {
      val refiid = Guid.REFIID(IMediaTransportControlsStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,interfacePtr)
      val result =
          IMediaTransportControlsStatics4.ABI.makeIMediaTransportControlsStatics4(interfacePtr.value)
      return result
    }

    public fun createIMediaTransportControlsStatics3(): IMediaTransportControlsStatics3 {
      val refiid = Guid.REFIID(IMediaTransportControlsStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,interfacePtr)
      val result =
          IMediaTransportControlsStatics3.ABI.makeIMediaTransportControlsStatics3(interfacePtr.value)
      return result
    }

    public fun createIMediaTransportControlsStatics2(): IMediaTransportControlsStatics2 {
      val refiid = Guid.REFIID(IMediaTransportControlsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,interfacePtr)
      val result =
          IMediaTransportControlsStatics2.ABI.makeIMediaTransportControlsStatics2(interfacePtr.value)
      return result
    }

    public fun createIMediaTransportControlsStatics(): IMediaTransportControlsStatics {
      val refiid = Guid.REFIID(IMediaTransportControlsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,interfacePtr)
      val result =
          IMediaTransportControlsStatics.ABI.makeIMediaTransportControlsStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaTransportControlsFactory(): IMediaTransportControlsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaTransportControlsFactory.ABI.makeIMediaTransportControlsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IMediaTransportControlsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaTransportControls {
      val address = segment.toRawLongValue()
      return MediaTransportControls(Pointer(address))
    }

    public override fun toNative(obj: MediaTransportControls): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsCompactOverlayButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics4_Instance.get_IsCompactOverlayButtonVisibleProperty()

    public fun get_IsCompactOverlayEnabledProperty() =
        ABI.IMediaTransportControlsStatics4_Instance.get_IsCompactOverlayEnabledProperty()

    public fun get_ShowAndHideAutomaticallyProperty() =
        ABI.IMediaTransportControlsStatics3_Instance.get_ShowAndHideAutomaticallyProperty()

    public fun get_IsRepeatEnabledProperty() =
        ABI.IMediaTransportControlsStatics3_Instance.get_IsRepeatEnabledProperty()

    public fun get_IsRepeatButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics3_Instance.get_IsRepeatButtonVisibleProperty()

    public fun get_IsSkipForwardButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_IsSkipForwardButtonVisibleProperty()

    public fun get_IsSkipForwardEnabledProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_IsSkipForwardEnabledProperty()

    public fun get_IsSkipBackwardButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_IsSkipBackwardButtonVisibleProperty()

    public fun get_IsSkipBackwardEnabledProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_IsSkipBackwardEnabledProperty()

    public fun get_IsNextTrackButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_IsNextTrackButtonVisibleProperty()

    public fun get_IsPreviousTrackButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_IsPreviousTrackButtonVisibleProperty()

    public fun get_FastPlayFallbackBehaviourProperty() =
        ABI.IMediaTransportControlsStatics2_Instance.get_FastPlayFallbackBehaviourProperty()

    public fun get_IsFullWindowButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsFullWindowButtonVisibleProperty()

    public fun get_IsFullWindowEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsFullWindowEnabledProperty()

    public fun get_IsZoomButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsZoomButtonVisibleProperty()

    public fun get_IsZoomEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsZoomEnabledProperty()

    public fun get_IsFastForwardButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsFastForwardButtonVisibleProperty()

    public fun get_IsFastForwardEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsFastForwardEnabledProperty()

    public fun get_IsFastRewindButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsFastRewindButtonVisibleProperty()

    public fun get_IsFastRewindEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsFastRewindEnabledProperty()

    public fun get_IsStopButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsStopButtonVisibleProperty()

    public fun get_IsStopEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsStopEnabledProperty()

    public fun get_IsVolumeButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsVolumeButtonVisibleProperty()

    public fun get_IsVolumeEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsVolumeEnabledProperty()

    public fun get_IsPlaybackRateButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsPlaybackRateButtonVisibleProperty()

    public fun get_IsPlaybackRateEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsPlaybackRateEnabledProperty()

    public fun get_IsSeekBarVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsSeekBarVisibleProperty()

    public fun get_IsSeekEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsSeekEnabledProperty()

    public fun get_IsCompactProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsCompactProperty()
  }
}
