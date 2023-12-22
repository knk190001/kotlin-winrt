package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IFlyoutPresenterFactory.ABI.IID
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

@ABIMarker(FlyoutPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.FlyoutPresenter;{827d5b79-e37b-46a5-8d44-63a11a580e83})")
@WinRTByReference(brClass = FlyoutPresenter.ByReference::class)
public open class FlyoutPresenter(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IFlyoutPresenter.WithDefault, IFlyoutPresenter2.WithDefault, IWinRTObject {
  private val __508564655_Interface: IFlyoutPresenter.WithDefault by lazy {
    as_508564655()
  }


  private val __1414364929_Interface: IFlyoutPresenter2.WithDefault by lazy {
    as_1414364929()
  }


  public override val __508564655_Ptr: JNAPointer? by lazy {
    __508564655_Interface.__508564655_Ptr
  }


  public override val __1414364929_Ptr: JNAPointer? by lazy {
    __1414364929_Interface.__1414364929_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__508564655_Interface, __1414364929_Interface)

  public constructor() : this(ABI.activate())

  private fun as_508564655(): IFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutPresenter.ABI.makeIFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutPresenter.ABI.makeIFlyoutPresenter(ref.value))
  }

  private fun as_1414364929(): IFlyoutPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutPresenter2.ABI.makeIFlyoutPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutPresenter2.ABI.makeIFlyoutPresenter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlyoutPresenter> {
    public override fun getValue() = FlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: FlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutPresenter, MemoryAddress> {
    public val IFlyoutPresenterStatics2_Instance: IFlyoutPresenterStatics2 by lazy {
      createIFlyoutPresenterStatics2()
    }


    public val IFlyoutPresenterFactory_Instance: IFlyoutPresenterFactory by lazy {
      createIFlyoutPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutPresenterStatics2(): IFlyoutPresenterStatics2 {
      val refiid = Guid.REFIID(IFlyoutPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result = IFlyoutPresenterStatics2.ABI.makeIFlyoutPresenterStatics2(interfacePtr.value)
      return result
    }

    public fun createIFlyoutPresenterFactory(): IFlyoutPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FlyoutPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlyoutPresenterFactory.ABI.makeIFlyoutPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlyoutPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlyoutPresenter {
      val address = segment.toRawLongValue()
      return FlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: FlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDefaultShadowEnabledProperty() =
        ABI.IFlyoutPresenterStatics2_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
