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

@ABIMarker(ToolTipTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.ToolTipTemplateSettings;{d4388247-0ec4-4506-affd-afac2225b48c})")
@WinRTByReference(brClass = ToolTipTemplateSettings.ByReference::class)
public class ToolTipTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IToolTipTemplateSettings.WithDefault, IWinRTObject {
  private val __33031780_Interface: IToolTipTemplateSettings.WithDefault by lazy {
    as_33031780()
  }


  public override val __33031780_Ptr: JNAPointer? by lazy {
    __33031780_Interface.__33031780_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__33031780_Interface)

  private fun as_33031780(): IToolTipTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IToolTipTemplateSettings.ABI.makeIToolTipTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToolTipTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToolTipTemplateSettings.ABI.makeIToolTipTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToolTipTemplateSettings> {
    public override fun getValue() = ToolTipTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ToolTipTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToolTipTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToolTipTemplateSettings {
      val address = segment.toRawLongValue()
      return ToolTipTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ToolTipTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
