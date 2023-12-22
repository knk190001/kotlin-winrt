package Windows.Media.Audio

import Windows.Media.Capture.MediaCategory
import Windows.Media.Devices.AudioDeviceRole
import Windows.Media.Render.AudioRenderCategory
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioStateMonitor.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioStateMonitor;{1d13d136-0199-4cdc-b84e-e72c2b581ece})")
@WinRTByReference(brClass = AudioStateMonitor.ByReference::class)
public class AudioStateMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioStateMonitor.WithDefault, IWinRTObject {
  private val __1449042167_Interface: IAudioStateMonitor.WithDefault by lazy {
    as_1449042167()
  }


  public override val __1449042167_Ptr: JNAPointer? by lazy {
    __1449042167_Interface.__1449042167_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1449042167_Interface)

  private fun as_1449042167(): IAudioStateMonitor.WithDefault {
    if(pointer == NULL) {
      return(IAudioStateMonitor.ABI.makeIAudioStateMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioStateMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioStateMonitor.ABI.makeIAudioStateMonitor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioStateMonitor> {
    public override fun getValue() = AudioStateMonitor(pointer.getPointer(0))

    public fun setValue(value: AudioStateMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioStateMonitor, MemoryAddress> {
    public val IAudioStateMonitorStatics_Instance: IAudioStateMonitorStatics by lazy {
      createIAudioStateMonitorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioStateMonitorStatics(): IAudioStateMonitorStatics {
      val refiid = Guid.REFIID(IAudioStateMonitorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioStateMonitor".toHandle(),refiid,interfacePtr)
      val result = IAudioStateMonitorStatics.ABI.makeIAudioStateMonitorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioStateMonitor {
      val address = segment.toRawLongValue()
      return AudioStateMonitor(Pointer(address))
    }

    public override fun toNative(obj: AudioStateMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForRenderMonitoring() =
        ABI.IAudioStateMonitorStatics_Instance.CreateForRenderMonitoring()

    public fun CreateForRenderMonitoring(category: AudioRenderCategory) =
        ABI.IAudioStateMonitorStatics_Instance.CreateForRenderMonitoring(category)

    public fun CreateForRenderMonitoring(category: AudioRenderCategory, role: AudioDeviceRole) =
        ABI.IAudioStateMonitorStatics_Instance.CreateForRenderMonitoring(category, role)

    public fun CreateForRenderMonitoringWithCategoryAndDeviceId(category: AudioRenderCategory,
        deviceId: String) =
        ABI.IAudioStateMonitorStatics_Instance.CreateForRenderMonitoringWithCategoryAndDeviceId(category,
        deviceId)

    public fun CreateForCaptureMonitoring() =
        ABI.IAudioStateMonitorStatics_Instance.CreateForCaptureMonitoring()

    public fun CreateForCaptureMonitoring(category: MediaCategory) =
        ABI.IAudioStateMonitorStatics_Instance.CreateForCaptureMonitoring(category)

    public fun CreateForCaptureMonitoring(category: MediaCategory, role: AudioDeviceRole) =
        ABI.IAudioStateMonitorStatics_Instance.CreateForCaptureMonitoring(category, role)

    public fun CreateForCaptureMonitoringWithCategoryAndDeviceId(category: MediaCategory,
        deviceId: String) =
        ABI.IAudioStateMonitorStatics_Instance.CreateForCaptureMonitoringWithCategoryAndDeviceId(category,
        deviceId)
  }
}
