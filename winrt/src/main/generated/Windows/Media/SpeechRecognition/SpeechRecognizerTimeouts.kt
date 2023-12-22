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

@ABIMarker(SpeechRecognizerTimeouts.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognizerTimeouts;{2ef76fca-6a3c-4dca-a153-df1bc88a79af})")
@WinRTByReference(brClass = SpeechRecognizerTimeouts.ByReference::class)
public class SpeechRecognizerTimeouts(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognizerTimeouts.WithDefault, IWinRTObject {
  private val __758721_Interface: ISpeechRecognizerTimeouts.WithDefault by lazy {
    as_758721()
  }


  public override val __758721_Ptr: JNAPointer? by lazy {
    __758721_Interface.__758721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__758721_Interface)

  private fun as_758721(): ISpeechRecognizerTimeouts.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognizerTimeouts.ABI.makeISpeechRecognizerTimeouts(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognizerTimeouts>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognizerTimeouts.ABI.makeISpeechRecognizerTimeouts(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognizerTimeouts> {
    public override fun getValue() = SpeechRecognizerTimeouts(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognizerTimeouts): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognizerTimeouts, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechRecognizerTimeouts {
      val address = segment.toRawLongValue()
      return SpeechRecognizerTimeouts(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognizerTimeouts): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
