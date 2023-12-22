package Windows.UI.Xaml.Hosting

import Windows.UI.Composition.ICompositionAnimationBase
import Windows.UI.Composition.Visual
import Windows.UI.WindowManagement.AppWindow
import Windows.UI.Xaml.Controls.ScrollViewer
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ElementCompositionPreview.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.ElementCompositionPreview;{b6f1a676-cfe6-46ac-acf6-c4687bb65e60})")
@WinRTByReference(brClass = ElementCompositionPreview.ByReference::class)
public class ElementCompositionPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IElementCompositionPreview.WithDefault, IWinRTObject {
  private val __474763252_Interface: IElementCompositionPreview.WithDefault by lazy {
    as_474763252()
  }


  public override val __474763252_Ptr: JNAPointer? by lazy {
    __474763252_Interface.__474763252_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__474763252_Interface)

  private fun as_474763252(): IElementCompositionPreview.WithDefault {
    if(pointer == NULL) {
      return(IElementCompositionPreview.ABI.makeIElementCompositionPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElementCompositionPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElementCompositionPreview.ABI.makeIElementCompositionPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ElementCompositionPreview> {
    public override fun getValue() = ElementCompositionPreview(pointer.getPointer(0))

    public fun setValue(value: ElementCompositionPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ElementCompositionPreview, MemoryAddress> {
    public val IElementCompositionPreviewStatics_Instance: IElementCompositionPreviewStatics by
        lazy {
      createIElementCompositionPreviewStatics()
    }


    public val IElementCompositionPreviewStatics3_Instance: IElementCompositionPreviewStatics3 by
        lazy {
      createIElementCompositionPreviewStatics3()
    }


    public val IElementCompositionPreviewStatics2_Instance: IElementCompositionPreviewStatics2 by
        lazy {
      createIElementCompositionPreviewStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIElementCompositionPreviewStatics(): IElementCompositionPreviewStatics {
      val refiid = Guid.REFIID(IElementCompositionPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.ElementCompositionPreview".toHandle(),refiid,interfacePtr)
      val result =
          IElementCompositionPreviewStatics.ABI.makeIElementCompositionPreviewStatics(interfacePtr.value)
      return result
    }

    public fun createIElementCompositionPreviewStatics3(): IElementCompositionPreviewStatics3 {
      val refiid = Guid.REFIID(IElementCompositionPreviewStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.ElementCompositionPreview".toHandle(),refiid,interfacePtr)
      val result =
          IElementCompositionPreviewStatics3.ABI.makeIElementCompositionPreviewStatics3(interfacePtr.value)
      return result
    }

    public fun createIElementCompositionPreviewStatics2(): IElementCompositionPreviewStatics2 {
      val refiid = Guid.REFIID(IElementCompositionPreviewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.ElementCompositionPreview".toHandle(),refiid,interfacePtr)
      val result =
          IElementCompositionPreviewStatics2.ABI.makeIElementCompositionPreviewStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ElementCompositionPreview {
      val address = segment.toRawLongValue()
      return ElementCompositionPreview(Pointer(address))
    }

    public override fun toNative(obj: ElementCompositionPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetElementVisual(element: UIElement) =
        ABI.IElementCompositionPreviewStatics_Instance.GetElementVisual(element)

    public fun GetElementChildVisual(element: UIElement) =
        ABI.IElementCompositionPreviewStatics_Instance.GetElementChildVisual(element)

    public fun SetElementChildVisual(element: UIElement, visual: Visual) =
        ABI.IElementCompositionPreviewStatics_Instance.SetElementChildVisual(element, visual)

    public fun GetScrollViewerManipulationPropertySet(scrollViewer: ScrollViewer) =
        ABI.IElementCompositionPreviewStatics_Instance.GetScrollViewerManipulationPropertySet(scrollViewer)

    public fun SetAppWindowContent(appWindow: AppWindow, xamlContent: UIElement) =
        ABI.IElementCompositionPreviewStatics3_Instance.SetAppWindowContent(appWindow, xamlContent)

    public fun GetAppWindowContent(appWindow: AppWindow) =
        ABI.IElementCompositionPreviewStatics3_Instance.GetAppWindowContent(appWindow)

    public fun SetImplicitShowAnimation(element: UIElement, animation: ICompositionAnimationBase) =
        ABI.IElementCompositionPreviewStatics2_Instance.SetImplicitShowAnimation(element, animation)

    public fun SetImplicitHideAnimation(element: UIElement, animation: ICompositionAnimationBase) =
        ABI.IElementCompositionPreviewStatics2_Instance.SetImplicitHideAnimation(element, animation)

    public fun SetIsTranslationEnabled(element: UIElement, value: Boolean) =
        ABI.IElementCompositionPreviewStatics2_Instance.SetIsTranslationEnabled(element, value)

    public fun GetPointerPositionPropertySet(targetElement: UIElement) =
        ABI.IElementCompositionPreviewStatics2_Instance.GetPointerPositionPropertySet(targetElement)
  }
}
