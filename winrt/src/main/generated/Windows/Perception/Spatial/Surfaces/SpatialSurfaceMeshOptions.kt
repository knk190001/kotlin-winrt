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

@ABIMarker(SpatialSurfaceMeshOptions.ABI::class)
@Signature("rc(Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions;{d2759f89-3572-3d2d-a10d-5fee9394aa37})")
@WinRTByReference(brClass = SpatialSurfaceMeshOptions.ByReference::class)
public class SpatialSurfaceMeshOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialSurfaceMeshOptions.WithDefault, IWinRTObject {
  private val __1278017619_Interface: ISpatialSurfaceMeshOptions.WithDefault by lazy {
    as_1278017619()
  }


  public override val __1278017619_Ptr: JNAPointer? by lazy {
    __1278017619_Interface.__1278017619_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1278017619_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1278017619(): ISpatialSurfaceMeshOptions.WithDefault {
    if(pointer == NULL) {
      return(ISpatialSurfaceMeshOptions.ABI.makeISpatialSurfaceMeshOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialSurfaceMeshOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialSurfaceMeshOptions.ABI.makeISpatialSurfaceMeshOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialSurfaceMeshOptions> {
    public override fun getValue() = SpatialSurfaceMeshOptions(pointer.getPointer(0))

    public fun setValue(value: SpatialSurfaceMeshOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialSurfaceMeshOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISpatialSurfaceMeshOptionsStatics_Instance: ISpatialSurfaceMeshOptionsStatics by
        lazy {
      createISpatialSurfaceMeshOptionsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions".toHandle(),
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

    public fun createISpatialSurfaceMeshOptionsStatics(): ISpatialSurfaceMeshOptionsStatics {
      val refiid = Guid.REFIID(ISpatialSurfaceMeshOptionsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialSurfaceMeshOptionsStatics.ABI.makeISpatialSurfaceMeshOptionsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialSurfaceMeshOptions {
      val address = segment.toRawLongValue()
      return SpatialSurfaceMeshOptions(Pointer(address))
    }

    public override fun toNative(obj: SpatialSurfaceMeshOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SupportedVertexPositionFormats() =
        ABI.ISpatialSurfaceMeshOptionsStatics_Instance.get_SupportedVertexPositionFormats()

    public fun get_SupportedTriangleIndexFormats() =
        ABI.ISpatialSurfaceMeshOptionsStatics_Instance.get_SupportedTriangleIndexFormats()

    public fun get_SupportedVertexNormalFormats() =
        ABI.ISpatialSurfaceMeshOptionsStatics_Instance.get_SupportedVertexNormalFormats()
  }
}
