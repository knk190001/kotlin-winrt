package Windows.Web.Http

import Windows.Foundation.IClosable
import Windows.Foundation.IStringable
import Windows.Web.Http.Filters.IHttpFilter
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

@ABIMarker(HttpClient.ABI::class)
@Signature("rc(Windows.Web.Http.HttpClient;{7fda1151-3574-4880-a8ba-e6b1e0061f3d})")
@WinRTByReference(brClass = HttpClient.ByReference::class)
public class HttpClient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpClient.WithDefault, IHttpClient2.WithDefault, IClosable.WithDefault,
    IStringable.WithDefault, IWinRTObject {
  private val __1755101999_Interface: IHttpClient.WithDefault by lazy {
    as_1755101999()
  }


  private val __1426412829_Interface: IHttpClient2.WithDefault by lazy {
    as_1426412829()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1755101999_Ptr: JNAPointer? by lazy {
    __1755101999_Interface.__1755101999_Ptr
  }


  public override val __1426412829_Ptr: JNAPointer? by lazy {
    __1426412829_Interface.__1426412829_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1755101999_Interface, __1426412829_Interface, __1260617006_Interface,
        __328683030_Interface)

  public constructor() : this(ABI.activate())

  public constructor(filter: IHttpFilter) : this(ABI.activate(filter))

  private fun as_1755101999(): IHttpClient.WithDefault {
    if(pointer == NULL) {
      return(IHttpClient.ABI.makeIHttpClient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpClient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpClient.ABI.makeIHttpClient(ref.value))
  }

  private fun as_1426412829(): IHttpClient2.WithDefault {
    if(pointer == NULL) {
      return(IHttpClient2.ABI.makeIHttpClient2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpClient2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpClient2.ABI.makeIHttpClient2(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HttpClient> {
    public override fun getValue() = HttpClient(pointer.getPointer(0))

    public fun setValue(value: HttpClient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpClient, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IHttpClientFactory_Instance: IHttpClientFactory by lazy {
      createIHttpClientFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpClient".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIHttpClientFactory(): IHttpClientFactory {
      val refiid = Guid.REFIID(IHttpClientFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpClient".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpClientFactory.ABI.makeIHttpClientFactory(factoryActivatorPtr.value))
    }

    public fun activate(filter: IHttpFilter): JNAPointer? =
        IHttpClientFactory_Instance.Create(filter)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpClient {
      val address = segment.toRawLongValue()
      return HttpClient(Pointer(address))
    }

    public override fun toNative(obj: HttpClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
