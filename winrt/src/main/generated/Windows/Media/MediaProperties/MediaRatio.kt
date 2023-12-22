package Windows.Media.MediaProperties

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

@ABIMarker(MediaRatio.ABI::class)
@Signature("rc(Windows.Media.MediaProperties.MediaRatio;{d2d0fee5-8929-401d-ac78-7d357e378163})")
@WinRTByReference(brClass = MediaRatio.ByReference::class)
public class MediaRatio(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaRatio.WithDefault, IWinRTObject {
  private val __697096654_Interface: IMediaRatio.WithDefault by lazy {
    as_697096654()
  }


  public override val __697096654_Ptr: JNAPointer? by lazy {
    __697096654_Interface.__697096654_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__697096654_Interface)

  private fun as_697096654(): IMediaRatio.WithDefault {
    if(pointer == NULL) {
      return(IMediaRatio.ABI.makeIMediaRatio(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaRatio>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaRatio.ABI.makeIMediaRatio(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaRatio> {
    public override fun getValue() = MediaRatio(pointer.getPointer(0))

    public fun setValue(value: MediaRatio): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaRatio, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaRatio {
      val address = segment.toRawLongValue()
      return MediaRatio(Pointer(address))
    }

    public override fun toNative(obj: MediaRatio): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
