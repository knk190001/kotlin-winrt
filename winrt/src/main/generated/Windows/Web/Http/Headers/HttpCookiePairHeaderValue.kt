package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpCookiePairHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpCookiePairHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpCookiePairHeaderValue;{cbd46217-4b29-412b-bd90-b3d814ab8e1b})")
@WinRTByReference(brClass = HttpCookiePairHeaderValue.ByReference::class)
public class HttpCookiePairHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCookiePairHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject
    {
  private val __890824390_Interface: IHttpCookiePairHeaderValue.WithDefault by lazy {
    as_890824390()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __890824390_Ptr: JNAPointer? by lazy {
    __890824390_Interface.__890824390_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__890824390_Interface, __328683030_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  public constructor(name: String, value: String) : this(ABI.activate(name, value))

  private fun as_890824390(): IHttpCookiePairHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpCookiePairHeaderValue.ABI.makeIHttpCookiePairHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCookiePairHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCookiePairHeaderValue.ABI.makeIHttpCookiePairHeaderValue(ref.value))
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
      IByReference<HttpCookiePairHeaderValue> {
    public override fun getValue() = HttpCookiePairHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpCookiePairHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCookiePairHeaderValue, MemoryAddress> {
    public val IHttpCookiePairHeaderValueStatics_Instance: IHttpCookiePairHeaderValueStatics by
        lazy {
      createIHttpCookiePairHeaderValueStatics()
    }


    public val IHttpCookiePairHeaderValueFactory_Instance: IHttpCookiePairHeaderValueFactory by
        lazy {
      createIHttpCookiePairHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpCookiePairHeaderValueStatics(): IHttpCookiePairHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpCookiePairHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpCookiePairHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpCookiePairHeaderValueStatics.ABI.makeIHttpCookiePairHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpCookiePairHeaderValueFactory(): IHttpCookiePairHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpCookiePairHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpCookiePairHeaderValueFactory.ABI.makeIHttpCookiePairHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IHttpCookiePairHeaderValueFactory_Instance.CreateFromName(name)?.pointer

    public fun activate(name: String, value: String): JNAPointer? =
        IHttpCookiePairHeaderValueFactory_Instance.CreateFromNameWithValue(name, value)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpCookiePairHeaderValue {
      val address = segment.toRawLongValue()
      return HttpCookiePairHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpCookiePairHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpCookiePairHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, cookiePairHeaderValue: ByReference) =
        ABI.IHttpCookiePairHeaderValueStatics_Instance.TryParse(input, cookiePairHeaderValue)
  }
}
