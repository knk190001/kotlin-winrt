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

@ABIMarker(ComboBoxTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ComboBoxTemplateSettings;{f2dc5e7f-8d3f-5c20-b356-af6f1ff8242a})")
@WinRTByReference(brClass = ComboBoxTemplateSettings.ByReference::class)
public class ComboBoxTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IComboBoxTemplateSettings.WithDefault, IWinRTObject {
  private val __1761670261_Interface: IComboBoxTemplateSettings.WithDefault by lazy {
    as_1761670261()
  }


  public override val __1761670261_Ptr: JNAPointer? by lazy {
    __1761670261_Interface.__1761670261_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1761670261_Interface)

  private fun as_1761670261(): IComboBoxTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxTemplateSettings.ABI.makeIComboBoxTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxTemplateSettings.ABI.makeIComboBoxTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComboBoxTemplateSettings> {
    public override fun getValue() = ComboBoxTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ComboBoxTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ComboBoxTemplateSettings {
      val address = segment.toRawLongValue()
      return ComboBoxTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
