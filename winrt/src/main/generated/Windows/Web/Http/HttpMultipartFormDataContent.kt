package Windows.Web.Http

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(HttpMultipartFormDataContent.ABI::class)
@Signature("rc(Windows.Web.Http.HttpMultipartFormDataContent;{64d337e2-e967-4624-b6d1-cf74604a4a42})")
@WinRTByReference(brClass = HttpMultipartFormDataContent.ByReference::class)
public class HttpMultipartFormDataContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpMultipartFormDataContent.WithDefault, IHttpContent.WithDefault,
    IClosable.WithDefault, IIterable<IHttpContent?>, IStringable.WithDefault, IWinRTObject {
  private val __399511075_Interface: IHttpMultipartFormDataContent.WithDefault by lazy {
    as_399511075()
  }


  private val __1335469675_Interface: IHttpContent.WithDefault by lazy {
    as_1335469675()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1449643190_Interface: IIterable<IHttpContent?> by lazy {
    as_1449643190()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<IHttpContent?>>()

  public override val __399511075_Ptr: JNAPointer? by lazy {
    __399511075_Interface.__399511075_Ptr
  }


  public override val __1335469675_Ptr: JNAPointer? by lazy {
    __1335469675_Interface.__1335469675_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__399511075_Interface, __1335469675_Interface, __1260617006_Interface,
        __1449643190_Interface, __328683030_Interface)

  public constructor() : this(ABI.activate())

  public constructor(boundary: String) : this(ABI.activate(boundary))

  private fun as_399511075(): IHttpMultipartFormDataContent.WithDefault {
    if(pointer == NULL) {
      return(IHttpMultipartFormDataContent.ABI.makeIHttpMultipartFormDataContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpMultipartFormDataContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpMultipartFormDataContent.ABI.makeIHttpMultipartFormDataContent(ref.value))
  }

  private fun as_1335469675(): IHttpContent.WithDefault {
    if(pointer == NULL) {
      return(IHttpContent.ABI.makeIHttpContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpContent.ABI.makeIHttpContent(ref.value))
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

  private fun as_1449643190(): IIterable<IHttpContent?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IHttpContent?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IHttpContent?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IHttpContent?>(ref.value))
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
      IByReference<HttpMultipartFormDataContent> {
    public override fun getValue() = HttpMultipartFormDataContent(pointer.getPointer(0))

    public fun setValue(value: HttpMultipartFormDataContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpMultipartFormDataContent, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IHttpMultipartFormDataContentFactory_Instance: IHttpMultipartFormDataContentFactory
        by lazy {
      createIHttpMultipartFormDataContentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpMultipartFormDataContent".toHandle(),
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

    public fun createIHttpMultipartFormDataContentFactory(): IHttpMultipartFormDataContentFactory {
      val refiid = Guid.REFIID(IHttpMultipartFormDataContentFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpMultipartFormDataContent".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpMultipartFormDataContentFactory.ABI.makeIHttpMultipartFormDataContentFactory(factoryActivatorPtr.value))
    }

    public fun activate(boundary: String): JNAPointer? =
        IHttpMultipartFormDataContentFactory_Instance.CreateWithBoundary(boundary)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpMultipartFormDataContent {
      val address = segment.toRawLongValue()
      return HttpMultipartFormDataContent(Pointer(address))
    }

    public override fun toNative(obj: HttpMultipartFormDataContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
