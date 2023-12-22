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

@ABIMarker(SpeechRecognitionHypothesis.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis;{7a7b25b0-99c5-4f7d-bf84-10aa1302b634})")
@WinRTByReference(brClass = SpeechRecognitionHypothesis.ByReference::class)
public class SpeechRecognitionHypothesis(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionHypothesis.WithDefault, IWinRTObject {
  private val __1538926072_Interface: ISpeechRecognitionHypothesis.WithDefault by lazy {
    as_1538926072()
  }


  public override val __1538926072_Ptr: JNAPointer? by lazy {
    __1538926072_Interface.__1538926072_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1538926072_Interface)

  private fun as_1538926072(): ISpeechRecognitionHypothesis.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionHypothesis.ABI.makeISpeechRecognitionHypothesis(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionHypothesis>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionHypothesis.ABI.makeISpeechRecognitionHypothesis(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionHypothesis> {
    public override fun getValue() = SpeechRecognitionHypothesis(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionHypothesis): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionHypothesis, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechRecognitionHypothesis {
      val address = segment.toRawLongValue()
      return SpeechRecognitionHypothesis(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionHypothesis): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
