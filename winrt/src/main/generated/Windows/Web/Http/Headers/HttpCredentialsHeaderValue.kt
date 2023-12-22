package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpCredentialsHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpCredentialsHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpCredentialsHeaderValue;{c34cc3cb-542e-4177-a6c7-b674ce193fbf})")
@WinRTByReference(brClass = HttpCredentialsHeaderValue.ByReference::class)
public class HttpCredentialsHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCredentialsHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject
    {
  private val __1236768820_Interface: IHttpCredentialsHeaderValue.WithDefault by lazy {
    as_1236768820()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1236768820_Ptr: JNAPointer? by lazy {
    __1236768820_Interface.__1236768820_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1236768820_Interface, __328683030_Interface)

  public constructor(scheme: String) : this(ABI.activate(scheme))

  public constructor(scheme: String, token: String) : this(ABI.activate(scheme, token))

  private fun as_1236768820(): IHttpCredentialsHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpCredentialsHeaderValue.ABI.makeIHttpCredentialsHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCredentialsHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCredentialsHeaderValue.ABI.makeIHttpCredentialsHeaderValue(ref.value))
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
      IByReference<HttpCredentialsHeaderValue> {
    public override fun getValue() = HttpCredentialsHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpCredentialsHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCredentialsHeaderValue, MemoryAddress> {
    public val IHttpCredentialsHeaderValueStatics_Instance: IHttpCredentialsHeaderValueStatics by
        lazy {
      createIHttpCredentialsHeaderValueStatics()
    }


    public val IHttpCredentialsHeaderValueFactory_Instance: IHttpCredentialsHeaderValueFactory by
        lazy {
      createIHttpCredentialsHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpCredentialsHeaderValueStatics(): IHttpCredentialsHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpCredentialsHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpCredentialsHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpCredentialsHeaderValueStatics.ABI.makeIHttpCredentialsHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpCredentialsHeaderValueFactory(): IHttpCredentialsHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpCredentialsHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpCredentialsHeaderValueFactory.ABI.makeIHttpCredentialsHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(scheme: String): JNAPointer? =
        IHttpCredentialsHeaderValueFactory_Instance.CreateFromScheme(scheme)?.pointer

    public fun activate(scheme: String, token: String): JNAPointer? =
        IHttpCredentialsHeaderValueFactory_Instance.CreateFromSchemeWithToken(scheme,
        token)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpCredentialsHeaderValue {
      val address = segment.toRawLongValue()
      return HttpCredentialsHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpCredentialsHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpCredentialsHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, credentialsHeaderValue: ByReference) =
        ABI.IHttpCredentialsHeaderValueStatics_Instance.TryParse(input, credentialsHeaderValue)
  }
}
