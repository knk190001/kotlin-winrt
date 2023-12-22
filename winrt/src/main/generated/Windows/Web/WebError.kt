package Windows.Web

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebError.ABI::class)
@WinRTByReference(brClass = WebError.ByReference::class)
public class WebError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebError> {
    public override fun getValue() = WebError(pointer.getPointer(0))

    public fun setValue(value: WebError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebError, MemoryAddress> {
    public val IWebErrorStatics_Instance: IWebErrorStatics by lazy {
      createIWebErrorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebErrorStatics(): IWebErrorStatics {
      val refiid = Guid.REFIID(IWebErrorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.WebError".toHandle(),refiid,interfacePtr)
      val result = IWebErrorStatics.ABI.makeIWebErrorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebError {
      val address = segment.toRawLongValue()
      return WebError(Pointer(address))
    }

    public override fun toNative(obj: WebError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetStatus(hresult: Int) = ABI.IWebErrorStatics_Instance.GetStatus(hresult)
  }
}
