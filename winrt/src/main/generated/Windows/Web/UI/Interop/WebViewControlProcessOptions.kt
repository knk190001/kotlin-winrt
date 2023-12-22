package Windows.Web.UI.Interop

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

@ABIMarker(WebViewControlProcessOptions.ABI::class)
@Signature("rc(Windows.Web.UI.Interop.WebViewControlProcessOptions;{1cca72a7-3bd6-4826-8261-6c8189505d89})")
@WinRTByReference(brClass = WebViewControlProcessOptions.ByReference::class)
public class WebViewControlProcessOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewControlProcessOptions.WithDefault, IWinRTObject {
  private val __432722156_Interface: IWebViewControlProcessOptions.WithDefault by lazy {
    as_432722156()
  }


  public override val __432722156_Ptr: JNAPointer? by lazy {
    __432722156_Interface.__432722156_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__432722156_Interface)

  public constructor() : this(ABI.activate())

  private fun as_432722156(): IWebViewControlProcessOptions.WithDefault {
    if(pointer == NULL) {
      return(IWebViewControlProcessOptions.ABI.makeIWebViewControlProcessOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewControlProcessOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewControlProcessOptions.ABI.makeIWebViewControlProcessOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewControlProcessOptions> {
    public override fun getValue() = WebViewControlProcessOptions(pointer.getPointer(0))

    public fun setValue(value: WebViewControlProcessOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewControlProcessOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.UI.Interop.WebViewControlProcessOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): WebViewControlProcessOptions {
      val address = segment.toRawLongValue()
      return WebViewControlProcessOptions(Pointer(address))
    }

    public override fun toNative(obj: WebViewControlProcessOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
