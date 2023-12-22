package Windows.Media.Capture.Frames

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

@ABIMarker(AudioMediaFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.AudioMediaFrame;{a3a9feff-8021-441b-9a46-e7f0137b7981})")
@WinRTByReference(brClass = AudioMediaFrame.ByReference::class)
public class AudioMediaFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioMediaFrame.WithDefault, IWinRTObject {
  private val __1982695047_Interface: IAudioMediaFrame.WithDefault by lazy {
    as_1982695047()
  }


  public override val __1982695047_Ptr: JNAPointer? by lazy {
    __1982695047_Interface.__1982695047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1982695047_Interface)

  private fun as_1982695047(): IAudioMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IAudioMediaFrame.ABI.makeIAudioMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioMediaFrame.ABI.makeIAudioMediaFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioMediaFrame> {
    public override fun getValue() = AudioMediaFrame(pointer.getPointer(0))

    public fun setValue(value: AudioMediaFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioMediaFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioMediaFrame {
      val address = segment.toRawLongValue()
      return AudioMediaFrame(Pointer(address))
    }

    public override fun toNative(obj: AudioMediaFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
