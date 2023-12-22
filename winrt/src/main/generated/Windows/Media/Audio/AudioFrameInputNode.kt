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

@ABIMarker(AudioFrameInputNode.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioFrameInputNode;{01b266c7-fd96-4ff5-a3c5-d27a9bf44237})")
@WinRTByReference(brClass = AudioFrameInputNode.ByReference::class)
public class AudioFrameInputNode(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioFrameInputNode.WithDefault, IAudioInputNode.WithDefault,
    IAudioNode.WithDefault, IClosable.WithDefault, IAudioInputNode2.WithDefault, IWinRTObject {
  private val __1762342931_Interface: IAudioFrameInputNode.WithDefault by lazy {
    as_1762342931()
  }


  private val __801834558_Interface: IAudioInputNode.WithDefault by lazy {
    as_801834558()
  }


  private val __1950949744_Interface: IAudioNode.WithDefault by lazy {
    as_1950949744()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __912932428_Interface: IAudioInputNode2.WithDefault by lazy {
    as_912932428()
  }


  public override val __1762342931_Ptr: JNAPointer? by lazy {
    __1762342931_Interface.__1762342931_Ptr
  }


  public override val __801834558_Ptr: JNAPointer? by lazy {
    __801834558_Interface.__801834558_Ptr
  }


  public override val __1950949744_Ptr: JNAPointer? by lazy {
    __1950949744_Interface.__1950949744_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __912932428_Ptr: JNAPointer? by lazy {
    __912932428_Interface.__912932428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1762342931_Interface, __801834558_Interface, __1950949744_Interface,
        __1260617006_Interface, __912932428_Interface)

  private fun as_1762342931(): IAudioFrameInputNode.WithDefault {
    if(pointer == NULL) {
      return(IAudioFrameInputNode.ABI.makeIAudioFrameInputNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioFrameInputNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioFrameInputNode.ABI.makeIAudioFrameInputNode(ref.value))
  }

  private fun as_801834558(): IAudioInputNode.WithDefault {
    if(pointer == NULL) {
      return(IAudioInputNode.ABI.makeIAudioInputNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioInputNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioInputNode.ABI.makeIAudioInputNode(ref.value))
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

  private fun as_912932428(): IAudioInputNode2.WithDefault {
    if(pointer == NULL) {
      return(IAudioInputNode2.ABI.makeIAudioInputNode2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioInputNode2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioInputNode2.ABI.makeIAudioInputNode2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioFrameInputNode> {
    public override fun getValue() = AudioFrameInputNode(pointer.getPointer(0))

    public fun setValue(value: AudioFrameInputNode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioFrameInputNode, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioFrameInputNode {
      val address = segment.toRawLongValue()
      return AudioFrameInputNode(Pointer(address))
    }

    public override fun toNative(obj: AudioFrameInputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
