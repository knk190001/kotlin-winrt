package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpContentDispositionHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpContentDispositionHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpContentDispositionHeaderValue;{f2a2eedc-2629-4b49-9908-96a168e9365e})")
@WinRTByReference(brClass = HttpContentDispositionHeaderValue.ByReference::class)
public class HttpContentDispositionHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContentDispositionHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1866697958_Interface: IHttpContentDispositionHeaderValue.WithDefault by lazy {
    as_1866697958()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1866697958_Ptr: JNAPointer? by lazy {
    __1866697958_Interface.__1866697958_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1866697958_Interface, __328683030_Interface)

  public constructor(dispositionType: String) : this(ABI.activate(dispositionType))

  private fun as_1866697958(): IHttpContentDispositionHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpContentDispositionHeaderValue.ABI.makeIHttpContentDispositionHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContentDispositionHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContentDispositionHeaderValue.ABI.makeIHttpContentDispositionHeaderValue(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpContentDispositionHeaderValue> {
    public override fun getValue() = HttpContentDispositionHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpContentDispositionHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpContentDispositionHeaderValue, MemoryAddress> {
    public val IHttpContentDispositionHeaderValueStatics_Instance:
        IHttpContentDispositionHeaderValueStatics by lazy {
      createIHttpContentDispositionHeaderValueStatics()
    }


    public val IHttpContentDispositionHeaderValueFactory_Instance:
        IHttpContentDispositionHeaderValueFactory by lazy {
      createIHttpContentDispositionHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpContentDispositionHeaderValueStatics():
        IHttpContentDispositionHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpContentDispositionHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpContentDispositionHeaderValueStatics.ABI.makeIHttpContentDispositionHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpContentDispositionHeaderValueFactory():
        IHttpContentDispositionHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentDispositionHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpContentDispositionHeaderValueFactory.ABI.makeIHttpContentDispositionHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(dispositionType: String): JNAPointer? =
        IHttpContentDispositionHeaderValueFactory_Instance.Create(dispositionType)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpContentDispositionHeaderValue {
      val address = segment.toRawLongValue()
      return HttpContentDispositionHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpContentDispositionHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) =
        ABI.IHttpContentDispositionHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, contentDispositionHeaderValue: ByReference) =
        ABI.IHttpContentDispositionHeaderValueStatics_Instance.TryParse(input,
        contentDispositionHeaderValue)
  }
}
