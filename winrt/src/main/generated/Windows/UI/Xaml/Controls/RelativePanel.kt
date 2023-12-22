package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IRelativePanelFactory.ABI.IID
import Windows.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RelativePanel.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RelativePanel;{2eabfaeb-b35a-4035-acea-3c4a3730683f})")
@WinRTByReference(brClass = RelativePanel.ByReference::class)
public open class RelativePanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IRelativePanel.WithDefault, IRelativePanel2.WithDefault, IWinRTObject {
  private val __1361260540_Interface: IRelativePanel.WithDefault by lazy {
    as_1361260540()
  }


  private val __750596170_Interface: IRelativePanel2.WithDefault by lazy {
    as_750596170()
  }


  public override val __1361260540_Ptr: JNAPointer? by lazy {
    __1361260540_Interface.__1361260540_Ptr
  }


  public override val __750596170_Ptr: JNAPointer? by lazy {
    __750596170_Interface.__750596170_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1361260540_Interface, __750596170_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1361260540(): IRelativePanel.WithDefault {
    if(pointer == NULL) {
      return(IRelativePanel.ABI.makeIRelativePanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRelativePanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRelativePanel.ABI.makeIRelativePanel(ref.value))
  }

  private fun as_750596170(): IRelativePanel2.WithDefault {
    if(pointer == NULL) {
      return(IRelativePanel2.ABI.makeIRelativePanel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRelativePanel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRelativePanel2.ABI.makeIRelativePanel2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RelativePanel>
      {
    public override fun getValue() = RelativePanel(pointer.getPointer(0))

    public fun setValue(value: RelativePanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RelativePanel, MemoryAddress> {
    public val IRelativePanelStatics2_Instance: IRelativePanelStatics2 by lazy {
      createIRelativePanelStatics2()
    }


    public val IRelativePanelStatics_Instance: IRelativePanelStatics by lazy {
      createIRelativePanelStatics()
    }


    public val IRelativePanelFactory_Instance: IRelativePanelFactory by lazy {
      createIRelativePanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRelativePanelStatics2(): IRelativePanelStatics2 {
      val refiid = Guid.REFIID(IRelativePanelStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RelativePanel".toHandle(),refiid,interfacePtr)
      val result = IRelativePanelStatics2.ABI.makeIRelativePanelStatics2(interfacePtr.value)
      return result
    }

    public fun createIRelativePanelStatics(): IRelativePanelStatics {
      val refiid = Guid.REFIID(IRelativePanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RelativePanel".toHandle(),refiid,interfacePtr)
      val result = IRelativePanelStatics.ABI.makeIRelativePanelStatics(interfacePtr.value)
      return result
    }

    public fun createIRelativePanelFactory(): IRelativePanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RelativePanel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRelativePanelFactory.ABI.makeIRelativePanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRelativePanelFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RelativePanel {
      val address = segment.toRawLongValue()
      return RelativePanel(Pointer(address))
    }

    public override fun toNative(obj: RelativePanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BackgroundSizingProperty() =
        ABI.IRelativePanelStatics2_Instance.get_BackgroundSizingProperty()

    public fun get_LeftOfProperty() = ABI.IRelativePanelStatics_Instance.get_LeftOfProperty()

    public fun GetLeftOf(element: UIElement) = ABI.IRelativePanelStatics_Instance.GetLeftOf(element)

    public fun SetLeftOf(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetLeftOf(element, value)

    public fun get_AboveProperty() = ABI.IRelativePanelStatics_Instance.get_AboveProperty()

    public fun GetAbove(element: UIElement) = ABI.IRelativePanelStatics_Instance.GetAbove(element)

    public fun SetAbove(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAbove(element, value)

    public fun get_RightOfProperty() = ABI.IRelativePanelStatics_Instance.get_RightOfProperty()

    public fun GetRightOf(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetRightOf(element)

    public fun SetRightOf(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetRightOf(element, value)

    public fun get_BelowProperty() = ABI.IRelativePanelStatics_Instance.get_BelowProperty()

    public fun GetBelow(element: UIElement) = ABI.IRelativePanelStatics_Instance.GetBelow(element)

    public fun SetBelow(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetBelow(element, value)

    public fun get_AlignHorizontalCenterWithProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignHorizontalCenterWithProperty()

    public fun GetAlignHorizontalCenterWith(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignHorizontalCenterWith(element)

    public fun SetAlignHorizontalCenterWith(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAlignHorizontalCenterWith(element, value)

    public fun get_AlignVerticalCenterWithProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignVerticalCenterWithProperty()

    public fun GetAlignVerticalCenterWith(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignVerticalCenterWith(element)

    public fun SetAlignVerticalCenterWith(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAlignVerticalCenterWith(element, value)

    public fun get_AlignLeftWithProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignLeftWithProperty()

    public fun GetAlignLeftWith(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignLeftWith(element)

    public fun SetAlignLeftWith(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAlignLeftWith(element, value)

    public fun get_AlignTopWithProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignTopWithProperty()

    public fun GetAlignTopWith(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignTopWith(element)

    public fun SetAlignTopWith(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAlignTopWith(element, value)

    public fun get_AlignRightWithProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignRightWithProperty()

    public fun GetAlignRightWith(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignRightWith(element)

    public fun SetAlignRightWith(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAlignRightWith(element, value)

    public fun get_AlignBottomWithProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignBottomWithProperty()

    public fun GetAlignBottomWith(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignBottomWith(element)

    public fun SetAlignBottomWith(element: UIElement, value: IUnknown) =
        ABI.IRelativePanelStatics_Instance.SetAlignBottomWith(element, value)

    public fun get_AlignLeftWithPanelProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignLeftWithPanelProperty()

    public fun GetAlignLeftWithPanel(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignLeftWithPanel(element)

    public fun SetAlignLeftWithPanel(element: UIElement, value: Boolean) =
        ABI.IRelativePanelStatics_Instance.SetAlignLeftWithPanel(element, value)

    public fun get_AlignTopWithPanelProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignTopWithPanelProperty()

    public fun GetAlignTopWithPanel(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignTopWithPanel(element)

    public fun SetAlignTopWithPanel(element: UIElement, value: Boolean) =
        ABI.IRelativePanelStatics_Instance.SetAlignTopWithPanel(element, value)

    public fun get_AlignRightWithPanelProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignRightWithPanelProperty()

    public fun GetAlignRightWithPanel(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignRightWithPanel(element)

    public fun SetAlignRightWithPanel(element: UIElement, value: Boolean) =
        ABI.IRelativePanelStatics_Instance.SetAlignRightWithPanel(element, value)

    public fun get_AlignBottomWithPanelProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignBottomWithPanelProperty()

    public fun GetAlignBottomWithPanel(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignBottomWithPanel(element)

    public fun SetAlignBottomWithPanel(element: UIElement, value: Boolean) =
        ABI.IRelativePanelStatics_Instance.SetAlignBottomWithPanel(element, value)

    public fun get_AlignHorizontalCenterWithPanelProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignHorizontalCenterWithPanelProperty()

    public fun GetAlignHorizontalCenterWithPanel(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignHorizontalCenterWithPanel(element)

    public fun SetAlignHorizontalCenterWithPanel(element: UIElement, value: Boolean) =
        ABI.IRelativePanelStatics_Instance.SetAlignHorizontalCenterWithPanel(element, value)

    public fun get_AlignVerticalCenterWithPanelProperty() =
        ABI.IRelativePanelStatics_Instance.get_AlignVerticalCenterWithPanelProperty()

    public fun GetAlignVerticalCenterWithPanel(element: UIElement) =
        ABI.IRelativePanelStatics_Instance.GetAlignVerticalCenterWithPanel(element)

    public fun SetAlignVerticalCenterWithPanel(element: UIElement, value: Boolean) =
        ABI.IRelativePanelStatics_Instance.SetAlignVerticalCenterWithPanel(element, value)

    public fun get_BorderBrushProperty() =
        ABI.IRelativePanelStatics_Instance.get_BorderBrushProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IRelativePanelStatics_Instance.get_BorderThicknessProperty()

    public fun get_CornerRadiusProperty() =
        ABI.IRelativePanelStatics_Instance.get_CornerRadiusProperty()

    public fun get_PaddingProperty() = ABI.IRelativePanelStatics_Instance.get_PaddingProperty()
  }
}
