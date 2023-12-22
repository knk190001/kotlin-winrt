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

@ABIMarker(MultiSourceMediaFrameReader.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MultiSourceMediaFrameReader;{8d144402-f763-488d-98f2-b437bcf075e7})")
@WinRTByReference(brClass = MultiSourceMediaFrameReader.ByReference::class)
public class MultiSourceMediaFrameReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMultiSourceMediaFrameReader.WithDefault, IClosable.WithDefault,
    IMultiSourceMediaFrameReader2.WithDefault, IWinRTObject {
  private val __1510696698_Interface: IMultiSourceMediaFrameReader.WithDefault by lazy {
    as_1510696698()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __413042568_Interface: IMultiSourceMediaFrameReader2.WithDefault by lazy {
    as_413042568()
  }


  public override val __1510696698_Ptr: JNAPointer? by lazy {
    __1510696698_Interface.__1510696698_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __413042568_Ptr: JNAPointer? by lazy {
    __413042568_Interface.__413042568_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1510696698_Interface, __1260617006_Interface, __413042568_Interface)

  private fun as_1510696698(): IMultiSourceMediaFrameReader.WithDefault {
    if(pointer == NULL) {
      return(IMultiSourceMediaFrameReader.ABI.makeIMultiSourceMediaFrameReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMultiSourceMediaFrameReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMultiSourceMediaFrameReader.ABI.makeIMultiSourceMediaFrameReader(ref.value))
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

  private fun as_413042568(): IMultiSourceMediaFrameReader2.WithDefault {
    if(pointer == NULL) {
      return(IMultiSourceMediaFrameReader2.ABI.makeIMultiSourceMediaFrameReader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMultiSourceMediaFrameReader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMultiSourceMediaFrameReader2.ABI.makeIMultiSourceMediaFrameReader2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MultiSourceMediaFrameReader> {
    public override fun getValue() = MultiSourceMediaFrameReader(pointer.getPointer(0))

    public fun setValue(value: MultiSourceMediaFrameReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MultiSourceMediaFrameReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MultiSourceMediaFrameReader {
      val address = segment.toRawLongValue()
      return MultiSourceMediaFrameReader(Pointer(address))
    }

    public override fun toNative(obj: MultiSourceMediaFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
