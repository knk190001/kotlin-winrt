package Windows.Perception

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

@ABIMarker(PerceptionTimestamp.ABI::class)
@Signature("rc(Windows.Perception.PerceptionTimestamp;{87c24804-a22e-4adb-ba26-d78ef639bcf4})")
@WinRTByReference(brClass = PerceptionTimestamp.ByReference::class)
public class PerceptionTimestamp(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionTimestamp.WithDefault, IPerceptionTimestamp2.WithDefault,
    IWinRTObject {
  private val __1860102120_Interface: IPerceptionTimestamp.WithDefault by lazy {
    as_1860102120()
  }


  private val __1828590822_Interface: IPerceptionTimestamp2.WithDefault by lazy {
    as_1828590822()
  }


  public override val __1860102120_Ptr: JNAPointer? by lazy {
    __1860102120_Interface.__1860102120_Ptr
  }


  public override val __1828590822_Ptr: JNAPointer? by lazy {
    __1828590822_Interface.__1828590822_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1860102120_Interface, __1828590822_Interface)

  private fun as_1860102120(): IPerceptionTimestamp.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionTimestamp.ABI.makeIPerceptionTimestamp(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionTimestamp>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionTimestamp.ABI.makeIPerceptionTimestamp(ref.value))
  }

  private fun as_1828590822(): IPerceptionTimestamp2.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionTimestamp2.ABI.makeIPerceptionTimestamp2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionTimestamp2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionTimestamp2.ABI.makeIPerceptionTimestamp2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionTimestamp> {
    public override fun getValue() = PerceptionTimestamp(pointer.getPointer(0))

    public fun setValue(value: PerceptionTimestamp): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionTimestamp, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionTimestamp {
      val address = segment.toRawLongValue()
      return PerceptionTimestamp(Pointer(address))
    }

    public override fun toNative(obj: PerceptionTimestamp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
