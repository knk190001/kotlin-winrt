package Windows.Security.Authentication.Web.Core

import Windows.Security.Authentication.Web.Core.IWebProviderErrorFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebProviderError.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.WebProviderError;{db191bb1-50c5-4809-8dca-09c99410245c})")
@WinRTByReference(brClass = WebProviderError.ByReference::class)
public class WebProviderError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebProviderError.WithDefault, IWinRTObject {
  private val __59762976_Interface: IWebProviderError.WithDefault by lazy {
    as_59762976()
  }


  public override val __59762976_Ptr: JNAPointer? by lazy {
    __59762976_Interface.__59762976_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__59762976_Interface)

  public constructor(errorCode: WinDef.UINT, errorMessage: String) : this(ABI.activate(errorCode,
      errorMessage))

  private fun as_59762976(): IWebProviderError.WithDefault {
    if(pointer == NULL) {
      return(IWebProviderError.ABI.makeIWebProviderError(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebProviderError>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebProviderError.ABI.makeIWebProviderError(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebProviderError> {
    public override fun getValue() = WebProviderError(pointer.getPointer(0))

    public fun setValue(value: WebProviderError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebProviderError, MemoryAddress> {
    public val IWebProviderErrorFactory_Instance: IWebProviderErrorFactory by lazy {
      createIWebProviderErrorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebProviderErrorFactory(): IWebProviderErrorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebProviderError".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebProviderErrorFactory.ABI.makeIWebProviderErrorFactory(factoryActivatorPtr.value))
    }

    public fun activate(errorCode: WinDef.UINT, errorMessage: String): JNAPointer? =
        IWebProviderErrorFactory_Instance.Create(errorCode, errorMessage)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebProviderError {
      val address = segment.toRawLongValue()
      return WebProviderError(Pointer(address))
    }

    public override fun toNative(obj: WebProviderError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
