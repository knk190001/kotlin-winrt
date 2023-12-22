package Windows.ApplicationModel.VoiceCommands

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

@ABIMarker(VoiceCommandDisambiguationResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandDisambiguationResult;{ecc68cfe-c9ac-45df-a8ea-feea08ef9c5e})")
@WinRTByReference(brClass = VoiceCommandDisambiguationResult.ByReference::class)
public class VoiceCommandDisambiguationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandDisambiguationResult.WithDefault, IWinRTObject {
  private val __1877832491_Interface: IVoiceCommandDisambiguationResult.WithDefault by lazy {
    as_1877832491()
  }


  public override val __1877832491_Ptr: JNAPointer? by lazy {
    __1877832491_Interface.__1877832491_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1877832491_Interface)

  private fun as_1877832491(): IVoiceCommandDisambiguationResult.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandDisambiguationResult.ABI.makeIVoiceCommandDisambiguationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandDisambiguationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandDisambiguationResult.ABI.makeIVoiceCommandDisambiguationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandDisambiguationResult> {
    public override fun getValue() = VoiceCommandDisambiguationResult(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandDisambiguationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandDisambiguationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceCommandDisambiguationResult {
      val address = segment.toRawLongValue()
      return VoiceCommandDisambiguationResult(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandDisambiguationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
