package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.PlacementMode
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ToolTipService.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ToolTipService;{01140768-2727-5f89-80e0-5210326a3431})")
@WinRTByReference(brClass = ToolTipService.ByReference::class)
public class ToolTipService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToolTipService.WithDefault, IWinRTObject {
  private val __178820825_Interface: IToolTipService.WithDefault by lazy {
    as_178820825()
  }


  public override val __178820825_Ptr: JNAPointer? by lazy {
    __178820825_Interface.__178820825_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__178820825_Interface)

  private fun as_178820825(): IToolTipService.WithDefault {
    if(pointer == NULL) {
      return(IToolTipService.ABI.makeIToolTipService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToolTipService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToolTipService.ABI.makeIToolTipService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ToolTipService>
      {
    public override fun getValue() = ToolTipService(pointer.getPointer(0))

    public fun setValue(value: ToolTipService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToolTipService, MemoryAddress> {
    public val IToolTipServiceStatics_Instance: IToolTipServiceStatics by lazy {
      createIToolTipServiceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToolTipServiceStatics(): IToolTipServiceStatics {
      val refiid = Guid.REFIID(IToolTipServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToolTipService".toHandle(),refiid,interfacePtr)
      val result = IToolTipServiceStatics.ABI.makeIToolTipServiceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ToolTipService {
      val address = segment.toRawLongValue()
      return ToolTipService(Pointer(address))
    }

    public override fun toNative(obj: ToolTipService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PlacementProperty() = ABI.IToolTipServiceStatics_Instance.get_PlacementProperty()

    public fun GetPlacement(element: DependencyObject) =
        ABI.IToolTipServiceStatics_Instance.GetPlacement(element)

    public fun SetPlacement(element: DependencyObject, value: PlacementMode) =
        ABI.IToolTipServiceStatics_Instance.SetPlacement(element, value)

    public fun get_PlacementTargetProperty() =
        ABI.IToolTipServiceStatics_Instance.get_PlacementTargetProperty()

    public fun GetPlacementTarget(element: DependencyObject) =
        ABI.IToolTipServiceStatics_Instance.GetPlacementTarget(element)

    public fun SetPlacementTarget(element: DependencyObject, value: UIElement) =
        ABI.IToolTipServiceStatics_Instance.SetPlacementTarget(element, value)

    public fun get_ToolTipProperty() = ABI.IToolTipServiceStatics_Instance.get_ToolTipProperty()

    public fun GetToolTip(element: DependencyObject) =
        ABI.IToolTipServiceStatics_Instance.GetToolTip(element)

    public fun SetToolTip(element: DependencyObject, value: IUnknown) =
        ABI.IToolTipServiceStatics_Instance.SetToolTip(element, value)
  }
}
