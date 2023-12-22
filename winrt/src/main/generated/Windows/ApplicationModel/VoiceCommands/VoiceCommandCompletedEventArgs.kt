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

@ABIMarker(VoiceCommandCompletedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandCompletedEventArgs;{c85e675d-fe42-432c-9907-09df9fcf64e8})")
@WinRTByReference(brClass = VoiceCommandCompletedEventArgs.ByReference::class)
public class VoiceCommandCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1310078334_Interface: IVoiceCommandCompletedEventArgs.WithDefault by lazy {
    as_1310078334()
  }


  public override val __1310078334_Ptr: JNAPointer? by lazy {
    __1310078334_Interface.__1310078334_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1310078334_Interface)

  private fun as_1310078334(): IVoiceCommandCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandCompletedEventArgs.ABI.makeIVoiceCommandCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandCompletedEventArgs.ABI.makeIVoiceCommandCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandCompletedEventArgs> {
    public override fun getValue() = VoiceCommandCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceCommandCompletedEventArgs {
      val address = segment.toRawLongValue()
      return VoiceCommandCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
