package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpMediaTypeHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpMediaTypeHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpMediaTypeHeaderValue;{16b28533-e728-4fcb-bdb0-08a431a14844})")
@WinRTByReference(brClass = HttpMediaTypeHeaderValue.ByReference::class)
public class HttpMediaTypeHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpMediaTypeHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __1704769614_Interface: IHttpMediaTypeHeaderValue.WithDefault by lazy {
    as_1704769614()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1704769614_Ptr: JNAPointer? by lazy {
    __1704769614_Interface.__1704769614_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1704769614_Interface, __328683030_Interface)

  public constructor(mediaType: String) : this(ABI.activate(mediaType))

  private fun as_1704769614(): IHttpMediaTypeHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpMediaTypeHeaderValue.ABI.makeIHttpMediaTypeHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpMediaTypeHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpMediaTypeHeaderValue.ABI.makeIHttpMediaTypeHeaderValue(ref.value))
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
      IByReference<HttpMediaTypeHeaderValue> {
    public override fun getValue() = HttpMediaTypeHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpMediaTypeHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpMediaTypeHeaderValue, MemoryAddress> {
    public val IHttpMediaTypeHeaderValueStatics_Instance: IHttpMediaTypeHeaderValueStatics by lazy {
      createIHttpMediaTypeHeaderValueStatics()
    }


    public val IHttpMediaTypeHeaderValueFactory_Instance: IHttpMediaTypeHeaderValueFactory by lazy {
      createIHttpMediaTypeHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpMediaTypeHeaderValueStatics(): IHttpMediaTypeHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpMediaTypeHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpMediaTypeHeaderValueStatics.ABI.makeIHttpMediaTypeHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpMediaTypeHeaderValueFactory(): IHttpMediaTypeHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpMediaTypeHeaderValueFactory.ABI.makeIHttpMediaTypeHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(mediaType: String): JNAPointer? =
        IHttpMediaTypeHeaderValueFactory_Instance.Create(mediaType)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpMediaTypeHeaderValue {
      val address = segment.toRawLongValue()
      return HttpMediaTypeHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpMediaTypeHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpMediaTypeHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, mediaTypeHeaderValue: ByReference) =
        ABI.IHttpMediaTypeHeaderValueStatics_Instance.TryParse(input, mediaTypeHeaderValue)
  }
}
