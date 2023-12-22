package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IMenuFlyoutPresenterFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Controls.MenuFlyoutPresenter;{5c9b4644-e292-5436-86ec-1c0e29f94c2d})")
@WinRTByReference(brClass = MenuFlyoutPresenter.ByReference::class)
public open class MenuFlyoutPresenter(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), IMenuFlyoutPresenter.WithDefault, IWinRTObject {
  private val __1885508199_Interface: IMenuFlyoutPresenter.WithDefault by lazy {
    as_1885508199()
  }


  public override val __1885508199_Ptr: JNAPointer? by lazy {
    __1885508199_Interface.__1885508199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1885508199_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1885508199(): IMenuFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutPresenter.ABI.makeIMenuFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutPresenter.ABI.makeIMenuFlyoutPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutPresenter> {
    public override fun getValue() = MenuFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutPresenter, MemoryAddress> {
    public val IMenuFlyoutPresenterStatics_Instance: IMenuFlyoutPresenterStatics by lazy {
      createIMenuFlyoutPresenterStatics()
    }


    public val IMenuFlyoutPresenterFactory_Instance: IMenuFlyoutPresenterFactory by lazy {
      createIMenuFlyoutPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutPresenterStatics(): IMenuFlyoutPresenterStatics {
      val refiid = Guid.REFIID(IMenuFlyoutPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuFlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IMenuFlyoutPresenterStatics.ABI.makeIMenuFlyoutPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutPresenterFactory(): IMenuFlyoutPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuFlyoutPresenter".toHandle(),refiid,factoryActivatorPtr)
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
        ABI.IMenuFlyoutPresenterStatics_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
