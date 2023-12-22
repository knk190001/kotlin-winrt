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

@ABIMarker(AudioTrackSupportInfo.ABI::class)
@Signature("rc(Windows.Media.Core.AudioTrackSupportInfo;{178beff7-cc39-44a6-b951-4a5653f073fa})")
@WinRTByReference(brClass = AudioTrackSupportInfo.ByReference::class)
public class AudioTrackSupportInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioTrackSupportInfo.WithDefault, IWinRTObject {
  private val __2009990931_Interface: IAudioTrackSupportInfo.WithDefault by lazy {
    as_2009990931()
  }


  public override val __2009990931_Ptr: JNAPointer? by lazy {
    __2009990931_Interface.__2009990931_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2009990931_Interface)

  private fun as_2009990931(): IAudioTrackSupportInfo.WithDefault {
    if(pointer == NULL) {
      return(IAudioTrackSupportInfo.ABI.makeIAudioTrackSupportInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioTrackSupportInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioTrackSupportInfo.ABI.makeIAudioTrackSupportInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioTrackSupportInfo> {
    public override fun getValue() = AudioTrackSupportInfo(pointer.getPointer(0))

    public fun setValue(value: AudioTrackSupportInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioTrackSupportInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioTrackSupportInfo {
      val address = segment.toRawLongValue()
      return AudioTrackSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: AudioTrackSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
