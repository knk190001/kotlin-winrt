package Windows.Phone.Notification.Management

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

@ABIMarker(SpeedDialEntry.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.SpeedDialEntry;{9240b6db-872c-46dc-b62a-be4541b166f8})")
@WinRTByReference(brClass = SpeedDialEntry.ByReference::class)
public class SpeedDialEntry(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeedDialEntry.WithDefault, IWinRTObject {
  private val __784061591_Interface: ISpeedDialEntry.WithDefault by lazy {
    as_784061591()
  }


  public override val __784061591_Ptr: JNAPointer? by lazy {
    __784061591_Interface.__784061591_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__784061591_Interface)

  private fun as_784061591(): ISpeedDialEntry.WithDefault {
    if(pointer == NULL) {
      return(ISpeedDialEntry.ABI.makeISpeedDialEntry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeedDialEntry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeedDialEntry.ABI.makeISpeedDialEntry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpeedDialEntry>
      {
    public override fun getValue() = SpeedDialEntry(pointer.getPointer(0))

    public fun setValue(value: SpeedDialEntry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeedDialEntry, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpeedDialEntry {
      val address = segment.toRawLongValue()
      return SpeedDialEntry(Pointer(address))
    }

    public override fun toNative(obj: SpeedDialEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
