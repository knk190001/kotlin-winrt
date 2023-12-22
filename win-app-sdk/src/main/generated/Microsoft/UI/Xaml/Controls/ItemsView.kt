package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IItemsViewFactory.ABI.IID
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

@ABIMarker(ItemsView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsView;{bbb195d8-6a7f-5a42-9866-25fd5a4473ab})")
@WinRTByReference(brClass = ItemsView.ByReference::class)
public open class ItemsView(
  ptr: JNAPointer? = NULL
) : Control(ptr), IItemsView.WithDefault, IWinRTObject {
  private val __1588754590_Interface: IItemsView.WithDefault by lazy {
    as_1588754590()
  }


  public override val __1588754590_Ptr: JNAPointer? by lazy {
    __1588754590_Interface.__1588754590_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1588754590_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1588754590(): IItemsView.WithDefault {
    if(pointer == NULL) {
      return(IItemsView.ABI.makeIItemsView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsView.ABI.makeIItemsView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemsView> {
    public override fun getValue() = ItemsView(pointer.getPointer(0))

    public fun setValue(value: ItemsView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsView, MemoryAddress> {
    public val IItemsViewStatics_Instance: IItemsViewStatics by lazy {
      createIItemsViewStatics()
    }


    public val IItemsViewFactory_Instance: IItemsViewFactory by lazy {
      createIItemsViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemsViewStatics(): IItemsViewStatics {
      val refiid = Guid.REFIID(IItemsViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsView".toHandle(),refiid,interfacePtr)
      val result = IItemsViewStatics.ABI.makeIItemsViewStatics(interfacePtr.value)
      return result
    }

    public fun createIItemsViewFactory(): IItemsViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemsViewFactory.ABI.makeIItemsViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IItemsViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemsView {
      val address = segment.toRawLongValue()
      return ItemsView(Pointer(address))
    }

    public override fun toNative(obj: ItemsView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsItemInvokedEnabledProperty() =
        ABI.IItemsViewStatics_Instance.get_IsItemInvokedEnabledProperty()

    public fun get_ItemsSourceProperty() = ABI.IItemsViewStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IItemsViewStatics_Instance.get_ItemTemplateProperty()

    public fun get_LayoutProperty() = ABI.IItemsViewStatics_Instance.get_LayoutProperty()

    public fun get_SelectionModeProperty() =
        ABI.IItemsViewStatics_Instance.get_SelectionModeProperty()

    public fun get_ItemTransitionProviderProperty() =
        ABI.IItemsViewStatics_Instance.get_ItemTransitionProviderProperty()

    public fun get_CurrentItemIndexProperty() =
        ABI.IItemsViewStatics_Instance.get_CurrentItemIndexProperty()

    public fun get_SelectedItemProperty() =
        ABI.IItemsViewStatics_Instance.get_SelectedItemProperty()

    public fun get_ScrollViewProperty() = ABI.IItemsViewStatics_Instance.get_ScrollViewProperty()

    public fun get_VerticalScrollControllerProperty() =
        ABI.IItemsViewStatics_Instance.get_VerticalScrollControllerProperty()
  }
}
