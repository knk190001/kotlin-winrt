package Windows.Web.Http.Filters

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

@ABIMarker(HttpCacheControl.ABI::class)
@Signature("rc(Windows.Web.Http.Filters.HttpCacheControl;{c77e1cb4-3cea-4eb5-ac85-04e186e63ab7})")
@WinRTByReference(brClass = HttpCacheControl.ByReference::class)
public class HttpCacheControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHttpCacheControl.WithDefault, IWinRTObject {
  private val __862080146_Interface: IHttpCacheControl.WithDefault by lazy {
    as_862080146()
  }


  public override val __862080146_Ptr: JNAPointer? by lazy {
    __862080146_Interface.__862080146_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__862080146_Interface)

  private fun as_862080146(): IHttpCacheControl.WithDefault {
    if(pointer == NULL) {
      return(IHttpCacheControl.ABI.makeIHttpCacheControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHttpCacheControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHttpCacheControl.ABI.makeIHttpCacheControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HttpCacheControl> {
    public override fun getValue() = HttpCacheControl(pointer.getPointer(0))

    public fun setValue(value: HttpCacheControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HttpCacheControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HttpCacheControl {
      val address = segment.toRawLongValue()
      return HttpCacheControl(Pointer(address))
    }

    public override fun toNative(obj: HttpCacheControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
