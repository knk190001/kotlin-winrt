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

@ABIMarker(WebAccountEventArgs.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.WebAccountEventArgs;{6fb7037d-424e-44ec-977c-ef2415462a5a})")
@WinRTByReference(brClass = WebAccountEventArgs.ByReference::class)
public class WebAccountEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountEventArgs.WithDefault, IWinRTObject {
  private val __1980228671_Interface: IWebAccountEventArgs.WithDefault by lazy {
    as_1980228671()
  }


  public override val __1980228671_Ptr: JNAPointer? by lazy {
    __1980228671_Interface.__1980228671_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1980228671_Interface)

  private fun as_1980228671(): IWebAccountEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountEventArgs.ABI.makeIWebAccountEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountEventArgs.ABI.makeIWebAccountEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountEventArgs> {
    public override fun getValue() = WebAccountEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebAccountEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebAccountEventArgs {
      val address = segment.toRawLongValue()
      return WebAccountEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebAccountEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
