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

@ABIMarker(SpeechRecognitionResult.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionResult;{4e303157-034e-4652-857e-d0454cc4beec})")
@WinRTByReference(brClass = SpeechRecognitionResult.ByReference::class)
public class SpeechRecognitionResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionResult.WithDefault, ISpeechRecognitionResult2.WithDefault,
    IWinRTObject {
  private val __1293655689_Interface: ISpeechRecognitionResult.WithDefault by lazy {
    as_1293655689()
  }


  private val __1448620745_Interface: ISpeechRecognitionResult2.WithDefault by lazy {
    as_1448620745()
  }


  public override val __1293655689_Ptr: JNAPointer? by lazy {
    __1293655689_Interface.__1293655689_Ptr
  }


  public override val __1448620745_Ptr: JNAPointer? by lazy {
    __1448620745_Interface.__1448620745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1293655689_Interface, __1448620745_Interface)

  private fun as_1293655689(): ISpeechRecognitionResult.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionResult.ABI.makeISpeechRecognitionResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionResult.ABI.makeISpeechRecognitionResult(ref.value))
  }

  private fun as_1448620745(): ISpeechRecognitionResult2.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionResult2.ABI.makeISpeechRecognitionResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionResult2.ABI.makeISpeechRecognitionResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionResult> {
    public override fun getValue() = SpeechRecognitionResult(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechRecognitionResult {
      val address = segment.toRawLongValue()
      return SpeechRecognitionResult(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
