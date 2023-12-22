package Windows.Media.Devices

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaDevice.ABI::class)
@WinRTByReference(brClass = MediaDevice.ByReference::class)
public class MediaDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaDevice> {
    public override fun getValue() = MediaDevice(pointer.getPointer(0))

    public fun setValue(value: MediaDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaDevice, MemoryAddress> {
    public val IMediaDeviceStatics_Instance: IMediaDeviceStatics by lazy {
      createIMediaDeviceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaDeviceStatics(): IMediaDeviceStatics {
      val refiid = Guid.REFIID(IMediaDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Devices.MediaDevice".toHandle(),refiid,interfacePtr)
      val result = IMediaDeviceStatics.ABI.makeIMediaDeviceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaDevice {
      val address = segment.toRawLongValue()
      return MediaDevice(Pointer(address))
    }

    public override fun toNative(obj: MediaDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetAudioCaptureSelector() =
        ABI.IMediaDeviceStatics_Instance.GetAudioCaptureSelector()

    public fun GetAudioRenderSelector() = ABI.IMediaDeviceStatics_Instance.GetAudioRenderSelector()

    public fun GetVideoCaptureSelector() =
        ABI.IMediaDeviceStatics_Instance.GetVideoCaptureSelector()

    public fun GetDefaultAudioCaptureId(role: AudioDeviceRole) =
        ABI.IMediaDeviceStatics_Instance.GetDefaultAudioCaptureId(role)

    public fun GetDefaultAudioRenderId(role: AudioDeviceRole) =
        ABI.IMediaDeviceStatics_Instance.GetDefaultAudioRenderId(role)

    public fun add_DefaultAudioCaptureDeviceChanged(handler: TypedEventHandler<IUnknown?,
        DefaultAudioCaptureDeviceChangedEventArgs?>) =
        ABI.IMediaDeviceStatics_Instance.add_DefaultAudioCaptureDeviceChanged(handler)

    public fun remove_DefaultAudioCaptureDeviceChanged(cookie: EventRegistrationToken) =
        ABI.IMediaDeviceStatics_Instance.remove_DefaultAudioCaptureDeviceChanged(cookie)

    public fun add_DefaultAudioRenderDeviceChanged(handler: TypedEventHandler<IUnknown?,
        DefaultAudioRenderDeviceChangedEventArgs?>) =
        ABI.IMediaDeviceStatics_Instance.add_DefaultAudioRenderDeviceChanged(handler)

    public fun remove_DefaultAudioRenderDeviceChanged(cookie: EventRegistrationToken) =
        ABI.IMediaDeviceStatics_Instance.remove_DefaultAudioRenderDeviceChanged(cookie)
  }
}
