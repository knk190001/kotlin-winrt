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

@ABIMarker(MediaBreakManager.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaBreakManager;{a854ddb1-feb4-4d9b-9d97-0fdbe58e5e39})")
@WinRTByReference(brClass = MediaBreakManager.ByReference::class)
public class MediaBreakManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBreakManager.WithDefault, IWinRTObject {
  private val __978552199_Interface: IMediaBreakManager.WithDefault by lazy {
    as_978552199()
  }


  public override val __978552199_Ptr: JNAPointer? by lazy {
    __978552199_Interface.__978552199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__978552199_Interface)

  private fun as_978552199(): IMediaBreakManager.WithDefault {
    if(pointer == NULL) {
      return(IMediaBreakManager.ABI.makeIMediaBreakManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBreakManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBreakManager.ABI.makeIMediaBreakManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaBreakManager> {
    public override fun getValue() = MediaBreakManager(pointer.getPointer(0))

    public fun setValue(value: MediaBreakManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBreakManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaBreakManager {
      val address = segment.toRawLongValue()
      return MediaBreakManager(Pointer(address))
    }

    public override fun toNative(obj: MediaBreakManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
