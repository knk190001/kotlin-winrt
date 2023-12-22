package Windows.UI.Xaml.Media.Media3D

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

@ABIMarker(CompositeTransform3D.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Media3D.CompositeTransform3D;{8977cb01-af8d-4af5-b084-c08eb9704abe})")
@WinRTByReference(brClass = CompositeTransform3D.ByReference::class)
public class CompositeTransform3D(
  ptr: JNAPointer? = NULL
) : Transform3D(ptr), ICompositeTransform3D.WithDefault, IWinRTObject {
  private val __2060916715_Interface: ICompositeTransform3D.WithDefault by lazy {
    as_2060916715()
  }


  public override val __2060916715_Ptr: JNAPointer? by lazy {
    __2060916715_Interface.__2060916715_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2060916715_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2060916715(): ICompositeTransform3D.WithDefault {
    if(pointer == NULL) {
      return(ICompositeTransform3D.ABI.makeICompositeTransform3D(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositeTransform3D>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositeTransform3D.ABI.makeICompositeTransform3D(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositeTransform3D> {
    public override fun getValue() = CompositeTransform3D(pointer.getPointer(0))

    public fun setValue(value: CompositeTransform3D): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositeTransform3D, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICompositeTransform3DStatics_Instance: ICompositeTransform3DStatics by lazy {
      createICompositeTransform3DStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Media3D.CompositeTransform3D".toHandle(),
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

    public fun createICompositeTransform3DStatics(): ICompositeTransform3DStatics {
      val refiid = Guid.REFIID(ICompositeTransform3DStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Media3D.CompositeTransform3D".toHandle(),refiid,interfacePtr)
      val result =
          ICompositeTransform3DStatics.ABI.makeICompositeTransform3DStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositeTransform3D {
      val address = segment.toRawLongValue()
      return CompositeTransform3D(Pointer(address))
    }

    public override fun toNative(obj: CompositeTransform3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterXProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_CenterXProperty()

    public fun get_CenterYProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_CenterYProperty()

    public fun get_CenterZProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_CenterZProperty()

    public fun get_RotationXProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_RotationXProperty()

    public fun get_RotationYProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_RotationYProperty()

    public fun get_RotationZProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_RotationZProperty()

    public fun get_ScaleXProperty() = ABI.ICompositeTransform3DStatics_Instance.get_ScaleXProperty()

    public fun get_ScaleYProperty() = ABI.ICompositeTransform3DStatics_Instance.get_ScaleYProperty()

    public fun get_ScaleZProperty() = ABI.ICompositeTransform3DStatics_Instance.get_ScaleZProperty()

    public fun get_TranslateXProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_TranslateXProperty()

    public fun get_TranslateYProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_TranslateYProperty()

    public fun get_TranslateZProperty() =
        ABI.ICompositeTransform3DStatics_Instance.get_TranslateZProperty()
  }
}
