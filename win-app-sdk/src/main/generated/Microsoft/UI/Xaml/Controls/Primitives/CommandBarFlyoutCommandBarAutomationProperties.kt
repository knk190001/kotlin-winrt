package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Automation.Peers.AutomationControlType
import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(CommandBarFlyoutCommandBarAutomationProperties.ABI::class)
@WinRTByReference(brClass = CommandBarFlyoutCommandBarAutomationProperties.ByReference::class)
public class CommandBarFlyoutCommandBarAutomationProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandBarFlyoutCommandBarAutomationProperties> {
    public override fun getValue() =
        CommandBarFlyoutCommandBarAutomationProperties(pointer.getPointer(0))

    public fun setValue(value: CommandBarFlyoutCommandBarAutomationProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBarFlyoutCommandBarAutomationProperties, MemoryAddress> {
    public val ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Instance:
        ICommandBarFlyoutCommandBarAutomationPropertiesStatics by lazy {
      createICommandBarFlyoutCommandBarAutomationPropertiesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommandBarFlyoutCommandBarAutomationPropertiesStatics():
        ICommandBarFlyoutCommandBarAutomationPropertiesStatics {
      val refiid = Guid.REFIID(ICommandBarFlyoutCommandBarAutomationPropertiesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CommandBarFlyoutCommandBarAutomationProperties".toHandle(),refiid,interfacePtr)
      val result =
          ICommandBarFlyoutCommandBarAutomationPropertiesStatics.ABI.makeICommandBarFlyoutCommandBarAutomationPropertiesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        CommandBarFlyoutCommandBarAutomationProperties {
      val address = segment.toRawLongValue()
      return CommandBarFlyoutCommandBarAutomationProperties(Pointer(address))
    }

    public override fun toNative(obj: CommandBarFlyoutCommandBarAutomationProperties): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ControlTypeProperty() =
        ABI.ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Instance.get_ControlTypeProperty()

    public fun GetControlType(element: UIElement) =
        ABI.ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Instance.GetControlType(element)

    public fun SetControlType(element: UIElement, value: AutomationControlType) =
        ABI.ICommandBarFlyoutCommandBarAutomationPropertiesStatics_Instance.SetControlType(element,
        value)
  }
}
