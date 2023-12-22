package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteractionSource.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionSource;{fb5433ba-b0b3-3148-9f3b-e9f5de568f5d})")
@WinRTByReference(brClass = SpatialInteractionSource.ByReference::class)
public class SpatialInteractionSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionSource.WithDefault, ISpatialInteractionSource2.WithDefault,
    ISpatialInteractionSource3.WithDefault, ISpatialInteractionSource4.WithDefault, IWinRTObject {
  private val __1168113215_Interface: ISpatialInteractionSource.WithDefault by lazy {
    as_1168113215()
  }


  private val __1851771247_Interface: ISpatialInteractionSource2.WithDefault by lazy {
    as_1851771247()
  }


  private val __1851771246_Interface: ISpatialInteractionSource3.WithDefault by lazy {
    as_1851771246()
  }


  private val __1851771245_Interface: ISpatialInteractionSource4.WithDefault by lazy {
    as_1851771245()
  }


  public override val __1168113215_Ptr: JNAPointer? by lazy {
    __1168113215_Interface.__1168113215_Ptr
  }


  public override val __1851771247_Ptr: JNAPointer? by lazy {
    __1851771247_Interface.__1851771247_Ptr
  }


  public override val __1851771246_Ptr: JNAPointer? by lazy {
    __1851771246_Interface.__1851771246_Ptr
  }


  public override val __1851771245_Ptr: JNAPointer? by lazy {
    __1851771245_Interface.__1851771245_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1168113215_Interface, __1851771247_Interface, __1851771246_Interface,
        __1851771245_Interface)

  private fun as_1168113215(): ISpatialInteractionSource.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSource.ABI.makeISpatialInteractionSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSource.ABI.makeISpatialInteractionSource(ref.value))
  }

  private fun as_1851771247(): ISpatialInteractionSource2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSource2.ABI.makeISpatialInteractionSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSource2.ABI.makeISpatialInteractionSource2(ref.value))
  }

  private fun as_1851771246(): ISpatialInteractionSource3.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSource3.ABI.makeISpatialInteractionSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSource3.ABI.makeISpatialInteractionSource3(ref.value))
  }

  private fun as_1851771245(): ISpatialInteractionSource4.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionSource4.ABI.makeISpatialInteractionSource4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionSource4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionSource4.ABI.makeISpatialInteractionSource4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionSource> {
    public override fun getValue() = SpatialInteractionSource(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionSource {
      val address = segment.toRawLongValue()
      return SpatialInteractionSource(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
