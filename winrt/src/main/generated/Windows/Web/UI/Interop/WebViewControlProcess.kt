package Windows.Web.UI.Interop

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebViewControlProcess.ABI::class)
@Signature("rc(Windows.Web.UI.Interop.WebViewControlProcess;{02c723ec-98d6-424a-b63e-c6136c36a0f2})")
@WinRTByReference(brClass = WebViewControlProcess.ByReference::class)
public class WebViewControlProcess(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlProcess.WithDefault, IWinRTObject {
  private val __224539606_Interface: IWebViewControlProcess.WithDefault by lazy {
    as_224539606()
  }


  public override val __224539606_Ptr: JNAPointer? by lazy {
    __224539606_Interface.__224539606_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__224539606_Interface)

  public constructor() : this(ABI.activate())

  public constructor(processOptions: WebViewControlProcessOptions) :
      this(ABI.activate(processOptions))

  private fun as_224539606(): IWebViewControlProcess.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlProcess.ABI.makeIWebViewControlProcess(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlProcess>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlProcess.ABI.makeIWebViewControlProcess(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlProcess> {
    public override fun getValue() = WebViewControlProcess(pointer.getPointer(0))

    public fun setValue(value: WebViewControlProcess): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlProcess, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWebViewControlProcessFactory_Instance: IWebViewControlProcessFactory by lazy {
      createIWebViewControlProcessFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.UI.Interop.WebViewControlProcess".toHandle(),
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

    public fun createIWebViewControlProcessFactory(): IWebViewControlProcessFactory {
      val refiid = Guid.REFIID(IWebViewControlProcessFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.UI.Interop.WebViewControlProcess".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebViewControlProcessFactory.ABI.makeIWebViewControlProcessFactory(factoryActivatorPtr.value))
    }

    public fun activate(processOptions: WebViewControlProcessOptions): JNAPointer? =
        IWebViewControlProcessFactory_Instance.CreateWithOptions(processOptions)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebViewControlProcess {
      val address = segment.toRawLongValue()
      return WebViewControlProcess(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlProcess): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
