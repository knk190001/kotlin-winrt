package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IControlFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(Control.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Control;{a8912263-2951-4f58-a9c5-5a134eaa7f07})")
@WinRTByReference(brClass = Control.ByReference::class)
public open class Control(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IControl.WithDefault, IControl2.WithDefault, IControl3.WithDefault,
    IControl4.WithDefault, IControl5.WithDefault, IControl7.WithDefault,
    IControlProtected.WithDefault, IControlOverrides.WithDefault, IControlOverrides6.WithDefault,
    IWinRTObject {
  private val __104493505_Interface: IControl.WithDefault by lazy {
    as_104493505()
  }


  private val __1055668591_Interface: IControl2.WithDefault by lazy {
    as_1055668591()
  }


  private val __1055668590_Interface: IControl3.WithDefault by lazy {
    as_1055668590()
  }


  private val __1055668589_Interface: IControl4.WithDefault by lazy {
    as_1055668589()
  }


  private val __1055668588_Interface: IControl5.WithDefault by lazy {
    as_1055668588()
  }


  private val __1055668586_Interface: IControl7.WithDefault by lazy {
    as_1055668586()
  }


  private val __1149207277_Interface: IControlProtected.WithDefault by lazy {
    as_1149207277()
  }


  private val __1007777126_Interface: IControlOverrides.WithDefault by lazy {
    as_1007777126()
  }


  private val __1176319888_Interface: IControlOverrides6.WithDefault by lazy {
    as_1176319888()
  }


  public override val __104493505_Ptr: JNAPointer? by lazy {
    __104493505_Interface.__104493505_Ptr
  }


  public override val __1055668591_Ptr: JNAPointer? by lazy {
    __1055668591_Interface.__1055668591_Ptr
  }


  public override val __1055668590_Ptr: JNAPointer? by lazy {
    __1055668590_Interface.__1055668590_Ptr
  }


  public override val __1055668589_Ptr: JNAPointer? by lazy {
    __1055668589_Interface.__1055668589_Ptr
  }


  public override val __1055668588_Ptr: JNAPointer? by lazy {
    __1055668588_Interface.__1055668588_Ptr
  }


  public override val __1055668586_Ptr: JNAPointer? by lazy {
    __1055668586_Interface.__1055668586_Ptr
  }


  public override val __1149207277_Ptr: JNAPointer? by lazy {
    __1149207277_Interface.__1149207277_Ptr
  }


  public override val __1007777126_Ptr: JNAPointer? by lazy {
    __1007777126_Interface.__1007777126_Ptr
  }


  public override val __1176319888_Ptr: JNAPointer? by lazy {
    __1176319888_Interface.__1176319888_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__104493505_Interface, __1055668591_Interface, __1055668590_Interface,
        __1055668589_Interface, __1055668588_Interface, __1055668586_Interface,
        __1149207277_Interface, __1007777126_Interface, __1176319888_Interface)

  public constructor() : this(ABI.activate())

  private fun as_104493505(): IControl.WithDefault {
    if(pointer == NULL) {
      return(IControl.ABI.makeIControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl.ABI.makeIControl(ref.value))
  }

  private fun as_1055668591(): IControl2.WithDefault {
    if(pointer == NULL) {
      return(IControl2.ABI.makeIControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl2.ABI.makeIControl2(ref.value))
  }

  private fun as_1055668590(): IControl3.WithDefault {
    if(pointer == NULL) {
      return(IControl3.ABI.makeIControl3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl3.ABI.makeIControl3(ref.value))
  }

  private fun as_1055668589(): IControl4.WithDefault {
    if(pointer == NULL) {
      return(IControl4.ABI.makeIControl4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl4.ABI.makeIControl4(ref.value))
  }

  private fun as_1055668588(): IControl5.WithDefault {
    if(pointer == NULL) {
      return(IControl5.ABI.makeIControl5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl5.ABI.makeIControl5(ref.value))
  }

  private fun as_1055668586(): IControl7.WithDefault {
    if(pointer == NULL) {
      return(IControl7.ABI.makeIControl7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl7.ABI.makeIControl7(ref.value))
  }

  private fun as_1149207277(): IControlProtected.WithDefault {
    if(pointer == NULL) {
      return(IControlProtected.ABI.makeIControlProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlProtected.ABI.makeIControlProtected(ref.value))
  }

  private fun as_1007777126(): IControlOverrides.WithDefault {
    if(pointer == NULL) {
      return(IControlOverrides.ABI.makeIControlOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlOverrides.ABI.makeIControlOverrides(ref.value))
  }

  private fun as_1176319888(): IControlOverrides6.WithDefault {
    if(pointer == NULL) {
      return(IControlOverrides6.ABI.makeIControlOverrides6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlOverrides6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlOverrides6.ABI.makeIControlOverrides6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Control> {
    public override fun getValue() = Control(pointer.getPointer(0))

    public fun setValue(value: Control): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Control, MemoryAddress> {
    public val IControlStatics_Instance: IControlStatics by lazy {
      createIControlStatics()
    }


    public val IControlStatics3_Instance: IControlStatics3 by lazy {
      createIControlStatics3()
    }


    public val IControlStatics7_Instance: IControlStatics7 by lazy {
      createIControlStatics7()
    }


    public val IControlStatics5_Instance: IControlStatics5 by lazy {
      createIControlStatics5()
    }


    public val IControlStatics2_Instance: IControlStatics2 by lazy {
      createIControlStatics2()
    }


    public val IControlStatics4_Instance: IControlStatics4 by lazy {
      createIControlStatics4()
    }


    public val IControlFactory_Instance: IControlFactory by lazy {
      createIControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIControlStatics(): IControlStatics {
      val refiid = Guid.REFIID(IControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics.ABI.makeIControlStatics(interfacePtr.value)
      return result
    }

    public fun createIControlStatics3(): IControlStatics3 {
      val refiid = Guid.REFIID(IControlStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics3.ABI.makeIControlStatics3(interfacePtr.value)
      return result
    }

    public fun createIControlStatics7(): IControlStatics7 {
      val refiid = Guid.REFIID(IControlStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics7.ABI.makeIControlStatics7(interfacePtr.value)
      return result
    }

    public fun createIControlStatics5(): IControlStatics5 {
      val refiid = Guid.REFIID(IControlStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics5.ABI.makeIControlStatics5(interfacePtr.value)
      return result
    }

    public fun createIControlStatics2(): IControlStatics2 {
      val refiid = Guid.REFIID(IControlStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics2.ABI.makeIControlStatics2(interfacePtr.value)
      return result
    }

    public fun createIControlStatics4(): IControlStatics4 {
      val refiid = Guid.REFIID(IControlStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics4.ABI.makeIControlStatics4(interfacePtr.value)
      return result
    }

    public fun createIControlFactory(): IControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Control".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IControlFactory.ABI.makeIControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IControlFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Control {
      val address = segment.toRawLongValue()
      return Control(Pointer(address))
    }

    public override fun toNative(obj: Control): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FontSizeProperty() = ABI.IControlStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() = ABI.IControlStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() = ABI.IControlStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.IControlStatics_Instance.get_FontStyleProperty()

    public fun get_FontStretchProperty() = ABI.IControlStatics_Instance.get_FontStretchProperty()

    public fun get_CharacterSpacingProperty() =
        ABI.IControlStatics_Instance.get_CharacterSpacingProperty()

    public fun get_ForegroundProperty() = ABI.IControlStatics_Instance.get_ForegroundProperty()

    public fun get_IsTabStopProperty() = ABI.IControlStatics_Instance.get_IsTabStopProperty()

    public fun get_IsEnabledProperty() = ABI.IControlStatics_Instance.get_IsEnabledProperty()

    public fun get_TabIndexProperty() = ABI.IControlStatics_Instance.get_TabIndexProperty()

    public fun get_TabNavigationProperty() =
        ABI.IControlStatics_Instance.get_TabNavigationProperty()

    public fun get_TemplateProperty() = ABI.IControlStatics_Instance.get_TemplateProperty()

    public fun get_PaddingProperty() = ABI.IControlStatics_Instance.get_PaddingProperty()

    public fun get_HorizontalContentAlignmentProperty() =
        ABI.IControlStatics_Instance.get_HorizontalContentAlignmentProperty()

    public fun get_VerticalContentAlignmentProperty() =
        ABI.IControlStatics_Instance.get_VerticalContentAlignmentProperty()

    public fun get_BackgroundProperty() = ABI.IControlStatics_Instance.get_BackgroundProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IControlStatics_Instance.get_BorderThicknessProperty()

    public fun get_BorderBrushProperty() = ABI.IControlStatics_Instance.get_BorderBrushProperty()

    public fun get_DefaultStyleKeyProperty() =
        ABI.IControlStatics_Instance.get_DefaultStyleKeyProperty()

    public fun get_FocusStateProperty() = ABI.IControlStatics_Instance.get_FocusStateProperty()

    public fun get_UseSystemFocusVisualsProperty() =
        ABI.IControlStatics3_Instance.get_UseSystemFocusVisualsProperty()

    public fun get_IsTemplateFocusTargetProperty() =
        ABI.IControlStatics3_Instance.get_IsTemplateFocusTargetProperty()

    public fun GetIsTemplateFocusTarget(element: FrameworkElement) =
        ABI.IControlStatics3_Instance.GetIsTemplateFocusTarget(element)

    public fun SetIsTemplateFocusTarget(element: FrameworkElement, value: Boolean) =
        ABI.IControlStatics3_Instance.SetIsTemplateFocusTarget(element, value)

    public fun get_BackgroundSizingProperty() =
        ABI.IControlStatics7_Instance.get_BackgroundSizingProperty()

    public fun get_CornerRadiusProperty() = ABI.IControlStatics7_Instance.get_CornerRadiusProperty()

    public fun get_DefaultStyleResourceUriProperty() =
        ABI.IControlStatics5_Instance.get_DefaultStyleResourceUriProperty()

    public fun get_IsTemplateKeyTipTargetProperty() =
        ABI.IControlStatics5_Instance.get_IsTemplateKeyTipTargetProperty()

    public fun GetIsTemplateKeyTipTarget(element: DependencyObject) =
        ABI.IControlStatics5_Instance.GetIsTemplateKeyTipTarget(element)

    public fun SetIsTemplateKeyTipTarget(element: DependencyObject, value: Boolean) =
        ABI.IControlStatics5_Instance.SetIsTemplateKeyTipTarget(element, value)

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IControlStatics2_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_IsFocusEngagementEnabledProperty() =
        ABI.IControlStatics4_Instance.get_IsFocusEngagementEnabledProperty()

    public fun get_IsFocusEngagedProperty() =
        ABI.IControlStatics4_Instance.get_IsFocusEngagedProperty()

    public fun get_RequiresPointerProperty() =
        ABI.IControlStatics4_Instance.get_RequiresPointerProperty()

    public fun get_XYFocusLeftProperty() = ABI.IControlStatics4_Instance.get_XYFocusLeftProperty()

    public fun get_XYFocusRightProperty() = ABI.IControlStatics4_Instance.get_XYFocusRightProperty()

    public fun get_XYFocusUpProperty() = ABI.IControlStatics4_Instance.get_XYFocusUpProperty()

    public fun get_XYFocusDownProperty() = ABI.IControlStatics4_Instance.get_XYFocusDownProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IControlStatics4_Instance.get_ElementSoundModeProperty()
  }
}
