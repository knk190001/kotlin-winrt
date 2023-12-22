package Windows.Media

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

@ABIMarker(VideoDisplayProperties.ABI::class)
@Signature("rc(Windows.Media.VideoDisplayProperties;{5609fdb1-5d2d-4872-8170-45dee5bc2f5c})")
@WinRTByReference(brClass = VideoDisplayProperties.ByReference::class)
public class VideoDisplayProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoDisplayProperties.WithDefault, IVideoDisplayProperties2.WithDefault,
    IWinRTObject {
  private val __1126490262_Interface: IVideoDisplayProperties.WithDefault by lazy {
    as_1126490262()
  }


  private val __561459704_Interface: IVideoDisplayProperties2.WithDefault by lazy {
    as_561459704()
  }


  public override val __1126490262_Ptr: JNAPointer? by lazy {
    __1126490262_Interface.__1126490262_Ptr
  }


  public override val __561459704_Ptr: JNAPointer? by lazy {
    __561459704_Interface.__561459704_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1126490262_Interface, __561459704_Interface)

  private fun as_1126490262(): IVideoDisplayProperties.WithDefault {
    if(pointer == NULL) {
      return(IVideoDisplayProperties.ABI.makeIVideoDisplayProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoDisplayProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoDisplayProperties.ABI.makeIVideoDisplayProperties(ref.value))
  }

  private fun as_561459704(): IVideoDisplayProperties2.WithDefault {
    if(pointer == NULL) {
      return(IVideoDisplayProperties2.ABI.makeIVideoDisplayProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoDisplayProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoDisplayProperties2.ABI.makeIVideoDisplayProperties2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoDisplayProperties> {
    public override fun getValue() = VideoDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: VideoDisplayProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoDisplayProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoDisplayProperties {
      val address = segment.toRawLongValue()
      return VideoDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: VideoDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
