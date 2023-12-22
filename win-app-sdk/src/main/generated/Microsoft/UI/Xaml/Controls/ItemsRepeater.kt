package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IItemsRepeaterFactory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(ItemsRepeater.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsRepeater;{9dabac84-fe81-53d1-a041-7a3befea505f})")
@WinRTByReference(brClass = ItemsRepeater.ByReference::class)
public open class ItemsRepeater(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IItemsRepeater.WithDefault, IItemsRepeater2.WithDefault, IWinRTObject {
  private val __129967871_Interface: IItemsRepeater.WithDefault by lazy {
    as_129967871()
  }


  private val __265963345_Interface: IItemsRepeater2.WithDefault by lazy {
    as_265963345()
  }


  public override val __129967871_Ptr: JNAPointer? by lazy {
    __129967871_Interface.__129967871_Ptr
  }


  public override val __265963345_Ptr: JNAPointer? by lazy {
    __265963345_Interface.__265963345_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__129967871_Interface, __265963345_Interface)

  public constructor() : this(ABI.activate())

  private fun as_129967871(): IItemsRepeater.WithDefault {
    if(pointer == NULL) {
      return(IItemsRepeater.ABI.makeIItemsRepeater(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsRepeater>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsRepeater.ABI.makeIItemsRepeater(ref.value))
  }

  private fun as_265963345(): IItemsRepeater2.WithDefault {
    if(pointer == NULL) {
      return(IItemsRepeater2.ABI.makeIItemsRepeater2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsRepeater2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsRepeater2.ABI.makeIItemsRepeater2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemsRepeater>
      {
    public override fun getValue() = ItemsRepeater(pointer.getPointer(0))

    public fun setValue(value: ItemsRepeater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsRepeater, MemoryAddress> {
    public val IItemsRepeaterStatics2_Instance: IItemsRepeaterStatics2 by lazy {
      createIItemsRepeaterStatics2()
    }


    public val IItemsRepeaterStatics_Instance: IItemsRepeaterStatics by lazy {
      createIItemsRepeaterStatics()
    }


    public val IItemsRepeaterFactory_Instance: IItemsRepeaterFactory by lazy {
      createIItemsRepeaterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemsRepeaterStatics2(): IItemsRepeaterStatics2 {
      val refiid = Guid.REFIID(IItemsRepeaterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsRepeater".toHandle(),refiid,interfacePtr)
      val result = IItemsRepeaterStatics2.ABI.makeIItemsRepeaterStatics2(interfacePtr.value)
      return result
    }

    public fun createIItemsRepeaterStatics(): IItemsRepeaterStatics {
      val refiid = Guid.REFIID(IItemsRepeaterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsRepeater".toHandle(),refiid,interfacePtr)
      val result = IItemsRepeaterStatics.ABI.makeIItemsRepeaterStatics(interfacePtr.value)
      return result
    }

    public fun createIItemsRepeaterFactory(): IItemsRepeaterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsRepeater".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemsRepeaterFactory.ABI.makeIItemsRepeaterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IItemsRepeaterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemsRepeater {
      val address = segment.toRawLongValue()
      return ItemsRepeater(Pointer(address))
    }

    public override fun toNative(obj: ItemsRepeater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemTransitionProviderProperty() =
        ABI.IItemsRepeaterStatics2_Instance.get_ItemTransitionProviderProperty()

    public fun get_ItemsSourceProperty() =
        ABI.IItemsRepeaterStatics_Instance.get_ItemsSourceProperty()

    public fun get_ItemTemplateProperty() =
        ABI.IItemsRepeaterStatics_Instance.get_ItemTemplateProperty()

    public fun get_LayoutProperty() = ABI.IItemsRepeaterStatics_Instance.get_LayoutProperty()

    public fun get_HorizontalCacheLengthProperty() =
        ABI.IItemsRepeaterStatics_Instance.get_HorizontalCacheLengthProperty()

    public fun get_VerticalCacheLengthProperty() =
        ABI.IItemsRepeaterStatics_Instance.get_VerticalCacheLengthProperty()

    public fun get_BackgroundProperty() =
        ABI.IItemsRepeaterStatics_Instance.get_BackgroundProperty()
  }
}
