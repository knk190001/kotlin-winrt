package Windows.Media.Playback

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Media.Core.TimedMetadataTrack
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

@ABIMarker(MediaPlaybackTimedMetadataTrackList.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackTimedMetadataTrackList;pinterface({bbe1fa4c-b0e3-4583-baef-1f1b2e483e56};rc(Windows.Media.Core.TimedMetadataTrack;{9e6aed9e-f67a-49a9-b330-cf03b0e9cf07})))")
@WinRTByReference(brClass = MediaPlaybackTimedMetadataTrackList.ByReference::class)
public class MediaPlaybackTimedMetadataTrackList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVectorView<TimedMetadataTrack?>, IIterable<TimedMetadataTrack?>,
    IMediaPlaybackTimedMetadataTrackList.WithDefault, IWinRTObject {
  private val __970637876_Interface: IVectorView<TimedMetadataTrack?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<TimedMetadataTrack?> by lazy {
    as_1449643190()
  }


  private val __871819351_Interface: IMediaPlaybackTimedMetadataTrackList.WithDefault by lazy {
    as_871819351()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<TimedMetadataTrack?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<TimedMetadataTrack?>>()

  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __871819351_Ptr: JNAPointer? by lazy {
    __871819351_Interface.__871819351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__970637876_Interface, __1449643190_Interface, __871819351_Interface)

  private fun as_970637876(): IVectorView<TimedMetadataTrack?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<TimedMetadataTrack?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<TimedMetadataTrack?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<TimedMetadataTrack?>(ref.value))
  }

  private fun as_1449643190(): IIterable<TimedMetadataTrack?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<TimedMetadataTrack?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<TimedMetadataTrack?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<TimedMetadataTrack?>(ref.value))
  }

  private fun as_871819351(): IMediaPlaybackTimedMetadataTrackList.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackTimedMetadataTrackList.ABI.makeIMediaPlaybackTimedMetadataTrackList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackTimedMetadataTrackList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackTimedMetadataTrackList.ABI.makeIMediaPlaybackTimedMetadataTrackList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackTimedMetadataTrackList> {
    public override fun getValue() = MediaPlaybackTimedMetadataTrackList(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackTimedMetadataTrackList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackTimedMetadataTrackList, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackTimedMetadataTrackList {
      val address = segment.toRawLongValue()
      return MediaPlaybackTimedMetadataTrackList(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackTimedMetadataTrackList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
