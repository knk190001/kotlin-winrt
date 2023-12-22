package Windows.UI.Input.Spatial

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(SpatialInteractionManager.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionManager;{32a64ea8-a15a-3995-b8bd-80513cb5adef})")
@WinRTByReference(brClass = SpatialInteractionManager.ByReference::class)
public class SpatialInteractionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionManager.WithDefault, IWinRTObject {
  private val __1005365959_Interface: ISpatialInteractionManager.WithDefault by lazy {
    as_1005365959()
  }


  public override val __1005365959_Ptr: JNAPointer? by lazy {
    __1005365959_Interface.__1005365959_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1005365959_Interface)

  private fun as_1005365959(): ISpatialInteractionManager.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionManager.ABI.makeISpatialInteractionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionManager.ABI.makeISpatialInteractionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionManager> {
    public override fun getValue() = SpatialInteractionManager(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionManager, MemoryAddress> {
    public val ISpatialInteractionManagerStatics2_Instance: ISpatialInteractionManagerStatics2 by
        lazy {
      createISpatialInteractionManagerStatics2()
    }


    public val ISpatialInteractionManagerStatics_Instance: ISpatialInteractionManagerStatics by
        lazy {
      createISpatialInteractionManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialInteractionManagerStatics2(): ISpatialInteractionManagerStatics2 {
      val refiid = Guid.REFIID(ISpatialInteractionManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Spatial.SpatialInteractionManager".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialInteractionManagerStatics2.ABI.makeISpatialInteractionManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createISpatialInteractionManagerStatics(): ISpatialInteractionManagerStatics {
      val refiid = Guid.REFIID(ISpatialInteractionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Spatial.SpatialInteractionManager".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialInteractionManagerStatics.ABI.makeISpatialInteractionManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionManager {
      val address = segment.toRawLongValue()
      return SpatialInteractionManager(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSourceKindSupported(kind: SpatialInteractionSourceKind) =
        ABI.ISpatialInteractionManagerStatics2_Instance.IsSourceKindSupported(kind)

    public fun GetForCurrentView() =
        ABI.ISpatialInteractionManagerStatics_Instance.GetForCurrentView()
  }
}
