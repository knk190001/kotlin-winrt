package Windows.Perception.Spatial.Surfaces

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(SpatialSurfaceObserver.ABI::class)
@Signature("rc(Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver;{10b69819-ddca-3483-ac3a-748fe8c86df5})")
@WinRTByReference(brClass = SpatialSurfaceObserver.ByReference::class)
public class SpatialSurfaceObserver(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialSurfaceObserver.WithDefault, IWinRTObject {
  private val __1501249690_Interface: ISpatialSurfaceObserver.WithDefault by lazy {
    as_1501249690()
  }


  public override val __1501249690_Ptr: JNAPointer? by lazy {
    __1501249690_Interface.__1501249690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1501249690_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1501249690(): ISpatialSurfaceObserver.WithDefault {
    if(pointer == NULL) {
      return(ISpatialSurfaceObserver.ABI.makeISpatialSurfaceObserver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialSurfaceObserver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialSurfaceObserver.ABI.makeISpatialSurfaceObserver(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialSurfaceObserver> {
    public override fun getValue() = SpatialSurfaceObserver(pointer.getPointer(0))

    public fun setValue(value: SpatialSurfaceObserver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialSurfaceObserver, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISpatialSurfaceObserverStatics2_Instance: ISpatialSurfaceObserverStatics2 by lazy {
      createISpatialSurfaceObserverStatics2()
    }


    public val ISpatialSurfaceObserverStatics_Instance: ISpatialSurfaceObserverStatics by lazy {
      createISpatialSurfaceObserverStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createISpatialSurfaceObserverStatics2(): ISpatialSurfaceObserverStatics2 {
      val refiid = Guid.REFIID(ISpatialSurfaceObserverStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialSurfaceObserverStatics2.ABI.makeISpatialSurfaceObserverStatics2(interfacePtr.value)
      return result
    }

    public fun createISpatialSurfaceObserverStatics(): ISpatialSurfaceObserverStatics {
      val refiid = Guid.REFIID(ISpatialSurfaceObserverStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialSurfaceObserverStatics.ABI.makeISpatialSurfaceObserverStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialSurfaceObserver {
      val address = segment.toRawLongValue()
      return SpatialSurfaceObserver(Pointer(address))
    }

    public override fun toNative(obj: SpatialSurfaceObserver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.ISpatialSurfaceObserverStatics2_Instance.IsSupported()

    public fun RequestAccessAsync() =
        ABI.ISpatialSurfaceObserverStatics_Instance.RequestAccessAsync()
  }
}
