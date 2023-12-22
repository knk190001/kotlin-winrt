package Windows.UI.Xaml.Media

import Windows.UI.Xaml.Media.IGradientBrushFactory.ABI.IID
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

@ABIMarker(GradientBrush.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.GradientBrush;{2166e69f-935a-4191-8e3c-1c8dfdfcdc78})")
@WinRTByReference(brClass = GradientBrush.ByReference::class)
public open class GradientBrush(
  ptr: JNAPointer? = NULL
) : Brush(ptr), IGradientBrush.WithDefault, IWinRTObject {
  private val __1696314734_Interface: IGradientBrush.WithDefault by lazy {
    as_1696314734()
  }


  public override val __1696314734_Ptr: JNAPointer? by lazy {
    __1696314734_Interface.__1696314734_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1696314734_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1696314734(): IGradientBrush.WithDefault {
    if(pointer == NULL) {
      return(IGradientBrush.ABI.makeIGradientBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGradientBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGradientBrush.ABI.makeIGradientBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GradientBrush>
      {
    public override fun getValue() = GradientBrush(pointer.getPointer(0))

    public fun setValue(value: GradientBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GradientBrush, MemoryAddress> {
    public val IGradientBrushStatics_Instance: IGradientBrushStatics by lazy {
      createIGradientBrushStatics()
    }


    public val IGradientBrushFactory_Instance: IGradientBrushFactory by lazy {
      createIGradientBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGradientBrushStatics(): IGradientBrushStatics {
      val refiid = Guid.REFIID(IGradientBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.GradientBrush".toHandle(),refiid,interfacePtr)
      val result = IGradientBrushStatics.ABI.makeIGradientBrushStatics(interfacePtr.value)
      return result
    }

    public fun createIGradientBrushFactory(): IGradientBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.GradientBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGradientBrushFactory.ABI.makeIGradientBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGradientBrushFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GradientBrush {
      val address = segment.toRawLongValue()
      return GradientBrush(Pointer(address))
    }

    public override fun toNative(obj: GradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SpreadMethodProperty() =
        ABI.IGradientBrushStatics_Instance.get_SpreadMethodProperty()

    public fun get_MappingModeProperty() =
        ABI.IGradientBrushStatics_Instance.get_MappingModeProperty()

    public fun get_ColorInterpolationModeProperty() =
        ABI.IGradientBrushStatics_Instance.get_ColorInterpolationModeProperty()

    public fun get_GradientStopsProperty() =
        ABI.IGradientBrushStatics_Instance.get_GradientStopsProperty()
  }
}
