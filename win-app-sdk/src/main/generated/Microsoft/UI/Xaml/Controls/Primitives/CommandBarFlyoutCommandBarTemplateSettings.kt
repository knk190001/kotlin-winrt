package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(CommandBarFlyoutCommandBarTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CommandBarFlyoutCommandBarTemplateSettings;{533cc5ca-dcf7-5f9d-a460-934a883acdc1})")
@WinRTByReference(brClass = CommandBarFlyoutCommandBarTemplateSettings.ByReference::class)
public class CommandBarFlyoutCommandBarTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICommandBarFlyoutCommandBarTemplateSettings.WithDefault, IWinRTObject {
  private val __440593927_Interface: ICommandBarFlyoutCommandBarTemplateSettings.WithDefault by
      lazy {
    as_440593927()
  }


  public override val __440593927_Ptr: JNAPointer? by lazy {
    __440593927_Interface.__440593927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__440593927_Interface)

  private fun as_440593927(): ICommandBarFlyoutCommandBarTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarFlyoutCommandBarTemplateSettings.ABI.makeICommandBarFlyoutCommandBarTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarFlyoutCommandBarTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarFlyoutCommandBarTemplateSettings.ABI.makeICommandBarFlyoutCommandBarTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandBarFlyoutCommandBarTemplateSettings> {
    public override fun getValue() =
        CommandBarFlyoutCommandBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: CommandBarFlyoutCommandBarTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBarFlyoutCommandBarTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CommandBarFlyoutCommandBarTemplateSettings {
      val address = segment.toRawLongValue()
      return CommandBarFlyoutCommandBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: CommandBarFlyoutCommandBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
