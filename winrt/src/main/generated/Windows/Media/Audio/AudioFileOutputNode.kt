package Windows.Media.Audio

import Windows.Foundation.IClosable
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

@ABIMarker(AudioFileOutputNode.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioFileOutputNode;{50e01980-5166-4093-80f8-ada00089e9cf})")
@WinRTByReference(brClass = AudioFileOutputNode.ByReference::class)
public class AudioFileOutputNode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioFileOutputNode.WithDefault, IAudioNode.WithDefault,
    IClosable.WithDefault, IWinRTObject {
  private val __829392083_Interface: IAudioFileOutputNode.WithDefault by lazy {
    as_829392083()
  }


  private val __1950949744_Interface: IAudioNode.WithDefault by lazy {
    as_1950949744()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __829392083_Ptr: JNAPointer? by lazy {
    __829392083_Interface.__829392083_Ptr
  }


  public override val __1950949744_Ptr: JNAPointer? by lazy {
    __1950949744_Interface.__1950949744_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__829392083_Interface, __1950949744_Interface, __1260617006_Interface)

  private fun as_829392083(): IAudioFileOutputNode.WithDefault {
    if(pointer == NULL) {
      return(IAudioFileOutputNode.ABI.makeIAudioFileOutputNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioFileOutputNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioFileOutputNode.ABI.makeIAudioFileOutputNode(ref.value))
  }

  private fun as_1950949744(): IAudioNode.WithDefault {
    if(pointer == NULL) {
      return(IAudioNode.ABI.makeIAudioNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNode.ABI.makeIAudioNode(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioFileOutputNode> {
    public override fun getValue() = AudioFileOutputNode(pointer.getPointer(0))

    public fun setValue(value: AudioFileOutputNode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioFileOutputNode, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioFileOutputNode {
      val address = segment.toRawLongValue()
      return AudioFileOutputNode(Pointer(address))
    }

    public override fun toNative(obj: AudioFileOutputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
