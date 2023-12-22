package Windows.Media.Effects

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

@ABIMarker(AudioRenderEffectsManager.ABI::class)
@Signature("rc(Windows.Media.Effects.AudioRenderEffectsManager;{4dc98966-8751-42b2-bfcb-39ca7864bd47})")
@WinRTByReference(brClass = AudioRenderEffectsManager.ByReference::class)
public class AudioRenderEffectsManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioRenderEffectsManager.WithDefault,
    IAudioRenderEffectsManager2.WithDefault, IWinRTObject {
  private val __627286437_Interface: IAudioRenderEffectsManager.WithDefault by lazy {
    as_627286437()
  }


  private val __2028956983_Interface: IAudioRenderEffectsManager2.WithDefault by lazy {
    as_2028956983()
  }


  public override val __627286437_Ptr: JNAPointer? by lazy {
    __627286437_Interface.__627286437_Ptr
  }


  public override val __2028956983_Ptr: JNAPointer? by lazy {
    __2028956983_Interface.__2028956983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__627286437_Interface, __2028956983_Interface)

  private fun as_627286437(): IAudioRenderEffectsManager.WithDefault {
    if(pointer == NULL) {
      return(IAudioRenderEffectsManager.ABI.makeIAudioRenderEffectsManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioRenderEffectsManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioRenderEffectsManager.ABI.makeIAudioRenderEffectsManager(ref.value))
  }

  private fun as_2028956983(): IAudioRenderEffectsManager2.WithDefault {
    if(pointer == NULL) {
      return(IAudioRenderEffectsManager2.ABI.makeIAudioRenderEffectsManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioRenderEffectsManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioRenderEffectsManager2.ABI.makeIAudioRenderEffectsManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioRenderEffectsManager> {
    public override fun getValue() = AudioRenderEffectsManager(pointer.getPointer(0))

    public fun setValue(value: AudioRenderEffectsManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioRenderEffectsManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioRenderEffectsManager {
      val address = segment.toRawLongValue()
      return AudioRenderEffectsManager(Pointer(address))
    }

    public override fun toNative(obj: AudioRenderEffectsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
