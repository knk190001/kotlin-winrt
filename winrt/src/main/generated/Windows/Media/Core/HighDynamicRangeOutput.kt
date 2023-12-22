package Windows.Media.Core

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

@ABIMarker(HighDynamicRangeOutput.ABI::class)
@Signature("rc(Windows.Media.Core.HighDynamicRangeOutput;{0f57806b-253b-4119-bb40-3a90e51384f7})")
@WinRTByReference(brClass = HighDynamicRangeOutput.ByReference::class)
public class HighDynamicRangeOutput(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHighDynamicRangeOutput.WithDefault, IWinRTObject {
  private val __279160118_Interface: IHighDynamicRangeOutput.WithDefault by lazy {
    as_279160118()
  }


  public override val __279160118_Ptr: JNAPointer? by lazy {
    __279160118_Interface.__279160118_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__279160118_Interface)

  private fun as_279160118(): IHighDynamicRangeOutput.WithDefault {
    if(pointer == NULL) {
      return(IHighDynamicRangeOutput.ABI.makeIHighDynamicRangeOutput(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHighDynamicRangeOutput>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHighDynamicRangeOutput.ABI.makeIHighDynamicRangeOutput(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HighDynamicRangeOutput> {
    public override fun getValue() = HighDynamicRangeOutput(pointer.getPointer(0))

    public fun setValue(value: HighDynamicRangeOutput): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HighDynamicRangeOutput, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HighDynamicRangeOutput {
      val address = segment.toRawLongValue()
      return HighDynamicRangeOutput(Pointer(address))
    }

    public override fun toNative(obj: HighDynamicRangeOutput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
