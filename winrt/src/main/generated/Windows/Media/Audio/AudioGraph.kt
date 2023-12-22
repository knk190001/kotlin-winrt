package Windows.Media.Audio

import Windows.Foundation.IClosable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioGraph.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioGraph;{1ad46eed-e48c-4e14-9660-2c4f83e9cdd8})")
@WinRTByReference(brClass = AudioGraph.ByReference::class)
public class AudioGraph(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioGraph.WithDefault, IClosable.WithDefault, IAudioGraph2.WithDefault,
    IAudioGraph3.WithDefault, IWinRTObject {
  private val __343522208_Interface: IAudioGraph.WithDefault by lazy {
    as_343522208()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __2059253906_Interface: IAudioGraph2.WithDefault by lazy {
    as_2059253906()
  }


  private val __2059253907_Interface: IAudioGraph3.WithDefault by lazy {
    as_2059253907()
  }


  public override val __343522208_Ptr: JNAPointer? by lazy {
    __343522208_Interface.__343522208_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __2059253906_Ptr: JNAPointer? by lazy {
    __2059253906_Interface.__2059253906_Ptr
  }


  public override val __2059253907_Ptr: JNAPointer? by lazy {
    __2059253907_Interface.__2059253907_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__343522208_Interface, __1260617006_Interface, __2059253906_Interface,
        __2059253907_Interface)

  private fun as_343522208(): IAudioGraph.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraph.ABI.makeIAudioGraph(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraph>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraph.ABI.makeIAudioGraph(ref.value))
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

  private fun as_2059253906(): IAudioGraph2.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraph2.ABI.makeIAudioGraph2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraph2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraph2.ABI.makeIAudioGraph2(ref.value))
  }

  private fun as_2059253907(): IAudioGraph3.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraph3.ABI.makeIAudioGraph3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraph3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraph3.ABI.makeIAudioGraph3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AudioGraph> {
    public override fun getValue() = AudioGraph(pointer.getPointer(0))

    public fun setValue(value: AudioGraph): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioGraph, MemoryAddress> {
    public val IAudioGraphStatics_Instance: IAudioGraphStatics by lazy {
      createIAudioGraphStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioGraphStatics(): IAudioGraphStatics {
      val refiid = Guid.REFIID(IAudioGraphStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioGraph".toHandle(),refiid,interfacePtr)
      val result = IAudioGraphStatics.ABI.makeIAudioGraphStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioGraph {
      val address = segment.toRawLongValue()
      return AudioGraph(Pointer(address))
    }

    public override fun toNative(obj: AudioGraph): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync(settings: AudioGraphSettings) =
        ABI.IAudioGraphStatics_Instance.CreateAsync(settings)
  }
}
