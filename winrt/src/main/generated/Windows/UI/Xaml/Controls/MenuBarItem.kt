package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMenuBarItemFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(MenuBarItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuBarItem;{bf643b4c-8125-5b53-a454-06e896a5acee})")
@WinRTByReference(brClass = MenuBarItem.ByReference::class)
public open class MenuBarItem(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMenuBarItem.WithDefault, IWinRTObject {
  private val __1200877003_Interface: IMenuBarItem.WithDefault by lazy {
    as_1200877003()
  }


  public override val __1200877003_Ptr: JNAPointer? by lazy {
    __1200877003_Interface.__1200877003_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1200877003_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1200877003(): IMenuBarItem.WithDefault {
    if(pointer == NULL) {
      return(IMenuBarItem.ABI.makeIMenuBarItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuBarItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuBarItem.ABI.makeIMenuBarItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MenuBarItem> {
    public override fun getValue() = MenuBarItem(pointer.getPointer(0))

    public fun setValue(value: MenuBarItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuBarItem, MemoryAddress> {
    public val IMenuBarItemStatics_Instance: IMenuBarItemStatics by lazy {
      createIMenuBarItemStatics()
    }


    public val IMenuBarItemFactory_Instance: IMenuBarItemFactory by lazy {
      createIMenuBarItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuBarItemStatics(): IMenuBarItemStatics {
      val refiid = Guid.REFIID(IMenuBarItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuBarItem".toHandle(),refiid,interfacePtr)
      val result = IMenuBarItemStatics.ABI.makeIMenuBarItemStatics(interfacePtr.value)
      return result
    }

    public fun createIMenuBarItemFactory(): IMenuBarItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuBarItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuBarItemFactory.ABI.makeIMenuBarItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuBarItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuBarItem {
      val address = segment.toRawLongValue()
      return MenuBarItem(Pointer(address))
    }

    public override fun toNative(obj: MenuBarItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TitleProperty() = ABI.IMenuBarItemStatics_Instance.get_TitleProperty()

    public fun get_ItemsProperty() = ABI.IMenuBarItemStatics_Instance.get_ItemsProperty()
  }
}
