package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IControlFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.FrameworkElement
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
@Signature("rc(Microsoft.UI.Xaml.Controls.Control;{857d6e8a-d45a-5c69-a99c-bf6a5c54fb38})")
@WinRTByReference(brClass = Control.ByReference::class)
public open class Control(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IControl.WithDefault, IControlProtected.WithDefault,
    IControlOverrides.WithDefault, IWinRTObject {
  private val __997664330_Interface: IControl.WithDefault by lazy {
    as_997664330()
  }


  private val __348012184_Interface: IControlProtected.WithDefault by lazy {
    as_348012184()
  }


  private val __206582033_Interface: IControlOverrides.WithDefault by lazy {
    as_206582033()
  }


  public override val __997664330_Ptr: JNAPointer? by lazy {
    __997664330_Interface.__997664330_Ptr
  }


  public override val __348012184_Ptr: JNAPointer? by lazy {
    __348012184_Interface.__348012184_Ptr
  }


  public override val __206582033_Ptr: JNAPointer? by lazy {
    __206582033_Interface.__206582033_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__997664330_Interface, __348012184_Interface, __206582033_Interface)

  public constructor() : this(ABI.activate())

  private fun as_997664330(): IControl.WithDefault {
    if(pointer == NULL) {
      return(IControl.ABI.makeIControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControl.ABI.makeIControl(ref.value))
  }

  private fun as_348012184(): IControlProtected.WithDefault {
    if(pointer == NULL) {
      return(IControlProtected.ABI.makeIControlProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlProtected.ABI.makeIControlProtected(ref.value))
  }

  private fun as_206582033(): IControlOverrides.WithDefault {
    if(pointer == NULL) {
      return(IControlOverrides.ABI.makeIControlOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IControlOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IControlOverrides.ABI.makeIControlOverrides(ref.value))
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


    public val IControlFactory_Instance: IControlFactory by lazy {
      createIControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIControlStatics(): IControlStatics {
      val refiid = Guid.REFIID(IControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Control".toHandle(),refiid,interfacePtr)
      val result = IControlStatics.ABI.makeIControlStatics(interfacePtr.value)
      return result
    }

    public fun createIControlFactory(): IControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Control".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_IsFocusEngagementEnabledProperty() =
        ABI.IControlStatics_Instance.get_IsFocusEngagementEnabledProperty()

    public fun get_IsFocusEngagedProperty() =
        ABI.IControlStatics_Instance.get_IsFocusEngagedProperty()

    public fun get_RequiresPointerProperty() =
        ABI.IControlStatics_Instance.get_RequiresPointerProperty()

    public fun get_FontSizeProperty() = ABI.IControlStatics_Instance.get_FontSizeProperty()

    public fun get_FontFamilyProperty() = ABI.IControlStatics_Instance.get_FontFamilyProperty()

    public fun get_FontWeightProperty() = ABI.IControlStatics_Instance.get_FontWeightProperty()

    public fun get_FontStyleProperty() = ABI.IControlStatics_Instance.get_FontStyleProperty()

    public fun get_FontStretchProperty() = ABI.IControlStatics_Instance.get_FontStretchProperty()

    public fun get_CharacterSpacingProperty() =
        ABI.IControlStatics_Instance.get_CharacterSpacingProperty()

    public fun get_ForegroundProperty() = ABI.IControlStatics_Instance.get_ForegroundProperty()

    public fun get_IsTextScaleFactorEnabledProperty() =
        ABI.IControlStatics_Instance.get_IsTextScaleFactorEnabledProperty()

    public fun get_IsEnabledProperty() = ABI.IControlStatics_Instance.get_IsEnabledProperty()

    public fun get_TabNavigationProperty() =
        ABI.IControlStatics_Instance.get_TabNavigationProperty()

    public fun get_TemplateProperty() = ABI.IControlStatics_Instance.get_TemplateProperty()

    public fun get_PaddingProperty() = ABI.IControlStatics_Instance.get_PaddingProperty()

    public fun get_HorizontalContentAlignmentProperty() =
        ABI.IControlStatics_Instance.get_HorizontalContentAlignmentProperty()

    public fun get_VerticalContentAlignmentProperty() =
        ABI.IControlStatics_Instance.get_VerticalContentAlignmentProperty()

    public fun get_BackgroundProperty() = ABI.IControlStatics_Instance.get_BackgroundProperty()

    public fun get_BackgroundSizingProperty() =
        ABI.IControlStatics_Instance.get_BackgroundSizingProperty()

    public fun get_BorderThicknessProperty() =
        ABI.IControlStatics_Instance.get_BorderThicknessProperty()

    public fun get_BorderBrushProperty() = ABI.IControlStatics_Instance.get_BorderBrushProperty()

    public fun get_DefaultStyleKeyProperty() =
        ABI.IControlStatics_Instance.get_DefaultStyleKeyProperty()

    public fun get_DefaultStyleResourceUriProperty() =
        ABI.IControlStatics_Instance.get_DefaultStyleResourceUriProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IControlStatics_Instance.get_ElementSoundModeProperty()

    public fun get_CornerRadiusProperty() = ABI.IControlStatics_Instance.get_CornerRadiusProperty()

    public fun get_IsTemplateFocusTargetProperty() =
        ABI.IControlStatics_Instance.get_IsTemplateFocusTargetProperty()

    public fun GetIsTemplateFocusTarget(element: FrameworkElement) =
        ABI.IControlStatics_Instance.GetIsTemplateFocusTarget(element)

    public fun SetIsTemplateFocusTarget(element: FrameworkElement, value: Boolean) =
        ABI.IControlStatics_Instance.SetIsTemplateFocusTarget(element, value)

    public fun get_IsTemplateKeyTipTargetProperty() =
        ABI.IControlStatics_Instance.get_IsTemplateKeyTipTargetProperty()

    public fun GetIsTemplateKeyTipTarget(element: DependencyObject) =
        ABI.IControlStatics_Instance.GetIsTemplateKeyTipTarget(element)

    public fun SetIsTemplateKeyTipTarget(element: DependencyObject, value: Boolean) =
        ABI.IControlStatics_Instance.SetIsTemplateKeyTipTarget(element, value)
  }
}
