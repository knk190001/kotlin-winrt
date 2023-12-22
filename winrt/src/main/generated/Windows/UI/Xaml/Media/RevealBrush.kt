package Windows.UI.Xaml.Media

import Windows.UI.Xaml.Media.IRevealBrushFactory.ABI.IID
import Windows.UI.Xaml.UIElement
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

@ABIMarker(RevealBrush.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.RevealBrush;{2036a0ed-8271-4398-9019-25872093f13f})")
@WinRTByReference(brClass = RevealBrush.ByReference::class)
public open class RevealBrush(
  ptr: JNAPointer? = NULL
) : XamlCompositionBrushBase(ptr), IRevealBrush.WithDefault, IWinRTObject {
  private val __1539813361_Interface: IRevealBrush.WithDefault by lazy {
    as_1539813361()
  }


  public override val __1539813361_Ptr: JNAPointer? by lazy {
    __1539813361_Interface.__1539813361_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1539813361_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1539813361(): IRevealBrush.WithDefault {
    if(pointer == NULL) {
      return(IRevealBrush.ABI.makeIRevealBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRevealBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRevealBrush.ABI.makeIRevealBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RevealBrush> {
    public override fun getValue() = RevealBrush(pointer.getPointer(0))

    public fun setValue(value: RevealBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RevealBrush, MemoryAddress> {
    public val IRevealBrushStatics_Instance: IRevealBrushStatics by lazy {
      createIRevealBrushStatics()
    }


    public val IRevealBrushFactory_Instance: IRevealBrushFactory by lazy {
      createIRevealBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRevealBrushStatics(): IRevealBrushStatics {
      val refiid = Guid.REFIID(IRevealBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RevealBrush".toHandle(),refiid,interfacePtr)
      val result = IRevealBrushStatics.ABI.makeIRevealBrushStatics(interfacePtr.value)
      return result
    }

    public fun createIRevealBrushFactory(): IRevealBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RevealBrush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRevealBrushFactory.ABI.makeIRevealBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRevealBrushFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RevealBrush {
      val address = segment.toRawLongValue()
      return RevealBrush(Pointer(address))
    }

    public override fun toNative(obj: RevealBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColorProperty() = ABI.IRevealBrushStatics_Instance.get_ColorProperty()

    public fun get_TargetThemeProperty() =
        ABI.IRevealBrushStatics_Instance.get_TargetThemeProperty()

    public fun get_AlwaysUseFallbackProperty() =
        ABI.IRevealBrushStatics_Instance.get_AlwaysUseFallbackProperty()

    public fun get_StateProperty() = ABI.IRevealBrushStatics_Instance.get_StateProperty()

    public fun SetState(element: UIElement, value: RevealBrushState) =
        ABI.IRevealBrushStatics_Instance.SetState(element, value)

    public fun GetState(element: UIElement) = ABI.IRevealBrushStatics_Instance.GetState(element)
  }
}
