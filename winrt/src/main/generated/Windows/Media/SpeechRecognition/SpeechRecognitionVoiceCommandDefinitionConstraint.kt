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

@ABIMarker(SpeechRecognitionVoiceCommandDefinitionConstraint.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionVoiceCommandDefinitionConstraint;{f2791c2b-1ef4-4ae7-9d77-b6ff10b8a3c2})")
@WinRTByReference(brClass = SpeechRecognitionVoiceCommandDefinitionConstraint.ByReference::class)
public class SpeechRecognitionVoiceCommandDefinitionConstraint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionVoiceCommandDefinitionConstraint.WithDefault,
    ISpeechRecognitionConstraint.WithDefault, IWinRTObject {
  private val __159737259_Interface: ISpeechRecognitionVoiceCommandDefinitionConstraint.WithDefault
      by lazy {
    as_159737259()
  }


  private val __411817545_Interface: ISpeechRecognitionConstraint.WithDefault by lazy {
    as_411817545()
  }


  public override val __159737259_Ptr: JNAPointer? by lazy {
    __159737259_Interface.__159737259_Ptr
  }


  public override val __411817545_Ptr: JNAPointer? by lazy {
    __411817545_Interface.__411817545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__159737259_Interface, __411817545_Interface)

  private fun as_159737259(): ISpeechRecognitionVoiceCommandDefinitionConstraint.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionVoiceCommandDefinitionConstraint.ABI.makeISpeechRecognitionVoiceCommandDefinitionConstraint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionVoiceCommandDefinitionConstraint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionVoiceCommandDefinitionConstraint.ABI.makeISpeechRecognitionVoiceCommandDefinitionConstraint(ref.value))
  }

  private fun as_411817545(): ISpeechRecognitionConstraint.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionConstraint.ABI.makeISpeechRecognitionConstraint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionConstraint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionConstraint.ABI.makeISpeechRecognitionConstraint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionVoiceCommandDefinitionConstraint> {
    public override fun getValue() =
        SpeechRecognitionVoiceCommandDefinitionConstraint(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionVoiceCommandDefinitionConstraint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionVoiceCommandDefinitionConstraint, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpeechRecognitionVoiceCommandDefinitionConstraint {
      val address = segment.toRawLongValue()
      return SpeechRecognitionVoiceCommandDefinitionConstraint(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionVoiceCommandDefinitionConstraint):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
