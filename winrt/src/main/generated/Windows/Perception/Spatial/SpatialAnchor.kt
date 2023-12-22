package Windows.Perception.Spatial

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(SpatialAnchor.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialAnchor;{0529e5ce-1d34-3702-bcec-eabff578a869})")
@WinRTByReference(brClass = SpatialAnchor.ByReference::class)
public class SpatialAnchor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAnchor.WithDefault, ISpatialAnchor2.WithDefault, IWinRTObject {
  private val __1801664182_Interface: ISpatialAnchor.WithDefault by lazy {
    as_1801664182()
  }


  private val __17014844_Interface: ISpatialAnchor2.WithDefault by lazy {
    as_17014844()
  }


  public override val __1801664182_Ptr: JNAPointer? by lazy {
    __1801664182_Interface.__1801664182_Ptr
  }


  public override val __17014844_Ptr: JNAPointer? by lazy {
    __17014844_Interface.__17014844_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1801664182_Interface, __17014844_Interface)

  private fun as_1801664182(): ISpatialAnchor.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAnchor.ABI.makeISpatialAnchor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAnchor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAnchor.ABI.makeISpatialAnchor(ref.value))
  }

  private fun as_17014844(): ISpatialAnchor2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAnchor2.ABI.makeISpatialAnchor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAnchor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAnchor2.ABI.makeISpatialAnchor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpatialAnchor>
      {
    public override fun getValue() = SpatialAnchor(pointer.getPointer(0))

    public fun setValue(value: SpatialAnchor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAnchor, MemoryAddress> {
    public val ISpatialAnchorStatics_Instance: ISpatialAnchorStatics by lazy {
      createISpatialAnchorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialAnchorStatics(): ISpatialAnchorStatics {
      val refiid = Guid.REFIID(ISpatialAnchorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialAnchor".toHandle(),refiid,interfacePtr)
      val result = ISpatialAnchorStatics.ABI.makeISpatialAnchorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialAnchor {
      val address = segment.toRawLongValue()
      return SpatialAnchor(Pointer(address))
    }

    public override fun toNative(obj: SpatialAnchor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreateRelativeTo(coordinateSystem: SpatialCoordinateSystem) =
        ABI.ISpatialAnchorStatics_Instance.TryCreateRelativeTo(coordinateSystem)

    public fun TryCreateRelativeTo(coordinateSystem: SpatialCoordinateSystem, position: Vector3) =
        ABI.ISpatialAnchorStatics_Instance.TryCreateRelativeTo(coordinateSystem, position)

    public fun TryCreateRelativeTo(
      coordinateSystem: SpatialCoordinateSystem,
      position: Vector3,
      orientation: Quaternion
    ) = ABI.ISpatialAnchorStatics_Instance.TryCreateRelativeTo(coordinateSystem, position,
        orientation)
  }
}
