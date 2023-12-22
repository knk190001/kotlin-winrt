package Windows.Media.Capture.Frames

import Windows.Foundation.IClosable
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

@ABIMarker(MediaFrameReader.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameReader;{e4c94395-2028-48ed-90b0-d1c1b162e24c})")
@WinRTByReference(brClass = MediaFrameReader.ByReference::class)
public class MediaFrameReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameReader.WithDefault, IClosable.WithDefault,
    IMediaFrameReader2.WithDefault, IWinRTObject {
  private val __1500672050_Interface: IMediaFrameReader.WithDefault by lazy {
    as_1500672050()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __723806656_Interface: IMediaFrameReader2.WithDefault by lazy {
    as_723806656()
  }


  public override val __1500672050_Ptr: JNAPointer? by lazy {
    __1500672050_Interface.__1500672050_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __723806656_Ptr: JNAPointer? by lazy {
    __723806656_Interface.__723806656_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1500672050_Interface, __1260617006_Interface, __723806656_Interface)

  private fun as_1500672050(): IMediaFrameReader.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameReader.ABI.makeIMediaFrameReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameReader.ABI.makeIMediaFrameReader(ref.value))
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

  private fun as_723806656(): IMediaFrameReader2.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameReader2.ABI.makeIMediaFrameReader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameReader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameReader2.ABI.makeIMediaFrameReader2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameReader> {
    public override fun getValue() = MediaFrameReader(pointer.getPointer(0))

    public fun setValue(value: MediaFrameReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFrameReader {
      val address = segment.toRawLongValue()
      return MediaFrameReader(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
