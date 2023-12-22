package Windows.ApplicationModel.VoiceCommands

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

@ABIMarker(VoiceCommandConfirmationResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandConfirmationResult;{a022593e-8221-4526-b083-840972262247})")
@WinRTByReference(brClass = VoiceCommandConfirmationResult.ByReference::class)
public class VoiceCommandConfirmationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandConfirmationResult.WithDefault, IWinRTObject {
  private val __1923624540_Interface: IVoiceCommandConfirmationResult.WithDefault by lazy {
    as_1923624540()
  }


  public override val __1923624540_Ptr: JNAPointer? by lazy {
    __1923624540_Interface.__1923624540_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1923624540_Interface)

  private fun as_1923624540(): IVoiceCommandConfirmationResult.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandConfirmationResult.ABI.makeIVoiceCommandConfirmationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandConfirmationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandConfirmationResult.ABI.makeIVoiceCommandConfirmationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandConfirmationResult> {
    public override fun getValue() = VoiceCommandConfirmationResult(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandConfirmationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandConfirmationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceCommandConfirmationResult {
      val address = segment.toRawLongValue()
      return VoiceCommandConfirmationResult(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandConfirmationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
