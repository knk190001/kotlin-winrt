package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IItemsControlFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
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
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsControl;{bf1ccb54-83e2-5b98-acbc-736f876c3d35})")
@WinRTByReference(brClass = ItemsControl.ByReference::class)
public open class ItemsControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IItemsControl.WithDefault, IItemsControlOverrides.WithDefault,
    IItemContainerMapping.WithDefault, IWinRTObject {
  private val __545798340_Interface: IItemsControl.WithDefault by lazy {
    as_545798340()
  }


  private val __1546641859_Interface: IItemsControlOverrides.WithDefault by lazy {
    as_1546641859()
  }


  private val __2010046087_Interface: IItemContainerMapping.WithDefault by lazy {
    as_2010046087()
  }


  public override val __545798340_Ptr: JNAPointer? by lazy {
    __545798340_Interface.__545798340_Ptr
  }


  public override val __1546641859_Ptr: JNAPointer? by lazy {
    __1546641859_Interface.__1546641859_Ptr
  }


  public override val __2010046087_Ptr: JNAPointer? by lazy {
    __2010046087_Interface.__2010046087_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__545798340_Interface, __1546641859_Interface, __2010046087_Interface)

  public constructor() : this(ABI.activate())

  private fun as_545798340(): IItemsControl.WithDefault {
    if(pointer == NULL) {
      return(IItemsControl.ABI.makeIItemsControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControl.ABI.makeIItemsControl(ref.value))
  }

  private fun as_1546641859(): IItemsControlOverrides.WithDefault {
    if(pointer == NULL) {
      return(IItemsControlOverrides.ABI.makeIItemsControlOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsControlOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsControlOverrides.ABI.makeIItemsControlOverrides(ref.value))
  }

  private fun as_2010046087(): IItemContainerMapping.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsControl".toHandle(),refiid,interfacePtr)
      val result = IItemsControlStatics.ABI.makeIItemsControlStatics(interfacePtr.value)
      return result
    }

    public fun createIItemsControlFactory(): IItemsControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsControl".toHandle(),refiid,factoryActivatorPtr)
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
