package Windows.UI.WebUI.Core

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

@ABIMarker(WebUICommandBarSizeChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.Core.WebUICommandBarSizeChangedEventArgs;{fbf1e2f6-3029-4719-8378-92f82b87af1e})")
@WinRTByReference(brClass = WebUICommandBarSizeChangedEventArgs.ByReference::class)
public class WebUICommandBarSizeChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUICommandBarSizeChangedEventArgs.WithDefault, IWinRTObject {
  private val __1185595969_Interface: IWebUICommandBarSizeChangedEventArgs.WithDefault by lazy {
    as_1185595969()
  }


  public override val __1185595969_Ptr: JNAPointer? by lazy {
    __1185595969_Interface.__1185595969_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1185595969_Interface)

  private fun as_1185595969(): IWebUICommandBarSizeChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebUICommandBarSizeChangedEventArgs.ABI.makeIWebUICommandBarSizeChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUICommandBarSizeChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUICommandBarSizeChangedEventArgs.ABI.makeIWebUICommandBarSizeChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUICommandBarSizeChangedEventArgs> {
    public override fun getValue() = WebUICommandBarSizeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUICommandBarSizeChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUICommandBarSizeChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUICommandBarSizeChangedEventArgs {
      val address = segment.toRawLongValue()
      return WebUICommandBarSizeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUICommandBarSizeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
