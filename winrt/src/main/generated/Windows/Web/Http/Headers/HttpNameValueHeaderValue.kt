package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpNameValueHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpNameValueHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpNameValueHeaderValue;{d8ba7463-5b9a-4d1b-93f9-aa5b44ecfddf})")
@WinRTByReference(brClass = HttpNameValueHeaderValue.ByReference::class)
public class HttpNameValueHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpNameValueHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __16831050_Interface: IHttpNameValueHeaderValue.WithDefault by lazy {
    as_16831050()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __16831050_Ptr: JNAPointer? by lazy {
    __16831050_Interface.__16831050_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__16831050_Interface, __328683030_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  public constructor(name: String, value: String) : this(ABI.activate(name, value))

  private fun as_16831050(): IHttpNameValueHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpNameValueHeaderValue.ABI.makeIHttpNameValueHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpNameValueHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpNameValueHeaderValue.ABI.makeIHttpNameValueHeaderValue(ref.value))
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
      IByReference<HttpNameValueHeaderValue> {
    public override fun getValue() = HttpNameValueHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpNameValueHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpNameValueHeaderValue, MemoryAddress> {
    public val IHttpNameValueHeaderValueStatics_Instance: IHttpNameValueHeaderValueStatics by lazy {
      createIHttpNameValueHeaderValueStatics()
    }


    public val IHttpNameValueHeaderValueFactory_Instance: IHttpNameValueHeaderValueFactory by lazy {
      createIHttpNameValueHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpNameValueHeaderValueStatics(): IHttpNameValueHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpNameValueHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpNameValueHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpNameValueHeaderValueStatics.ABI.makeIHttpNameValueHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpNameValueHeaderValueFactory(): IHttpNameValueHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpNameValueHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpNameValueHeaderValueFactory.ABI.makeIHttpNameValueHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IHttpNameValueHeaderValueFactory_Instance.CreateFromName(name)?.pointer

    public fun activate(name: String, value: String): JNAPointer? =
        IHttpNameValueHeaderValueFactory_Instance.CreateFromNameWithValue(name, value)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpNameValueHeaderValue {
      val address = segment.toRawLongValue()
      return HttpNameValueHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpNameValueHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpNameValueHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, nameValueHeaderValue: ByReference) =
        ABI.IHttpNameValueHeaderValueStatics_Instance.TryParse(input, nameValueHeaderValue)
  }
}
