package Windows.ApplicationModel

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

@ABIMarker(LeavingBackgroundEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.LeavingBackgroundEventArgs;{39c6ec9a-ae6e-46f9-a07a-cfc23f88733e})")
@WinRTByReference(brClass = LeavingBackgroundEventArgs.ByReference::class)
public class LeavingBackgroundEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILeavingBackgroundEventArgs.WithDefault, IWinRTObject {
  private val __25105574_Interface: ILeavingBackgroundEventArgs.WithDefault by lazy {
    as_25105574()
  }


  public override val __25105574_Ptr: JNAPointer? by lazy {
    __25105574_Interface.__25105574_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__25105574_Interface)

  private fun as_25105574(): ILeavingBackgroundEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILeavingBackgroundEventArgs.ABI.makeILeavingBackgroundEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILeavingBackgroundEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILeavingBackgroundEventArgs.ABI.makeILeavingBackgroundEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LeavingBackgroundEventArgs> {
    public override fun getValue() = LeavingBackgroundEventArgs(pointer.getPointer(0))

    public fun setValue(value: LeavingBackgroundEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LeavingBackgroundEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LeavingBackgroundEventArgs {
      val address = segment.toRawLongValue()
      return LeavingBackgroundEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LeavingBackgroundEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
