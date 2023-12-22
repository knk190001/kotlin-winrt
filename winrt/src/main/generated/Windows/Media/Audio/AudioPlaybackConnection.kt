package Windows.Media.Audio

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioPlaybackConnection.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioPlaybackConnection;{1a4c1dea-cafc-50e7-8718-ea3f81cbfa51})")
@WinRTByReference(brClass = AudioPlaybackConnection.ByReference::class)
public class AudioPlaybackConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioPlaybackConnection.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1522833849_Interface: IAudioPlaybackConnection.WithDefault by lazy {
    as_1522833849()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1522833849_Ptr: JNAPointer? by lazy {
    __1522833849_Interface.__1522833849_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1522833849_Interface, __1260617006_Interface)

  private fun as_1522833849(): IAudioPlaybackConnection.WithDefault {
    if(pointer == NULL) {
      return(IAudioPlaybackConnection.ABI.makeIAudioPlaybackConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioPlaybackConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioPlaybackConnection.ABI.makeIAudioPlaybackConnection(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioPlaybackConnection> {
    public override fun getValue() = AudioPlaybackConnection(pointer.getPointer(0))

    public fun setValue(value: AudioPlaybackConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioPlaybackConnection, MemoryAddress> {
    public val IAudioPlaybackConnectionStatics_Instance: IAudioPlaybackConnectionStatics by lazy {
      createIAudioPlaybackConnectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioPlaybackConnectionStatics(): IAudioPlaybackConnectionStatics {
      val refiid = Guid.REFIID(IAudioPlaybackConnectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioPlaybackConnection".toHandle(),refiid,interfacePtr)
      val result =
          IAudioPlaybackConnectionStatics.ABI.makeIAudioPlaybackConnectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AudioPlaybackConnection {
      val address = segment.toRawLongValue()
      return AudioPlaybackConnection(Pointer(address))
    }

    public override fun toNative(obj: AudioPlaybackConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() =
        ABI.IAudioPlaybackConnectionStatics_Instance.GetDeviceSelector()

    public fun TryCreateFromId(id: String) =
        ABI.IAudioPlaybackConnectionStatics_Instance.TryCreateFromId(id)
  }
}
