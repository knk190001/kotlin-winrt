package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Primitives.IFlyoutBaseFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(FlyoutBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.FlyoutBase;{723eea0b-d12e-430d-a9f0-9bb32bbf9913})")
@WinRTByReference(brClass = FlyoutBase.ByReference::class)
public open class FlyoutBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IFlyoutBase.WithDefault, IFlyoutBase2.WithDefault,
    IFlyoutBase3.WithDefault, IFlyoutBase4.WithDefault, IFlyoutBase5.WithDefault,
    IFlyoutBase6.WithDefault, IFlyoutBaseOverrides.WithDefault, IFlyoutBaseOverrides4.WithDefault,
    IWinRTObject {
  private val __873998520_Interface: IFlyoutBase.WithDefault by lazy {
    as_873998520()
  }


  private val __1324150294_Interface: IFlyoutBase2.WithDefault by lazy {
    as_1324150294()
  }


  private val __1324150293_Interface: IFlyoutBase3.WithDefault by lazy {
    as_1324150293()
  }


  private val __1324150292_Interface: IFlyoutBase4.WithDefault by lazy {
    as_1324150292()
  }


  private val __1324150291_Interface: IFlyoutBase5.WithDefault by lazy {
    as_1324150291()
  }


  private val __1324150290_Interface: IFlyoutBase6.WithDefault by lazy {
    as_1324150290()
  }


  private val __1432377279_Interface: IFlyoutBaseOverrides.WithDefault by lazy {
    as_1432377279()
  }


  private val __1454022741_Interface: IFlyoutBaseOverrides4.WithDefault by lazy {
    as_1454022741()
  }


  public override val __873998520_Ptr: JNAPointer? by lazy {
    __873998520_Interface.__873998520_Ptr
  }


  public override val __1324150294_Ptr: JNAPointer? by lazy {
    __1324150294_Interface.__1324150294_Ptr
  }


  public override val __1324150293_Ptr: JNAPointer? by lazy {
    __1324150293_Interface.__1324150293_Ptr
  }


  public override val __1324150292_Ptr: JNAPointer? by lazy {
    __1324150292_Interface.__1324150292_Ptr
  }


  public override val __1324150291_Ptr: JNAPointer? by lazy {
    __1324150291_Interface.__1324150291_Ptr
  }


  public override val __1324150290_Ptr: JNAPointer? by lazy {
    __1324150290_Interface.__1324150290_Ptr
  }


  public override val __1432377279_Ptr: JNAPointer? by lazy {
    __1432377279_Interface.__1432377279_Ptr
  }


  public override val __1454022741_Ptr: JNAPointer? by lazy {
    __1454022741_Interface.__1454022741_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__873998520_Interface, __1324150294_Interface, __1324150293_Interface,
        __1324150292_Interface, __1324150291_Interface, __1324150290_Interface,
        __1432377279_Interface, __1454022741_Interface)

  public constructor() : this(ABI.activate())

  private fun as_873998520(): IFlyoutBase.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase.ABI.makeIFlyoutBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase.ABI.makeIFlyoutBase(ref.value))
  }

  private fun as_1324150294(): IFlyoutBase2.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase2.ABI.makeIFlyoutBase2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase2.ABI.makeIFlyoutBase2(ref.value))
  }

  private fun as_1324150293(): IFlyoutBase3.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase3.ABI.makeIFlyoutBase3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase3.ABI.makeIFlyoutBase3(ref.value))
  }

  private fun as_1324150292(): IFlyoutBase4.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase4.ABI.makeIFlyoutBase4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase4.ABI.makeIFlyoutBase4(ref.value))
  }

  private fun as_1324150291(): IFlyoutBase5.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase5.ABI.makeIFlyoutBase5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase5.ABI.makeIFlyoutBase5(ref.value))
  }

  private fun as_1324150290(): IFlyoutBase6.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase6.ABI.makeIFlyoutBase6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase6.ABI.makeIFlyoutBase6(ref.value))
  }

  private fun as_1432377279(): IFlyoutBaseOverrides.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBaseOverrides.ABI.makeIFlyoutBaseOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBaseOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBaseOverrides.ABI.makeIFlyoutBaseOverrides(ref.value))
  }

  private fun as_1454022741(): IFlyoutBaseOverrides4.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBaseOverrides4.ABI.makeIFlyoutBaseOverrides4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBaseOverrides4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBaseOverrides4.ABI.makeIFlyoutBaseOverrides4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlyoutBase> {
    public override fun getValue() = FlyoutBase(pointer.getPointer(0))

    public fun setValue(value: FlyoutBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutBase, MemoryAddress> {
    public val IFlyoutBaseStatics6_Instance: IFlyoutBaseStatics6 by lazy {
      createIFlyoutBaseStatics6()
    }


    public val IFlyoutBaseStatics_Instance: IFlyoutBaseStatics by lazy {
      createIFlyoutBaseStatics()
    }


    public val IFlyoutBaseStatics5_Instance: IFlyoutBaseStatics5 by lazy {
      createIFlyoutBaseStatics5()
    }


    public val IFlyoutBaseStatics3_Instance: IFlyoutBaseStatics3 by lazy {
      createIFlyoutBaseStatics3()
    }


    public val IFlyoutBaseStatics2_Instance: IFlyoutBaseStatics2 by lazy {
      createIFlyoutBaseStatics2()
    }


    public val IFlyoutBaseFactory_Instance: IFlyoutBaseFactory by lazy {
      createIFlyoutBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutBaseStatics6(): IFlyoutBaseStatics6 {
      val refiid = Guid.REFIID(IFlyoutBaseStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics6.ABI.makeIFlyoutBaseStatics6(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseStatics(): IFlyoutBaseStatics {
      val refiid = Guid.REFIID(IFlyoutBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics.ABI.makeIFlyoutBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseStatics5(): IFlyoutBaseStatics5 {
      val refiid = Guid.REFIID(IFlyoutBaseStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics5.ABI.makeIFlyoutBaseStatics5(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseStatics3(): IFlyoutBaseStatics3 {
      val refiid = Guid.REFIID(IFlyoutBaseStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics3.ABI.makeIFlyoutBaseStatics3(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseStatics2(): IFlyoutBaseStatics2 {
      val refiid = Guid.REFIID(IFlyoutBaseStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics2.ABI.makeIFlyoutBaseStatics2(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseFactory(): IFlyoutBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlyoutBaseFactory.ABI.makeIFlyoutBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlyoutBaseFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlyoutBase {
      val address = segment.toRawLongValue()
      return FlyoutBase(Pointer(address))
    }

    public override fun toNative(obj: FlyoutBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ShouldConstrainToRootBoundsProperty() =
        ABI.IFlyoutBaseStatics6_Instance.get_ShouldConstrainToRootBoundsProperty()

    public fun get_PlacementProperty() = ABI.IFlyoutBaseStatics_Instance.get_PlacementProperty()

    public fun get_AttachedFlyoutProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_AttachedFlyoutProperty()

    public fun GetAttachedFlyout(element: FrameworkElement) =
        ABI.IFlyoutBaseStatics_Instance.GetAttachedFlyout(element)

    public fun SetAttachedFlyout(element: FrameworkElement, value: FlyoutBase) =
        ABI.IFlyoutBaseStatics_Instance.SetAttachedFlyout(element, value)

    public fun ShowAttachedFlyout(flyoutOwner: FrameworkElement) =
        ABI.IFlyoutBaseStatics_Instance.ShowAttachedFlyout(flyoutOwner)

    public fun get_TargetProperty() = ABI.IFlyoutBaseStatics5_Instance.get_TargetProperty()

    public fun get_ShowModeProperty() = ABI.IFlyoutBaseStatics5_Instance.get_ShowModeProperty()

    public fun get_InputDevicePrefersPrimaryCommandsProperty() =
        ABI.IFlyoutBaseStatics5_Instance.get_InputDevicePrefersPrimaryCommandsProperty()

    public fun get_AreOpenCloseAnimationsEnabledProperty() =
        ABI.IFlyoutBaseStatics5_Instance.get_AreOpenCloseAnimationsEnabledProperty()

    public fun get_IsOpenProperty() = ABI.IFlyoutBaseStatics5_Instance.get_IsOpenProperty()

    public fun get_OverlayInputPassThroughElementProperty() =
        ABI.IFlyoutBaseStatics3_Instance.get_OverlayInputPassThroughElementProperty()

    public fun get_AllowFocusOnInteractionProperty() =
        ABI.IFlyoutBaseStatics2_Instance.get_AllowFocusOnInteractionProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IFlyoutBaseStatics2_Instance.get_LightDismissOverlayModeProperty()

    public fun get_AllowFocusWhenDisabledProperty() =
        ABI.IFlyoutBaseStatics2_Instance.get_AllowFocusWhenDisabledProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IFlyoutBaseStatics2_Instance.get_ElementSoundModeProperty()
  }
}
