package Windows.UI.Input.Spatial

import Windows.Perception.PerceptionTimestamp
import Windows.Perception.Spatial.SpatialCoordinateSystem
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

@ABIMarker(SpatialPointerPose.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialPointerPose;{6953a42e-c17e-357d-97a1-7269d0ed2d10})")
@WinRTByReference(brClass = SpatialPointerPose.ByReference::class)
public class SpatialPointerPose(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialPointerPose.WithDefault, ISpatialPointerPose2.WithDefault,
    ISpatialPointerPose3.WithDefault, IWinRTObject {
  private val __19652706_Interface: ISpatialPointerPose.WithDefault by lazy {
    as_19652706()
  }


  private val __609233936_Interface: ISpatialPointerPose2.WithDefault by lazy {
    as_609233936()
  }


  private val __609233937_Interface: ISpatialPointerPose3.WithDefault by lazy {
    as_609233937()
  }


  public override val __19652706_Ptr: JNAPointer? by lazy {
    __19652706_Interface.__19652706_Ptr
  }


  public override val __609233936_Ptr: JNAPointer? by lazy {
    __609233936_Interface.__609233936_Ptr
  }


  public override val __609233937_Ptr: JNAPointer? by lazy {
    __609233937_Interface.__609233937_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__19652706_Interface, __609233936_Interface, __609233937_Interface)

  private fun as_19652706(): ISpatialPointerPose.WithDefault {
    if(pointer == NULL) {
      return(ISpatialPointerPose.ABI.makeISpatialPointerPose(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialPointerPose>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialPointerPose.ABI.makeISpatialPointerPose(ref.value))
  }

  private fun as_609233936(): ISpatialPointerPose2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialPointerPose2.ABI.makeISpatialPointerPose2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialPointerPose2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialPointerPose2.ABI.makeISpatialPointerPose2(ref.value))
  }

  private fun as_609233937(): ISpatialPointerPose3.WithDefault {
    if(pointer == NULL) {
      return(ISpatialPointerPose3.ABI.makeISpatialPointerPose3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialPointerPose3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialPointerPose3.ABI.makeISpatialPointerPose3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialPointerPose> {
    public override fun getValue() = SpatialPointerPose(pointer.getPointer(0))

    public fun setValue(value: SpatialPointerPose): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialPointerPose, MemoryAddress> {
    public val ISpatialPointerPoseStatics_Instance: ISpatialPointerPoseStatics by lazy {
      createISpatialPointerPoseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialPointerPoseStatics(): ISpatialPointerPoseStatics {
      val refiid = Guid.REFIID(ISpatialPointerPoseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Spatial.SpatialPointerPose".toHandle(),refiid,interfacePtr)
      val result = ISpatialPointerPoseStatics.ABI.makeISpatialPointerPoseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialPointerPose {
      val address = segment.toRawLongValue()
      return SpatialPointerPose(Pointer(address))
    }

    public override fun toNative(obj: SpatialPointerPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryGetAtTimestamp(coordinateSystem: SpatialCoordinateSystem,
        timestamp: PerceptionTimestamp) =
        ABI.ISpatialPointerPoseStatics_Instance.TryGetAtTimestamp(coordinateSystem, timestamp)
  }
}
