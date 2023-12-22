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

@ABIMarker(AudioEffect.ABI::class)
@Signature("rc(Windows.Media.Effects.AudioEffect;{34aafa51-9207-4055-be93-6e5734a86ae4})")
@WinRTByReference(brClass = AudioEffect.ByReference::class)
public class AudioEffect(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioEffect.WithDefault, IWinRTObject {
  private val __1115604459_Interface: IAudioEffect.WithDefault by lazy {
    as_1115604459()
  }


  public override val __1115604459_Ptr: JNAPointer? by lazy {
    __1115604459_Interface.__1115604459_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1115604459_Interface)

  private fun as_1115604459(): IAudioEffect.WithDefault {
    if(pointer == NULL) {
      return(IAudioEffect.ABI.makeIAudioEffect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioEffect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioEffect.ABI.makeIAudioEffect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AudioEffect> {
    public override fun getValue() = AudioEffect(pointer.getPointer(0))

    public fun setValue(value: AudioEffect): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioEffect, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioEffect {
      val address = segment.toRawLongValue()
      return AudioEffect(Pointer(address))
    }

    public override fun toNative(obj: AudioEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
