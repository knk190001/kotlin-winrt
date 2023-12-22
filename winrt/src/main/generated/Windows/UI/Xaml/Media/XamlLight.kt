package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.IXamlLightFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XamlLight.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.XamlLight;{0cc3fc1f-b327-4a18-9648-7c84db26ce22})")
@WinRTByReference(brClass = XamlLight.ByReference::class)
public open class XamlLight(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IXamlLight.WithDefault, IXamlLightProtected.WithDefault,
    IXamlLightOverrides.WithDefault, IWinRTObject {
  private val __972925646_Interface: IXamlLight.WithDefault by lazy {
    as_972925646()
  }


  private val __1213329052_Interface: IXamlLightProtected.WithDefault by lazy {
    as_1213329052()
  }


  private val __1071898901_Interface: IXamlLightOverrides.WithDefault by lazy {
    as_1071898901()
  }


  public override val __972925646_Ptr: JNAPointer? by lazy {
    __972925646_Interface.__972925646_Ptr
  }


  public override val __1213329052_Ptr: JNAPointer? by lazy {
    __1213329052_Interface.__1213329052_Ptr
  }


  public override val __1071898901_Ptr: JNAPointer? by lazy {
    __1071898901_Interface.__1071898901_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__972925646_Interface, __1213329052_Interface, __1071898901_Interface)

  public constructor() : this(ABI.activate())

  private fun as_972925646(): IXamlLight.WithDefault {
    if(pointer == NULL) {
      return(IXamlLight.ABI.makeIXamlLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlLight.ABI.makeIXamlLight(ref.value))
  }

  private fun as_1213329052(): IXamlLightProtected.WithDefault {
    if(pointer == NULL) {
      return(IXamlLightProtected.ABI.makeIXamlLightProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlLightProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlLightProtected.ABI.makeIXamlLightProtected(ref.value))
  }

  private fun as_1071898901(): IXamlLightOverrides.WithDefault {
    if(pointer == NULL) {
      return(IXamlLightOverrides.ABI.makeIXamlLightOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlLightOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlLightOverrides.ABI.makeIXamlLightOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XamlLight> {
    public override fun getValue() = XamlLight(pointer.getPointer(0))

    public fun setValue(value: XamlLight): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlLight, MemoryAddress> {
    public val IXamlLightStatics_Instance: IXamlLightStatics by lazy {
      createIXamlLightStatics()
    }


    public val IXamlLightFactory_Instance: IXamlLightFactory by lazy {
      createIXamlLightFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlLightStatics(): IXamlLightStatics {
      val refiid = Guid.REFIID(IXamlLightStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.XamlLight".toHandle(),refiid,interfacePtr)
      val result = IXamlLightStatics.ABI.makeIXamlLightStatics(interfacePtr.value)
      return result
    }

    public fun createIXamlLightFactory(): IXamlLightFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.XamlLight".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXamlLightFactory.ABI.makeIXamlLightFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IXamlLightFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): XamlLight {
      val address = segment.toRawLongValue()
      return XamlLight(Pointer(address))
    }

    public override fun toNative(obj: XamlLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AddTargetElement(lightId: String, element: UIElement) =
        ABI.IXamlLightStatics_Instance.AddTargetElement(lightId, element)

    public fun RemoveTargetElement(lightId: String, element: UIElement) =
        ABI.IXamlLightStatics_Instance.RemoveTargetElement(lightId, element)

    public fun AddTargetBrush(lightId: String, brush: Brush) =
        ABI.IXamlLightStatics_Instance.AddTargetBrush(lightId, brush)

    public fun RemoveTargetBrush(lightId: String, brush: Brush) =
        ABI.IXamlLightStatics_Instance.RemoveTargetBrush(lightId, brush)
  }
}
