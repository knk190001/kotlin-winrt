package Windows.UI.Xaml

import Windows.UI.Xaml.IFrameworkElementFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.FrameworkElement;{a391d09b-4a99-4b7c-9d8d-6fa5d01f6fbf})")
@WinRTByReference(brClass = FrameworkElement.ByReference::class)
public open class FrameworkElement(
  ptr: JNAPointer? = NULL
) : UIElement(ptr), IFrameworkElement.WithDefault, IFrameworkElement2.WithDefault,
    IFrameworkElement3.WithDefault, IFrameworkElement4.WithDefault, IFrameworkElement6.WithDefault,
    IFrameworkElement7.WithDefault, IFrameworkElementProtected7.WithDefault,
    IFrameworkElementOverrides.WithDefault, IFrameworkElementOverrides2.WithDefault, IWinRTObject {
  private val __127922832_Interface: IFrameworkElement.WithDefault by lazy {
    as_127922832()
  }


  private val __329359554_Interface: IFrameworkElement2.WithDefault by lazy {
    as_329359554()
  }


  private val __329359555_Interface: IFrameworkElement3.WithDefault by lazy {
    as_329359555()
  }


  private val __329359556_Interface: IFrameworkElement4.WithDefault by lazy {
    as_329359556()
  }


  private val __329359558_Interface: IFrameworkElement6.WithDefault by lazy {
    as_329359558()
  }


  private val __329359559_Interface: IFrameworkElement7.WithDefault by lazy {
    as_329359559()
  }


  private val __739842087_Interface: IFrameworkElementProtected7.WithDefault by lazy {
    as_739842087()
  }


  private val __1497271959_Interface: IFrameworkElementOverrides.WithDefault by lazy {
    as_1497271959()
  }


  private val __829209477_Interface: IFrameworkElementOverrides2.WithDefault by lazy {
    as_829209477()
  }


  public override val __127922832_Ptr: JNAPointer? by lazy {
    __127922832_Interface.__127922832_Ptr
  }


  public override val __329359554_Ptr: JNAPointer? by lazy {
    __329359554_Interface.__329359554_Ptr
  }


  public override val __329359555_Ptr: JNAPointer? by lazy {
    __329359555_Interface.__329359555_Ptr
  }


  public override val __329359556_Ptr: JNAPointer? by lazy {
    __329359556_Interface.__329359556_Ptr
  }


  public override val __329359558_Ptr: JNAPointer? by lazy {
    __329359558_Interface.__329359558_Ptr
  }


  public override val __329359559_Ptr: JNAPointer? by lazy {
    __329359559_Interface.__329359559_Ptr
  }


  public override val __739842087_Ptr: JNAPointer? by lazy {
    __739842087_Interface.__739842087_Ptr
  }


  public override val __1497271959_Ptr: JNAPointer? by lazy {
    __1497271959_Interface.__1497271959_Ptr
  }


  public override val __829209477_Ptr: JNAPointer? by lazy {
    __829209477_Interface.__829209477_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__127922832_Interface, __329359554_Interface, __329359555_Interface,
        __329359556_Interface, __329359558_Interface, __329359559_Interface, __739842087_Interface,
        __1497271959_Interface, __829209477_Interface)

  public constructor() : this(ABI.activate())

  private fun as_127922832(): IFrameworkElement.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement.ABI.makeIFrameworkElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement.ABI.makeIFrameworkElement(ref.value))
  }

  private fun as_329359554(): IFrameworkElement2.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement2.ABI.makeIFrameworkElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement2.ABI.makeIFrameworkElement2(ref.value))
  }

  private fun as_329359555(): IFrameworkElement3.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement3.ABI.makeIFrameworkElement3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement3.ABI.makeIFrameworkElement3(ref.value))
  }

  private fun as_329359556(): IFrameworkElement4.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement4.ABI.makeIFrameworkElement4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement4.ABI.makeIFrameworkElement4(ref.value))
  }

  private fun as_329359558(): IFrameworkElement6.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement6.ABI.makeIFrameworkElement6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement6.ABI.makeIFrameworkElement6(ref.value))
  }

  private fun as_329359559(): IFrameworkElement7.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElement7.ABI.makeIFrameworkElement7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElement7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElement7.ABI.makeIFrameworkElement7(ref.value))
  }

  private fun as_739842087(): IFrameworkElementProtected7.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElementProtected7.ABI.makeIFrameworkElementProtected7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElementProtected7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElementProtected7.ABI.makeIFrameworkElementProtected7(ref.value))
  }

  private fun as_1497271959(): IFrameworkElementOverrides.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElementOverrides.ABI.makeIFrameworkElementOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElementOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElementOverrides.ABI.makeIFrameworkElementOverrides(ref.value))
  }

  private fun as_829209477(): IFrameworkElementOverrides2.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkElementOverrides2.ABI.makeIFrameworkElementOverrides2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkElementOverrides2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkElementOverrides2.ABI.makeIFrameworkElementOverrides2(ref.value))
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


    public val IFrameworkElementStatics2_Instance: IFrameworkElementStatics2 by lazy {
      createIFrameworkElementStatics2()
    }


    public val IFrameworkElementStatics6_Instance: IFrameworkElementStatics6 by lazy {
      createIFrameworkElementStatics6()
    }


    public val IFrameworkElementStatics4_Instance: IFrameworkElementStatics4 by lazy {
      createIFrameworkElementStatics4()
    }


    public val IFrameworkElementStatics5_Instance: IFrameworkElementStatics5 by lazy {
      createIFrameworkElementStatics5()
    }


    public val IFrameworkElementFactory_Instance: IFrameworkElementFactory by lazy {
      createIFrameworkElementFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameworkElementStatics(): IFrameworkElementStatics {
      val refiid = Guid.REFIID(IFrameworkElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkElement".toHandle(),refiid,interfacePtr)
      val result = IFrameworkElementStatics.ABI.makeIFrameworkElementStatics(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementStatics2(): IFrameworkElementStatics2 {
      val refiid = Guid.REFIID(IFrameworkElementStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkElement".toHandle(),refiid,interfacePtr)
      val result = IFrameworkElementStatics2.ABI.makeIFrameworkElementStatics2(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementStatics6(): IFrameworkElementStatics6 {
      val refiid = Guid.REFIID(IFrameworkElementStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkElement".toHandle(),refiid,interfacePtr)
      val result = IFrameworkElementStatics6.ABI.makeIFrameworkElementStatics6(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementStatics4(): IFrameworkElementStatics4 {
      val refiid = Guid.REFIID(IFrameworkElementStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkElement".toHandle(),refiid,interfacePtr)
      val result = IFrameworkElementStatics4.ABI.makeIFrameworkElementStatics4(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementStatics5(): IFrameworkElementStatics5 {
      val refiid = Guid.REFIID(IFrameworkElementStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkElement".toHandle(),refiid,interfacePtr)
      val result = IFrameworkElementStatics5.ABI.makeIFrameworkElementStatics5(interfacePtr.value)
      return result
    }

    public fun createIFrameworkElementFactory(): IFrameworkElementFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkElement".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_StyleProperty() = ABI.IFrameworkElementStatics_Instance.get_StyleProperty()

    public fun get_FlowDirectionProperty() =
        ABI.IFrameworkElementStatics_Instance.get_FlowDirectionProperty()

    public fun get_RequestedThemeProperty() =
        ABI.IFrameworkElementStatics2_Instance.get_RequestedThemeProperty()

    public fun get_ActualThemeProperty() =
        ABI.IFrameworkElementStatics6_Instance.get_ActualThemeProperty()

    public fun get_AllowFocusOnInteractionProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_AllowFocusOnInteractionProperty()

    public fun get_FocusVisualMarginProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_FocusVisualMarginProperty()

    public fun get_FocusVisualSecondaryThicknessProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_FocusVisualSecondaryThicknessProperty()

    public fun get_FocusVisualPrimaryThicknessProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_FocusVisualPrimaryThicknessProperty()

    public fun get_FocusVisualSecondaryBrushProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_FocusVisualSecondaryBrushProperty()

    public fun get_FocusVisualPrimaryBrushProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_FocusVisualPrimaryBrushProperty()

    public fun get_AllowFocusWhenDisabledProperty() =
        ABI.IFrameworkElementStatics4_Instance.get_AllowFocusWhenDisabledProperty()

    public fun DeferTree(element: DependencyObject) =
        ABI.IFrameworkElementStatics5_Instance.DeferTree(element)
  }
}
