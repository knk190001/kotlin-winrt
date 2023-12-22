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

@ABIMarker(AutomationElement.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.AutomationElement;{a1898370-2c07-56fd-993f-61a72a08058c})")
@WinRTByReference(brClass = AutomationElement.ByReference::class)
public class AutomationElement(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationElement.WithDefault, IWinRTObject {
  private val __856381558_Interface: IAutomationElement.WithDefault by lazy {
    as_856381558()
  }


  public override val __856381558_Ptr: JNAPointer? by lazy {
    __856381558_Interface.__856381558_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__856381558_Interface)

  private fun as_856381558(): IAutomationElement.WithDefault {
    if(pointer == NULL) {
      return(IAutomationElement.ABI.makeIAutomationElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationElement.ABI.makeIAutomationElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationElement> {
    public override fun getValue() = AutomationElement(pointer.getPointer(0))

    public fun setValue(value: AutomationElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationElement, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutomationElement {
      val address = segment.toRawLongValue()
      return AutomationElement(Pointer(address))
    }

    public override fun toNative(obj: AutomationElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
