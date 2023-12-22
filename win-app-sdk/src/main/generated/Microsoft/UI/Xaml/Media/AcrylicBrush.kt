package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.IAcrylicBrushFactory.ABI.IID
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

@ABIMarker(AcrylicBrush.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.AcrylicBrush;{3a8c760a-941f-58bc-a6d4-aa7a0dd1d036})")
@WinRTByReference(brClass = AcrylicBrush.ByReference::class)
public open class AcrylicBrush(
  ptr: JNAPointer? = NULL
) : XamlCompositionBrushBase(ptr), IAcrylicBrush.WithDefault, IAcrylicBrush2.WithDefault,
    IWinRTObject {
  private val __1497071634_Interface: IAcrylicBrush.WithDefault by lazy {
    as_1497071634()
  }


  private val __835419652_Interface: IAcrylicBrush2.WithDefault by lazy {
    as_835419652()
  }


  public override val __1497071634_Ptr: JNAPointer? by lazy {
    __1497071634_Interface.__1497071634_Ptr
  }


  public override val __835419652_Ptr: JNAPointer? by lazy {
    __835419652_Interface.__835419652_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1497071634_Interface, __835419652_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1497071634(): IAcrylicBrush.WithDefault {
    if(pointer == NULL) {
      return(IAcrylicBrush.ABI.makeIAcrylicBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAcrylicBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAcrylicBrush.ABI.makeIAcrylicBrush(ref.value))
  }

  private fun as_835419652(): IAcrylicBrush2.WithDefault {
    if(pointer == NULL) {
      return(IAcrylicBrush2.ABI.makeIAcrylicBrush2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAcrylicBrush2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAcrylicBrush2.ABI.makeIAcrylicBrush2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AcrylicBrush> {
    public override fun getValue() = AcrylicBrush(pointer.getPointer(0))

    public fun setValue(value: AcrylicBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AcrylicBrush, MemoryAddress> {
    public val IAcrylicBrushStatics_Instance: IAcrylicBrushStatics by lazy {
      createIAcrylicBrushStatics()
    }


    public val IAcrylicBrushStatics2_Instance: IAcrylicBrushStatics2 by lazy {
      createIAcrylicBrushStatics2()
    }


    public val IAcrylicBrushFactory_Instance: IAcrylicBrushFactory by lazy {
      createIAcrylicBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAcrylicBrushStatics(): IAcrylicBrushStatics {
      val refiid = Guid.REFIID(IAcrylicBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.AcrylicBrush".toHandle(),refiid,interfacePtr)
      val result = IAcrylicBrushStatics.ABI.makeIAcrylicBrushStatics(interfacePtr.value)
      return result
    }

    public fun createIAcrylicBrushStatics2(): IAcrylicBrushStatics2 {
      val refiid = Guid.REFIID(IAcrylicBrushStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.AcrylicBrush".toHandle(),refiid,interfacePtr)
      val result = IAcrylicBrushStatics2.ABI.makeIAcrylicBrushStatics2(interfacePtr.value)
      return result
    }

    public fun createIAcrylicBrushFactory(): IAcrylicBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.AcrylicBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAcrylicBrushFactory.ABI.makeIAcrylicBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAcrylicBrushFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AcrylicBrush {
      val address = segment.toRawLongValue()
      return AcrylicBrush(Pointer(address))
    }

    public override fun toNative(obj: AcrylicBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TintColorProperty() = ABI.IAcrylicBrushStatics_Instance.get_TintColorProperty()

    public fun get_TintOpacityProperty() =
        ABI.IAcrylicBrushStatics_Instance.get_TintOpacityProperty()

    public fun get_TintTransitionDurationProperty() =
        ABI.IAcrylicBrushStatics_Instance.get_TintTransitionDurationProperty()

    public fun get_AlwaysUseFallbackProperty() =
        ABI.IAcrylicBrushStatics_Instance.get_AlwaysUseFallbackProperty()

    public fun get_TintLuminosityOpacityProperty() =
        ABI.IAcrylicBrushStatics2_Instance.get_TintLuminosityOpacityProperty()
  }
}
