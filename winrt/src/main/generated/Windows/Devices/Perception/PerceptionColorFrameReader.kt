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

@ABIMarker(PerceptionColorFrameReader.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionColorFrameReader;{7650f56e-b9f5-461b-83ad-f222af2aaadc})")
@WinRTByReference(brClass = PerceptionColorFrameReader.ByReference::class)
public class PerceptionColorFrameReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionColorFrameReader.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1146515066_Interface: IPerceptionColorFrameReader.WithDefault by lazy {
    as_1146515066()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1146515066_Ptr: JNAPointer? by lazy {
    __1146515066_Interface.__1146515066_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1146515066_Interface, __1260617006_Interface)

  private fun as_1146515066(): IPerceptionColorFrameReader.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionColorFrameReader.ABI.makeIPerceptionColorFrameReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionColorFrameReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionColorFrameReader.ABI.makeIPerceptionColorFrameReader(ref.value))
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
      IByReference<PerceptionColorFrameReader> {
    public override fun getValue() = PerceptionColorFrameReader(pointer.getPointer(0))

    public fun setValue(value: PerceptionColorFrameReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionColorFrameReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionColorFrameReader {
      val address = segment.toRawLongValue()
      return PerceptionColorFrameReader(Pointer(address))
    }

    public override fun toNative(obj: PerceptionColorFrameReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
