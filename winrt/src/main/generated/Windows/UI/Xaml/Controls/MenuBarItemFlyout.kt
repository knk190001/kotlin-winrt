package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMenuBarItemFlyoutFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(MenuBarItemFlyout.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuBarItemFlyout;{ed00d2d8-b686-55fe-8dbb-f04a640e42ef})")
@WinRTByReference(brClass = MenuBarItemFlyout.ByReference::class)
public open class MenuBarItemFlyout(
  ptr: JNAPointer? = NULL
) : MenuFlyout(ptr), IMenuBarItemFlyout.WithDefault, IWinRTObject {
  private val __1570963546_Interface: IMenuBarItemFlyout.WithDefault by lazy {
    as_1570963546()
  }


  public override val __1570963546_Ptr: JNAPointer? by lazy {
    __1570963546_Interface.__1570963546_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1570963546_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1570963546(): IMenuBarItemFlyout.WithDefault {
    if(pointer == NULL) {
      return(IMenuBarItemFlyout.ABI.makeIMenuBarItemFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuBarItemFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuBarItemFlyout.ABI.makeIMenuBarItemFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuBarItemFlyout> {
    public override fun getValue() = MenuBarItemFlyout(pointer.getPointer(0))

    public fun setValue(value: MenuBarItemFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuBarItemFlyout, MemoryAddress> {
    public val IMenuBarItemFlyoutFactory_Instance: IMenuBarItemFlyoutFactory by lazy {
      createIMenuBarItemFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuBarItemFlyoutFactory(): IMenuBarItemFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuBarItemFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuBarItemFlyoutFactory.ABI.makeIMenuBarItemFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuBarItemFlyoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuBarItemFlyout {
      val address = segment.toRawLongValue()
      return MenuBarItemFlyout(Pointer(address))
    }

    public override fun toNative(obj: MenuBarItemFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
