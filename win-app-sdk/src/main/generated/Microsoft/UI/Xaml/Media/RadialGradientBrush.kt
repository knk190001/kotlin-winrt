package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.IRadialGradientBrushFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RadialGradientBrush.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.RadialGradientBrush;{5d493ce1-b844-546a-b772-b3bcba7e98ee})")
@WinRTByReference(brClass = RadialGradientBrush.ByReference::class)
public open class RadialGradientBrush(
  ptr: JNAPointer? = NULL
) : XamlCompositionBrushBase(ptr), IRadialGradientBrush.WithDefault, IWinRTObject {
  private val __1687694906_Interface: IRadialGradientBrush.WithDefault by lazy {
    as_1687694906()
  }


  public override val __1687694906_Ptr: JNAPointer? by lazy {
    __1687694906_Interface.__1687694906_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1687694906_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1687694906(): IRadialGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(IRadialGradientBrush.ABI.makeIRadialGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialGradientBrush.ABI.makeIRadialGradientBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialGradientBrush> {
    public override fun getValue() = RadialGradientBrush(pointer.getPointer(0))

    public fun setValue(value: RadialGradientBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialGradientBrush, MemoryAddress> {
    public val IRadialGradientBrushStatics_Instance: IRadialGradientBrushStatics by lazy {
      createIRadialGradientBrushStatics()
    }


    public val IRadialGradientBrushFactory_Instance: IRadialGradientBrushFactory by lazy {
      createIRadialGradientBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadialGradientBrushStatics(): IRadialGradientBrushStatics {
      val refiid = Guid.REFIID(IRadialGradientBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.RadialGradientBrush".toHandle(),refiid,interfacePtr)
      val result =
          IRadialGradientBrushStatics.ABI.makeIRadialGradientBrushStatics(interfacePtr.value)
      return result
    }

    public fun createIRadialGradientBrushFactory(): IRadialGradientBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.RadialGradientBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRadialGradientBrushFactory.ABI.makeIRadialGradientBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRadialGradientBrushFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RadialGradientBrush {
      val address = segment.toRawLongValue()
      return RadialGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: RadialGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterProperty() = ABI.IRadialGradientBrushStatics_Instance.get_CenterProperty()

    public fun get_RadiusXProperty() =
        ABI.IRadialGradientBrushStatics_Instance.get_RadiusXProperty()

    public fun get_RadiusYProperty() =
        ABI.IRadialGradientBrushStatics_Instance.get_RadiusYProperty()

    public fun get_GradientOriginProperty() =
        ABI.IRadialGradientBrushStatics_Instance.get_GradientOriginProperty()

    public fun get_InterpolationSpaceProperty() =
        ABI.IRadialGradientBrushStatics_Instance.get_InterpolationSpaceProperty()

    public fun get_MappingModeProperty() =
        ABI.IRadialGradientBrushStatics_Instance.get_MappingModeProperty()

    public fun get_SpreadMethodProperty() =
        ABI.IRadialGradientBrushStatics_Instance.get_SpreadMethodProperty()
  }
}
