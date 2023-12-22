package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpTransferCodingHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpTransferCodingHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpTransferCodingHeaderValue;{436f32f9-3ded-42bd-b38a-5496a2511ce6})")
@WinRTByReference(brClass = HttpTransferCodingHeaderValue.ByReference::class)
public class HttpTransferCodingHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpTransferCodingHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1083836669_Interface: IHttpTransferCodingHeaderValue.WithDefault by lazy {
    as_1083836669()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1083836669_Ptr: JNAPointer? by lazy {
    __1083836669_Interface.__1083836669_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1083836669_Interface, __328683030_Interface)

  public constructor(input: String) : this(ABI.activate(input))

  private fun as_1083836669(): IHttpTransferCodingHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpTransferCodingHeaderValue.ABI.makeIHttpTransferCodingHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpTransferCodingHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpTransferCodingHeaderValue.ABI.makeIHttpTransferCodingHeaderValue(ref.value))
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
      IByReference<HttpTransferCodingHeaderValue> {
    public override fun getValue() = HttpTransferCodingHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpTransferCodingHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpTransferCodingHeaderValue, MemoryAddress> {
    public val IHttpTransferCodingHeaderValueStatics_Instance: IHttpTransferCodingHeaderValueStatics
        by lazy {
      createIHttpTransferCodingHeaderValueStatics()
    }


    public val IHttpTransferCodingHeaderValueFactory_Instance: IHttpTransferCodingHeaderValueFactory
        by lazy {
      createIHttpTransferCodingHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpTransferCodingHeaderValueStatics():
        IHttpTransferCodingHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpTransferCodingHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpTransferCodingHeaderValueStatics.ABI.makeIHttpTransferCodingHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpTransferCodingHeaderValueFactory():
        IHttpTransferCodingHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpTransferCodingHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpTransferCodingHeaderValueFactory.ABI.makeIHttpTransferCodingHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(input: String): JNAPointer? =
        IHttpTransferCodingHeaderValueFactory_Instance.Create(input)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpTransferCodingHeaderValue {
      val address = segment.toRawLongValue()
      return HttpTransferCodingHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpTransferCodingHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) =
        ABI.IHttpTransferCodingHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, transferCodingHeaderValue: ByReference) =
        ABI.IHttpTransferCodingHeaderValueStatics_Instance.TryParse(input,
        transferCodingHeaderValue)
  }
}
