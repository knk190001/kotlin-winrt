package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpProductInfoHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpProductInfoHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpProductInfoHeaderValue;{1b1a8732-4c35-486a-966f-646489198e4d})")
@WinRTByReference(brClass = HttpProductInfoHeaderValue.ByReference::class)
public class HttpProductInfoHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpProductInfoHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject
    {
  private val __2086452653_Interface: IHttpProductInfoHeaderValue.WithDefault by lazy {
    as_2086452653()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __2086452653_Ptr: JNAPointer? by lazy {
    __2086452653_Interface.__2086452653_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2086452653_Interface, __328683030_Interface)

  public constructor(productComment: String) : this(ABI.activate(productComment))

  public constructor(productName: String, productVersion: String) : this(ABI.activate(productName,
      productVersion))

  private fun as_2086452653(): IHttpProductInfoHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpProductInfoHeaderValue.ABI.makeIHttpProductInfoHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpProductInfoHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpProductInfoHeaderValue.ABI.makeIHttpProductInfoHeaderValue(ref.value))
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
      IByReference<HttpProductInfoHeaderValue> {
    public override fun getValue() = HttpProductInfoHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpProductInfoHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpProductInfoHeaderValue, MemoryAddress> {
    public val IHttpProductInfoHeaderValueStatics_Instance: IHttpProductInfoHeaderValueStatics by
        lazy {
      createIHttpProductInfoHeaderValueStatics()
    }


    public val IHttpProductInfoHeaderValueFactory_Instance: IHttpProductInfoHeaderValueFactory by
        lazy {
      createIHttpProductInfoHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpProductInfoHeaderValueStatics(): IHttpProductInfoHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpProductInfoHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpProductInfoHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpProductInfoHeaderValueStatics.ABI.makeIHttpProductInfoHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpProductInfoHeaderValueFactory(): IHttpProductInfoHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpProductInfoHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpProductInfoHeaderValueFactory.ABI.makeIHttpProductInfoHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(productComment: String): JNAPointer? =
        IHttpProductInfoHeaderValueFactory_Instance.CreateFromComment(productComment)?.pointer

    public fun activate(productName: String, productVersion: String): JNAPointer? =
        IHttpProductInfoHeaderValueFactory_Instance.CreateFromNameWithVersion(productName,
        productVersion)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpProductInfoHeaderValue {
      val address = segment.toRawLongValue()
      return HttpProductInfoHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpProductInfoHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpProductInfoHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, productInfoHeaderValue: ByReference) =
        ABI.IHttpProductInfoHeaderValueStatics_Instance.TryParse(input, productInfoHeaderValue)
  }
}
