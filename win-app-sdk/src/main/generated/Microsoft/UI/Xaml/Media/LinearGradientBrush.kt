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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LinearGradientBrush.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.LinearGradientBrush;{c0ab9638-1bd9-5fa4-9649-48cfa12f0d1e})")
@WinRTByReference(brClass = LinearGradientBrush.ByReference::class)
public class LinearGradientBrush(
  ptr: JNAPointer? = NULL
) : GradientBrush(ptr), ILinearGradientBrush.WithDefault, IWinRTObject {
  private val __1565072652_Interface: ILinearGradientBrush.WithDefault by lazy {
    as_1565072652()
  }


  public override val __1565072652_Ptr: JNAPointer? by lazy {
    __1565072652_Interface.__1565072652_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1565072652_Interface)

  public constructor() : this(ABI.activate())

  public constructor(gradientStopCollection: GradientStopCollection, angle: Double) :
      this(ABI.activate(gradientStopCollection, angle))

  private fun as_1565072652(): ILinearGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(ILinearGradientBrush.ABI.makeILinearGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinearGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinearGradientBrush.ABI.makeILinearGradientBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinearGradientBrush> {
    public override fun getValue() = LinearGradientBrush(pointer.getPointer(0))

    public fun setValue(value: LinearGradientBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinearGradientBrush, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILinearGradientBrushStatics_Instance: ILinearGradientBrushStatics by lazy {
      createILinearGradientBrushStatics()
    }


    public val ILinearGradientBrushFactory_Instance: ILinearGradientBrushFactory by lazy {
      createILinearGradientBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.LinearGradientBrush".toHandle(),
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

    public fun createILinearGradientBrushStatics(): ILinearGradientBrushStatics {
      val refiid = Guid.REFIID(ILinearGradientBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.LinearGradientBrush".toHandle(),refiid,interfacePtr)
      val result =
          ILinearGradientBrushStatics.ABI.makeILinearGradientBrushStatics(interfacePtr.value)
      return result
    }

    public fun createILinearGradientBrushFactory(): ILinearGradientBrushFactory {
      val refiid = Guid.REFIID(ILinearGradientBrushFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.LinearGradientBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILinearGradientBrushFactory.ABI.makeILinearGradientBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(gradientStopCollection: GradientStopCollection, angle: Double): JNAPointer?
        =
        ILinearGradientBrushFactory_Instance.CreateInstanceWithGradientStopCollectionAndAngle(gradientStopCollection,
        angle)?.pointer

    public override fun fromNative(segment: MemoryAddress): LinearGradientBrush {
      val address = segment.toRawLongValue()
      return LinearGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: LinearGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_StartPointProperty() =
        ABI.ILinearGradientBrushStatics_Instance.get_StartPointProperty()

    public fun get_EndPointProperty() =
        ABI.ILinearGradientBrushStatics_Instance.get_EndPointProperty()
  }
}
