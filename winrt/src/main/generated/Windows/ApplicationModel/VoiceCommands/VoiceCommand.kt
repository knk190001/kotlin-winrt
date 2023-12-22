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

@ABIMarker(VoiceCommand.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommand;{936f5273-ec82-42a6-a55c-d2d79ec6f920})")
@WinRTByReference(brClass = VoiceCommand.ByReference::class)
public class VoiceCommand(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommand.WithDefault, IWinRTObject {
  private val __1503887022_Interface: IVoiceCommand.WithDefault by lazy {
    as_1503887022()
  }


  public override val __1503887022_Ptr: JNAPointer? by lazy {
    __1503887022_Interface.__1503887022_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1503887022_Interface)

  private fun as_1503887022(): IVoiceCommand.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommand.ABI.makeIVoiceCommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommand.ABI.makeIVoiceCommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VoiceCommand> {
    public override fun getValue() = VoiceCommand(pointer.getPointer(0))

    public fun setValue(value: VoiceCommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommand, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceCommand {
      val address = segment.toRawLongValue()
      return VoiceCommand(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
