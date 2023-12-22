package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.IScrollSnapPointsInfo
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
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsPresenter;{0b0fbb88-6cb3-5f4e-99bd-879916b460df})")
@WinRTByReference(brClass = ItemsPresenter.ByReference::class)
public class ItemsPresenter(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IItemsPresenter.WithDefault, IScrollSnapPointsInfo.WithDefault,
    IWinRTObject {
  private val __665521_Interface: IItemsPresenter.WithDefault by lazy {
    as_665521()
  }


  private val __1788393063_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1788393063()
  }


  public override val __665521_Ptr: JNAPointer? by lazy {
    __665521_Interface.__665521_Ptr
  }


  public override val __1788393063_Ptr: JNAPointer? by lazy {
    __1788393063_Interface.__1788393063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__665521_Interface, __1788393063_Interface)

  public constructor() : this(ABI.activate())

  private fun as_665521(): IItemsPresenter.WithDefault {
    if(pointer == NULL) {
      return(IItemsPresenter.ABI.makeIItemsPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsPresenter.ABI.makeIItemsPresenter(ref.value))
  }

  private fun as_1788393063(): IScrollSnapPointsInfo.WithDefault {
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


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsPresenter".toHandle(),
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsPresenter".toHandle(),refiid,interfacePtr)
      val result = IItemsPresenterStatics.ABI.makeIItemsPresenterStatics(interfacePtr.value)
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

    public fun get_FooterProperty() = ABI.IItemsPresenterStatics_Instance.get_FooterProperty()

    public fun get_FooterTemplateProperty() =
        ABI.IItemsPresenterStatics_Instance.get_FooterTemplateProperty()

    public fun get_FooterTransitionsProperty() =
        ABI.IItemsPresenterStatics_Instance.get_FooterTransitionsProperty()

    public fun get_PaddingProperty() = ABI.IItemsPresenterStatics_Instance.get_PaddingProperty()
  }
}
