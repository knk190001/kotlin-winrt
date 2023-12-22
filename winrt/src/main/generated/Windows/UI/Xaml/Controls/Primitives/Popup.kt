package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(Popup.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.Popup;{62418240-e6d3-4705-a1dc-39156456ee29})")
@WinRTByReference(brClass = Popup.ByReference::class)
public class Popup(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IPopup.WithDefault, IPopup2.WithDefault, IPopup3.WithDefault,
    IPopup4.WithDefault, IWinRTObject {
  private val __1624313680_Interface: IPopup.WithDefault by lazy {
    as_1624313680()
  }


  private val __1185883422_Interface: IPopup2.WithDefault by lazy {
    as_1185883422()
  }


  private val __1185883421_Interface: IPopup3.WithDefault by lazy {
    as_1185883421()
  }


  private val __1185883420_Interface: IPopup4.WithDefault by lazy {
    as_1185883420()
  }


  public override val __1624313680_Ptr: JNAPointer? by lazy {
    __1624313680_Interface.__1624313680_Ptr
  }


  public override val __1185883422_Ptr: JNAPointer? by lazy {
    __1185883422_Interface.__1185883422_Ptr
  }


  public override val __1185883421_Ptr: JNAPointer? by lazy {
    __1185883421_Interface.__1185883421_Ptr
  }


  public override val __1185883420_Ptr: JNAPointer? by lazy {
    __1185883420_Interface.__1185883420_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1624313680_Interface, __1185883422_Interface, __1185883421_Interface,
        __1185883420_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1624313680(): IPopup.WithDefault {
    if(pointer == NULL) {
      return(IPopup.ABI.makeIPopup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopup.ABI.makeIPopup(ref.value))
  }

  private fun as_1185883422(): IPopup2.WithDefault {
    if(pointer == NULL) {
      return(IPopup2.ABI.makeIPopup2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopup2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopup2.ABI.makeIPopup2(ref.value))
  }

  private fun as_1185883421(): IPopup3.WithDefault {
    if(pointer == NULL) {
      return(IPopup3.ABI.makeIPopup3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopup3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopup3.ABI.makeIPopup3(ref.value))
  }

  private fun as_1185883420(): IPopup4.WithDefault {
    if(pointer == NULL) {
      return(IPopup4.ABI.makeIPopup4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopup4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopup4.ABI.makeIPopup4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Popup> {
    public override fun getValue() = Popup(pointer.getPointer(0))

    public fun setValue(value: Popup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Popup, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPopupStatics3_Instance: IPopupStatics3 by lazy {
      createIPopupStatics3()
    }


    public val IPopupStatics4_Instance: IPopupStatics4 by lazy {
      createIPopupStatics4()
    }


    public val IPopupStatics2_Instance: IPopupStatics2 by lazy {
      createIPopupStatics2()
    }


    public val IPopupStatics_Instance: IPopupStatics by lazy {
      createIPopupStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Popup".toHandle(),
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

    public fun createIPopupStatics3(): IPopupStatics3 {
      val refiid = Guid.REFIID(IPopupStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Popup".toHandle(),refiid,interfacePtr)
      val result = IPopupStatics3.ABI.makeIPopupStatics3(interfacePtr.value)
      return result
    }

    public fun createIPopupStatics4(): IPopupStatics4 {
      val refiid = Guid.REFIID(IPopupStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Popup".toHandle(),refiid,interfacePtr)
      val result = IPopupStatics4.ABI.makeIPopupStatics4(interfacePtr.value)
      return result
    }

    public fun createIPopupStatics2(): IPopupStatics2 {
      val refiid = Guid.REFIID(IPopupStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Popup".toHandle(),refiid,interfacePtr)
      val result = IPopupStatics2.ABI.makeIPopupStatics2(interfacePtr.value)
      return result
    }

    public fun createIPopupStatics(): IPopupStatics {
      val refiid = Guid.REFIID(IPopupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.Popup".toHandle(),refiid,interfacePtr)
      val result = IPopupStatics.ABI.makeIPopupStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Popup {
      val address = segment.toRawLongValue()
      return Popup(Pointer(address))
    }

    public override fun toNative(obj: Popup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ShouldConstrainToRootBoundsProperty() =
        ABI.IPopupStatics3_Instance.get_ShouldConstrainToRootBoundsProperty()

    public fun get_PlacementTargetProperty() =
        ABI.IPopupStatics4_Instance.get_PlacementTargetProperty()

    public fun get_DesiredPlacementProperty() =
        ABI.IPopupStatics4_Instance.get_DesiredPlacementProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IPopupStatics2_Instance.get_LightDismissOverlayModeProperty()

    public fun get_ChildProperty() = ABI.IPopupStatics_Instance.get_ChildProperty()

    public fun get_IsOpenProperty() = ABI.IPopupStatics_Instance.get_IsOpenProperty()

    public fun get_HorizontalOffsetProperty() =
        ABI.IPopupStatics_Instance.get_HorizontalOffsetProperty()

    public fun get_VerticalOffsetProperty() =
        ABI.IPopupStatics_Instance.get_VerticalOffsetProperty()

    public fun get_ChildTransitionsProperty() =
        ABI.IPopupStatics_Instance.get_ChildTransitionsProperty()

    public fun get_IsLightDismissEnabledProperty() =
        ABI.IPopupStatics_Instance.get_IsLightDismissEnabledProperty()
  }
}
