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

@ABIMarker(SpeechRecognitionQualityDegradingEventArgs.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionQualityDegradingEventArgs;{4fe24105-8c3a-4c7e-8d0a-5bd4f5b14ad8})")
@WinRTByReference(brClass = SpeechRecognitionQualityDegradingEventArgs.ByReference::class)
public class SpeechRecognitionQualityDegradingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionQualityDegradingEventArgs.WithDefault, IWinRTObject {
  private val __725727721_Interface: ISpeechRecognitionQualityDegradingEventArgs.WithDefault by
      lazy {
    as_725727721()
  }


  public override val __725727721_Ptr: JNAPointer? by lazy {
    __725727721_Interface.__725727721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__725727721_Interface)

  private fun as_725727721(): ISpeechRecognitionQualityDegradingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionQualityDegradingEventArgs.ABI.makeISpeechRecognitionQualityDegradingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionQualityDegradingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionQualityDegradingEventArgs.ABI.makeISpeechRecognitionQualityDegradingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionQualityDegradingEventArgs> {
    public override fun getValue() =
        SpeechRecognitionQualityDegradingEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionQualityDegradingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionQualityDegradingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpeechRecognitionQualityDegradingEventArgs {
      val address = segment.toRawLongValue()
      return SpeechRecognitionQualityDegradingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionQualityDegradingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
