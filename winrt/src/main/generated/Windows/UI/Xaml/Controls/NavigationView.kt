package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.INavigationViewFactory.ABI.IID
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

@ABIMarker(NavigationView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationView;{f209ce15-391a-42ca-9fc6-f79da65aca32})")
@WinRTByReference(brClass = NavigationView.ByReference::class)
public open class NavigationView(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), INavigationView.WithDefault, INavigationView2.WithDefault,
    INavigationView3.WithDefault, IWinRTObject {
  private val __1251964427_Interface: INavigationView.WithDefault by lazy {
    as_1251964427()
  }


  private val __156191523_Interface: INavigationView2.WithDefault by lazy {
    as_156191523()
  }


  private val __156191522_Interface: INavigationView3.WithDefault by lazy {
    as_156191522()
  }


  public override val __1251964427_Ptr: JNAPointer? by lazy {
    __1251964427_Interface.__1251964427_Ptr
  }


  public override val __156191523_Ptr: JNAPointer? by lazy {
    __156191523_Interface.__156191523_Ptr
  }


  public override val __156191522_Ptr: JNAPointer? by lazy {
    __156191522_Interface.__156191522_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1251964427_Interface, __156191523_Interface, __156191522_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1251964427(): INavigationView.WithDefault {
    if(pointer == NULL) {
      return(INavigationView.ABI.makeINavigationView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationView.ABI.makeINavigationView(ref.value))
  }

  private fun as_156191523(): INavigationView2.WithDefault {
    if(pointer == NULL) {
      return(INavigationView2.ABI.makeINavigationView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationView2.ABI.makeINavigationView2(ref.value))
  }

  private fun as_156191522(): INavigationView3.WithDefault {
    if(pointer == NULL) {
      return(INavigationView3.ABI.makeINavigationView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationView3.ABI.makeINavigationView3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NavigationView>
      {
    public override fun getValue() = NavigationView(pointer.getPointer(0))

    public fun setValue(value: NavigationView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationView, MemoryAddress> {
    public val INavigationViewStatics_Instance: INavigationViewStatics by lazy {
      createINavigationViewStatics()
    }


    public val INavigationViewStatics2_Instance: INavigationViewStatics2 by lazy {
      createINavigationViewStatics2()
    }


    public val INavigationViewStatics3_Instance: INavigationViewStatics3 by lazy {
      createINavigationViewStatics3()
    }


    public val INavigationViewFactory_Instance: INavigationViewFactory by lazy {
      createINavigationViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewStatics(): INavigationViewStatics {
      val refiid = Guid.REFIID(INavigationViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationView".toHandle(),refiid,interfacePtr)
      val result = INavigationViewStatics.ABI.makeINavigationViewStatics(interfacePtr.value)
      return result
    }

    public fun createINavigationViewStatics2(): INavigationViewStatics2 {
      val refiid = Guid.REFIID(INavigationViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationView".toHandle(),refiid,interfacePtr)
      val result = INavigationViewStatics2.ABI.makeINavigationViewStatics2(interfacePtr.value)
      return result
    }

    public fun createINavigationViewStatics3(): INavigationViewStatics3 {
      val refiid = Guid.REFIID(INavigationViewStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationView".toHandle(),refiid,interfacePtr)
      val result = INavigationViewStatics3.ABI.makeINavigationViewStatics3(interfacePtr.value)
      return result
    }

    public fun createINavigationViewFactory(): INavigationViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewFactory.ABI.makeINavigationViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = INavigationViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationView {
      val address = segment.toRawLongValue()
      return NavigationView(Pointer(address))
    }

    public override fun toNative(obj: NavigationView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsPaneOpenProperty() =
        ABI.INavigationViewStatics_Instance.get_IsPaneOpenProperty()

    public fun get_CompactModeThresholdWidthProperty() =
        ABI.INavigationViewStatics_Instance.get_CompactModeThresholdWidthProperty()

    public fun get_ExpandedModeThresholdWidthProperty() =
        ABI.INavigationViewStatics_Instance.get_ExpandedModeThresholdWidthProperty()

    public fun get_PaneFooterProperty() =
        ABI.INavigationViewStatics_Instance.get_PaneFooterProperty()

    public fun get_HeaderProperty() = ABI.INavigationViewStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.INavigationViewStatics_Instance.get_HeaderTemplateProperty()

    public fun get_DisplayModeProperty() =
        ABI.INavigationViewStatics_Instance.get_DisplayModeProperty()

    public fun get_IsSettingsVisibleProperty() =
        ABI.INavigationViewStatics_Instance.get_IsSettingsVisibleProperty()

    public fun get_IsPaneToggleButtonVisibleProperty() =
        ABI.INavigationViewStatics_Instance.get_IsPaneToggleButtonVisibleProperty()

    public fun get_AlwaysShowHeaderProperty() =
        ABI.INavigationViewStatics_Instance.get_AlwaysShowHeaderProperty()

    public fun get_CompactPaneLengthProperty() =
        ABI.INavigationViewStatics_Instance.get_CompactPaneLengthProperty()

    public fun get_OpenPaneLengthProperty() =
        ABI.INavigationViewStatics_Instance.get_OpenPaneLengthProperty()

    public fun get_PaneToggleButtonStyleProperty() =
        ABI.INavigationViewStatics_Instance.get_PaneToggleButtonStyleProperty()

    public fun get_MenuItemsProperty() = ABI.INavigationViewStatics_Instance.get_MenuItemsProperty()

    public fun get_MenuItemsSourceProperty() =
        ABI.INavigationViewStatics_Instance.get_MenuItemsSourceProperty()

    public fun get_SelectedItemProperty() =
        ABI.INavigationViewStatics_Instance.get_SelectedItemProperty()

    public fun get_SettingsItemProperty() =
        ABI.INavigationViewStatics_Instance.get_SettingsItemProperty()

    public fun get_AutoSuggestBoxProperty() =
        ABI.INavigationViewStatics_Instance.get_AutoSuggestBoxProperty()

    public fun get_MenuItemTemplateProperty() =
        ABI.INavigationViewStatics_Instance.get_MenuItemTemplateProperty()

    public fun get_MenuItemTemplateSelectorProperty() =
        ABI.INavigationViewStatics_Instance.get_MenuItemTemplateSelectorProperty()

    public fun get_MenuItemContainerStyleProperty() =
        ABI.INavigationViewStatics_Instance.get_MenuItemContainerStyleProperty()

    public fun get_MenuItemContainerStyleSelectorProperty() =
        ABI.INavigationViewStatics_Instance.get_MenuItemContainerStyleSelectorProperty()

    public fun get_IsBackButtonVisibleProperty() =
        ABI.INavigationViewStatics2_Instance.get_IsBackButtonVisibleProperty()

    public fun get_IsBackEnabledProperty() =
        ABI.INavigationViewStatics2_Instance.get_IsBackEnabledProperty()

    public fun get_PaneTitleProperty() =
        ABI.INavigationViewStatics2_Instance.get_PaneTitleProperty()

    public fun get_PaneDisplayModeProperty() =
        ABI.INavigationViewStatics3_Instance.get_PaneDisplayModeProperty()

    public fun get_PaneHeaderProperty() =
        ABI.INavigationViewStatics3_Instance.get_PaneHeaderProperty()

    public fun get_PaneCustomContentProperty() =
        ABI.INavigationViewStatics3_Instance.get_PaneCustomContentProperty()

    public fun get_ContentOverlayProperty() =
        ABI.INavigationViewStatics3_Instance.get_ContentOverlayProperty()

    public fun get_IsPaneVisibleProperty() =
        ABI.INavigationViewStatics3_Instance.get_IsPaneVisibleProperty()

    public fun get_SelectionFollowsFocusProperty() =
        ABI.INavigationViewStatics3_Instance.get_SelectionFollowsFocusProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.INavigationViewStatics3_Instance.get_TemplateSettingsProperty()

    public fun get_ShoulderNavigationEnabledProperty() =
        ABI.INavigationViewStatics3_Instance.get_ShoulderNavigationEnabledProperty()

    public fun get_OverflowLabelModeProperty() =
        ABI.INavigationViewStatics3_Instance.get_OverflowLabelModeProperty()
  }
}
