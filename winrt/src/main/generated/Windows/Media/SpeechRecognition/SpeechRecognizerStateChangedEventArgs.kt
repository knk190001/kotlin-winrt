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

@ABIMarker(SpeechRecognizerStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognizerStateChangedEventArgs;{563d4f09-ba03-4bad-ad81-ddc6c4dab0c3})")
@WinRTByReference(brClass = SpeechRecognizerStateChangedEventArgs.ByReference::class)
public class SpeechRecognizerStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognizerStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __11801797_Interface: ISpeechRecognizerStateChangedEventArgs.WithDefault by lazy {
    as_11801797()
  }


  public override val __11801797_Ptr: JNAPointer? by lazy {
    __11801797_Interface.__11801797_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__11801797_Interface)

  private fun as_11801797(): ISpeechRecognizerStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognizerStateChangedEventArgs.ABI.makeISpeechRecognizerStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognizerStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognizerStateChangedEventArgs.ABI.makeISpeechRecognizerStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognizerStateChangedEventArgs> {
    public override fun getValue() = SpeechRecognizerStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognizerStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognizerStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechRecognizerStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return SpeechRecognizerStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognizerStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
