package Windows.Media.Playback

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Media.Core.AudioTrack
import Windows.Media.Core.ISingleSelectMediaTrackList
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(MediaPlaybackAudioTrackList.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackAudioTrackList;pinterface({bbe1fa4c-b0e3-4583-baef-1f1b2e483e56};rc(Windows.Media.Core.AudioTrack;{03e1fafc-c931-491a-b46b-c10ee8c256b7})))")
@WinRTByReference(brClass = MediaPlaybackAudioTrackList.ByReference::class)
public class MediaPlaybackAudioTrackList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVectorView<AudioTrack?>, IIterable<AudioTrack?>,
    ISingleSelectMediaTrackList.WithDefault, IWinRTObject {
  private val __970637876_Interface: IVectorView<AudioTrack?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<AudioTrack?> by lazy {
    as_1449643190()
  }


  private val __1015321570_Interface: ISingleSelectMediaTrackList.WithDefault by lazy {
    as_1015321570()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<AudioTrack?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<AudioTrack?>>()

  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __1015321570_Ptr: JNAPointer? by lazy {
    __1015321570_Interface.__1015321570_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__970637876_Interface, __1449643190_Interface, __1015321570_Interface)

  private fun as_970637876(): IVectorView<AudioTrack?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<AudioTrack?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<AudioTrack?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<AudioTrack?>(ref.value))
  }

  private fun as_1449643190(): IIterable<AudioTrack?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<AudioTrack?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<AudioTrack?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<AudioTrack?>(ref.value))
  }

  private fun as_1015321570(): ISingleSelectMediaTrackList.WithDefault {
    if(pointer == NULL) {
      return(ISingleSelectMediaTrackList.ABI.makeISingleSelectMediaTrackList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISingleSelectMediaTrackList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISingleSelectMediaTrackList.ABI.makeISingleSelectMediaTrackList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackAudioTrackList> {
    public override fun getValue() = MediaPlaybackAudioTrackList(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackAudioTrackList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackAudioTrackList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackAudioTrackList {
      val address = segment.toRawLongValue()
      return MediaPlaybackAudioTrackList(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackAudioTrackList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
