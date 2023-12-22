package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyObject
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
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.CommandBarTemplateSettings;{61c8f92c-05aa-414a-a2ae-482c5a46c08e})")
@WinRTByReference(brClass = CommandBarTemplateSettings.ByReference::class)
public class CommandBarTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICommandBarTemplateSettings.WithDefault,
    ICommandBarTemplateSettings2.WithDefault, ICommandBarTemplateSettings3.WithDefault,
    ICommandBarTemplateSettings4.WithDefault, IWinRTObject {
  private val __491721601_Interface: ICommandBarTemplateSettings.WithDefault by lazy {
    as_491721601()
  }


  private val __1936499503_Interface: ICommandBarTemplateSettings2.WithDefault by lazy {
    as_1936499503()
  }


  private val __1936499502_Interface: ICommandBarTemplateSettings3.WithDefault by lazy {
    as_1936499502()
  }


  private val __1936499501_Interface: ICommandBarTemplateSettings4.WithDefault by lazy {
    as_1936499501()
  }


  public override val __491721601_Ptr: JNAPointer? by lazy {
    __491721601_Interface.__491721601_Ptr
  }


  public override val __1936499503_Ptr: JNAPointer? by lazy {
    __1936499503_Interface.__1936499503_Ptr
  }


  public override val __1936499502_Ptr: JNAPointer? by lazy {
    __1936499502_Interface.__1936499502_Ptr
  }


  public override val __1936499501_Ptr: JNAPointer? by lazy {
    __1936499501_Interface.__1936499501_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__491721601_Interface, __1936499503_Interface, __1936499502_Interface,
        __1936499501_Interface)

  private fun as_491721601(): ICommandBarTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarTemplateSettings.ABI.makeICommandBarTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarTemplateSettings.ABI.makeICommandBarTemplateSettings(ref.value))
  }

  private fun as_1936499503(): ICommandBarTemplateSettings2.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarTemplateSettings2.ABI.makeICommandBarTemplateSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarTemplateSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarTemplateSettings2.ABI.makeICommandBarTemplateSettings2(ref.value))
  }

  private fun as_1936499502(): ICommandBarTemplateSettings3.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarTemplateSettings3.ABI.makeICommandBarTemplateSettings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarTemplateSettings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarTemplateSettings3.ABI.makeICommandBarTemplateSettings3(ref.value))
  }

  private fun as_1936499501(): ICommandBarTemplateSettings4.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarTemplateSettings4.ABI.makeICommandBarTemplateSettings4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarTemplateSettings4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarTemplateSettings4.ABI.makeICommandBarTemplateSettings4(ref.value))
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
