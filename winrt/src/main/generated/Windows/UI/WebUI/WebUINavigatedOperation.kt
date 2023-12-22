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

@ABIMarker(WebUINavigatedOperation.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUINavigatedOperation;{7a965f08-8182-4a89-ab67-8492e8750d4b})")
@WinRTByReference(brClass = WebUINavigatedOperation.ByReference::class)
public class WebUINavigatedOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebUINavigatedOperation.WithDefault, IWinRTObject {
  private val __5710036_Interface: IWebUINavigatedOperation.WithDefault by lazy {
    as_5710036()
  }


  public override val __5710036_Ptr: JNAPointer? by lazy {
    __5710036_Interface.__5710036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__5710036_Interface)

  private fun as_5710036(): IWebUINavigatedOperation.WithDefault {
    if(pointer == NULL) {
      return(IWebUINavigatedOperation.ABI.makeIWebUINavigatedOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebUINavigatedOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebUINavigatedOperation.ABI.makeIWebUINavigatedOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUINavigatedOperation> {
    public override fun getValue() = WebUINavigatedOperation(pointer.getPointer(0))

    public fun setValue(value: WebUINavigatedOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUINavigatedOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUINavigatedOperation {
      val address = segment.toRawLongValue()
      return WebUINavigatedOperation(Pointer(address))
    }

    public override fun toNative(obj: WebUINavigatedOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
