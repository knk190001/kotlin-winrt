package Windows.UI.UIAutomation

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

@ABIMarker(AutomationTextRange.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.AutomationTextRange;{7e101b65-40d3-5994-85a9-0a0cb9a4ec98})")
@WinRTByReference(brClass = AutomationTextRange.ByReference::class)
public class AutomationTextRange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationTextRange.WithDefault, IWinRTObject {
  private val __1852308234_Interface: IAutomationTextRange.WithDefault by lazy {
    as_1852308234()
  }


  public override val __1852308234_Ptr: JNAPointer? by lazy {
    __1852308234_Interface.__1852308234_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1852308234_Interface)

  private fun as_1852308234(): IAutomationTextRange.WithDefault {
    if(pointer == NULL) {
      return(IAutomationTextRange.ABI.makeIAutomationTextRange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationTextRange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationTextRange.ABI.makeIAutomationTextRange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationTextRange> {
    public override fun getValue() = AutomationTextRange(pointer.getPointer(0))

    public fun setValue(value: AutomationTextRange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationTextRange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutomationTextRange {
      val address = segment.toRawLongValue()
      return AutomationTextRange(Pointer(address))
    }

    public override fun toNative(obj: AutomationTextRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
