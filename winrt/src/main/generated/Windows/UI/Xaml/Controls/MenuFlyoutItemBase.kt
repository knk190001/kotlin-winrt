package Windows.UI.Xaml.Controls

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

@ABIMarker(MenuFlyoutItemBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuFlyoutItemBase;{f9b56047-8da6-4730-9208-144125c6b396})")
@WinRTByReference(brClass = MenuFlyoutItemBase.ByReference::class)
public open class MenuFlyoutItemBase(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMenuFlyoutItemBase.WithDefault, IWinRTObject {
  private val __1031402490_Interface: IMenuFlyoutItemBase.WithDefault by lazy {
    as_1031402490()
  }


  public override val __1031402490_Ptr: JNAPointer? by lazy {
    __1031402490_Interface.__1031402490_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1031402490_Interface)

  private fun as_1031402490(): IMenuFlyoutItemBase.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutItemBase.ABI.makeIMenuFlyoutItemBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutItemBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutItemBase.ABI.makeIMenuFlyoutItemBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutItemBase> {
    public override fun getValue() = MenuFlyoutItemBase(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutItemBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutItemBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutItemBase {
      val address = segment.toRawLongValue()
      return MenuFlyoutItemBase(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutItemBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
