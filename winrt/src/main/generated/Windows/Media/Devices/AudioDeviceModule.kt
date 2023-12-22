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

@ABIMarker(AudioDeviceModule.ABI::class)
@Signature("rc(Windows.Media.Devices.AudioDeviceModule;{86cfac36-47c1-4b33-9852-8773ec4be123})")
@WinRTByReference(brClass = AudioDeviceModule.ByReference::class)
public class AudioDeviceModule(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioDeviceModule.WithDefault, IWinRTObject {
  private val __1162343337_Interface: IAudioDeviceModule.WithDefault by lazy {
    as_1162343337()
  }


  public override val __1162343337_Ptr: JNAPointer? by lazy {
    __1162343337_Interface.__1162343337_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1162343337_Interface)

  private fun as_1162343337(): IAudioDeviceModule.WithDefault {
    if(pointer == NULL) {
      return(IAudioDeviceModule.ABI.makeIAudioDeviceModule(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioDeviceModule>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioDeviceModule.ABI.makeIAudioDeviceModule(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioDeviceModule> {
    public override fun getValue() = AudioDeviceModule(pointer.getPointer(0))

    public fun setValue(value: AudioDeviceModule): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioDeviceModule, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioDeviceModule {
      val address = segment.toRawLongValue()
      return AudioDeviceModule(Pointer(address))
    }

    public override fun toNative(obj: AudioDeviceModule): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
