package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IMediaTransportControlsFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.MediaTransportControls;{c99c110b-9dee-5a6b-bb9e-61bfcaaafa3e})")
@WinRTByReference(brClass = MediaTransportControls.ByReference::class)
public open class MediaTransportControls(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMediaTransportControls.WithDefault, IWinRTObject {
  private val __1016966146_Interface: IMediaTransportControls.WithDefault by lazy {
    as_1016966146()
  }


  public override val __1016966146_Ptr: JNAPointer? by lazy {
    __1016966146_Interface.__1016966146_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1016966146_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1016966146(): IMediaTransportControls.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControls.ABI.makeIMediaTransportControls(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControls>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControls.ABI.makeIMediaTransportControls(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTransportControls> {
    public override fun getValue() = MediaTransportControls(pointer.getPointer(0))

    public fun setValue(value: MediaTransportControls): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTransportControls, MemoryAddress> {
    public val IMediaTransportControlsStatics_Instance: IMediaTransportControlsStatics by lazy {
      createIMediaTransportControlsStatics()
    }


    public val IMediaTransportControlsFactory_Instance: IMediaTransportControlsFactory by lazy {
      createIMediaTransportControlsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaTransportControlsStatics(): IMediaTransportControlsStatics {
      val refiid = Guid.REFIID(IMediaTransportControlsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,interfacePtr)
      val result =
          IMediaTransportControlsStatics.ABI.makeIMediaTransportControlsStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaTransportControlsFactory(): IMediaTransportControlsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MediaTransportControls".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_IsSkipForwardButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsSkipForwardButtonVisibleProperty()

    public fun get_IsSkipForwardEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsSkipForwardEnabledProperty()

    public fun get_IsSkipBackwardButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsSkipBackwardButtonVisibleProperty()

    public fun get_IsSkipBackwardEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsSkipBackwardEnabledProperty()

    public fun get_IsNextTrackButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsNextTrackButtonVisibleProperty()

    public fun get_IsPreviousTrackButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsPreviousTrackButtonVisibleProperty()

    public fun get_FastPlayFallbackBehaviourProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_FastPlayFallbackBehaviourProperty()

    public fun get_ShowAndHideAutomaticallyProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_ShowAndHideAutomaticallyProperty()

    public fun get_IsRepeatEnabledProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsRepeatEnabledProperty()

    public fun get_IsRepeatButtonVisibleProperty() =
        ABI.IMediaTransportControlsStatics_Instance.get_IsRepeatButtonVisibleProperty()
  }
}
