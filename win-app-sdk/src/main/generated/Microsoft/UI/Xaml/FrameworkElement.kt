package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IFrameworkElementFactory.ABI.IID
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

@ABIMarker(FrameworkElement.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.FrameworkElement;{fe08f13d-dc6a-5495-ad44-c2d8d21863b0})")
@WinRTByReference(brClass = FrameworkElement.ByReference::class)
public open class FrameworkElement(
  ptr: JNAPointer? = NULL
) : UIElement(ptr), IFrameworkElement.WithDefault, IFrameworkElementProtected.WithDefault,
    IFrameworkElementOverrides.WithDefault, IWinRTObject {
  private val __1230080667_Interface: IFrameworkElement.WithDefault by lazy {
    as_1230080667()
  }


  private val __837507017_Interface: IFrameworkElementProtected.WithDefault by lazy {
    as_837507017()
  }


  private val __696076866_Interface: IFrameworkElementOverrides.WithDefault by lazy {
    as_696076866()
  }


  public override val __1230080667_Ptr: JNAPointer? by lazy {
    __1230080667_Interface.__1230080667_Ptr
  }


  public override val __837507017_Ptr: JNAPointer? by lazy {
    __837507017_Interface.__837507017_Ptr
  }


  public override val __696076866_Ptr: JNAPointer? by lazy {
    __696076866_Interface.__696076866_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1230080667_Interface, __837507017_Interface, __696076866_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1230080667(): IFrameworkElement.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement.ABI.makeIFrameworkElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement.ABI.makeIFrameworkElement(ref.value))
  }

  private fun as_837507017(): IFrameworkElementProtected.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElementProtected.ABI.makeIFrameworkElementProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElementProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElementProtected.ABI.makeIFrameworkElementProtected(ref.value))
  }

  private fun as_696076866(): IFrameworkElementOverrides.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElementOverrides.ABI.makeIFrameworkElementOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElementOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElementOverrides.ABI.makeIFrameworkElementOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameworkElement> {
    public override fun getValue() = FrameworkElement(pointer.getPointer(0))

    public fun setValue(value: FrameworkElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameworkElement, MemoryAddress> {
    public val IFrameworkElementStatics_Instance: IFrameworkElementStatics by lazy {
      createIFrameworkElementStatics()
    }


    public val IFrameworkElementFactory_Instance: IFrameworkElementFactory by lazy {
      createIFrameworkElementFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameworkElementStatics(): IFrameworkElementStatics {
      val refiid = Guid.REFIID(IFrameworkElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.FrameworkElement".toHandle(),refiid,interfacePtr)
      val result = IFrameworkElementStatics.ABI.makeIFrameworkElementStatics(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementFactory(): IFrameworkElementFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.FrameworkElement".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFrameworkElementFactory.ABI.makeIFrameworkElementFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFrameworkElementFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FrameworkElement {
      val address = segment.toRawLongValue()
      return FrameworkElement(Pointer(address))
    }

    public override fun toNative(obj: FrameworkElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TagProperty() = ABI.IFrameworkElementStatics_Instance.get_TagProperty()

    public fun get_LanguageProperty() = ABI.IFrameworkElementStatics_Instance.get_LanguageProperty()

    public fun get_ActualWidthProperty() =
        ABI.IFrameworkElementStatics_Instance.get_ActualWidthProperty()

    public fun get_ActualHeightProperty() =
        ABI.IFrameworkElementStatics_Instance.get_ActualHeightProperty()

    public fun get_WidthProperty() = ABI.IFrameworkElementStatics_Instance.get_WidthProperty()

    public fun get_HeightProperty() = ABI.IFrameworkElementStatics_Instance.get_HeightProperty()

    public fun get_MinWidthProperty() = ABI.IFrameworkElementStatics_Instance.get_MinWidthProperty()

    public fun get_MaxWidthProperty() = ABI.IFrameworkElementStatics_Instance.get_MaxWidthProperty()

    public fun get_MinHeightProperty() =
        ABI.IFrameworkElementStatics_Instance.get_MinHeightProperty()

    public fun get_MaxHeightProperty() =
        ABI.IFrameworkElementStatics_Instance.get_MaxHeightProperty()

    public fun get_HorizontalAlignmentProperty() =
        ABI.IFrameworkElementStatics_Instance.get_HorizontalAlignmentProperty()

    public fun get_VerticalAlignmentProperty() =
        ABI.IFrameworkElementStatics_Instance.get_VerticalAlignmentProperty()

    public fun get_MarginProperty() = ABI.IFrameworkElementStatics_Instance.get_MarginProperty()

    public fun get_NameProperty() = ABI.IFrameworkElementStatics_Instance.get_NameProperty()

    public fun get_DataContextProperty() =
        ABI.IFrameworkElementStatics_Instance.get_DataContextProperty()

    public fun get_AllowFocusOnInteractionProperty() =
        ABI.IFrameworkElementStatics_Instance.get_AllowFocusOnInteractionProperty()

    public fun get_FocusVisualMarginProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FocusVisualMarginProperty()

    public fun get_FocusVisualSecondaryThicknessProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FocusVisualSecondaryThicknessProperty()

    public fun get_FocusVisualPrimaryThicknessProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FocusVisualPrimaryThicknessProperty()

    public fun get_FocusVisualSecondaryBrushProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FocusVisualSecondaryBrushProperty()

    public fun get_FocusVisualPrimaryBrushProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FocusVisualPrimaryBrushProperty()

    public fun get_AllowFocusWhenDisabledProperty() =
        ABI.IFrameworkElementStatics_Instance.get_AllowFocusWhenDisabledProperty()

    public fun get_StyleProperty() = ABI.IFrameworkElementStatics_Instance.get_StyleProperty()

    public fun get_FlowDirectionProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FlowDirectionProperty()

    public fun get_RequestedThemeProperty() =
        ABI.IFrameworkElementStatics_Instance.get_RequestedThemeProperty()

    public fun get_ActualThemeProperty() =
        ABI.IFrameworkElementStatics_Instance.get_ActualThemeProperty()

    public fun DeferTree(element: DependencyObject) =
        ABI.IFrameworkElementStatics_Instance.DeferTree(element)
  }
}
