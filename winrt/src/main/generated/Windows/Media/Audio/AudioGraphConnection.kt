package Windows.Media.Audio

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

@ABIMarker(AudioGraphConnection.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioGraphConnection;{763070ed-d04e-4fac-b233-600b42edd469})")
@WinRTByReference(brClass = AudioGraphConnection.ByReference::class)
public class AudioGraphConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioGraphConnection.WithDefault, IWinRTObject {
  private val __145617250_Interface: IAudioGraphConnection.WithDefault by lazy {
    as_145617250()
  }


  public override val __145617250_Ptr: JNAPointer? by lazy {
    __145617250_Interface.__145617250_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__145617250_Interface)

  private fun as_145617250(): IAudioGraphConnection.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraphConnection.ABI.makeIAudioGraphConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraphConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraphConnection.ABI.makeIAudioGraphConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioGraphConnection> {
    public override fun getValue() = AudioGraphConnection(pointer.getPointer(0))

    public fun setValue(value: AudioGraphConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioGraphConnection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AudioGraphConnection {
      val address = segment.toRawLongValue()
      return AudioGraphConnection(Pointer(address))
    }

    public override fun toNative(obj: AudioGraphConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
