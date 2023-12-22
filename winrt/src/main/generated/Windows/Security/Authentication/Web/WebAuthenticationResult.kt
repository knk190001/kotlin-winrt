package Windows.Security.Authentication.Web

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

@ABIMarker(WebAuthenticationResult.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.WebAuthenticationResult;{64002b4b-ede9-470a-a5cd-0323faf6e262})")
@WinRTByReference(brClass = WebAuthenticationResult.ByReference::class)
public class WebAuthenticationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAuthenticationResult.WithDefault, IWinRTObject {
  private val __1893429185_Interface: IWebAuthenticationResult.WithDefault by lazy {
    as_1893429185()
  }


  public override val __1893429185_Ptr: JNAPointer? by lazy {
    __1893429185_Interface.__1893429185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1893429185_Interface)

  private fun as_1893429185(): IWebAuthenticationResult.WithDefault {
    if(pointer == NULL) {
      return(IWebAuthenticationResult.ABI.makeIWebAuthenticationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAuthenticationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAuthenticationResult.ABI.makeIWebAuthenticationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAuthenticationResult> {
    public override fun getValue() = WebAuthenticationResult(pointer.getPointer(0))

    public fun setValue(value: WebAuthenticationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAuthenticationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebAuthenticationResult {
      val address = segment.toRawLongValue()
      return WebAuthenticationResult(Pointer(address))
    }

    public override fun toNative(obj: WebAuthenticationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
