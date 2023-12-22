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

@ABIMarker(SpeechContinuousRecognitionCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechContinuousRecognitionCompletedEventArgs;{e3d069bb-e30c-5e18-424b-7fbe81f8fbd0})")
@WinRTByReference(brClass = SpeechContinuousRecognitionCompletedEventArgs.ByReference::class)
public class SpeechContinuousRecognitionCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechContinuousRecognitionCompletedEventArgs.WithDefault, IWinRTObject {
  private val __626302487_Interface: ISpeechContinuousRecognitionCompletedEventArgs.WithDefault by
      lazy {
    as_626302487()
  }


  public override val __626302487_Ptr: JNAPointer? by lazy {
    __626302487_Interface.__626302487_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__626302487_Interface)

  private fun as_626302487(): ISpeechContinuousRecognitionCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpeechContinuousRecognitionCompletedEventArgs.ABI.makeISpeechContinuousRecognitionCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechContinuousRecognitionCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechContinuousRecognitionCompletedEventArgs.ABI.makeISpeechContinuousRecognitionCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechContinuousRecognitionCompletedEventArgs> {
    public override fun getValue() =
        SpeechContinuousRecognitionCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpeechContinuousRecognitionCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechContinuousRecognitionCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpeechContinuousRecognitionCompletedEventArgs {
      val address = segment.toRawLongValue()
      return SpeechContinuousRecognitionCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpeechContinuousRecognitionCompletedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
