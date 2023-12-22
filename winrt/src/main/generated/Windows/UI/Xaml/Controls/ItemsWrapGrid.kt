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

@ABIMarker(ItemsWrapGrid.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemsWrapGrid;{ddfe6b5f-ba88-4a7d-8a5b-e58caf0f4e2d})")
@WinRTByReference(brClass = ItemsWrapGrid.ByReference::class)
public class ItemsWrapGrid(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IItemsWrapGrid.WithDefault, IItemsWrapGrid2.WithDefault, IWinRTObject {
  private val __139614196_Interface: IItemsWrapGrid.WithDefault by lazy {
    as_139614196()
  }


  private val __33072830_Interface: IItemsWrapGrid2.WithDefault by lazy {
    as_33072830()
  }


  public override val __139614196_Ptr: JNAPointer? by lazy {
    __139614196_Interface.__139614196_Ptr
  }


  public override val __33072830_Ptr: JNAPointer? by lazy {
    __33072830_Interface.__33072830_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__139614196_Interface, __33072830_Interface)

  public constructor() : this(ABI.activate())

  private fun as_139614196(): IItemsWrapGrid.WithDefault {
    if(pointer == NULL) {
      return(IItemsWrapGrid.ABI.makeIItemsWrapGrid(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsWrapGrid>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsWrapGrid.ABI.makeIItemsWrapGrid(ref.value))
  }

  private fun as_33072830(): IItemsWrapGrid2.WithDefault {
    if(pointer == NULL) {
      return(IItemsWrapGrid2.ABI.makeIItemsWrapGrid2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsWrapGrid2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsWrapGrid2.ABI.makeIItemsWrapGrid2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemsWrapGrid>
      {
    public override fun getValue() = ItemsWrapGrid(pointer.getPointer(0))

    public fun setValue(value: ItemsWrapGrid): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsWrapGrid, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IItemsWrapGridStatics_Instance: IItemsWrapGridStatics by lazy {
      createIItemsWrapGridStatics()
    }


    public val IItemsWrapGridStatics2_Instance: IItemsWrapGridStatics2 by lazy {
      createIItemsWrapGridStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsWrapGrid".toHandle(),
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

    public fun createIItemsWrapGridStatics(): IItemsWrapGridStatics {
      val refiid = Guid.REFIID(IItemsWrapGridStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsWrapGrid".toHandle(),refiid,interfacePtr)
      val result = IItemsWrapGridStatics.ABI.makeIItemsWrapGridStatics(interfacePtr.value)
      return result
    }

    public fun createIItemsWrapGridStatics2(): IItemsWrapGridStatics2 {
      val refiid = Guid.REFIID(IItemsWrapGridStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsWrapGrid".toHandle(),refiid,interfacePtr)
      val result = IItemsWrapGridStatics2.ABI.makeIItemsWrapGridStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ItemsWrapGrid {
      val address = segment.toRawLongValue()
      return ItemsWrapGrid(Pointer(address))
    }

    public override fun toNative(obj: ItemsWrapGrid): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_GroupPaddingProperty() =
        ABI.IItemsWrapGridStatics_Instance.get_GroupPaddingProperty()

    public fun get_OrientationProperty() =
        ABI.IItemsWrapGridStatics_Instance.get_OrientationProperty()

    public fun get_MaximumRowsOrColumnsProperty() =
        ABI.IItemsWrapGridStatics_Instance.get_MaximumRowsOrColumnsProperty()

    public fun get_ItemWidthProperty() = ABI.IItemsWrapGridStatics_Instance.get_ItemWidthProperty()

    public fun get_ItemHeightProperty() =
        ABI.IItemsWrapGridStatics_Instance.get_ItemHeightProperty()

    public fun get_GroupHeaderPlacementProperty() =
        ABI.IItemsWrapGridStatics_Instance.get_GroupHeaderPlacementProperty()

    public fun get_CacheLengthProperty() =
        ABI.IItemsWrapGridStatics_Instance.get_CacheLengthProperty()

    public fun get_AreStickyGroupHeadersEnabledProperty() =
        ABI.IItemsWrapGridStatics2_Instance.get_AreStickyGroupHeadersEnabledProperty()
  }
}
