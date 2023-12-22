package Windows.Media.Playback

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(BackgroundMediaPlayer.ABI::class)
@WinRTByReference(brClass = BackgroundMediaPlayer.ByReference::class)
public class BackgroundMediaPlayer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundMediaPlayer> {
    public override fun getValue() = BackgroundMediaPlayer(pointer.getPointer(0))

    public fun setValue(value: BackgroundMediaPlayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundMediaPlayer, MemoryAddress> {
    public val IBackgroundMediaPlayerStatics_Instance: IBackgroundMediaPlayerStatics by lazy {
      createIBackgroundMediaPlayerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundMediaPlayerStatics(): IBackgroundMediaPlayerStatics {
      val refiid = Guid.REFIID(IBackgroundMediaPlayerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.BackgroundMediaPlayer".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundMediaPlayerStatics.ABI.makeIBackgroundMediaPlayerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundMediaPlayer {
      val address = segment.toRawLongValue()
      return BackgroundMediaPlayer(Pointer(address))
    }

    public override fun toNative(obj: BackgroundMediaPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IBackgroundMediaPlayerStatics_Instance.get_Current()

    public
        fun add_MessageReceivedFromBackground(value: EventHandler<MediaPlayerDataReceivedEventArgs?>)
        = ABI.IBackgroundMediaPlayerStatics_Instance.add_MessageReceivedFromBackground(value)

    public fun remove_MessageReceivedFromBackground(token: EventRegistrationToken) =
        ABI.IBackgroundMediaPlayerStatics_Instance.remove_MessageReceivedFromBackground(token)

    public
        fun add_MessageReceivedFromForeground(value: EventHandler<MediaPlayerDataReceivedEventArgs?>)
        = ABI.IBackgroundMediaPlayerStatics_Instance.add_MessageReceivedFromForeground(value)

    public fun remove_MessageReceivedFromForeground(token: EventRegistrationToken) =
        ABI.IBackgroundMediaPlayerStatics_Instance.remove_MessageReceivedFromForeground(token)

    public fun SendMessageToBackground(value: ValueSet) =
        ABI.IBackgroundMediaPlayerStatics_Instance.SendMessageToBackground(value)

    public fun SendMessageToForeground(value: ValueSet) =
        ABI.IBackgroundMediaPlayerStatics_Instance.SendMessageToForeground(value)

    public fun IsMediaPlaying() = ABI.IBackgroundMediaPlayerStatics_Instance.IsMediaPlaying()

    public fun Shutdown() = ABI.IBackgroundMediaPlayerStatics_Instance.Shutdown()
  }
}
