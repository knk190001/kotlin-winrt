package Microsoft.UI.Xaml

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TriggerAction.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.TriggerAction;{1fa35464-a690-586c-aedf-6c88cac7d14a})")
@WinRTByReference(brClass = TriggerAction.ByReference::class)
public open class TriggerAction(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITriggerAction.WithDefault, IWinRTObject {
  private val __1536280871_Interface: ITriggerAction.WithDefault by lazy {
    as_1536280871()
  }


  public override val __1536280871_Ptr: JNAPointer? by lazy {
    __1536280871_Interface.__1536280871_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1536280871_Interface)

  private fun as_1536280871(): ITriggerAction.WithDefault {
    if(pointer == NULL) {
      return(ITriggerAction.ABI.makeITriggerAction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITriggerAction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITriggerAction.ABI.makeITriggerAction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TriggerAction>
      {
    public override fun getValue() = TriggerAction(pointer.getPointer(0))

    public fun setValue(value: TriggerAction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TriggerAction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TriggerAction {
      val address = segment.toRawLongValue()
      return TriggerAction(Pointer(address))
    }

    public override fun toNative(obj: TriggerAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
