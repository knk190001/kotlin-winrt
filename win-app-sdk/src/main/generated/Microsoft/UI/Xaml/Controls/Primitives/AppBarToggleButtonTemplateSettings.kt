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

@ABIMarker(AppBarToggleButtonTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.AppBarToggleButtonTemplateSettings;{32aa9f11-2f5e-57ab-a570-b03bceee835d})")
@WinRTByReference(brClass = AppBarToggleButtonTemplateSettings.ByReference::class)
public class AppBarToggleButtonTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAppBarToggleButtonTemplateSettings.WithDefault, IWinRTObject {
  private val __1920539162_Interface: IAppBarToggleButtonTemplateSettings.WithDefault by lazy {
    as_1920539162()
  }


  public override val __1920539162_Ptr: JNAPointer? by lazy {
    __1920539162_Interface.__1920539162_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1920539162_Interface)

  private fun as_1920539162(): IAppBarToggleButtonTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IAppBarToggleButtonTemplateSettings.ABI.makeIAppBarToggleButtonTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarToggleButtonTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarToggleButtonTemplateSettings.ABI.makeIAppBarToggleButtonTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarToggleButtonTemplateSettings> {
    public override fun getValue() = AppBarToggleButtonTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: AppBarToggleButtonTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarToggleButtonTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBarToggleButtonTemplateSettings {
      val address = segment.toRawLongValue()
      return AppBarToggleButtonTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: AppBarToggleButtonTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
