package Microsoft.UI.Xaml.Media

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlaneProjection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.PlaneProjection;{d3e22836-0322-5d75-941c-a5ffb05192b2})")
@WinRTByReference(brClass = PlaneProjection.ByReference::class)
public class PlaneProjection(
  ptr: JNAPointer? = NULL
) : Projection(ptr), IPlaneProjection.WithDefault, IWinRTObject {
  private val __939900282_Interface: IPlaneProjection.WithDefault by lazy {
    as_939900282()
  }


  public override val __939900282_Ptr: JNAPointer? by lazy {
    __939900282_Interface.__939900282_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__939900282_Interface)

  public constructor() : this(ABI.activate())

  private fun as_939900282(): IPlaneProjection.WithDefault {
    if(pointer == NULL) {
      return(IPlaneProjection.ABI.makeIPlaneProjection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaneProjection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaneProjection.ABI.makeIPlaneProjection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaneProjection> {
    public override fun getValue() = PlaneProjection(pointer.getPointer(0))

    public fun setValue(value: PlaneProjection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaneProjection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPlaneProjectionStatics_Instance: IPlaneProjectionStatics by lazy {
      createIPlaneProjectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PlaneProjection".toHandle(),
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

    public fun createIPlaneProjectionStatics(): IPlaneProjectionStatics {
      val refiid = Guid.REFIID(IPlaneProjectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PlaneProjection".toHandle(),refiid,interfacePtr)
      val result = IPlaneProjectionStatics.ABI.makeIPlaneProjectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlaneProjection {
      val address = segment.toRawLongValue()
      return PlaneProjection(Pointer(address))
    }

    public override fun toNative(obj: PlaneProjection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LocalOffsetXProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_LocalOffsetXProperty()

    public fun get_LocalOffsetYProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_LocalOffsetYProperty()

    public fun get_LocalOffsetZProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_LocalOffsetZProperty()

    public fun get_RotationXProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_RotationXProperty()

    public fun get_RotationYProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_RotationYProperty()

    public fun get_RotationZProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_RotationZProperty()

    public fun get_CenterOfRotationXProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_CenterOfRotationXProperty()

    public fun get_CenterOfRotationYProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_CenterOfRotationYProperty()

    public fun get_CenterOfRotationZProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_CenterOfRotationZProperty()

    public fun get_GlobalOffsetXProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_GlobalOffsetXProperty()

    public fun get_GlobalOffsetYProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_GlobalOffsetYProperty()

    public fun get_GlobalOffsetZProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_GlobalOffsetZProperty()

    public fun get_ProjectionMatrixProperty() =
        ABI.IPlaneProjectionStatics_Instance.get_ProjectionMatrixProperty()
  }
}
