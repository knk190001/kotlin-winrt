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

@ABIMarker(VoiceCommandDefinition.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandDefinition;{7972aad0-0974-4979-984b-cb8959cd61ae})")
@WinRTByReference(brClass = VoiceCommandDefinition.ByReference::class)
public class VoiceCommandDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandDefinition.WithDefault, IWinRTObject {
  private val __1928620987_Interface: IVoiceCommandDefinition.WithDefault by lazy {
    as_1928620987()
  }


  public override val __1928620987_Ptr: JNAPointer? by lazy {
    __1928620987_Interface.__1928620987_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1928620987_Interface)

  private fun as_1928620987(): IVoiceCommandDefinition.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandDefinition.ABI.makeIVoiceCommandDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandDefinition.ABI.makeIVoiceCommandDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandDefinition> {
    public override fun getValue() = VoiceCommandDefinition(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandDefinition, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceCommandDefinition {
      val address = segment.toRawLongValue()
      return VoiceCommandDefinition(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
