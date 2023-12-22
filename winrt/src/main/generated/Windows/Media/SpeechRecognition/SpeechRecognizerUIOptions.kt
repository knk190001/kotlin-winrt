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

@ABIMarker(SpeechRecognizerUIOptions.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognizerUIOptions;{7888d641-b92b-44ba-a25f-d1864630641f})")
@WinRTByReference(brClass = SpeechRecognizerUIOptions.ByReference::class)
public class SpeechRecognizerUIOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognizerUIOptions.WithDefault, IWinRTObject {
  private val __2039546587_Interface: ISpeechRecognizerUIOptions.WithDefault by lazy {
    as_2039546587()
  }


  public override val __2039546587_Ptr: JNAPointer? by lazy {
    __2039546587_Interface.__2039546587_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2039546587_Interface)

  private fun as_2039546587(): ISpeechRecognizerUIOptions.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognizerUIOptions.ABI.makeISpeechRecognizerUIOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognizerUIOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognizerUIOptions.ABI.makeISpeechRecognizerUIOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognizerUIOptions> {
    public override fun getValue() = SpeechRecognizerUIOptions(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognizerUIOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognizerUIOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechRecognizerUIOptions {
      val address = segment.toRawLongValue()
      return SpeechRecognizerUIOptions(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognizerUIOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
