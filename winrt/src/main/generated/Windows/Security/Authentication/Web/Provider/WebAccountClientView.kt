package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Uri
import Windows.Security.Authentication.Web.Provider.IWebAccountClientViewFactory.ABI.IID
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebAccountClientView.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebAccountClientView;{e7bd66ba-0bc7-4c66-bfd4-65d3082cbca8})")
@WinRTByReference(brClass = WebAccountClientView.ByReference::class)
public class WebAccountClientView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountClientView.WithDefault, IWinRTObject {
  private val __2041313428_Interface: IWebAccountClientView.WithDefault by lazy {
    as_2041313428()
  }


  public override val __2041313428_Ptr: JNAPointer? by lazy {
    __2041313428_Interface.__2041313428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2041313428_Interface)

  public constructor(viewType: WebAccountClientViewType, applicationCallbackUri: Uri) :
      this(ABI.activate(viewType, applicationCallbackUri))

  public constructor(
    viewType: WebAccountClientViewType,
    applicationCallbackUri: Uri,
    accountPairwiseId: String
  ) : this(ABI.activate(viewType, applicationCallbackUri, accountPairwiseId))

  private fun as_2041313428(): IWebAccountClientView.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountClientView.ABI.makeIWebAccountClientView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountClientView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountClientView.ABI.makeIWebAccountClientView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountClientView> {
    public override fun getValue() = WebAccountClientView(pointer.getPointer(0))

    public fun setValue(value: WebAccountClientView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountClientView, MemoryAddress> {
    public val IWebAccountClientViewFactory_Instance: IWebAccountClientViewFactory by lazy {
      createIWebAccountClientViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAccountClientViewFactory(): IWebAccountClientViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountClientView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebAccountClientViewFactory.ABI.makeIWebAccountClientViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(viewType: WebAccountClientViewType, applicationCallbackUri: Uri):
        JNAPointer? = IWebAccountClientViewFactory_Instance.Create(viewType,
        applicationCallbackUri)?.pointer

    public fun activate(
      viewType: WebAccountClientViewType,
      applicationCallbackUri: Uri,
      accountPairwiseId: String
    ): JNAPointer? = IWebAccountClientViewFactory_Instance.CreateWithPairwiseId(viewType,
        applicationCallbackUri, accountPairwiseId)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebAccountClientView {
      val address = segment.toRawLongValue()
      return WebAccountClientView(Pointer(address))
    }

    public override fun toNative(obj: WebAccountClientView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
