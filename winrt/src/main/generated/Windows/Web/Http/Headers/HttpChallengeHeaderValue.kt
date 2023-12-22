package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpChallengeHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpChallengeHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpChallengeHeaderValue;{393361af-0f7d-4820-9fdd-a2b956eeaeab})")
@WinRTByReference(brClass = HttpChallengeHeaderValue.ByReference::class)
public class HttpChallengeHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpChallengeHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __755741549_Interface: IHttpChallengeHeaderValue.WithDefault by lazy {
    as_755741549()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __755741549_Ptr: JNAPointer? by lazy {
    __755741549_Interface.__755741549_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__755741549_Interface, __328683030_Interface)

  public constructor(scheme: String) : this(ABI.activate(scheme))

  public constructor(scheme: String, token: String) : this(ABI.activate(scheme, token))

  private fun as_755741549(): IHttpChallengeHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpChallengeHeaderValue.ABI.makeIHttpChallengeHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpChallengeHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpChallengeHeaderValue.ABI.makeIHttpChallengeHeaderValue(ref.value))
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
      IByReference<HttpChallengeHeaderValue> {
    public override fun getValue() = HttpChallengeHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpChallengeHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpChallengeHeaderValue, MemoryAddress> {
    public val IHttpChallengeHeaderValueStatics_Instance: IHttpChallengeHeaderValueStatics by lazy {
      createIHttpChallengeHeaderValueStatics()
    }


    public val IHttpChallengeHeaderValueFactory_Instance: IHttpChallengeHeaderValueFactory by lazy {
      createIHttpChallengeHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpChallengeHeaderValueStatics(): IHttpChallengeHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpChallengeHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpChallengeHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpChallengeHeaderValueStatics.ABI.makeIHttpChallengeHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpChallengeHeaderValueFactory(): IHttpChallengeHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpChallengeHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpChallengeHeaderValueFactory.ABI.makeIHttpChallengeHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(scheme: String): JNAPointer? =
        IHttpChallengeHeaderValueFactory_Instance.CreateFromScheme(scheme)?.pointer

    public fun activate(scheme: String, token: String): JNAPointer? =
        IHttpChallengeHeaderValueFactory_Instance.CreateFromSchemeWithToken(scheme, token)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpChallengeHeaderValue {
      val address = segment.toRawLongValue()
      return HttpChallengeHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpChallengeHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpChallengeHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, challengeHeaderValue: ByReference) =
        ABI.IHttpChallengeHeaderValueStatics_Instance.TryParse(input, challengeHeaderValue)
  }
}
