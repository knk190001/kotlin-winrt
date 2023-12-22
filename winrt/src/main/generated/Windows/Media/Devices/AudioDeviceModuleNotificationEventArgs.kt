package Windows.Media.Devices

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioDeviceModuleNotificationEventArgs.ABI::class)
@Signature("rc(Windows.Media.Devices.AudioDeviceModuleNotificationEventArgs;{e3e3ccaf-224c-48be-956b-9a13134e96e8})")
@WinRTByReference(brClass = AudioDeviceModuleNotificationEventArgs.ByReference::class)
public class AudioDeviceModuleNotificationEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioDeviceModuleNotificationEventArgs.WithDefault, IWinRTObject {
  private val __202540587_Interface: IAudioDeviceModuleNotificationEventArgs.WithDefault by lazy {
    as_202540587()
  }


  public override val __202540587_Ptr: JNAPointer? by lazy {
    __202540587_Interface.__202540587_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__202540587_Interface)

  private fun as_202540587(): IAudioDeviceModuleNotificationEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAudioDeviceModuleNotificationEventArgs.ABI.makeIAudioDeviceModuleNotificationEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioDeviceModuleNotificationEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioDeviceModuleNotificationEventArgs.ABI.makeIAudioDeviceModuleNotificationEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioDeviceModuleNotificationEventArgs> {
    public override fun getValue() = AudioDeviceModuleNotificationEventArgs(pointer.getPointer(0))

    public fun setValue(value: AudioDeviceModuleNotificationEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioDeviceModuleNotificationEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioDeviceModuleNotificationEventArgs {
      val address = segment.toRawLongValue()
      return AudioDeviceModuleNotificationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AudioDeviceModuleNotificationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
