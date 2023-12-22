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

@ABIMarker(MediaPlaybackSessionOutputDegradationPolicyState.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackSessionOutputDegradationPolicyState;{558e727d-f633-49f9-965a-abaa1db709be})")
@WinRTByReference(brClass = MediaPlaybackSessionOutputDegradationPolicyState.ByReference::class)
public class MediaPlaybackSessionOutputDegradationPolicyState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackSessionOutputDegradationPolicyState.WithDefault, IWinRTObject {
  private val __1570417258_Interface: IMediaPlaybackSessionOutputDegradationPolicyState.WithDefault
      by lazy {
    as_1570417258()
  }


  public override val __1570417258_Ptr: JNAPointer? by lazy {
    __1570417258_Interface.__1570417258_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1570417258_Interface)

  private fun as_1570417258(): IMediaPlaybackSessionOutputDegradationPolicyState.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSessionOutputDegradationPolicyState.ABI.makeIMediaPlaybackSessionOutputDegradationPolicyState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSessionOutputDegradationPolicyState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSessionOutputDegradationPolicyState.ABI.makeIMediaPlaybackSessionOutputDegradationPolicyState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackSessionOutputDegradationPolicyState> {
    public override fun getValue() =
        MediaPlaybackSessionOutputDegradationPolicyState(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackSessionOutputDegradationPolicyState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackSessionOutputDegradationPolicyState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaPlaybackSessionOutputDegradationPolicyState {
      val address = segment.toRawLongValue()
      return MediaPlaybackSessionOutputDegradationPolicyState(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackSessionOutputDegradationPolicyState):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
