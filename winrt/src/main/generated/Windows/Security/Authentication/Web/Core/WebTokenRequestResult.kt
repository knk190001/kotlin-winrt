package Windows.Security.Authentication.Web.Core

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

@ABIMarker(WebTokenRequestResult.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.WebTokenRequestResult;{c12a8305-d1f8-4483-8d54-38fe292784ff})")
@WinRTByReference(brClass = WebTokenRequestResult.ByReference::class)
public class WebTokenRequestResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebTokenRequestResult.WithDefault, IWinRTObject {
  private val __451600086_Interface: IWebTokenRequestResult.WithDefault by lazy {
    as_451600086()
  }


  public override val __451600086_Ptr: JNAPointer? by lazy {
    __451600086_Interface.__451600086_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__451600086_Interface)

  private fun as_451600086(): IWebTokenRequestResult.WithDefault {
    if(pointer == NULL) {
      return(IWebTokenRequestResult.ABI.makeIWebTokenRequestResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebTokenRequestResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebTokenRequestResult.ABI.makeIWebTokenRequestResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebTokenRequestResult> {
    public override fun getValue() = WebTokenRequestResult(pointer.getPointer(0))

    public fun setValue(value: WebTokenRequestResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebTokenRequestResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebTokenRequestResult {
      val address = segment.toRawLongValue()
      return WebTokenRequestResult(Pointer(address))
    }

    public override fun toNative(obj: WebTokenRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
