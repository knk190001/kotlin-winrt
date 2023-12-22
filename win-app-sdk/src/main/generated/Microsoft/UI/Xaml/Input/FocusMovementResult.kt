package Microsoft.UI.Xaml.Input

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

@ABIMarker(FocusMovementResult.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.FocusMovementResult;{a46259fd-3edd-554b-a188-0a47b71e4e1a})")
@WinRTByReference(brClass = FocusMovementResult.ByReference::class)
public class FocusMovementResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusMovementResult.WithDefault, IWinRTObject {
  private val __433977927_Interface: IFocusMovementResult.WithDefault by lazy {
    as_433977927()
  }


  public override val __433977927_Ptr: JNAPointer? by lazy {
    __433977927_Interface.__433977927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__433977927_Interface)

  private fun as_433977927(): IFocusMovementResult.WithDefault {
    if(pointer == NULL) {
      return(IFocusMovementResult.ABI.makeIFocusMovementResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusMovementResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusMovementResult.ABI.makeIFocusMovementResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FocusMovementResult> {
    public override fun getValue() = FocusMovementResult(pointer.getPointer(0))

    public fun setValue(value: FocusMovementResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusMovementResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusMovementResult {
      val address = segment.toRawLongValue()
      return FocusMovementResult(Pointer(address))
    }

    public override fun toNative(obj: FocusMovementResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
