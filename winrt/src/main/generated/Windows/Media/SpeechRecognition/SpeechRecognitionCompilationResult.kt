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

@ABIMarker(SpeechRecognitionCompilationResult.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionCompilationResult;{407e6c5d-6ac7-4da4-9cc1-2fce32cf7489})")
@WinRTByReference(brClass = SpeechRecognitionCompilationResult.ByReference::class)
public class SpeechRecognitionCompilationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionCompilationResult.WithDefault, IWinRTObject {
  private val __1852227116_Interface: ISpeechRecognitionCompilationResult.WithDefault by lazy {
    as_1852227116()
  }


  public override val __1852227116_Ptr: JNAPointer? by lazy {
    __1852227116_Interface.__1852227116_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1852227116_Interface)

  private fun as_1852227116(): ISpeechRecognitionCompilationResult.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionCompilationResult.ABI.makeISpeechRecognitionCompilationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionCompilationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionCompilationResult.ABI.makeISpeechRecognitionCompilationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionCompilationResult> {
    public override fun getValue() = SpeechRecognitionCompilationResult(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionCompilationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionCompilationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechRecognitionCompilationResult {
      val address = segment.toRawLongValue()
      return SpeechRecognitionCompilationResult(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionCompilationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
