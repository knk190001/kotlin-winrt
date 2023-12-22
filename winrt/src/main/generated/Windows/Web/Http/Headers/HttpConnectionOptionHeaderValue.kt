package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpConnectionOptionHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpConnectionOptionHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue;{cb4af27a-4e90-45eb-8dcd-fd1408f4c44f})")
@WinRTByReference(brClass = HttpConnectionOptionHeaderValue.ByReference::class)
public class HttpConnectionOptionHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpConnectionOptionHeaderValue.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1846233723_Interface: IHttpConnectionOptionHeaderValue.WithDefault by lazy {
    as_1846233723()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1846233723_Ptr: JNAPointer? by lazy {
    __1846233723_Interface.__1846233723_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1846233723_Interface, __328683030_Interface)

  public constructor(token: String) : this(ABI.activate(token))

  private fun as_1846233723(): IHttpConnectionOptionHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpConnectionOptionHeaderValue.ABI.makeIHttpConnectionOptionHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpConnectionOptionHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpConnectionOptionHeaderValue.ABI.makeIHttpConnectionOptionHeaderValue(ref.value))
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
      IByReference<HttpConnectionOptionHeaderValue> {
    public override fun getValue() = HttpConnectionOptionHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpConnectionOptionHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpConnectionOptionHeaderValue, MemoryAddress> {
    public val IHttpConnectionOptionHeaderValueStatics_Instance:
        IHttpConnectionOptionHeaderValueStatics by lazy {
      createIHttpConnectionOptionHeaderValueStatics()
    }


    public val IHttpConnectionOptionHeaderValueFactory_Instance:
        IHttpConnectionOptionHeaderValueFactory by lazy {
      createIHttpConnectionOptionHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpConnectionOptionHeaderValueStatics():
        IHttpConnectionOptionHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpConnectionOptionHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpConnectionOptionHeaderValueStatics.ABI.makeIHttpConnectionOptionHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpConnectionOptionHeaderValueFactory():
        IHttpConnectionOptionHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpConnectionOptionHeaderValueFactory.ABI.makeIHttpConnectionOptionHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(token: String): JNAPointer? =
        IHttpConnectionOptionHeaderValueFactory_Instance.Create(token)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpConnectionOptionHeaderValue {
      val address = segment.toRawLongValue()
      return HttpConnectionOptionHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpConnectionOptionHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) =
        ABI.IHttpConnectionOptionHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, connectionOptionHeaderValue: ByReference) =
        ABI.IHttpConnectionOptionHeaderValueStatics_Instance.TryParse(input,
        connectionOptionHeaderValue)
  }
}
