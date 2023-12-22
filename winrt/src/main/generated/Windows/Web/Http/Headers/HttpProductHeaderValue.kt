package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpProductHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpProductHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpProductHeaderValue;{f4feee03-ebd4-4160-b9ff-807c5183b6e6})")
@WinRTByReference(brClass = HttpProductHeaderValue.ByReference::class)
public class HttpProductHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpProductHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __950985119_Interface: IHttpProductHeaderValue.WithDefault by lazy {
    as_950985119()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __950985119_Ptr: JNAPointer? by lazy {
    __950985119_Interface.__950985119_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__950985119_Interface, __328683030_Interface)

  public constructor(productName: String) : this(ABI.activate(productName))

  public constructor(productName: String, productVersion: String) : this(ABI.activate(productName,
      productVersion))

  private fun as_950985119(): IHttpProductHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpProductHeaderValue.ABI.makeIHttpProductHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpProductHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpProductHeaderValue.ABI.makeIHttpProductHeaderValue(ref.value))
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
      IByReference<HttpProductHeaderValue> {
    public override fun getValue() = HttpProductHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpProductHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpProductHeaderValue, MemoryAddress> {
    public val IHttpProductHeaderValueStatics_Instance: IHttpProductHeaderValueStatics by lazy {
      createIHttpProductHeaderValueStatics()
    }


    public val IHttpProductHeaderValueFactory_Instance: IHttpProductHeaderValueFactory by lazy {
      createIHttpProductHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpProductHeaderValueStatics(): IHttpProductHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpProductHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpProductHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpProductHeaderValueStatics.ABI.makeIHttpProductHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpProductHeaderValueFactory(): IHttpProductHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpProductHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpProductHeaderValueFactory.ABI.makeIHttpProductHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(productName: String): JNAPointer? =
        IHttpProductHeaderValueFactory_Instance.CreateFromName(productName)?.pointer

    public fun activate(productName: String, productVersion: String): JNAPointer? =
        IHttpProductHeaderValueFactory_Instance.CreateFromNameWithVersion(productName,
        productVersion)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpProductHeaderValue {
      val address = segment.toRawLongValue()
      return HttpProductHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpProductHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpProductHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, productHeaderValue: ByReference) =
        ABI.IHttpProductHeaderValueStatics_Instance.TryParse(input, productHeaderValue)
  }
}
