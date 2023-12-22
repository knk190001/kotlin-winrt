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

@ABIMarker(VideoTrack.ABI::class)
@Signature("rc(Windows.Media.Core.VideoTrack;{03e1fafc-c931-491a-b46b-c10ee8c256b7})")
@WinRTByReference(brClass = VideoTrack.ByReference::class)
public class VideoTrack(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaTrack.WithDefault, IVideoTrack.WithDefault, IWinRTObject {
  private val __1836839004_Interface: IMediaTrack.WithDefault by lazy {
    as_1836839004()
  }


  private val __1720872411_Interface: IVideoTrack.WithDefault by lazy {
    as_1720872411()
  }


  public override val __1836839004_Ptr: JNAPointer? by lazy {
    __1836839004_Interface.__1836839004_Ptr
  }


  public override val __1720872411_Ptr: JNAPointer? by lazy {
    __1720872411_Interface.__1720872411_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1836839004_Interface, __1720872411_Interface)

  private fun as_1836839004(): IMediaTrack.WithDefault {
    if(pointer == NULL) {
      return(IMediaTrack.ABI.makeIMediaTrack(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTrack>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTrack.ABI.makeIMediaTrack(ref.value))
  }

  private fun as_1720872411(): IVideoTrack.WithDefault {
    if(pointer == NULL) {
      return(IVideoTrack.ABI.makeIVideoTrack(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoTrack>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoTrack.ABI.makeIVideoTrack(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VideoTrack> {
    public override fun getValue() = VideoTrack(pointer.getPointer(0))

    public fun setValue(value: VideoTrack): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoTrack, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoTrack {
      val address = segment.toRawLongValue()
      return VideoTrack(Pointer(address))
    }

    public override fun toNative(obj: VideoTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
