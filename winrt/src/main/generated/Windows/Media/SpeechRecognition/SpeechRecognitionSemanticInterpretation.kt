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

@ABIMarker(SpeechRecognitionSemanticInterpretation.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionSemanticInterpretation;{aae1da9b-7e32-4c1f-89fe-0c65f486f52e})")
@WinRTByReference(brClass = SpeechRecognitionSemanticInterpretation.ByReference::class)
public class SpeechRecognitionSemanticInterpretation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionSemanticInterpretation.WithDefault, IWinRTObject {
  private val __1086900186_Interface: ISpeechRecognitionSemanticInterpretation.WithDefault by lazy {
    as_1086900186()
  }


  public override val __1086900186_Ptr: JNAPointer? by lazy {
    __1086900186_Interface.__1086900186_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1086900186_Interface)

  private fun as_1086900186(): ISpeechRecognitionSemanticInterpretation.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionSemanticInterpretation.ABI.makeISpeechRecognitionSemanticInterpretation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionSemanticInterpretation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionSemanticInterpretation.ABI.makeISpeechRecognitionSemanticInterpretation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionSemanticInterpretation> {
    public override fun getValue() = SpeechRecognitionSemanticInterpretation(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionSemanticInterpretation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionSemanticInterpretation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpeechRecognitionSemanticInterpretation {
      val address = segment.toRawLongValue()
      return SpeechRecognitionSemanticInterpretation(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionSemanticInterpretation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
