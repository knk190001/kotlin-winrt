package Windows.Web.Http

import Windows.Foundation.IStringable
import Windows.Web.Http.IHttpCookieFactory.ABI.IID
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

@ABIMarker(HttpCookie.ABI::class)
@Signature("rc(Windows.Web.Http.HttpCookie;{1f5488e2-cc2d-4779-86a7-88f10687d249})")
@WinRTByReference(brClass = HttpCookie.ByReference::class)
public class HttpCookie(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCookie.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __1758056904_Interface: IHttpCookie.WithDefault by lazy {
    as_1758056904()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __1758056904_Ptr: JNAPointer? by lazy {
    __1758056904_Interface.__1758056904_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1758056904_Interface, __328683030_Interface)

  public constructor(
    name: String,
    domain: String,
    path: String
  ) : this(ABI.activate(name, domain, path))

  private fun as_1758056904(): IHttpCookie.WithDefault {
    if(pointer == NULL) {
      return(IHttpCookie.ABI.makeIHttpCookie(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCookie>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCookie.ABI.makeIHttpCookie(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HttpCookie> {
    public override fun getValue() = HttpCookie(pointer.getPointer(0))

    public fun setValue(value: HttpCookie): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCookie, MemoryAddress> {
    public val IHttpCookieFactory_Instance: IHttpCookieFactory by lazy {
      createIHttpCookieFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHttpCookieFactory(): IHttpCookieFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Http.HttpCookie".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHttpCookieFactory.ABI.makeIHttpCookieFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      name: String,
      domain: String,
      path: String
    ): JNAPointer? = IHttpCookieFactory_Instance.Create(name, domain, path)?.pointer

    public override fun fromNative(segment: MemoryAddress): HttpCookie {
      val address = segment.toRawLongValue()
      return HttpCookie(Pointer(address))
    }

    public override fun toNative(obj: HttpCookie): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
