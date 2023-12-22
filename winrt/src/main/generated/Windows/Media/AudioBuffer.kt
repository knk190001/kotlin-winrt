package Windows.Media

import Windows.Foundation.IClosable
import Windows.Foundation.IMemoryBuffer
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

@ABIMarker(AudioBuffer.ABI::class)
@Signature("rc(Windows.Media.AudioBuffer;{35175827-724b-4c6a-b130-f6537f9ae0d0})")
@WinRTByReference(brClass = AudioBuffer.ByReference::class)
public class AudioBuffer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioBuffer.WithDefault, IMemoryBuffer.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __2141956442_Interface: IAudioBuffer.WithDefault by lazy {
    as_2141956442()
  }


  private val __2070864652_Interface: IMemoryBuffer.WithDefault by lazy {
    as_2070864652()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2141956442_Ptr: JNAPointer? by lazy {
    __2141956442_Interface.__2141956442_Ptr
  }


  public override val __2070864652_Ptr: JNAPointer? by lazy {
    __2070864652_Interface.__2070864652_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2141956442_Interface, __2070864652_Interface, __1260617006_Interface)

  private fun as_2141956442(): IAudioBuffer.WithDefault {
    if(pointer == NULL) {
      return(IAudioBuffer.ABI.makeIAudioBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioBuffer.ABI.makeIAudioBuffer(ref.value))
  }

  private fun as_2070864652(): IMemoryBuffer.WithDefault {
    if(pointer == NULL) {
      return(IMemoryBuffer.ABI.makeIMemoryBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMemoryBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMemoryBuffer.ABI.makeIMemoryBuffer(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AudioBuffer> {
    public override fun getValue() = AudioBuffer(pointer.getPointer(0))

    public fun setValue(value: AudioBuffer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioBuffer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioBuffer {
      val address = segment.toRawLongValue()
      return AudioBuffer(Pointer(address))
    }

    public override fun toNative(obj: AudioBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
