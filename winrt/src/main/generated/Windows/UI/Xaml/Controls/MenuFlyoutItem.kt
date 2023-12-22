package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMenuFlyoutItemFactory.ABI.IID
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

@ABIMarker(MenuFlyoutItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MenuFlyoutItem;{160775cf-b598-44af-a488-c3ce2af6d3f0})")
@WinRTByReference(brClass = MenuFlyoutItem.ByReference::class)
public open class MenuFlyoutItem(
  ptr: JNAPointer? = NULL
) : MenuFlyoutItemBase(ptr), IMenuFlyoutItem.WithDefault, IMenuFlyoutItem2.WithDefault,
    IMenuFlyoutItem3.WithDefault, IWinRTObject {
  private val __2072667529_Interface: IMenuFlyoutItem.WithDefault by lazy {
    as_2072667529()
  }


  private val __171815991_Interface: IMenuFlyoutItem2.WithDefault by lazy {
    as_171815991()
  }


  private val __171815990_Interface: IMenuFlyoutItem3.WithDefault by lazy {
    as_171815990()
  }


  public override val __2072667529_Ptr: JNAPointer? by lazy {
    __2072667529_Interface.__2072667529_Ptr
  }


  public override val __171815991_Ptr: JNAPointer? by lazy {
    __171815991_Interface.__171815991_Ptr
  }


  public override val __171815990_Ptr: JNAPointer? by lazy {
    __171815990_Interface.__171815990_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2072667529_Interface, __171815991_Interface, __171815990_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2072667529(): IMenuFlyoutItem.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutItem.ABI.makeIMenuFlyoutItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutItem.ABI.makeIMenuFlyoutItem(ref.value))
  }

  private fun as_171815991(): IMenuFlyoutItem2.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutItem2.ABI.makeIMenuFlyoutItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutItem2.ABI.makeIMenuFlyoutItem2(ref.value))
  }

  private fun as_171815990(): IMenuFlyoutItem3.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutItem3.ABI.makeIMenuFlyoutItem3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutItem3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutItem3.ABI.makeIMenuFlyoutItem3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MenuFlyoutItem>
      {
    public override fun getValue() = MenuFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutItem, MemoryAddress> {
    public val IMenuFlyoutItemStatics3_Instance: IMenuFlyoutItemStatics3 by lazy {
      createIMenuFlyoutItemStatics3()
    }


    public val IMenuFlyoutItemStatics2_Instance: IMenuFlyoutItemStatics2 by lazy {
      createIMenuFlyoutItemStatics2()
    }


    public val IMenuFlyoutItemStatics_Instance: IMenuFlyoutItemStatics by lazy {
      createIMenuFlyoutItemStatics()
    }


    public val IMenuFlyoutItemFactory_Instance: IMenuFlyoutItemFactory by lazy {
      createIMenuFlyoutItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutItemStatics3(): IMenuFlyoutItemStatics3 {
      val refiid = Guid.REFIID(IMenuFlyoutItemStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutItem".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutItemStatics3.ABI.makeIMenuFlyoutItemStatics3(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutItemStatics2(): IMenuFlyoutItemStatics2 {
      val refiid = Guid.REFIID(IMenuFlyoutItemStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutItem".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutItemStatics2.ABI.makeIMenuFlyoutItemStatics2(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutItemStatics(): IMenuFlyoutItemStatics {
      val refiid = Guid.REFIID(IMenuFlyoutItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutItem".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutItemStatics.ABI.makeIMenuFlyoutItemStatics(interfacePtr.value)
      return result
    }

    public fun createIMenuFlyoutItemFactory(): IMenuFlyoutItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MenuFlyoutItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuFlyoutItemFactory.ABI.makeIMenuFlyoutItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuFlyoutItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutItem {
      val address = segment.toRawLongValue()
      return MenuFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeyboardAcceleratorTextOverrideProperty() =
        ABI.IMenuFlyoutItemStatics3_Instance.get_KeyboardAcceleratorTextOverrideProperty()

    public fun get_IconProperty() = ABI.IMenuFlyoutItemStatics2_Instance.get_IconProperty()

    public fun get_TextProperty() = ABI.IMenuFlyoutItemStatics_Instance.get_TextProperty()

    public fun get_CommandProperty() = ABI.IMenuFlyoutItemStatics_Instance.get_CommandProperty()

    public fun get_CommandParameterProperty() =
        ABI.IMenuFlyoutItemStatics_Instance.get_CommandParameterProperty()
  }
}
