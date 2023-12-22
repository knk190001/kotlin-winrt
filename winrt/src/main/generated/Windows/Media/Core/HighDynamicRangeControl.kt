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

@ABIMarker(HighDynamicRangeControl.ABI::class)
@Signature("rc(Windows.Media.Core.HighDynamicRangeControl;{55f1a7ae-d957-4dc9-9d1c-8553a82a7d99})")
@WinRTByReference(brClass = HighDynamicRangeControl.ByReference::class)
public class HighDynamicRangeControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHighDynamicRangeControl.WithDefault, IWinRTObject {
  private val __2121686984_Interface: IHighDynamicRangeControl.WithDefault by lazy {
    as_2121686984()
  }


  public override val __2121686984_Ptr: JNAPointer? by lazy {
    __2121686984_Interface.__2121686984_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2121686984_Interface)

  private fun as_2121686984(): IHighDynamicRangeControl.WithDefault {
    if(pointer == NULL) {
      return(IHighDynamicRangeControl.ABI.makeIHighDynamicRangeControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHighDynamicRangeControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHighDynamicRangeControl.ABI.makeIHighDynamicRangeControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HighDynamicRangeControl> {
    public override fun getValue() = HighDynamicRangeControl(pointer.getPointer(0))

    public fun setValue(value: HighDynamicRangeControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HighDynamicRangeControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HighDynamicRangeControl {
      val address = segment.toRawLongValue()
      return HighDynamicRangeControl(Pointer(address))
    }

    public override fun toNative(obj: HighDynamicRangeControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
