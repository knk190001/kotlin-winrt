package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.UIElement
import Microsoft.UI.Xaml.Window
import Microsoft.UI.Xaml.XamlRoot
import Windows.Foundation.Point
import Windows.Foundation.Rect
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VisualTreeHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.VisualTreeHelper;{5f69ac1e-6504-5e3f-a11c-87684c1db814})")
@WinRTByReference(brClass = VisualTreeHelper.ByReference::class)
public class VisualTreeHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisualTreeHelper.WithDefault, IWinRTObject {
  private val __2078050941_Interface: IVisualTreeHelper.WithDefault by lazy {
    as_2078050941()
  }


  public override val __2078050941_Ptr: JNAPointer? by lazy {
    __2078050941_Interface.__2078050941_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2078050941_Interface)

  private fun as_2078050941(): IVisualTreeHelper.WithDefault {
    if(pointer == NULL) {
      return(IVisualTreeHelper.ABI.makeIVisualTreeHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualTreeHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualTreeHelper.ABI.makeIVisualTreeHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualTreeHelper> {
    public override fun getValue() = VisualTreeHelper(pointer.getPointer(0))

    public fun setValue(value: VisualTreeHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualTreeHelper, MemoryAddress> {
    public val IVisualTreeHelperStatics_Instance: IVisualTreeHelperStatics by lazy {
      createIVisualTreeHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVisualTreeHelperStatics(): IVisualTreeHelperStatics {
      val refiid = Guid.REFIID(IVisualTreeHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.VisualTreeHelper".toHandle(),refiid,interfacePtr)
      val result = IVisualTreeHelperStatics.ABI.makeIVisualTreeHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VisualTreeHelper {
      val address = segment.toRawLongValue()
      return VisualTreeHelper(Pointer(address))
    }

    public override fun toNative(obj: VisualTreeHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindElementsInHostCoordinates(intersectingPoint: Point, subtree: UIElement) =
        ABI.IVisualTreeHelperStatics_Instance.FindElementsInHostCoordinates(intersectingPoint,
        subtree)

    public fun FindElementsInHostCoordinates(intersectingRect: Rect, subtree: UIElement) =
        ABI.IVisualTreeHelperStatics_Instance.FindElementsInHostCoordinates(intersectingRect,
        subtree)

    public fun FindElementsInHostCoordinates(
      intersectingPoint: Point,
      subtree: UIElement,
      includeAllElements: Boolean
    ) = ABI.IVisualTreeHelperStatics_Instance.FindElementsInHostCoordinates(intersectingPoint,
        subtree, includeAllElements)

    public fun FindElementsInHostCoordinates(
      intersectingRect: Rect,
      subtree: UIElement,
      includeAllElements: Boolean
    ) = ABI.IVisualTreeHelperStatics_Instance.FindElementsInHostCoordinates(intersectingRect,
        subtree, includeAllElements)

    public fun GetChild(reference: DependencyObject, childIndex: Int) =
        ABI.IVisualTreeHelperStatics_Instance.GetChild(reference, childIndex)

    public fun GetChildrenCount(reference: DependencyObject) =
        ABI.IVisualTreeHelperStatics_Instance.GetChildrenCount(reference)

    public fun GetParent(reference: DependencyObject) =
        ABI.IVisualTreeHelperStatics_Instance.GetParent(reference)

    public fun DisconnectChildrenRecursive(element: UIElement) =
        ABI.IVisualTreeHelperStatics_Instance.DisconnectChildrenRecursive(element)

    public fun GetOpenPopups(window: Window) =
        ABI.IVisualTreeHelperStatics_Instance.GetOpenPopups(window)

    public fun GetOpenPopupsForXamlRoot(xamlRoot: XamlRoot) =
        ABI.IVisualTreeHelperStatics_Instance.GetOpenPopupsForXamlRoot(xamlRoot)
  }
}
