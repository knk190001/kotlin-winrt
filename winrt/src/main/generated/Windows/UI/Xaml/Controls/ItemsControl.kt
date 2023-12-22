package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IItemsControlFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(ItemsControl.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemsControl;{f4a91dd8-d979-4381-8652-bda0342a765e})")
@WinRTByReference(brClass = ItemsControl.ByReference::class)
public open class ItemsControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IItemsControl.WithDefault, IItemsControl2.WithDefault, IItemsControl3.WithDefault,
    IItemsControlOverrides.WithDefault, IItemContainerMapping.WithDefault, IWinRTObject {
  private val __1193611367_Interface: IItemsControl.WithDefault by lazy {
    as_1193611367()
  }


  private val __1652753337_Interface: IItemsControl2.WithDefault by lazy {
    as_1652753337()
  }


  private val __1652753338_Interface: IItemsControl3.WithDefault by lazy {
    as_1652753338()
  }


  private val __2007304846_Interface: IItemsControlOverrides.WithDefault by lazy {
    as_2007304846()
  }


  private val __1577324452_Interface: IItemContainerMapping.WithDefault by lazy {
    as_1577324452()
  }


  public override val __1193611367_Ptr: JNAPointer? by lazy {
    __1193611367_Interface.__1193611367_Ptr
  }


  public override val __1652753337_Ptr: JNAPointer? by lazy {
    __1652753337_Interface.__1652753337_Ptr
  }


  public override val __1652753338_Ptr: JNAPointer? by lazy {
    __1652753338_Interface.__1652753338_Ptr
  }


  public override val __2007304846_Ptr: JNAPointer? by lazy {
    __2007304846_Interface.__2007304846_Ptr
  }


  public override val __1577324452_Ptr: JNAPointer? by lazy {
    __1577324452_Interface.__1577324452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1193611367_Interface, __1652753337_Interface, __1652753338_Interface,
        __2007304846_Interface, __1577324452_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1193611367(): IItemsControl.WithDefault {
    if(pointer == NULL) {
      return(IItemsControl.ABI.makeIItemsControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControl.ABI.makeIItemsControl(ref.value))
  }

  private fun as_1652753337(): IItemsControl2.WithDefault {
    if(pointer == NULL) {
      return(IItemsControl2.ABI.makeIItemsControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControl2.ABI.makeIItemsControl2(ref.value))
  }

  private fun as_1652753338(): IItemsControl3.WithDefault {
    if(pointer == NULL) {
      return(IItemsControl3.ABI.makeIItemsControl3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControl3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControl3.ABI.makeIItemsControl3(ref.value))
  }

  private fun as_2007304846(): IItemsControlOverrides.WithDefault {
    if(pointer == NULL) {
      return(IItemsControlOverrides.ABI.makeIItemsControlOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControlOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControlOverrides.ABI.makeIItemsControlOverrides(ref.value))
  }

  private fun as_1577324452(): IItemContainerMapping.WithDefault {
    if(pointer == NULL) {
      return(IItemContainerMapping.ABI.makeIItemContainerMapping(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainerMapping>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainerMapping.ABI.makeIItemContainerMapping(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemsControl> {
    public override fun getValue() = ItemsControl(pointer.getPointer(0))

    public fun setValue(value: ItemsControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsControl, MemoryAddress> {
    public val IItemsControlStatics_Instance: IItemsControlStatics by lazy {
      createIItemsControlStatics()
    }


    public val IItemsControlFactory_Instance: IItemsControlFactory by lazy {
      createIItemsControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemsControlStatics(): IItemsControlStatics {
      val refiid = Guid.REFIID(IItemsControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsControl".toHandle(),refiid,interfacePtr)
      val result = IItemsControlStatics.ABI.makeIItemsControlStatics(interfacePtr.value)
      return result
    }

    public fun createIItemsControlFactory(): IItemsControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsControl".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemsControlFactory.ABI.makeIItemsControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IItemsControlFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemsControl {
      val address = segment.toRawLongValue()
      return ItemsControl(Pointer(address))
    }

    public override fun toNative(obj: ItemsControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsSourceProperty() =
        ABI.IItemsControlStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IItemsControlStatics_Instance.get_ItemTemplateProperty()

    public fun get_ItemTemplateSelectorProperty() =
        ABI.IItemsControlStatics_Instance.get_ItemTemplateSelectorProperty()

    public fun get_ItemsPanelProperty() = ABI.IItemsControlStatics_Instance.get_ItemsPanelProperty()

    public fun get_DisplayMemberPathProperty() =
        ABI.IItemsControlStatics_Instance.get_DisplayMemberPathProperty()

    public fun get_ItemContainerStyleProperty() =
        ABI.IItemsControlStatics_Instance.get_ItemContainerStyleProperty()

    public fun get_ItemContainerStyleSelectorProperty() =
        ABI.IItemsControlStatics_Instance.get_ItemContainerStyleSelectorProperty()

    public fun get_ItemContainerTransitionsProperty() =
        ABI.IItemsControlStatics_Instance.get_ItemContainerTransitionsProperty()

    public fun get_GroupStyleSelectorProperty() =
        ABI.IItemsControlStatics_Instance.get_GroupStyleSelectorProperty()

    public fun get_IsGroupingProperty() = ABI.IItemsControlStatics_Instance.get_IsGroupingProperty()

    public fun GetItemsOwner(element: DependencyObject) =
        ABI.IItemsControlStatics_Instance.GetItemsOwner(element)

    public fun ItemsControlFromItemContainer(container: DependencyObject) =
        ABI.IItemsControlStatics_Instance.ItemsControlFromItemContainer(container)
  }
}
