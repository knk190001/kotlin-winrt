package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IFlyoutBaseFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(FlyoutBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase;{bb6603bf-744d-5c31-a87d-744394634d77})")
@WinRTByReference(brClass = FlyoutBase.ByReference::class)
public open class FlyoutBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IFlyoutBase.WithDefault, IFlyoutBase2.WithDefault,
    IFlyoutBaseOverrides.WithDefault, IWinRTObject {
  private val __1334661507_Interface: IFlyoutBase.WithDefault by lazy {
    as_1334661507()
  }


  private val __1575166293_Interface: IFlyoutBase2.WithDefault by lazy {
    as_1575166293()
  }


  private val __759942186_Interface: IFlyoutBaseOverrides.WithDefault by lazy {
    as_759942186()
  }


  public override val __1334661507_Ptr: JNAPointer? by lazy {
    __1334661507_Interface.__1334661507_Ptr
  }


  public override val __1575166293_Ptr: JNAPointer? by lazy {
    __1575166293_Interface.__1575166293_Ptr
  }


  public override val __759942186_Ptr: JNAPointer? by lazy {
    __759942186_Interface.__759942186_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1334661507_Interface, __1575166293_Interface, __759942186_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1334661507(): IFlyoutBase.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase.ABI.makeIFlyoutBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase.ABI.makeIFlyoutBase(ref.value))
  }

  private fun as_1575166293(): IFlyoutBase2.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBase2.ABI.makeIFlyoutBase2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBase2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBase2.ABI.makeIFlyoutBase2(ref.value))
  }

  private fun as_759942186(): IFlyoutBaseOverrides.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutBaseOverrides.ABI.makeIFlyoutBaseOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutBaseOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutBaseOverrides.ABI.makeIFlyoutBaseOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlyoutBase> {
    public override fun getValue() = FlyoutBase(pointer.getPointer(0))

    public fun setValue(value: FlyoutBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutBase, MemoryAddress> {
    public val IFlyoutBaseStatics2_Instance: IFlyoutBaseStatics2 by lazy {
      createIFlyoutBaseStatics2()
    }


    public val IFlyoutBaseStatics_Instance: IFlyoutBaseStatics by lazy {
      createIFlyoutBaseStatics()
    }


    public val IFlyoutBaseFactory_Instance: IFlyoutBaseFactory by lazy {
      createIFlyoutBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutBaseStatics2(): IFlyoutBaseStatics2 {
      val refiid = Guid.REFIID(IFlyoutBaseStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics2.ABI.makeIFlyoutBaseStatics2(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseStatics(): IFlyoutBaseStatics {
      val refiid = Guid.REFIID(IFlyoutBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,interfacePtr)
      val result = IFlyoutBaseStatics.ABI.makeIFlyoutBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIFlyoutBaseFactory(): IFlyoutBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_SystemBackdropProperty() =
        ABI.IFlyoutBaseStatics2_Instance.get_SystemBackdropProperty()

    public fun get_TargetProperty() = ABI.IFlyoutBaseStatics_Instance.get_TargetProperty()

    public fun get_PlacementProperty() = ABI.IFlyoutBaseStatics_Instance.get_PlacementProperty()

    public fun get_AllowFocusOnInteractionProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_AllowFocusOnInteractionProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_LightDismissOverlayModeProperty()

    public fun get_AllowFocusWhenDisabledProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_AllowFocusWhenDisabledProperty()

    public fun get_ShowModeProperty() = ABI.IFlyoutBaseStatics_Instance.get_ShowModeProperty()

    public fun get_InputDevicePrefersPrimaryCommandsProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_InputDevicePrefersPrimaryCommandsProperty()

    public fun get_AreOpenCloseAnimationsEnabledProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_AreOpenCloseAnimationsEnabledProperty()

    public fun get_ShouldConstrainToRootBoundsProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_ShouldConstrainToRootBoundsProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_ElementSoundModeProperty()

    public fun get_OverlayInputPassThroughElementProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_OverlayInputPassThroughElementProperty()

    public fun get_IsOpenProperty() = ABI.IFlyoutBaseStatics_Instance.get_IsOpenProperty()

    public fun get_AttachedFlyoutProperty() =
        ABI.IFlyoutBaseStatics_Instance.get_AttachedFlyoutProperty()

    public fun GetAttachedFlyout(element: FrameworkElement) =
        ABI.IFlyoutBaseStatics_Instance.GetAttachedFlyout(element)

    public fun SetAttachedFlyout(element: FrameworkElement, value: FlyoutBase) =
        ABI.IFlyoutBaseStatics_Instance.SetAttachedFlyout(element, value)

    public fun ShowAttachedFlyout(flyoutOwner: FrameworkElement) =
        ABI.IFlyoutBaseStatics_Instance.ShowAttachedFlyout(flyoutOwner)
  }
}
