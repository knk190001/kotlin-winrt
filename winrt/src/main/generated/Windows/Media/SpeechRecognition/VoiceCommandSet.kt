package Windows.Media.SpeechRecognition

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

@ABIMarker(VoiceCommandSet.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.VoiceCommandSet;{0bedda75-46e6-4b11-a088-5c68632899b5})")
@WinRTByReference(brClass = VoiceCommandSet.ByReference::class)
public class VoiceCommandSet(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandSet.WithDefault, IWinRTObject {
  private val __1092715392_Interface: IVoiceCommandSet.WithDefault by lazy {
    as_1092715392()
  }


  public override val __1092715392_Ptr: JNAPointer? by lazy {
    __1092715392_Interface.__1092715392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1092715392_Interface)

  private fun as_1092715392(): IVoiceCommandSet.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandSet.ABI.makeIVoiceCommandSet(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandSet>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandSet.ABI.makeIVoiceCommandSet(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandSet> {
    public override fun getValue() = VoiceCommandSet(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandSet): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandSet, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceCommandSet {
      val address = segment.toRawLongValue()
      return VoiceCommandSet(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandSet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
