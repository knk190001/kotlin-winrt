package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.IScrollSnapPointsInfo
import Windows.UI.Xaml.FrameworkElement
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

@ABIMarker(ItemsPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemsPresenter;{c271569b-6dca-4e2b-8e14-c55136b02a71})")
@WinRTByReference(brClass = ItemsPresenter.ByReference::class)
public class ItemsPresenter(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IItemsPresenter.WithDefault, IItemsPresenter2.WithDefault,
    IScrollSnapPointsInfo.WithDefault, IWinRTObject {
  private val __831115804_Interface: IItemsPresenter.WithDefault by lazy {
    as_831115804()
  }


  private val __5213902_Interface: IItemsPresenter2.WithDefault by lazy {
    as_5213902()
  }


  private val __1877225636_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1877225636()
  }


  public override val __831115804_Ptr: JNAPointer? by lazy {
    __831115804_Interface.__831115804_Ptr
  }


  public override val __5213902_Ptr: JNAPointer? by lazy {
    __5213902_Interface.__5213902_Ptr
  }


  public override val __1877225636_Ptr: JNAPointer? by lazy {
    __1877225636_Interface.__1877225636_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__831115804_Interface, __5213902_Interface, __1877225636_Interface)

  public constructor() : this(ABI.activate())

  private fun as_831115804(): IItemsPresenter.WithDefault {
    if(pointer == NULL) {
      return(IItemsPresenter.ABI.makeIItemsPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsPresenter.ABI.makeIItemsPresenter(ref.value))
  }

  private fun as_5213902(): IItemsPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IItemsPresenter2.ABI.makeIItemsPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsPresenter2.ABI.makeIItemsPresenter2(ref.value))
  }

  private fun as_1877225636(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ItemsPresenter>
      {
    public override fun getValue() = ItemsPresenter(pointer.getPointer(0))

    public fun setValue(value: ItemsPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsPresenter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IItemsPresenterStatics_Instance: IItemsPresenterStatics by lazy {
      createIItemsPresenterStatics()
    }


    public val IItemsPresenterStatics2_Instance: IItemsPresenterStatics2 by lazy {
      createIItemsPresenterStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsPresenter".toHandle(),
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

    public fun createIItemsPresenterStatics(): IItemsPresenterStatics {
      val refiid = Guid.REFIID(IItemsPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsPresenter".toHandle(),refiid,interfacePtr)
      val result = IItemsPresenterStatics.ABI.makeIItemsPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIItemsPresenterStatics2(): IItemsPresenterStatics2 {
      val refiid = Guid.REFIID(IItemsPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsPresenter".toHandle(),refiid,interfacePtr)
      val result = IItemsPresenterStatics2.ABI.makeIItemsPresenterStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ItemsPresenter {
      val address = segment.toRawLongValue()
      return ItemsPresenter(Pointer(address))
    }

    public override fun toNative(obj: ItemsPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.IItemsPresenterStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IItemsPresenterStatics_Instance.get_HeaderTemplateProperty()

    public fun get_HeaderTransitionsProperty() =
        ABI.IItemsPresenterStatics_Instance.get_HeaderTransitionsProperty()

    public fun get_PaddingProperty() = ABI.IItemsPresenterStatics_Instance.get_PaddingProperty()

    public fun get_FooterProperty() = ABI.IItemsPresenterStatics2_Instance.get_FooterProperty()

    public fun get_FooterTemplateProperty() =
        ABI.IItemsPresenterStatics2_Instance.get_FooterTemplateProperty()

    public fun get_FooterTransitionsProperty() =
        ABI.IItemsPresenterStatics2_Instance.get_FooterTransitionsProperty()
  }
}
