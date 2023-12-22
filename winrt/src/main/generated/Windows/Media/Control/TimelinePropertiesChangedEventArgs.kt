package Windows.Media.Control

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

@ABIMarker(TimelinePropertiesChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Control.TimelinePropertiesChangedEventArgs;{29033a2f-c923-5a77-bcaf-055ff415ad32})")
@WinRTByReference(brClass = TimelinePropertiesChangedEventArgs.ByReference::class)
public class TimelinePropertiesChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimelinePropertiesChangedEventArgs.WithDefault, IWinRTObject {
  private val __1434140440_Interface: ITimelinePropertiesChangedEventArgs.WithDefault by lazy {
    as_1434140440()
  }


  public override val __1434140440_Ptr: JNAPointer? by lazy {
    __1434140440_Interface.__1434140440_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1434140440_Interface)

  private fun as_1434140440(): ITimelinePropertiesChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITimelinePropertiesChangedEventArgs.ABI.makeITimelinePropertiesChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimelinePropertiesChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimelinePropertiesChangedEventArgs.ABI.makeITimelinePropertiesChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimelinePropertiesChangedEventArgs> {
    public override fun getValue() = TimelinePropertiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TimelinePropertiesChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimelinePropertiesChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TimelinePropertiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return TimelinePropertiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TimelinePropertiesChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
