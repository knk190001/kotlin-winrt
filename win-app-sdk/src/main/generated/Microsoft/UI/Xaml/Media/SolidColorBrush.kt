package Microsoft.UI.Xaml.Media

import Windows.UI.Color
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

@ABIMarker(SolidColorBrush.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.SolidColorBrush;{b3865c31-37c8-55c1-8a72-d41c67642e2a})")
@WinRTByReference(brClass = SolidColorBrush.ByReference::class)
public class SolidColorBrush(
  ptr: JNAPointer? = NULL
) : Brush(ptr), ISolidColorBrush.WithDefault, IWinRTObject {
  private val __807831121_Interface: ISolidColorBrush.WithDefault by lazy {
    as_807831121()
  }


  public override val __807831121_Ptr: JNAPointer? by lazy {
    __807831121_Interface.__807831121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__807831121_Interface)

  public constructor() : this(ABI.activate())

  public constructor(color: Color) : this(ABI.activate(color))

  private fun as_807831121(): ISolidColorBrush.WithDefault {
    if(pointer == NULL) {
      return(ISolidColorBrush.ABI.makeISolidColorBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISolidColorBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISolidColorBrush.ABI.makeISolidColorBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SolidColorBrush> {
    public override fun getValue() = SolidColorBrush(pointer.getPointer(0))

    public fun setValue(value: SolidColorBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SolidColorBrush, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISolidColorBrushStatics_Instance: ISolidColorBrushStatics by lazy {
      createISolidColorBrushStatics()
    }


    public val ISolidColorBrushFactory_Instance: ISolidColorBrushFactory by lazy {
      createISolidColorBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.SolidColorBrush".toHandle(),
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

    public fun createISolidColorBrushStatics(): ISolidColorBrushStatics {
      val refiid = Guid.REFIID(ISolidColorBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.SolidColorBrush".toHandle(),refiid,interfacePtr)
      val result = ISolidColorBrushStatics.ABI.makeISolidColorBrushStatics(interfacePtr.value)
      return result
    }

    public fun createISolidColorBrushFactory(): ISolidColorBrushFactory {
      val refiid = Guid.REFIID(ISolidColorBrushFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.SolidColorBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISolidColorBrushFactory.ABI.makeISolidColorBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(color: Color): JNAPointer? =
        ISolidColorBrushFactory_Instance.CreateInstanceWithColor(color)?.pointer

    public override fun fromNative(segment: MemoryAddress): SolidColorBrush {
      val address = segment.toRawLongValue()
      return SolidColorBrush(Pointer(address))
    }

    public override fun toNative(obj: SolidColorBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColorProperty() = ABI.ISolidColorBrushStatics_Instance.get_ColorProperty()
  }
}
