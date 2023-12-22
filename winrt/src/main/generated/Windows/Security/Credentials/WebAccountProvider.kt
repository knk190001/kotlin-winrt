package Windows.Security.Credentials

import Windows.Foundation.Uri
import Windows.Security.Credentials.IWebAccountProviderFactory.ABI.IID
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

@ABIMarker(WebAccountProvider.ABI::class)
@Signature("rc(Windows.Security.Credentials.WebAccountProvider;{29dcc8c3-7ab9-4a7c-a336-b942f9dbf7c7})")
@WinRTByReference(brClass = WebAccountProvider.ByReference::class)
public class WebAccountProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProvider.WithDefault, IWebAccountProvider2.WithDefault,
    IWebAccountProvider3.WithDefault, IWebAccountProvider4.WithDefault, IWinRTObject {
  private val __1576826074_Interface: IWebAccountProvider.WithDefault by lazy {
    as_1576826074()
  }


  private val __1636968088_Interface: IWebAccountProvider2.WithDefault by lazy {
    as_1636968088()
  }


  private val __1636968089_Interface: IWebAccountProvider3.WithDefault by lazy {
    as_1636968089()
  }


  private val __1636968090_Interface: IWebAccountProvider4.WithDefault by lazy {
    as_1636968090()
  }


  public override val __1576826074_Ptr: JNAPointer? by lazy {
    __1576826074_Interface.__1576826074_Ptr
  }


  public override val __1636968088_Ptr: JNAPointer? by lazy {
    __1636968088_Interface.__1636968088_Ptr
  }


  public override val __1636968089_Ptr: JNAPointer? by lazy {
    __1636968089_Interface.__1636968089_Ptr
  }


  public override val __1636968090_Ptr: JNAPointer? by lazy {
    __1636968090_Interface.__1636968090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576826074_Interface, __1636968088_Interface, __1636968089_Interface,
        __1636968090_Interface)

  public constructor(
    id: String,
    displayName: String,
    iconUri: Uri
  ) : this(ABI.activate(id, displayName, iconUri))

  private fun as_1576826074(): IWebAccountProvider.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProvider.ABI.makeIWebAccountProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProvider.ABI.makeIWebAccountProvider(ref.value))
  }

  private fun as_1636968088(): IWebAccountProvider2.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProvider2.ABI.makeIWebAccountProvider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProvider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProvider2.ABI.makeIWebAccountProvider2(ref.value))
  }

  private fun as_1636968089(): IWebAccountProvider3.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProvider3.ABI.makeIWebAccountProvider3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProvider3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProvider3.ABI.makeIWebAccountProvider3(ref.value))
  }

  private fun as_1636968090(): IWebAccountProvider4.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProvider4.ABI.makeIWebAccountProvider4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProvider4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProvider4.ABI.makeIWebAccountProvider4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountProvider> {
    public override fun getValue() = WebAccountProvider(pointer.getPointer(0))

    public fun setValue(value: WebAccountProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProvider, MemoryAddress> {
    public val IWebAccountProviderFactory_Instance: IWebAccountProviderFactory by lazy {
      createIWebAccountProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAccountProviderFactory(): IWebAccountProviderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.WebAccountProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebAccountProviderFactory.ABI.makeIWebAccountProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      id: String,
      displayName: String,
      iconUri: Uri
    ): JNAPointer? = IWebAccountProviderFactory_Instance.CreateWebAccountProvider(id, displayName,
        iconUri)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebAccountProvider {
      val address = segment.toRawLongValue()
      return WebAccountProvider(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
