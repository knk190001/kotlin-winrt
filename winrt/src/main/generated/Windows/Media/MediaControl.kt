package Windows.Media

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaControl.ABI::class)
@WinRTByReference(brClass = MediaControl.ByReference::class)
public class MediaControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaControl> {
    public override fun getValue() = MediaControl(pointer.getPointer(0))

    public fun setValue(value: MediaControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaControl, MemoryAddress> {
    public val IMediaControl_Instance: IMediaControl by lazy {
      createIMediaControl()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaControl(): IMediaControl {
      val refiid = Guid.REFIID(IMediaControl.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.MediaControl".toHandle(),refiid,interfacePtr)
      val result = IMediaControl.ABI.makeIMediaControl(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaControl {
      val address = segment.toRawLongValue()
      return MediaControl(Pointer(address))
    }

    public override fun toNative(obj: MediaControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_SoundLevelChanged(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_SoundLevelChanged(handler)

    public fun remove_SoundLevelChanged(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_SoundLevelChanged(cookie)

    public fun add_PlayPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_PlayPressed(handler)

    public fun remove_PlayPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_PlayPressed(cookie)

    public fun add_PausePressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_PausePressed(handler)

    public fun remove_PausePressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_PausePressed(cookie)

    public fun add_StopPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_StopPressed(handler)

    public fun remove_StopPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_StopPressed(cookie)

    public fun add_PlayPauseTogglePressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_PlayPauseTogglePressed(handler)

    public fun remove_PlayPauseTogglePressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_PlayPauseTogglePressed(cookie)

    public fun add_RecordPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_RecordPressed(handler)

    public fun remove_RecordPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_RecordPressed(cookie)

    public fun add_NextTrackPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_NextTrackPressed(handler)

    public fun remove_NextTrackPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_NextTrackPressed(cookie)

    public fun add_PreviousTrackPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_PreviousTrackPressed(handler)

    public fun remove_PreviousTrackPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_PreviousTrackPressed(cookie)

    public fun add_FastForwardPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_FastForwardPressed(handler)

    public fun remove_FastForwardPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_FastForwardPressed(cookie)

    public fun add_RewindPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_RewindPressed(handler)

    public fun remove_RewindPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_RewindPressed(cookie)

    public fun add_ChannelUpPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_ChannelUpPressed(handler)

    public fun remove_ChannelUpPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_ChannelUpPressed(cookie)

    public fun add_ChannelDownPressed(handler: EventHandler<IUnknown?>) =
        ABI.IMediaControl_Instance.add_ChannelDownPressed(handler)

    public fun remove_ChannelDownPressed(cookie: EventRegistrationToken) =
        ABI.IMediaControl_Instance.remove_ChannelDownPressed(cookie)

    public fun get_SoundLevel() = ABI.IMediaControl_Instance.get_SoundLevel()

    public fun put_TrackName(value: String) = ABI.IMediaControl_Instance.put_TrackName(value)

    public fun get_TrackName() = ABI.IMediaControl_Instance.get_TrackName()

    public fun put_ArtistName(value: String) = ABI.IMediaControl_Instance.put_ArtistName(value)

    public fun get_ArtistName() = ABI.IMediaControl_Instance.get_ArtistName()

    public fun put_IsPlaying(value: Boolean) = ABI.IMediaControl_Instance.put_IsPlaying(value)

    public fun get_IsPlaying() = ABI.IMediaControl_Instance.get_IsPlaying()

    public fun put_AlbumArt(value: Uri) = ABI.IMediaControl_Instance.put_AlbumArt(value)

    public fun get_AlbumArt() = ABI.IMediaControl_Instance.get_AlbumArt()
  }
}
