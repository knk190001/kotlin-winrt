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

@ABIMarker(EllipseGeometry.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.EllipseGeometry;{ababd262-d8e4-5b49-bce9-0108a5209d45})")
@WinRTByReference(brClass = EllipseGeometry.ByReference::class)
public class EllipseGeometry(
  ptr: JNAPointer? = NULL
) : Geometry(ptr), IEllipseGeometry.WithDefault, IWinRTObject {
  private val __2029106657_Interface: IEllipseGeometry.WithDefault by lazy {
    as_2029106657()
  }


  public override val __2029106657_Ptr: JNAPointer? by lazy {
    __2029106657_Interface.__2029106657_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2029106657_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2029106657(): IEllipseGeometry.WithDefault {
    if(pointer == NULL) {
      return(IEllipseGeometry.ABI.makeIEllipseGeometry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEllipseGeometry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEllipseGeometry.ABI.makeIEllipseGeometry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EllipseGeometry> {
    public override fun getValue() = EllipseGeometry(pointer.getPointer(0))

    public fun setValue(value: EllipseGeometry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EllipseGeometry, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IEllipseGeometryStatics_Instance: IEllipseGeometryStatics by lazy {
      createIEllipseGeometryStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.EllipseGeometry".toHandle(),
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

    public fun createIEllipseGeometryStatics(): IEllipseGeometryStatics {
      val refiid = Guid.REFIID(IEllipseGeometryStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.EllipseGeometry".toHandle(),refiid,interfacePtr)
      val result = IEllipseGeometryStatics.ABI.makeIEllipseGeometryStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EllipseGeometry {
      val address = segment.toRawLongValue()
      return EllipseGeometry(Pointer(address))
    }

    public override fun toNative(obj: EllipseGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterProperty() = ABI.IEllipseGeometryStatics_Instance.get_CenterProperty()

    public fun get_RadiusXProperty() = ABI.IEllipseGeometryStatics_Instance.get_RadiusXProperty()

    public fun get_RadiusYProperty() = ABI.IEllipseGeometryStatics_Instance.get_RadiusYProperty()
  }
}
