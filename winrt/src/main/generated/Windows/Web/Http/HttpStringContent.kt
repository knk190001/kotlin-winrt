package Windows.Web.Http

import Windows.Foundation.IClosable
import Windows.Foundation.IStringable
import Windows.Storage.Streams.UnicodeEncoding
import Windows.Web.Http.IHttpStringContentFactory.ABI.IID
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

@ABIMarker(HttpStringContent.ABI::class)
@Signature("rc(Windows.Web.Http.HttpStringContent;{6b14a441-fba7-4bd2-af0a-839de7c295da})")
@WinRTByReference(brClass = HttpStringContent.ByReference::class)
public class HttpStringContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpContent.WithDefault, IClosable.WithDefault, IStringable.WithDefault,
    IWinRTObject {
  private val __1335469675_Interface: IHttpContent.WithDefault by lazy {
    as_1335469675()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1335469675_Ptr: JNAPointer? by lazy {
    __1335469675_Interface.__1335469675_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1335469675_Interface, __1260617006_Interface, __328683030_Interface)

  public constructor(content: String) : this(ABI.activate(content))

  public constructor(content: String, encoding: UnicodeEncoding) : this(ABI.activate(content,
      encoding))

  public constructor(
    content: String,
    encoding: UnicodeEncoding,
    mediaType: String
  ) : this(ABI.activate(content, encoding, mediaType))

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
      IByReference<HttpStringContent> {
    public override fun getValue() = HttpStringContent(pointer.getPointer(0))

    public fun setValue(value: HttpStringContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpStringContent, MemoryAddress> {
    public val IHttpStringContentFactory_Instance: IHttpStringContentFactory by lazy {
      createIHttpStringContentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpStringContentFactory(): IHttpStringContentFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpStringContent".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpStringContentFactory.ABI.makeIHttpStringContentFactory(factoryActivatorPtr.value))
    }

    public fun activate(content: String): JNAPointer? =
        IHttpStringContentFactory_Instance.CreateFromString(content)?.pointer

    public fun activate(content: String, encoding: UnicodeEncoding): JNAPointer? =
        IHttpStringContentFactory_Instance.CreateFromStringWithEncoding(content, encoding)?.pointer

    public fun activate(
      content: String,
      encoding: UnicodeEncoding,
      mediaType: String
    ): JNAPointer? =
        IHttpStringContentFactory_Instance.CreateFromStringWithEncodingAndMediaType(content,
        encoding, mediaType)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpStringContent {
      val address = segment.toRawLongValue()
      return HttpStringContent(Pointer(address))
    }

    public override fun toNative(obj: HttpStringContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
