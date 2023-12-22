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

@ABIMarker(SpatialPointerInteractionSourcePose.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialPointerInteractionSourcePose;{a7104307-2c2b-4d3a-92a7-80ced7c4a0d0})")
@WinRTByReference(brClass = SpatialPointerInteractionSourcePose.ByReference::class)
public class SpatialPointerInteractionSourcePose(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialPointerInteractionSourcePose.WithDefault,
    ISpatialPointerInteractionSourcePose2.WithDefault, IWinRTObject {
  private val __1654644557_Interface: ISpatialPointerInteractionSourcePose.WithDefault by lazy {
    as_1654644557()
  }


  private val __245626235_Interface: ISpatialPointerInteractionSourcePose2.WithDefault by lazy {
    as_245626235()
  }


  public override val __1654644557_Ptr: JNAPointer? by lazy {
    __1654644557_Interface.__1654644557_Ptr
  }


  public override val __245626235_Ptr: JNAPointer? by lazy {
    __245626235_Interface.__245626235_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1654644557_Interface, __245626235_Interface)

  private fun as_1654644557(): ISpatialPointerInteractionSourcePose.WithDefault {
    if(pointer == NULL) {
      return(ISpatialPointerInteractionSourcePose.ABI.makeISpatialPointerInteractionSourcePose(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialPointerInteractionSourcePose>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialPointerInteractionSourcePose.ABI.makeISpatialPointerInteractionSourcePose(ref.value))
  }

  private fun as_245626235(): ISpatialPointerInteractionSourcePose2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialPointerInteractionSourcePose2.ABI.makeISpatialPointerInteractionSourcePose2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialPointerInteractionSourcePose2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialPointerInteractionSourcePose2.ABI.makeISpatialPointerInteractionSourcePose2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialPointerInteractionSourcePose> {
    public override fun getValue() = SpatialPointerInteractionSourcePose(pointer.getPointer(0))

    public fun setValue(value: SpatialPointerInteractionSourcePose): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialPointerInteractionSourcePose, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialPointerInteractionSourcePose {
      val address = segment.toRawLongValue()
      return SpatialPointerInteractionSourcePose(Pointer(address))
    }

    public override fun toNative(obj: SpatialPointerInteractionSourcePose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
