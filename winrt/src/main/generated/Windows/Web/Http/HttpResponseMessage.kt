package Windows.Web.Http

import Windows.Foundation.IClosable
import Windows.Foundation.IStringable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpResponseMessage.ABI::class)
@Signature("rc(Windows.Web.Http.HttpResponseMessage;{fee200fb-8664-44e0-95d9-42696199bffc})")
@WinRTByReference(brClass = HttpResponseMessage.ByReference::class)
public class HttpResponseMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpResponseMessage.WithDefault, IClosable.WithDefault,
    IStringable.WithDefault, IWinRTObject {
  private val __797920862_Interface: IHttpResponseMessage.WithDefault by lazy {
    as_797920862()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __797920862_Ptr: JNAPointer? by lazy {
    __797920862_Interface.__797920862_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__797920862_Interface, __1260617006_Interface, __328683030_Interface)

  public constructor() : this(ABI.activate())

  public constructor(statusCode: HttpStatusCode) : this(ABI.activate(statusCode))

  private fun as_797920862(): IHttpResponseMessage.WithDefault {
    if(pointer == NULL) {
      return(IHttpResponseMessage.ABI.makeIHttpResponseMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpResponseMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpResponseMessage.ABI.makeIHttpResponseMessage(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
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
      IByReference<HttpResponseMessage> {
    public override fun getValue() = HttpResponseMessage(pointer.getPointer(0))

    public fun setValue(value: HttpResponseMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpResponseMessage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IHttpResponseMessageFactory_Instance: IHttpResponseMessageFactory by lazy {
      createIHttpResponseMessageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpResponseMessage".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIHttpResponseMessageFactory(): IHttpResponseMessageFactory {
      val refiid = Guid.REFIID(IHttpResponseMessageFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpResponseMessage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpResponseMessageFactory.ABI.makeIHttpResponseMessageFactory(factoryActivatorPtr.value))
    }

    public fun activate(statusCode: HttpStatusCode): JNAPointer? =
        IHttpResponseMessageFactory_Instance.Create(statusCode)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpResponseMessage {
      val address = segment.toRawLongValue()
      return HttpResponseMessage(Pointer(address))
    }

    public override fun toNative(obj: HttpResponseMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
