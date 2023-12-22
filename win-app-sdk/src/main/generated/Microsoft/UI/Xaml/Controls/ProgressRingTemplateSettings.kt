package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ProgressRingTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ProgressRingTemplateSettings;{34020d86-e1c1-5d7c-b223-acd7f862ffd5})")
@WinRTByReference(brClass = ProgressRingTemplateSettings.ByReference::class)
public class ProgressRingTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IProgressRingTemplateSettings.WithDefault, IWinRTObject {
  private val __676146209_Interface: IProgressRingTemplateSettings.WithDefault by lazy {
    as_676146209()
  }


  public override val __676146209_Ptr: JNAPointer? by lazy {
    __676146209_Interface.__676146209_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__676146209_Interface)

  private fun as_676146209(): IProgressRingTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IProgressRingTemplateSettings.ABI.makeIProgressRingTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProgressRingTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProgressRingTemplateSettings.ABI.makeIProgressRingTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProgressRingTemplateSettings> {
    public override fun getValue() = ProgressRingTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ProgressRingTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProgressRingTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProgressRingTemplateSettings {
      val address = segment.toRawLongValue()
      return ProgressRingTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ProgressRingTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
