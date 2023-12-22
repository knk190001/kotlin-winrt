package Windows.Web.Http

import Windows.Foundation.IStringable
import Windows.Web.Http.IHttpMethodFactory.ABI.IID
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

@ABIMarker(HttpMethod.ABI::class)
@Signature("rc(Windows.Web.Http.HttpMethod;{728d4022-700d-4fe0-afa5-40299c58dbfd})")
@WinRTByReference(brClass = HttpMethod.ByReference::class)
public class HttpMethod(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpMethod.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __2035259461_Interface: IHttpMethod.WithDefault by lazy {
    as_2035259461()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __2035259461_Ptr: JNAPointer? by lazy {
    __2035259461_Interface.__2035259461_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2035259461_Interface, __328683030_Interface)

  public constructor(method: String) : this(ABI.activate(method))

  private fun as_2035259461(): IHttpMethod.WithDefault {
    if(pointer == NULL) {
      return(IHttpMethod.ABI.makeIHttpMethod(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpMethod>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpMethod.ABI.makeIHttpMethod(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HttpMethod> {
    public override fun getValue() = HttpMethod(pointer.getPointer(0))

    public fun setValue(value: HttpMethod): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpMethod, MemoryAddress> {
    public val IHttpMethodStatics_Instance: IHttpMethodStatics by lazy {
      createIHttpMethodStatics()
    }


    public val IHttpMethodFactory_Instance: IHttpMethodFactory by lazy {
      createIHttpMethodFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpMethodStatics(): IHttpMethodStatics {
      val refiid = Guid.REFIID(IHttpMethodStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpMethod".toHandle(),refiid,interfacePtr)
      val result = IHttpMethodStatics.ABI.makeIHttpMethodStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpMethodFactory(): IHttpMethodFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpMethod".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpMethodFactory.ABI.makeIHttpMethodFactory(factoryActivatorPtr.value))
    }

    public fun activate(method: String): JNAPointer? =
        IHttpMethodFactory_Instance.Create(method)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpMethod {
      val address = segment.toRawLongValue()
      return HttpMethod(Pointer(address))
    }

    public override fun toNative(obj: HttpMethod): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Delete() = ABI.IHttpMethodStatics_Instance.get_Delete()

    public fun get_Get() = ABI.IHttpMethodStatics_Instance.get_Get()

    public fun get_Head() = ABI.IHttpMethodStatics_Instance.get_Head()

    public fun get_Options() = ABI.IHttpMethodStatics_Instance.get_Options()

    public fun get_Patch() = ABI.IHttpMethodStatics_Instance.get_Patch()

    public fun get_Post() = ABI.IHttpMethodStatics_Instance.get_Post()

    public fun get_Put() = ABI.IHttpMethodStatics_Instance.get_Put()
  }
}
