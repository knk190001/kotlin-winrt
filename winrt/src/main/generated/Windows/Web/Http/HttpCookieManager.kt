package Windows.Web.Http

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HttpCookieManager.ABI::class)
@Signature("rc(Windows.Web.Http.HttpCookieManager;{7a431780-cd4f-4e57-a84a-5b0a53d6bb96})")
@WinRTByReference(brClass = HttpCookieManager.ByReference::class)
public class HttpCookieManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCookieManager.WithDefault, IWinRTObject {
  private val __1705362629_Interface: IHttpCookieManager.WithDefault by lazy {
    as_1705362629()
  }


  public override val __1705362629_Ptr: JNAPointer? by lazy {
    __1705362629_Interface.__1705362629_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1705362629_Interface)

  private fun as_1705362629(): IHttpCookieManager.WithDefault {
    if(pointer == NULL) {
      return(IHttpCookieManager.ABI.makeIHttpCookieManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCookieManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCookieManager.ABI.makeIHttpCookieManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpCookieManager> {
    public override fun getValue() = HttpCookieManager(pointer.getPointer(0))

    public fun setValue(value: HttpCookieManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCookieManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpCookieManager {
      val address = segment.toRawLongValue()
      return HttpCookieManager(Pointer(address))
    }

    public override fun toNative(obj: HttpCookieManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
