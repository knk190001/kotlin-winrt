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

@ABIMarker(ActivatedOperation.ABI::class)
@Signature("rc(Windows.UI.WebUI.ActivatedOperation;{b6a0b4bc-c6ca-42fd-9818-71904e45fed7})")
@WinRTByReference(brClass = ActivatedOperation.ByReference::class)
public class ActivatedOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivatedOperation.WithDefault, IWinRTObject {
  private val __1156342278_Interface: IActivatedOperation.WithDefault by lazy {
    as_1156342278()
  }


  public override val __1156342278_Ptr: JNAPointer? by lazy {
    __1156342278_Interface.__1156342278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1156342278_Interface)

  private fun as_1156342278(): IActivatedOperation.WithDefault {
    if(pointer == NULL) {
      return(IActivatedOperation.ABI.makeIActivatedOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedOperation.ABI.makeIActivatedOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivatedOperation> {
    public override fun getValue() = ActivatedOperation(pointer.getPointer(0))

    public fun setValue(value: ActivatedOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivatedOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivatedOperation {
      val address = segment.toRawLongValue()
      return ActivatedOperation(Pointer(address))
    }

    public override fun toNative(obj: ActivatedOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
