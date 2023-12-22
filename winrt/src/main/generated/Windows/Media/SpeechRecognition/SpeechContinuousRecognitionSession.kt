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

@ABIMarker(SpeechContinuousRecognitionSession.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechContinuousRecognitionSession;{6a213c04-6614-49f8-99a2-b5e9b3a085c8})")
@WinRTByReference(brClass = SpeechContinuousRecognitionSession.ByReference::class)
public class SpeechContinuousRecognitionSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechContinuousRecognitionSession.WithDefault, IWinRTObject {
  private val __1712045735_Interface: ISpeechContinuousRecognitionSession.WithDefault by lazy {
    as_1712045735()
  }


  public override val __1712045735_Ptr: JNAPointer? by lazy {
    __1712045735_Interface.__1712045735_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1712045735_Interface)

  private fun as_1712045735(): ISpeechContinuousRecognitionSession.WithDefault {
    if(pointer == NULL) {
      return(ISpeechContinuousRecognitionSession.ABI.makeISpeechContinuousRecognitionSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechContinuousRecognitionSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechContinuousRecognitionSession.ABI.makeISpeechContinuousRecognitionSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechContinuousRecognitionSession> {
    public override fun getValue() = SpeechContinuousRecognitionSession(pointer.getPointer(0))

    public fun setValue(value: SpeechContinuousRecognitionSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechContinuousRecognitionSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechContinuousRecognitionSession {
      val address = segment.toRawLongValue()
      return SpeechContinuousRecognitionSession(Pointer(address))
    }

    public override fun toNative(obj: SpeechContinuousRecognitionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
