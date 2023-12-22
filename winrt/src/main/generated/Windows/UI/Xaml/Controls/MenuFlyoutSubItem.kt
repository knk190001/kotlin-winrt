package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(MenuFlyoutSubItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuFlyoutSubItem;{e5386550-fe2c-43e2-a73f-62168f619973})")
@WinRTByReference(brClass = MenuFlyoutSubItem.ByReference::class)
public class MenuFlyoutSubItem(
  ptr: JNAPointer? = NULL
) : MenuFlyoutItemBase(ptr), IMenuFlyoutSubItem.WithDefault, IMenuFlyoutSubItem2.WithDefault,
    IWinRTObject {
  private val __1596455107_Interface: IMenuFlyoutSubItem.WithDefault by lazy {
    as_1596455107()
  }


  private val __2049499285_Interface: IMenuFlyoutSubItem2.WithDefault by lazy {
    as_2049499285()
  }


  public override val __1596455107_Ptr: JNAPointer? by lazy {
    __1596455107_Interface.__1596455107_Ptr
  }


  public override val __2049499285_Ptr: JNAPointer? by lazy {
    __2049499285_Interface.__2049499285_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1596455107_Interface, __2049499285_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1596455107(): IMenuFlyoutSubItem.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutSubItem.ABI.makeIMenuFlyoutSubItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutSubItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutSubItem.ABI.makeIMenuFlyoutSubItem(ref.value))
  }

  private fun as_2049499285(): IMenuFlyoutSubItem2.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutSubItem2.ABI.makeIMenuFlyoutSubItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutSubItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutSubItem2.ABI.makeIMenuFlyoutSubItem2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutSubItem> {
    public override fun getValue() = MenuFlyoutSubItem(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutSubItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutSubItem, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMenuFlyoutSubItemStatics_Instance: IMenuFlyoutSubItemStatics by lazy {
      createIMenuFlyoutSubItemStatics()
    }


    public val IMenuFlyoutSubItemStatics2_Instance: IMenuFlyoutSubItemStatics2 by lazy {
      createIMenuFlyoutSubItemStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutSubItem".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIMenuFlyoutSubItemStatics(): IMenuFlyoutSubItemStatics {
      val refiid = Guid.REFIID(IMenuFlyoutSubItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutSubItem".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutSubItemStatics.ABI.makeIMenuFlyoutSubItemStatics(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutSubItemStatics2(): IMenuFlyoutSubItemStatics2 {
      val refiid = Guid.REFIID(IMenuFlyoutSubItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutSubItem".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutSubItemStatics2.ABI.makeIMenuFlyoutSubItemStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutSubItem {
      val address = segment.toRawLongValue()
      return MenuFlyoutSubItem(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutSubItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TextProperty() = ABI.IMenuFlyoutSubItemStatics_Instance.get_TextProperty()

    public fun get_IconProperty() = ABI.IMenuFlyoutSubItemStatics2_Instance.get_IconProperty()
  }
}
