package Windows.Devices.PointOfService

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

@ABIMarker(LineDisplayStatusUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayStatusUpdatedEventArgs;{ddd57c1a-86fb-4eba-93d1-6f5eda52b752})")
@WinRTByReference(brClass = LineDisplayStatusUpdatedEventArgs.ByReference::class)
public class LineDisplayStatusUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayStatusUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __2022097731_Interface: ILineDisplayStatusUpdatedEventArgs.WithDefault by lazy {
    as_2022097731()
  }


  public override val __2022097731_Ptr: JNAPointer? by lazy {
    __2022097731_Interface.__2022097731_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2022097731_Interface)

  private fun as_2022097731(): ILineDisplayStatusUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayStatusUpdatedEventArgs.ABI.makeILineDisplayStatusUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayStatusUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayStatusUpdatedEventArgs.ABI.makeILineDisplayStatusUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayStatusUpdatedEventArgs> {
    public override fun getValue() = LineDisplayStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LineDisplayStatusUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayStatusUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return LineDisplayStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
