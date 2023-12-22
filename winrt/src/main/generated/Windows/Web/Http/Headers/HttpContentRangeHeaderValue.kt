package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpContentRangeHeaderValueFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpContentRangeHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpContentRangeHeaderValue;{04d967d3-a4f6-495c-9530-8579fcba8aa9})")
@WinRTByReference(brClass = HttpContentRangeHeaderValue.ByReference::class)
public class HttpContentRangeHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContentRangeHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1010176108_Interface: IHttpContentRangeHeaderValue.WithDefault by lazy {
    as_1010176108()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1010176108_Ptr: JNAPointer? by lazy {
    __1010176108_Interface.__1010176108_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1010176108_Interface, __328683030_Interface)

  public constructor(length: WinDef.ULONG) : this(ABI.activate(length))

  public constructor(from: WinDef.ULONG, to: WinDef.ULONG) : this(ABI.activate(from, to))

  public constructor(
    from: WinDef.ULONG,
    to: WinDef.ULONG,
    length: WinDef.ULONG
  ) : this(ABI.activate(from, to, length))

  private fun as_1010176108(): IHttpContentRangeHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpContentRangeHeaderValue.ABI.makeIHttpContentRangeHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContentRangeHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContentRangeHeaderValue.ABI.makeIHttpContentRangeHeaderValue(ref.value))
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
      IByReference<HttpContentRangeHeaderValue> {
    public override fun getValue() = HttpContentRangeHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpContentRangeHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpContentRangeHeaderValue, MemoryAddress> {
    public val IHttpContentRangeHeaderValueStatics_Instance: IHttpContentRangeHeaderValueStatics by
        lazy {
      createIHttpContentRangeHeaderValueStatics()
    }


    public val IHttpContentRangeHeaderValueFactory_Instance: IHttpContentRangeHeaderValueFactory by
        lazy {
      createIHttpContentRangeHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpContentRangeHeaderValueStatics(): IHttpContentRangeHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpContentRangeHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentRangeHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpContentRangeHeaderValueStatics.ABI.makeIHttpContentRangeHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpContentRangeHeaderValueFactory(): IHttpContentRangeHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpContentRangeHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpContentRangeHeaderValueFactory.ABI.makeIHttpContentRangeHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(length: WinDef.ULONG): JNAPointer? =
        IHttpContentRangeHeaderValueFactory_Instance.CreateFromLength(length)?.pointer

    public fun activate(from: WinDef.ULONG, to: WinDef.ULONG): JNAPointer? =
        IHttpContentRangeHeaderValueFactory_Instance.CreateFromRange(from, to)?.pointer

    public fun activate(
      from: WinDef.ULONG,
      to: WinDef.ULONG,
      length: WinDef.ULONG
    ): JNAPointer? = IHttpContentRangeHeaderValueFactory_Instance.CreateFromRangeWithLength(from,
        to, length)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpContentRangeHeaderValue {
      val address = segment.toRawLongValue()
      return HttpContentRangeHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpContentRangeHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpContentRangeHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, contentRangeHeaderValue: ByReference) =
        ABI.IHttpContentRangeHeaderValueStatics_Instance.TryParse(input, contentRangeHeaderValue)
  }
}
