package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMenuFlyoutFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(MenuFlyout.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuFlyout;{ad3210f1-985b-4171-bbba-67bcc729649b})")
@WinRTByReference(brClass = MenuFlyout.ByReference::class)
public open class MenuFlyout(
  ptr: JNAPointer? = NULL
) : FlyoutBase(ptr), IMenuFlyout.WithDefault, IMenuFlyout2.WithDefault, IWinRTObject {
  private val __1964773718_Interface: IMenuFlyout.WithDefault by lazy {
    as_1964773718()
  }


  private val __778443164_Interface: IMenuFlyout2.WithDefault by lazy {
    as_778443164()
  }


  public override val __1964773718_Ptr: JNAPointer? by lazy {
    __1964773718_Interface.__1964773718_Ptr
  }


  public override val __778443164_Ptr: JNAPointer? by lazy {
    __778443164_Interface.__778443164_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1964773718_Interface, __778443164_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1964773718(): IMenuFlyout.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyout.ABI.makeIMenuFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyout.ABI.makeIMenuFlyout(ref.value))
  }

  private fun as_778443164(): IMenuFlyout2.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyout2.ABI.makeIMenuFlyout2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyout2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyout2.ABI.makeIMenuFlyout2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MenuFlyout> {
    public override fun getValue() = MenuFlyout(pointer.getPointer(0))

    public fun setValue(value: MenuFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyout, MemoryAddress> {
    public val IMenuFlyoutStatics_Instance: IMenuFlyoutStatics by lazy {
      createIMenuFlyoutStatics()
    }


    public val IMenuFlyoutFactory_Instance: IMenuFlyoutFactory by lazy {
      createIMenuFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutStatics(): IMenuFlyoutStatics {
      val refiid = Guid.REFIID(IMenuFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyout".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutStatics.ABI.makeIMenuFlyoutStatics(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutFactory(): IMenuFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuFlyoutFactory.ABI.makeIMenuFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuFlyoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuFlyout {
      val address = segment.toRawLongValue()
      return MenuFlyout(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MenuFlyoutPresenterStyleProperty() =
        ABI.IMenuFlyoutStatics_Instance.get_MenuFlyoutPresenterStyleProperty()
  }
}
