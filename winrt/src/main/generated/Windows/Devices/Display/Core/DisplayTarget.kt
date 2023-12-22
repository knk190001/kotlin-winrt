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

@ABIMarker(DisplayTarget.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayTarget;{aec57c6f-47b4-546b-987c-e73fa791fe3a})")
@WinRTByReference(brClass = DisplayTarget.ByReference::class)
public class DisplayTarget(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayTarget.WithDefault, IWinRTObject {
  private val __1224619185_Interface: IDisplayTarget.WithDefault by lazy {
    as_1224619185()
  }


  public override val __1224619185_Ptr: JNAPointer? by lazy {
    __1224619185_Interface.__1224619185_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1224619185_Interface)

  private fun as_1224619185(): IDisplayTarget.WithDefault {
    if(pointer == NULL) {
      return(IDisplayTarget.ABI.makeIDisplayTarget(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayTarget>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayTarget.ABI.makeIDisplayTarget(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DisplayTarget>
      {
    public override fun getValue() = DisplayTarget(pointer.getPointer(0))

    public fun setValue(value: DisplayTarget): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayTarget, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayTarget {
      val address = segment.toRawLongValue()
      return DisplayTarget(Pointer(address))
    }

    public override fun toNative(obj: DisplayTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
