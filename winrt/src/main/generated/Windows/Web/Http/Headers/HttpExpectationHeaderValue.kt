package Windows.Web.Http.Headers

import Windows.Foundation.IStringable
import Windows.Web.Http.Headers.IHttpExpectationHeaderValueFactory.ABI.IID
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

@ABIMarker(HttpExpectationHeaderValue.ABI::class)
@Signature("rc(Windows.Web.Http.Headers.HttpExpectationHeaderValue;{4ce585cd-3a99-43af-a2e6-ec232fea9658})")
@WinRTByReference(brClass = HttpExpectationHeaderValue.ByReference::class)
public class HttpExpectationHeaderValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpExpectationHeaderValue.WithDefault, IStringable.WithDefault, IWinRTObject
    {
  private val __1855449868_Interface: IHttpExpectationHeaderValue.WithDefault by lazy {
    as_1855449868()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1855449868_Ptr: JNAPointer? by lazy {
    __1855449868_Interface.__1855449868_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1855449868_Interface, __328683030_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  public constructor(name: String, value: String) : this(ABI.activate(name, value))

  private fun as_1855449868(): IHttpExpectationHeaderValue.WithDefault {
    if(pointer == NULL) {
      return(IHttpExpectationHeaderValue.ABI.makeIHttpExpectationHeaderValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpExpectationHeaderValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpExpectationHeaderValue.ABI.makeIHttpExpectationHeaderValue(ref.value))
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
      IByReference<HttpExpectationHeaderValue> {
    public override fun getValue() = HttpExpectationHeaderValue(pointer.getPointer(0))

    public fun setValue(value: HttpExpectationHeaderValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpExpectationHeaderValue, MemoryAddress> {
    public val IHttpExpectationHeaderValueStatics_Instance: IHttpExpectationHeaderValueStatics by
        lazy {
      createIHttpExpectationHeaderValueStatics()
    }


    public val IHttpExpectationHeaderValueFactory_Instance: IHttpExpectationHeaderValueFactory by
        lazy {
      createIHttpExpectationHeaderValueFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpExpectationHeaderValueStatics(): IHttpExpectationHeaderValueStatics {
      val refiid = Guid.REFIID(IHttpExpectationHeaderValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpExpectationHeaderValue".toHandle(),refiid,interfacePtr)
      val result =
          IHttpExpectationHeaderValueStatics.ABI.makeIHttpExpectationHeaderValueStatics(interfacePtr.value)
      return result
    }

    public fun createIHttpExpectationHeaderValueFactory(): IHttpExpectationHeaderValueFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.Headers.HttpExpectationHeaderValue".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpExpectationHeaderValueFactory.ABI.makeIHttpExpectationHeaderValueFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IHttpExpectationHeaderValueFactory_Instance.CreateFromName(name)?.pointer

    public fun activate(name: String, value: String): JNAPointer? =
        IHttpExpectationHeaderValueFactory_Instance.CreateFromNameWithValue(name, value)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpExpectationHeaderValue {
      val address = segment.toRawLongValue()
      return HttpExpectationHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: HttpExpectationHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Parse(input: String) = ABI.IHttpExpectationHeaderValueStatics_Instance.Parse(input)

    public fun TryParse(input: String, expectationHeaderValue: ByReference) =
        ABI.IHttpExpectationHeaderValueStatics_Instance.TryParse(input, expectationHeaderValue)
  }
}
