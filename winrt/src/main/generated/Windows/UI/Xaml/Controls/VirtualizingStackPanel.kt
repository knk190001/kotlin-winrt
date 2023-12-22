package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.OrientedVirtualizingPanel
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(VirtualizingStackPanel.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.VirtualizingStackPanel;{7567cd9a-a3b4-4dea-bb11-549e2c2f919d})")
@WinRTByReference(brClass = VirtualizingStackPanel.ByReference::class)
public class VirtualizingStackPanel(
  ptr: JNAPointer? = NULL
) : OrientedVirtualizingPanel(ptr), IVirtualizingStackPanel.WithDefault,
    IVirtualizingStackPanelOverrides.WithDefault, IWinRTObject {
  private val __1680375554_Interface: IVirtualizingStackPanel.WithDefault by lazy {
    as_1680375554()
  }


  private val __708131529_Interface: IVirtualizingStackPanelOverrides.WithDefault by lazy {
    as_708131529()
  }


  public override val __1680375554_Ptr: JNAPointer? by lazy {
    __1680375554_Interface.__1680375554_Ptr
  }


  public override val __708131529_Ptr: JNAPointer? by lazy {
    __708131529_Interface.__708131529_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1680375554_Interface, __708131529_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1680375554(): IVirtualizingStackPanel.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingStackPanel.ABI.makeIVirtualizingStackPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingStackPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingStackPanel.ABI.makeIVirtualizingStackPanel(ref.value))
  }

  private fun as_708131529(): IVirtualizingStackPanelOverrides.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingStackPanelOverrides.ABI.makeIVirtualizingStackPanelOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingStackPanelOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingStackPanelOverrides.ABI.makeIVirtualizingStackPanelOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VirtualizingStackPanel> {
    public override fun getValue() = VirtualizingStackPanel(pointer.getPointer(0))

    public fun setValue(value: VirtualizingStackPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VirtualizingStackPanel, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IVirtualizingStackPanelStatics_Instance: IVirtualizingStackPanelStatics by lazy {
      createIVirtualizingStackPanelStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.VirtualizingStackPanel".toHandle(),
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

    public fun createIVirtualizingStackPanelStatics(): IVirtualizingStackPanelStatics {
      val refiid = Guid.REFIID(IVirtualizingStackPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.VirtualizingStackPanel".toHandle(),refiid,interfacePtr)
      val result =
          IVirtualizingStackPanelStatics.ABI.makeIVirtualizingStackPanelStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VirtualizingStackPanel {
      val address = segment.toRawLongValue()
      return VirtualizingStackPanel(Pointer(address))
    }

    public override fun toNative(obj: VirtualizingStackPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AreScrollSnapPointsRegularProperty() =
        ABI.IVirtualizingStackPanelStatics_Instance.get_AreScrollSnapPointsRegularProperty()

    public fun get_OrientationProperty() =
        ABI.IVirtualizingStackPanelStatics_Instance.get_OrientationProperty()

    public fun get_VirtualizationModeProperty() =
        ABI.IVirtualizingStackPanelStatics_Instance.get_VirtualizationModeProperty()

    public fun GetVirtualizationMode(element: DependencyObject) =
        ABI.IVirtualizingStackPanelStatics_Instance.GetVirtualizationMode(element)

    public fun SetVirtualizationMode(element: DependencyObject, value: VirtualizationMode) =
        ABI.IVirtualizingStackPanelStatics_Instance.SetVirtualizationMode(element, value)

    public fun get_IsVirtualizingProperty() =
        ABI.IVirtualizingStackPanelStatics_Instance.get_IsVirtualizingProperty()

    public fun GetIsVirtualizing(o: DependencyObject) =
        ABI.IVirtualizingStackPanelStatics_Instance.GetIsVirtualizing(o)
  }
}
