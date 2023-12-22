package Microsoft.UI.Xaml.Automation

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

@ABIMarker(AutomationProperty.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.AutomationProperty;{5ca6b2c8-ff86-5a41-aa18-6948fae592cf})")
@WinRTByReference(brClass = AutomationProperty.ByReference::class)
public class AutomationProperty(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutomationProperty.WithDefault, IWinRTObject {
  private val __1077886702_Interface: IAutomationProperty.WithDefault by lazy {
    as_1077886702()
  }


  public override val __1077886702_Ptr: JNAPointer? by lazy {
    __1077886702_Interface.__1077886702_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1077886702_Interface)

  private fun as_1077886702(): IAutomationProperty.WithDefault {
    if(pointer == NULL) {
      return(IAutomationProperty.ABI.makeIAutomationProperty(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutomationProperty>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutomationProperty.ABI.makeIAutomationProperty(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutomationProperty> {
    public override fun getValue() = AutomationProperty(pointer.getPointer(0))

    public fun setValue(value: AutomationProperty): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutomationProperty, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AutomationProperty {
      val address = segment.toRawLongValue()
      return AutomationProperty(Pointer(address))
    }

    public override fun toNative(obj: AutomationProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
