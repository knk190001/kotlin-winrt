package Windows.Media.SpeechSynthesis

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

@ABIMarker(SpeechSynthesizerOptions.ABI::class)
@Signature("rc(Windows.Media.SpeechSynthesis.SpeechSynthesizerOptions;{a0e23871-cc3d-43c9-91b1-ee185324d83d})")
@WinRTByReference(brClass = SpeechSynthesizerOptions.ByReference::class)
public class SpeechSynthesizerOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechSynthesizerOptions.WithDefault, ISpeechSynthesizerOptions2.WithDefault,
    ISpeechSynthesizerOptions3.WithDefault, IWinRTObject {
  private val __828443460_Interface: ISpeechSynthesizerOptions.WithDefault by lazy {
    as_828443460()
  }


  private val __88056466_Interface: ISpeechSynthesizerOptions2.WithDefault by lazy {
    as_88056466()
  }


  private val __88056465_Interface: ISpeechSynthesizerOptions3.WithDefault by lazy {
    as_88056465()
  }


  public override val __828443460_Ptr: JNAPointer? by lazy {
    __828443460_Interface.__828443460_Ptr
  }


  public override val __88056466_Ptr: JNAPointer? by lazy {
    __88056466_Interface.__88056466_Ptr
  }


  public override val __88056465_Ptr: JNAPointer? by lazy {
    __88056465_Interface.__88056465_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__828443460_Interface, __88056466_Interface, __88056465_Interface)

  private fun as_828443460(): ISpeechSynthesizerOptions.WithDefault {
    if(pointer == NULL) {
      return(ISpeechSynthesizerOptions.ABI.makeISpeechSynthesizerOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechSynthesizerOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechSynthesizerOptions.ABI.makeISpeechSynthesizerOptions(ref.value))
  }

  private fun as_88056466(): ISpeechSynthesizerOptions2.WithDefault {
    if(pointer == NULL) {
      return(ISpeechSynthesizerOptions2.ABI.makeISpeechSynthesizerOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechSynthesizerOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechSynthesizerOptions2.ABI.makeISpeechSynthesizerOptions2(ref.value))
  }

  private fun as_88056465(): ISpeechSynthesizerOptions3.WithDefault {
    if(pointer == NULL) {
      return(ISpeechSynthesizerOptions3.ABI.makeISpeechSynthesizerOptions3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechSynthesizerOptions3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechSynthesizerOptions3.ABI.makeISpeechSynthesizerOptions3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechSynthesizerOptions> {
    public override fun getValue() = SpeechSynthesizerOptions(pointer.getPointer(0))

    public fun setValue(value: SpeechSynthesizerOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechSynthesizerOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeechSynthesizerOptions {
      val address = segment.toRawLongValue()
      return SpeechSynthesizerOptions(Pointer(address))
    }

    public override fun toNative(obj: SpeechSynthesizerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
