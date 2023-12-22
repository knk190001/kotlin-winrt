package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMenuFlyoutPresenterFactory.ABI.IID
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

@ABIMarker(MenuFlyoutPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuFlyoutPresenter;{906e0304-254e-413f-b219-c7b97f003752})")
@WinRTByReference(brClass = MenuFlyoutPresenter.ByReference::class)
public open class MenuFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), IMenuFlyoutPresenter.WithDefault, IMenuFlyoutPresenter2.WithDefault,
    IMenuFlyoutPresenter3.WithDefault, IWinRTObject {
  private val __1139707406_Interface: IMenuFlyoutPresenter.WithDefault by lazy {
    as_1139707406()
  }


  private val __971191168_Interface: IMenuFlyoutPresenter2.WithDefault by lazy {
    as_971191168()
  }


  private val __971191167_Interface: IMenuFlyoutPresenter3.WithDefault by lazy {
    as_971191167()
  }


  public override val __1139707406_Ptr: JNAPointer? by lazy {
    __1139707406_Interface.__1139707406_Ptr
  }


  public override val __971191168_Ptr: JNAPointer? by lazy {
    __971191168_Interface.__971191168_Ptr
  }


  public override val __971191167_Ptr: JNAPointer? by lazy {
    __971191167_Interface.__971191167_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1139707406_Interface, __971191168_Interface, __971191167_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1139707406(): IMenuFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutPresenter.ABI.makeIMenuFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutPresenter.ABI.makeIMenuFlyoutPresenter(ref.value))
  }

  private fun as_971191168(): IMenuFlyoutPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutPresenter2.ABI.makeIMenuFlyoutPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutPresenter2.ABI.makeIMenuFlyoutPresenter2(ref.value))
  }

  private fun as_971191167(): IMenuFlyoutPresenter3.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutPresenter3.ABI.makeIMenuFlyoutPresenter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutPresenter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutPresenter3.ABI.makeIMenuFlyoutPresenter3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutPresenter> {
    public override fun getValue() = MenuFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutPresenter, MemoryAddress> {
    public val IMenuFlyoutPresenterStatics3_Instance: IMenuFlyoutPresenterStatics3 by lazy {
      createIMenuFlyoutPresenterStatics3()
    }


    public val IMenuFlyoutPresenterFactory_Instance: IMenuFlyoutPresenterFactory by lazy {
      createIMenuFlyoutPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutPresenterStatics3(): IMenuFlyoutPresenterStatics3 {
      val refiid = Guid.REFIID(IMenuFlyoutPresenterStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IMenuFlyoutPresenterStatics3.ABI.makeIMenuFlyoutPresenterStatics3(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutPresenterFactory(): IMenuFlyoutPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuFlyoutPresenterFactory.ABI.makeIMenuFlyoutPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuFlyoutPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutPresenter {
      val address = segment.toRawLongValue()
      return MenuFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDefaultShadowEnabledProperty() =
        ABI.IMenuFlyoutPresenterStatics3_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
