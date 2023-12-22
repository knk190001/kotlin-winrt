package Microsoft.Web.WebView2.Core

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2EnvironmentOptions.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2EnvironmentOptions;{e77350fb-77a1-56f7-be95-eb7f8a7a3072})")
@WinRTByReference(brClass = CoreWebView2EnvironmentOptions.ByReference::class)
public class CoreWebView2EnvironmentOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2EnvironmentOptions2.WithDefault,
    ICoreWebView2EnvironmentOptions3.WithDefault, ICoreWebView2EnvironmentOptions4.WithDefault,
    ICoreWebView2EnvironmentOptions5.WithDefault,
    ICoreWebView2EnvironmentOptions_Manual.WithDefault, ICoreWebView2EnvironmentOptions.WithDefault,
    IWinRTObject {
  private val __407832896_Interface: ICoreWebView2EnvironmentOptions2.WithDefault by lazy {
    as_407832896()
  }


  private val __407832895_Interface: ICoreWebView2EnvironmentOptions3.WithDefault by lazy {
    as_407832895()
  }


  private val __407832894_Interface: ICoreWebView2EnvironmentOptions4.WithDefault by lazy {
    as_407832894()
  }


  private val __407832893_Interface: ICoreWebView2EnvironmentOptions5.WithDefault by lazy {
    as_407832893()
  }


  private val __582296851_Interface: ICoreWebView2EnvironmentOptions_Manual.WithDefault by lazy {
    as_582296851()
  }


  private val __567345230_Interface: ICoreWebView2EnvironmentOptions.WithDefault by lazy {
    as_567345230()
  }


  public override val __407832896_Ptr: JNAPointer? by lazy {
    __407832896_Interface.__407832896_Ptr
  }


  public override val __407832895_Ptr: JNAPointer? by lazy {
    __407832895_Interface.__407832895_Ptr
  }


  public override val __407832894_Ptr: JNAPointer? by lazy {
    __407832894_Interface.__407832894_Ptr
  }


  public override val __407832893_Ptr: JNAPointer? by lazy {
    __407832893_Interface.__407832893_Ptr
  }


  public override val __582296851_Ptr: JNAPointer? by lazy {
    __582296851_Interface.__582296851_Ptr
  }


  public override val __567345230_Ptr: JNAPointer? by lazy {
    __567345230_Interface.__567345230_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__407832896_Interface, __407832895_Interface, __407832894_Interface,
        __407832893_Interface, __582296851_Interface, __567345230_Interface)

  public constructor() : this(ABI.activate())

  private fun as_407832896(): ICoreWebView2EnvironmentOptions2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2EnvironmentOptions2.ABI.makeICoreWebView2EnvironmentOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2EnvironmentOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2EnvironmentOptions2.ABI.makeICoreWebView2EnvironmentOptions2(ref.value))
  }

  private fun as_407832895(): ICoreWebView2EnvironmentOptions3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2EnvironmentOptions3.ABI.makeICoreWebView2EnvironmentOptions3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2EnvironmentOptions3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2EnvironmentOptions3.ABI.makeICoreWebView2EnvironmentOptions3(ref.value))
  }

  private fun as_407832894(): ICoreWebView2EnvironmentOptions4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2EnvironmentOptions4.ABI.makeICoreWebView2EnvironmentOptions4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2EnvironmentOptions4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2EnvironmentOptions4.ABI.makeICoreWebView2EnvironmentOptions4(ref.value))
  }

  private fun as_407832893(): ICoreWebView2EnvironmentOptions5.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2EnvironmentOptions5.ABI.makeICoreWebView2EnvironmentOptions5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2EnvironmentOptions5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2EnvironmentOptions5.ABI.makeICoreWebView2EnvironmentOptions5(ref.value))
  }

  private fun as_582296851(): ICoreWebView2EnvironmentOptions_Manual.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2EnvironmentOptions_Manual.ABI.makeICoreWebView2EnvironmentOptions_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2EnvironmentOptions_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2EnvironmentOptions_Manual.ABI.makeICoreWebView2EnvironmentOptions_Manual(ref.value))
  }

  private fun as_567345230(): ICoreWebView2EnvironmentOptions.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2EnvironmentOptions.ABI.makeICoreWebView2EnvironmentOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2EnvironmentOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2EnvironmentOptions.ABI.makeICoreWebView2EnvironmentOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2EnvironmentOptions> {
    public override fun getValue() = CoreWebView2EnvironmentOptions(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2EnvironmentOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2EnvironmentOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Web.WebView2.Core.CoreWebView2EnvironmentOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CoreWebView2EnvironmentOptions {
      val address = segment.toRawLongValue()
      return CoreWebView2EnvironmentOptions(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2EnvironmentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
