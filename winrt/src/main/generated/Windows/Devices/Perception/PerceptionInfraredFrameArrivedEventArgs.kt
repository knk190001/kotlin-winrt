package Windows.Devices.Perception

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

@ABIMarker(PerceptionInfraredFrameArrivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionInfraredFrameArrivedEventArgs;{9f77fac7-b4bd-4857-9d50-be8ef075daef})")
@WinRTByReference(brClass = PerceptionInfraredFrameArrivedEventArgs.ByReference::class)
public class PerceptionInfraredFrameArrivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionInfraredFrameArrivedEventArgs.WithDefault, IWinRTObject {
  private val __38695479_Interface: IPerceptionInfraredFrameArrivedEventArgs.WithDefault by lazy {
    as_38695479()
  }


  public override val __38695479_Ptr: JNAPointer? by lazy {
    __38695479_Interface.__38695479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__38695479_Interface)

  private fun as_38695479(): IPerceptionInfraredFrameArrivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrameArrivedEventArgs.ABI.makeIPerceptionInfraredFrameArrivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrameArrivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrameArrivedEventArgs.ABI.makeIPerceptionInfraredFrameArrivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionInfraredFrameArrivedEventArgs> {
    public override fun getValue() = PerceptionInfraredFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionInfraredFrameArrivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionInfraredFrameArrivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionInfraredFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionInfraredFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionInfraredFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
