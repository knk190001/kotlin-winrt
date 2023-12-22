package Windows.UI.WebUI

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

@ABIMarker(WebUINavigatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUINavigatedEventArgs;{a75841b8-2499-4030-a69d-15d2d9cfe524})")
@WinRTByReference(brClass = WebUINavigatedEventArgs.ByReference::class)
public class WebUINavigatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUINavigatedEventArgs.WithDefault, IWinRTObject {
  private val __1637555108_Interface: IWebUINavigatedEventArgs.WithDefault by lazy {
    as_1637555108()
  }


  public override val __1637555108_Ptr: JNAPointer? by lazy {
    __1637555108_Interface.__1637555108_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1637555108_Interface)

  private fun as_1637555108(): IWebUINavigatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebUINavigatedEventArgs.ABI.makeIWebUINavigatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUINavigatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUINavigatedEventArgs.ABI.makeIWebUINavigatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUINavigatedEventArgs> {
    public override fun getValue() = WebUINavigatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUINavigatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUINavigatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUINavigatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUINavigatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUINavigatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
