package Windows.Perception.Spatial

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(SpatialStageFrameOfReference.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialStageFrameOfReference;{7a8a3464-ad0d-4590-ab86-33062b674926})")
@WinRTByReference(brClass = SpatialStageFrameOfReference.ByReference::class)
public class SpatialStageFrameOfReference(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialStageFrameOfReference.WithDefault, IWinRTObject {
  private val __512692092_Interface: ISpatialStageFrameOfReference.WithDefault by lazy {
    as_512692092()
  }


  public override val __512692092_Ptr: JNAPointer? by lazy {
    __512692092_Interface.__512692092_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__512692092_Interface)

  private fun as_512692092(): ISpatialStageFrameOfReference.WithDefault {
    if(pointer == NULL) {
      return(ISpatialStageFrameOfReference.ABI.makeISpatialStageFrameOfReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialStageFrameOfReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialStageFrameOfReference.ABI.makeISpatialStageFrameOfReference(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialStageFrameOfReference> {
    public override fun getValue() = SpatialStageFrameOfReference(pointer.getPointer(0))

    public fun setValue(value: SpatialStageFrameOfReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialStageFrameOfReference, MemoryAddress> {
    public val ISpatialStageFrameOfReferenceStatics_Instance: ISpatialStageFrameOfReferenceStatics
        by lazy {
      createISpatialStageFrameOfReferenceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialStageFrameOfReferenceStatics(): ISpatialStageFrameOfReferenceStatics {
      val refiid = Guid.REFIID(ISpatialStageFrameOfReferenceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialStageFrameOfReference".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialStageFrameOfReferenceStatics.ABI.makeISpatialStageFrameOfReferenceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialStageFrameOfReference {
      val address = segment.toRawLongValue()
      return SpatialStageFrameOfReference(Pointer(address))
    }

    public override fun toNative(obj: SpatialStageFrameOfReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.ISpatialStageFrameOfReferenceStatics_Instance.get_Current()

    public fun add_CurrentChanged(handler: EventHandler<IUnknown?>) =
        ABI.ISpatialStageFrameOfReferenceStatics_Instance.add_CurrentChanged(handler)

    public fun remove_CurrentChanged(cookie: EventRegistrationToken) =
        ABI.ISpatialStageFrameOfReferenceStatics_Instance.remove_CurrentChanged(cookie)

    public fun RequestNewStageAsync() =
        ABI.ISpatialStageFrameOfReferenceStatics_Instance.RequestNewStageAsync()
  }
}
