package Windows.UI.Xaml.Controls

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
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(WebView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebView;{5862cc46-1f7d-479b-92a6-de7858fe8d54})")
@WinRTByReference(brClass = WebView.ByReference::class)
public class WebView(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IWebView.WithDefault, IWebView2.WithDefault, IWebView3.WithDefault,
    IWebView4.WithDefault, IWebView5.WithDefault, IWebView6.WithDefault, IWebView7.WithDefault,
    IWinRTObject {
  private val __376421501_Interface: IWebView.WithDefault by lazy {
    as_376421501()
  }


  private val __1215835307_Interface: IWebView2.WithDefault by lazy {
    as_1215835307()
  }


  private val __1215835306_Interface: IWebView3.WithDefault by lazy {
    as_1215835306()
  }


  private val __1215835305_Interface: IWebView4.WithDefault by lazy {
    as_1215835305()
  }


  private val __1215835304_Interface: IWebView5.WithDefault by lazy {
    as_1215835304()
  }


  private val __1215835303_Interface: IWebView6.WithDefault by lazy {
    as_1215835303()
  }


  private val __1215835302_Interface: IWebView7.WithDefault by lazy {
    as_1215835302()
  }


  public override val __376421501_Ptr: JNAPointer? by lazy {
    __376421501_Interface.__376421501_Ptr
  }


  public override val __1215835307_Ptr: JNAPointer? by lazy {
    __1215835307_Interface.__1215835307_Ptr
  }


  public override val __1215835306_Ptr: JNAPointer? by lazy {
    __1215835306_Interface.__1215835306_Ptr
  }


  public override val __1215835305_Ptr: JNAPointer? by lazy {
    __1215835305_Interface.__1215835305_Ptr
  }


  public override val __1215835304_Ptr: JNAPointer? by lazy {
    __1215835304_Interface.__1215835304_Ptr
  }


  public override val __1215835303_Ptr: JNAPointer? by lazy {
    __1215835303_Interface.__1215835303_Ptr
  }


  public override val __1215835302_Ptr: JNAPointer? by lazy {
    __1215835302_Interface.__1215835302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__376421501_Interface, __1215835307_Interface, __1215835306_Interface,
        __1215835305_Interface, __1215835304_Interface, __1215835303_Interface,
        __1215835302_Interface)

  public constructor() : this(ABI.activate())

  public constructor(executionMode: WebViewExecutionMode) : this(ABI.activate(executionMode))

  private fun as_376421501(): IWebView.WithDefault {
    if(pointer == NULL) {
      return(IWebView.ABI.makeIWebView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView.ABI.makeIWebView(ref.value))
  }

  private fun as_1215835307(): IWebView2.WithDefault {
    if(pointer == NULL) {
      return(IWebView2.ABI.makeIWebView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView2.ABI.makeIWebView2(ref.value))
  }

  private fun as_1215835306(): IWebView3.WithDefault {
    if(pointer == NULL) {
      return(IWebView3.ABI.makeIWebView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView3.ABI.makeIWebView3(ref.value))
  }

  private fun as_1215835305(): IWebView4.WithDefault {
    if(pointer == NULL) {
      return(IWebView4.ABI.makeIWebView4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView4.ABI.makeIWebView4(ref.value))
  }

  private fun as_1215835304(): IWebView5.WithDefault {
    if(pointer == NULL) {
      return(IWebView5.ABI.makeIWebView5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView5.ABI.makeIWebView5(ref.value))
  }

  private fun as_1215835303(): IWebView6.WithDefault {
    if(pointer == NULL) {
      return(IWebView6.ABI.makeIWebView6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView6.ABI.makeIWebView6(ref.value))
  }

  private fun as_1215835302(): IWebView7.WithDefault {
    if(pointer == NULL) {
      return(IWebView7.ABI.makeIWebView7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebView7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebView7.ABI.makeIWebView7(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebView> {
    public override fun getValue() = WebView(pointer.getPointer(0))

    public fun setValue(value: WebView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebView, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWebViewStatics4_Instance: IWebViewStatics4 by lazy {
      createIWebViewStatics4()
    }


    public val IWebViewStatics2_Instance: IWebViewStatics2 by lazy {
      createIWebViewStatics2()
    }


    public val IWebViewStatics3_Instance: IWebViewStatics3 by lazy {
      createIWebViewStatics3()
    }


    public val IWebViewStatics5_Instance: IWebViewStatics5 by lazy {
      createIWebViewStatics5()
    }


    public val IWebViewStatics_Instance: IWebViewStatics by lazy {
      createIWebViewStatics()
    }


    public val IWebViewFactory4_Instance: IWebViewFactory4 by lazy {
      createIWebViewFactory4()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIWebViewStatics4(): IWebViewStatics4 {
      val refiid = Guid.REFIID(IWebViewStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),refiid,interfacePtr)
      val result = IWebViewStatics4.ABI.makeIWebViewStatics4(interfacePtr.value)
      return result
    }

    public fun createIWebViewStatics2(): IWebViewStatics2 {
      val refiid = Guid.REFIID(IWebViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),refiid,interfacePtr)
      val result = IWebViewStatics2.ABI.makeIWebViewStatics2(interfacePtr.value)
      return result
    }

    public fun createIWebViewStatics3(): IWebViewStatics3 {
      val refiid = Guid.REFIID(IWebViewStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),refiid,interfacePtr)
      val result = IWebViewStatics3.ABI.makeIWebViewStatics3(interfacePtr.value)
      return result
    }

    public fun createIWebViewStatics5(): IWebViewStatics5 {
      val refiid = Guid.REFIID(IWebViewStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),refiid,interfacePtr)
      val result = IWebViewStatics5.ABI.makeIWebViewStatics5(interfacePtr.value)
      return result
    }

    public fun createIWebViewStatics(): IWebViewStatics {
      val refiid = Guid.REFIID(IWebViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),refiid,interfacePtr)
      val result = IWebViewStatics.ABI.makeIWebViewStatics(interfacePtr.value)
      return result
    }

    public fun createIWebViewFactory4(): IWebViewFactory4 {
      val refiid = Guid.REFIID(IWebViewFactory4.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.WebView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebViewFactory4.ABI.makeIWebViewFactory4(factoryActivatorPtr.value))
    }

    public fun activate(executionMode: WebViewExecutionMode): JNAPointer? =
        IWebViewFactory4_Instance.CreateInstanceWithExecutionMode(executionMode)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebView {
      val address = segment.toRawLongValue()
      return WebView(Pointer(address))
    }

    public override fun toNative(obj: WebView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DefaultExecutionMode() = ABI.IWebViewStatics4_Instance.get_DefaultExecutionMode()

    public fun ClearTemporaryWebDataAsync() =
        ABI.IWebViewStatics4_Instance.ClearTemporaryWebDataAsync()

    public fun get_CanGoBackProperty() = ABI.IWebViewStatics2_Instance.get_CanGoBackProperty()

    public fun get_CanGoForwardProperty() = ABI.IWebViewStatics2_Instance.get_CanGoForwardProperty()

    public fun get_DocumentTitleProperty() =
        ABI.IWebViewStatics2_Instance.get_DocumentTitleProperty()

    public fun get_DefaultBackgroundColorProperty() =
        ABI.IWebViewStatics2_Instance.get_DefaultBackgroundColorProperty()

    public fun get_ContainsFullScreenElementProperty() =
        ABI.IWebViewStatics3_Instance.get_ContainsFullScreenElementProperty()

    public fun get_XYFocusLeftProperty() = ABI.IWebViewStatics5_Instance.get_XYFocusLeftProperty()

    public fun get_XYFocusRightProperty() = ABI.IWebViewStatics5_Instance.get_XYFocusRightProperty()

    public fun get_XYFocusUpProperty() = ABI.IWebViewStatics5_Instance.get_XYFocusUpProperty()

    public fun get_XYFocusDownProperty() = ABI.IWebViewStatics5_Instance.get_XYFocusDownProperty()

    public fun get_AnyScriptNotifyUri() = ABI.IWebViewStatics_Instance.get_AnyScriptNotifyUri()

    public fun get_SourceProperty() = ABI.IWebViewStatics_Instance.get_SourceProperty()

    public fun get_AllowedScriptNotifyUrisProperty() =
        ABI.IWebViewStatics_Instance.get_AllowedScriptNotifyUrisProperty()

    public fun get_DataTransferPackageProperty() =
        ABI.IWebViewStatics_Instance.get_DataTransferPackageProperty()
  }
}
