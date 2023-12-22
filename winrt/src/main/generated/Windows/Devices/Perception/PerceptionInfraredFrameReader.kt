package Windows.Devices.Perception

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

@ABIMarker(PerceptionInfraredFrameReader.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionInfraredFrameReader;{7960ce18-d39b-4fc8-a04a-929734c6756c})")
@WinRTByReference(brClass = PerceptionInfraredFrameReader.ByReference::class)
public class PerceptionInfraredFrameReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionInfraredFrameReader.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __2045890398_Interface: IPerceptionInfraredFrameReader.WithDefault by lazy {
    as_2045890398()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2045890398_Ptr: JNAPointer? by lazy {
    __2045890398_Interface.__2045890398_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2045890398_Interface, __1260617006_Interface)

  private fun as_2045890398(): IPerceptionInfraredFrameReader.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrameReader.ABI.makeIPerceptionInfraredFrameReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrameReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrameReader.ABI.makeIPerceptionInfraredFrameReader(ref.value))
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
      IByReference<PerceptionInfraredFrameReader> {
    public override fun getValue() = PerceptionInfraredFrameReader(pointer.getPointer(0))

    public fun setValue(value: PerceptionInfraredFrameReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionInfraredFrameReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionInfraredFrameReader {
      val address = segment.toRawLongValue()
      return PerceptionInfraredFrameReader(Pointer(address))
    }

    public override fun toNative(obj: PerceptionInfraredFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
