package Windows.Devices.Display.Core

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

@ABIMarker(DisplayTaskResult.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayTaskResult;{6fbc7d67-f9b1-55e0-9d88-d3a5197a3f59})")
@WinRTByReference(brClass = DisplayTaskResult.ByReference::class)
public class DisplayTaskResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayTaskResult.WithDefault, IWinRTObject {
  private val __1695341278_Interface: IDisplayTaskResult.WithDefault by lazy {
    as_1695341278()
  }


  public override val __1695341278_Ptr: JNAPointer? by lazy {
    __1695341278_Interface.__1695341278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1695341278_Interface)

  private fun as_1695341278(): IDisplayTaskResult.WithDefault {
    if(pointer == NULL) {
      return(IDisplayTaskResult.ABI.makeIDisplayTaskResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayTaskResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayTaskResult.ABI.makeIDisplayTaskResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayTaskResult> {
    public override fun getValue() = DisplayTaskResult(pointer.getPointer(0))

    public fun setValue(value: DisplayTaskResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayTaskResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayTaskResult {
      val address = segment.toRawLongValue()
      return DisplayTaskResult(Pointer(address))
    }

    public override fun toNative(obj: DisplayTaskResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
