package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpContentCodingHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpContentCodingHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpContentCodingHeaderValue;{bcf7f92a-9376-4d85-bccc-9f4f9acab434})")
@WinRTByReference(brClass = HttpContentCodingHeaderValue.ByReference::class)
public class HttpContentCodingHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContentCodingHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __835152013_Interface: IHttpContentCodingHeaderValue.WithDefault by lazy {
    as_835152013()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __835152013_Ptr: JNAPointer? by lazy {
    __835152013_Interface.__835152013_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__835152013_Interface, __328683030_Interface)

  public constructor(contentCoding: String) : this(ABI.activate(contentCoding))

  private fun as_835152013(): IHttpContentCodingHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpContentCodingHeaderValue.ABI.makeIHttpContentCodingHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContentCodingHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContentCodingHeaderValue.ABI.makeIHttpContentCodingHeaderValue(ref.value))
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
      IByReference<HttpContentCodingHeaderValue> {
    public override fun getValue() = HttpContentCodingHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpContentCodingHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpContentCodingHeaderValue, MemoryAddress> {
    public val IHttpContentCodingHeaderValueStatics_Instance: IHttpContentCodingHeaderValueStatics
        by lazy {
      createIHttpContentCodingHeaderValueStatics()
    }


    public val IHttpContentCodingHeaderValueFactory_Instance: IHttpContentCodingHeaderValueFactory
        by lazy {
      createIHttpContentCodingHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpContentCodingHeaderValueStatics(): IHttpContentCodingHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpContentCodingHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentCodingHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpContentCodingHeaderValueStatics.ABI.makeIHttpContentCodingHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpContentCodingHeaderValueFactory(): IHttpContentCodingHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentCodingHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpContentCodingHeaderValueFactory.ABI.makeIHttpContentCodingHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(contentCoding: String): JNAPointer? =
        IHttpContentCodingHeaderValueFactory_Instance.Create(contentCoding)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpContentCodingHeaderValue {
      val address = segment.toRawLongValue()
      return HttpContentCodingHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpContentCodingHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpContentCodingHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, contentCodingHeaderValue: ByReference) =
        ABI.IHttpContentCodingHeaderValueStatics_Instance.TryParse(input, contentCodingHeaderValue)
  }
}
