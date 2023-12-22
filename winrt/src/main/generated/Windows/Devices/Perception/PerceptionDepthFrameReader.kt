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

@ABIMarker(PerceptionDepthFrameReader.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthFrameReader;{b1a3c09f-299b-4612-a4f7-270f25a096ec})")
@WinRTByReference(brClass = PerceptionDepthFrameReader.ByReference::class)
public class PerceptionDepthFrameReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthFrameReader.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2039744742_Interface: IPerceptionDepthFrameReader.WithDefault by lazy {
    as_2039744742()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2039744742_Ptr: JNAPointer? by lazy {
    __2039744742_Interface.__2039744742_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2039744742_Interface, __1260617006_Interface)

  private fun as_2039744742(): IPerceptionDepthFrameReader.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthFrameReader.ABI.makeIPerceptionDepthFrameReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthFrameReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthFrameReader.ABI.makeIPerceptionDepthFrameReader(ref.value))
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
      IByReference<PerceptionDepthFrameReader> {
    public override fun getValue() = PerceptionDepthFrameReader(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthFrameReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthFrameReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionDepthFrameReader {
      val address = segment.toRawLongValue()
      return PerceptionDepthFrameReader(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
