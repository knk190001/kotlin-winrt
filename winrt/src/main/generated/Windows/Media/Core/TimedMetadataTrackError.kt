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

@ABIMarker(TimedMetadataTrackError.ABI::class)
@Signature("rc(Windows.Media.Core.TimedMetadataTrackError;{b3767915-4114-4819-b9d9-dd76089e72f8})")
@WinRTByReference(brClass = TimedMetadataTrackError.ByReference::class)
public class TimedMetadataTrackError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedMetadataTrackError.WithDefault, IWinRTObject {
  private val __1848229166_Interface: ITimedMetadataTrackError.WithDefault by lazy {
    as_1848229166()
  }


  public override val __1848229166_Ptr: JNAPointer? by lazy {
    __1848229166_Interface.__1848229166_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1848229166_Interface)

  private fun as_1848229166(): ITimedMetadataTrackError.WithDefault {
    if(pointer == NULL) {
      return(ITimedMetadataTrackError.ABI.makeITimedMetadataTrackError(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedMetadataTrackError>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedMetadataTrackError.ABI.makeITimedMetadataTrackError(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedMetadataTrackError> {
    public override fun getValue() = TimedMetadataTrackError(pointer.getPointer(0))

    public fun setValue(value: TimedMetadataTrackError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedMetadataTrackError, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TimedMetadataTrackError {
      val address = segment.toRawLongValue()
      return TimedMetadataTrackError(Pointer(address))
    }

    public override fun toNative(obj: TimedMetadataTrackError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
