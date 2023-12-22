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

@ABIMarker(ExpanderTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ExpanderTemplateSettings;{8f959018-f6b8-5c02-be08-cd196c9fcd2d})")
@WinRTByReference(brClass = ExpanderTemplateSettings.ByReference::class)
public class ExpanderTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IExpanderTemplateSettings.WithDefault, IWinRTObject {
  private val __1015610987_Interface: IExpanderTemplateSettings.WithDefault by lazy {
    as_1015610987()
  }


  public override val __1015610987_Ptr: JNAPointer? by lazy {
    __1015610987_Interface.__1015610987_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1015610987_Interface)

  private fun as_1015610987(): IExpanderTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IExpanderTemplateSettings.ABI.makeIExpanderTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpanderTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpanderTemplateSettings.ABI.makeIExpanderTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpanderTemplateSettings> {
    public override fun getValue() = ExpanderTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ExpanderTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpanderTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExpanderTemplateSettings {
      val address = segment.toRawLongValue()
      return ExpanderTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ExpanderTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
