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

@ABIMarker(MenuFlyoutPresenterTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.MenuFlyoutPresenterTemplateSettings;{d68fd00d-629d-4349-ac51-b877c80983b8})")
@WinRTByReference(brClass = MenuFlyoutPresenterTemplateSettings.ByReference::class)
public class MenuFlyoutPresenterTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMenuFlyoutPresenterTemplateSettings.WithDefault, IWinRTObject {
  private val __540246513_Interface: IMenuFlyoutPresenterTemplateSettings.WithDefault by lazy {
    as_540246513()
  }


  public override val __540246513_Ptr: JNAPointer? by lazy {
    __540246513_Interface.__540246513_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__540246513_Interface)

  private fun as_540246513(): IMenuFlyoutPresenterTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutPresenterTemplateSettings.ABI.makeIMenuFlyoutPresenterTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutPresenterTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutPresenterTemplateSettings.ABI.makeIMenuFlyoutPresenterTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutPresenterTemplateSettings> {
    public override fun getValue() = MenuFlyoutPresenterTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutPresenterTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutPresenterTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutPresenterTemplateSettings {
      val address = segment.toRawLongValue()
      return MenuFlyoutPresenterTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutPresenterTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
