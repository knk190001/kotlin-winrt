package Windows.Media.Playback

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

@ABIMarker(MediaBreakSchedule.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaBreakSchedule;{a19a5813-98b6-41d8-83da-f971d22b7bba})")
@WinRTByReference(brClass = MediaBreakSchedule.ByReference::class)
public class MediaBreakSchedule(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBreakSchedule.WithDefault, IWinRTObject {
  private val __1091534517_Interface: IMediaBreakSchedule.WithDefault by lazy {
    as_1091534517()
  }


  public override val __1091534517_Ptr: JNAPointer? by lazy {
    __1091534517_Interface.__1091534517_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1091534517_Interface)

  private fun as_1091534517(): IMediaBreakSchedule.WithDefault {
    if(pointer == NULL) {
      return(IMediaBreakSchedule.ABI.makeIMediaBreakSchedule(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBreakSchedule>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBreakSchedule.ABI.makeIMediaBreakSchedule(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaBreakSchedule> {
    public override fun getValue() = MediaBreakSchedule(pointer.getPointer(0))

    public fun setValue(value: MediaBreakSchedule): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBreakSchedule, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaBreakSchedule {
      val address = segment.toRawLongValue()
      return MediaBreakSchedule(Pointer(address))
    }

    public override fun toNative(obj: MediaBreakSchedule): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
