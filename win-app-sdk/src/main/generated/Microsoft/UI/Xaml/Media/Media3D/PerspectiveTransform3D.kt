package Microsoft.UI.Xaml.Media.Media3D

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

@ABIMarker(PerspectiveTransform3D.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Media3D.PerspectiveTransform3D;{4006cc46-684e-54ea-a421-dae5b0556b85})")
@WinRTByReference(brClass = PerspectiveTransform3D.ByReference::class)
public class PerspectiveTransform3D(
  ptr: JNAPointer? = NULL
) : Transform3D(ptr), IPerspectiveTransform3D.WithDefault, IWinRTObject {
  private val __1102153547_Interface: IPerspectiveTransform3D.WithDefault by lazy {
    as_1102153547()
  }


  public override val __1102153547_Ptr: JNAPointer? by lazy {
    __1102153547_Interface.__1102153547_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1102153547_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1102153547(): IPerspectiveTransform3D.WithDefault {
    if(pointer == NULL) {
      return(IPerspectiveTransform3D.ABI.makeIPerspectiveTransform3D(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerspectiveTransform3D>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerspectiveTransform3D.ABI.makeIPerspectiveTransform3D(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerspectiveTransform3D> {
    public override fun getValue() = PerspectiveTransform3D(pointer.getPointer(0))

    public fun setValue(value: PerspectiveTransform3D): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerspectiveTransform3D, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPerspectiveTransform3DStatics_Instance: IPerspectiveTransform3DStatics by lazy {
      createIPerspectiveTransform3DStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Media3D.PerspectiveTransform3D".toHandle(),
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

    public fun createIPerspectiveTransform3DStatics(): IPerspectiveTransform3DStatics {
      val refiid = Guid.REFIID(IPerspectiveTransform3DStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Media3D.PerspectiveTransform3D".toHandle(),refiid,interfacePtr)
      val result =
          IPerspectiveTransform3DStatics.ABI.makeIPerspectiveTransform3DStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PerspectiveTransform3D {
      val address = segment.toRawLongValue()
      return PerspectiveTransform3D(Pointer(address))
    }

    public override fun toNative(obj: PerspectiveTransform3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DepthProperty() = ABI.IPerspectiveTransform3DStatics_Instance.get_DepthProperty()

    public fun get_OffsetXProperty() =
        ABI.IPerspectiveTransform3DStatics_Instance.get_OffsetXProperty()

    public fun get_OffsetYProperty() =
        ABI.IPerspectiveTransform3DStatics_Instance.get_OffsetYProperty()
  }
}
