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

@ABIMarker(CommandBarTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CommandBarTemplateSettings;{ae9535f6-1678-5066-90bf-147aa610c5dd})")
@WinRTByReference(brClass = CommandBarTemplateSettings.ByReference::class)
public class CommandBarTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICommandBarTemplateSettings.WithDefault, IWinRTObject {
  private val __175562934_Interface: ICommandBarTemplateSettings.WithDefault by lazy {
    as_175562934()
  }


  public override val __175562934_Ptr: JNAPointer? by lazy {
    __175562934_Interface.__175562934_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__175562934_Interface)

  private fun as_175562934(): ICommandBarTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarTemplateSettings.ABI.makeICommandBarTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarTemplateSettings.ABI.makeICommandBarTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandBarTemplateSettings> {
    public override fun getValue() = CommandBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: CommandBarTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBarTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CommandBarTemplateSettings {
      val address = segment.toRawLongValue()
      return CommandBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: CommandBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
