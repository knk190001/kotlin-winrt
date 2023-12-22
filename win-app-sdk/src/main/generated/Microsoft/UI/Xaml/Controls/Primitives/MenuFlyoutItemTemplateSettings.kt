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

@ABIMarker(MenuFlyoutItemTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.MenuFlyoutItemTemplateSettings;{fa7b8b1f-020d-58ec-8658-f2ce97310051})")
@WinRTByReference(brClass = MenuFlyoutItemTemplateSettings.ByReference::class)
public class MenuFlyoutItemTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMenuFlyoutItemTemplateSettings.WithDefault, IWinRTObject {
  private val __608005157_Interface: IMenuFlyoutItemTemplateSettings.WithDefault by lazy {
    as_608005157()
  }


  public override val __608005157_Ptr: JNAPointer? by lazy {
    __608005157_Interface.__608005157_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__608005157_Interface)

  private fun as_608005157(): IMenuFlyoutItemTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutItemTemplateSettings.ABI.makeIMenuFlyoutItemTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutItemTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutItemTemplateSettings.ABI.makeIMenuFlyoutItemTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutItemTemplateSettings> {
    public override fun getValue() = MenuFlyoutItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutItemTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutItemTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutItemTemplateSettings {
      val address = segment.toRawLongValue()
      return MenuFlyoutItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
