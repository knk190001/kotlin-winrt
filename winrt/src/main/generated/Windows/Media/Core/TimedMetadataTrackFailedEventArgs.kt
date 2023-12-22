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

@ABIMarker(TimedMetadataTrackFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.TimedMetadataTrackFailedEventArgs;{a57fc9d1-6789-4d4d-b07f-84b4f31acb70})")
@WinRTByReference(brClass = TimedMetadataTrackFailedEventArgs.ByReference::class)
public class TimedMetadataTrackFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedMetadataTrackFailedEventArgs.WithDefault, IWinRTObject {
  private val __1590070912_Interface: ITimedMetadataTrackFailedEventArgs.WithDefault by lazy {
    as_1590070912()
  }


  public override val __1590070912_Ptr: JNAPointer? by lazy {
    __1590070912_Interface.__1590070912_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1590070912_Interface)

  private fun as_1590070912(): ITimedMetadataTrackFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITimedMetadataTrackFailedEventArgs.ABI.makeITimedMetadataTrackFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedMetadataTrackFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedMetadataTrackFailedEventArgs.ABI.makeITimedMetadataTrackFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedMetadataTrackFailedEventArgs> {
    public override fun getValue() = TimedMetadataTrackFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TimedMetadataTrackFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedMetadataTrackFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TimedMetadataTrackFailedEventArgs {
      val address = segment.toRawLongValue()
      return TimedMetadataTrackFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TimedMetadataTrackFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
