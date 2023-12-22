package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpContentCodingWithQualityHeaderValueFactory.ABI.IID
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
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpContentCodingWithQualityHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue;{94531cd5-8b13-4d73-8651-f76b38f88495})")
@WinRTByReference(brClass = HttpContentCodingWithQualityHeaderValue.ByReference::class)
public class HttpContentCodingWithQualityHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContentCodingWithQualityHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1934322306_Interface: IHttpContentCodingWithQualityHeaderValue.WithDefault by lazy {
    as_1934322306()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1934322306_Ptr: JNAPointer? by lazy {
    __1934322306_Interface.__1934322306_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1934322306_Interface, __328683030_Interface)

  public constructor(contentCoding: String) : this(ABI.activate(contentCoding))

  public constructor(contentCoding: String, quality: Double) : this(ABI.activate(contentCoding,
      quality))

  private fun as_1934322306(): IHttpContentCodingWithQualityHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpContentCodingWithQualityHeaderValue.ABI.makeIHttpContentCodingWithQualityHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContentCodingWithQualityHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContentCodingWithQualityHeaderValue.ABI.makeIHttpContentCodingWithQualityHeaderValue(ref.value))
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
      IByReference<HttpContentCodingWithQualityHeaderValue> {
    public override fun getValue() = HttpContentCodingWithQualityHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpContentCodingWithQualityHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpContentCodingWithQualityHeaderValue, MemoryAddress> {
    public val IHttpContentCodingWithQualityHeaderValueStatics_Instance:
        IHttpContentCodingWithQualityHeaderValueStatics by lazy {
      createIHttpContentCodingWithQualityHeaderValueStatics()
    }


    public val IHttpContentCodingWithQualityHeaderValueFactory_Instance:
        IHttpContentCodingWithQualityHeaderValueFactory by lazy {
      createIHttpContentCodingWithQualityHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpContentCodingWithQualityHeaderValueStatics():
        IHttpContentCodingWithQualityHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpContentCodingWithQualityHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpContentCodingWithQualityHeaderValueStatics.ABI.makeIHttpContentCodingWithQualityHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpContentCodingWithQualityHeaderValueFactory():
        IHttpContentCodingWithQualityHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentCodingWithQualityHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpContentCodingWithQualityHeaderValueFactory.ABI.makeIHttpContentCodingWithQualityHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(contentCoding: String): JNAPointer? =
        IHttpContentCodingWithQualityHeaderValueFactory_Instance.CreateFromValue(contentCoding)?.pointer

    public fun activate(contentCoding: String, quality: Double): JNAPointer? =
        IHttpContentCodingWithQualityHeaderValueFactory_Instance.CreateFromValueWithQuality(contentCoding,
        quality)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        HttpContentCodingWithQualityHeaderValue {
      val address = segment.toRawLongValue()
      return HttpContentCodingWithQualityHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpContentCodingWithQualityHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) =
        ABI.IHttpContentCodingWithQualityHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, contentCodingWithQualityHeaderValue: ByReference) =
        ABI.IHttpContentCodingWithQualityHeaderValueStatics_Instance.TryParse(input,
        contentCodingWithQualityHeaderValue)
  }
}
