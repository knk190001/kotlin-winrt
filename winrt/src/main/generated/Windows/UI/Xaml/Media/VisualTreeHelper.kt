package Windows.UI.Xaml.Media

import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.UIElement
import Windows.UI.Xaml.Window
import Windows.UI.Xaml.XamlRoot
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
@Signature("rc(Windows.UI.Xaml.Media.VisualTreeHelper;{24b935e3-52c7-4141-8bac-a73d06130569})")
@WinRTByReference(brClass = VisualTreeHelper.ByReference::class)
public class VisualTreeHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisualTreeHelper.WithDefault, IWinRTObject {
  private val __304042424_Interface: IVisualTreeHelper.WithDefault by lazy {
    as_304042424()
  }


  public override val __304042424_Ptr: JNAPointer? by lazy {
    __304042424_Interface.__304042424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__304042424_Interface)

  private fun as_304042424(): IVisualTreeHelper.WithDefault {
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


    public val IVisualTreeHelperStatics2_Instance: IVisualTreeHelperStatics2 by lazy {
      createIVisualTreeHelperStatics2()
    }


    public val IVisualTreeHelperStatics3_Instance: IVisualTreeHelperStatics3 by lazy {
      createIVisualTreeHelperStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVisualTreeHelperStatics(): IVisualTreeHelperStatics {
      val refiid = Guid.REFIID(IVisualTreeHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.VisualTreeHelper".toHandle(),refiid,interfacePtr)
      val result = IVisualTreeHelperStatics.ABI.makeIVisualTreeHelperStatics(interfacePtr.value)
      return result
    }

    public fun createIVisualTreeHelperStatics2(): IVisualTreeHelperStatics2 {
      val refiid = Guid.REFIID(IVisualTreeHelperStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.VisualTreeHelper".toHandle(),refiid,interfacePtr)
      val result = IVisualTreeHelperStatics2.ABI.makeIVisualTreeHelperStatics2(interfacePtr.value)
      return result
    }

    public fun createIVisualTreeHelperStatics3(): IVisualTreeHelperStatics3 {
      val refiid = Guid.REFIID(IVisualTreeHelperStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.VisualTreeHelper".toHandle(),refiid,interfacePtr)
      val result = IVisualTreeHelperStatics3.ABI.makeIVisualTreeHelperStatics3(interfacePtr.value)
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
        ABI.IVisualTreeHelperStatics2_Instance.GetOpenPopups(window)

    public fun GetOpenPopupsForXamlRoot(xamlRoot: XamlRoot) =
        ABI.IVisualTreeHelperStatics3_Instance.GetOpenPopupsForXamlRoot(xamlRoot)
  }
}
