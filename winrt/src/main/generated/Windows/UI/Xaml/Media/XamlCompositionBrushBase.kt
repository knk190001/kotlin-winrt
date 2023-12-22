package Windows.UI.Xaml.Media

import Windows.UI.Xaml.Media.IXamlCompositionBrushBaseFactory.ABI.IID
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

@ABIMarker(XamlCompositionBrushBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.XamlCompositionBrushBase;{03e432d9-b35c-4a79-811c-c5652004da0e})")
@WinRTByReference(brClass = XamlCompositionBrushBase.ByReference::class)
public open class XamlCompositionBrushBase(
  ptr: JNAPointer? = NULL
) : Brush(ptr), IXamlCompositionBrushBase.WithDefault,
    IXamlCompositionBrushBaseProtected.WithDefault, IXamlCompositionBrushBaseOverrides.WithDefault,
    IWinRTObject {
  private val __1338728197_Interface: IXamlCompositionBrushBase.WithDefault by lazy {
    as_1338728197()
  }


  private val __1641332183_Interface: IXamlCompositionBrushBaseProtected.WithDefault by lazy {
    as_1641332183()
  }


  private val __1782762334_Interface: IXamlCompositionBrushBaseOverrides.WithDefault by lazy {
    as_1782762334()
  }


  public override val __1338728197_Ptr: JNAPointer? by lazy {
    __1338728197_Interface.__1338728197_Ptr
  }


  public override val __1641332183_Ptr: JNAPointer? by lazy {
    __1641332183_Interface.__1641332183_Ptr
  }


  public override val __1782762334_Ptr: JNAPointer? by lazy {
    __1782762334_Interface.__1782762334_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1338728197_Interface, __1641332183_Interface, __1782762334_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1338728197(): IXamlCompositionBrushBase.WithDefault {
    if(pointer == NULL) {
      return(IXamlCompositionBrushBase.ABI.makeIXamlCompositionBrushBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlCompositionBrushBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlCompositionBrushBase.ABI.makeIXamlCompositionBrushBase(ref.value))
  }

  private fun as_1641332183(): IXamlCompositionBrushBaseProtected.WithDefault {
    if(pointer == NULL) {
      return(IXamlCompositionBrushBaseProtected.ABI.makeIXamlCompositionBrushBaseProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlCompositionBrushBaseProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlCompositionBrushBaseProtected.ABI.makeIXamlCompositionBrushBaseProtected(ref.value))
  }

  private fun as_1782762334(): IXamlCompositionBrushBaseOverrides.WithDefault {
    if(pointer == NULL) {
      return(IXamlCompositionBrushBaseOverrides.ABI.makeIXamlCompositionBrushBaseOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlCompositionBrushBaseOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlCompositionBrushBaseOverrides.ABI.makeIXamlCompositionBrushBaseOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlCompositionBrushBase> {
    public override fun getValue() = XamlCompositionBrushBase(pointer.getPointer(0))

    public fun setValue(value: XamlCompositionBrushBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlCompositionBrushBase, MemoryAddress> {
    public val IXamlCompositionBrushBaseStatics_Instance: IXamlCompositionBrushBaseStatics by lazy {
      createIXamlCompositionBrushBaseStatics()
    }


    public val IXamlCompositionBrushBaseFactory_Instance: IXamlCompositionBrushBaseFactory by lazy {
      createIXamlCompositionBrushBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlCompositionBrushBaseStatics(): IXamlCompositionBrushBaseStatics {
      val refiid = Guid.REFIID(IXamlCompositionBrushBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.XamlCompositionBrushBase".toHandle(),refiid,interfacePtr)
      val result =
          IXamlCompositionBrushBaseStatics.ABI.makeIXamlCompositionBrushBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIXamlCompositionBrushBaseFactory(): IXamlCompositionBrushBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.XamlCompositionBrushBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXamlCompositionBrushBaseFactory.ABI.makeIXamlCompositionBrushBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IXamlCompositionBrushBaseFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): XamlCompositionBrushBase {
      val address = segment.toRawLongValue()
      return XamlCompositionBrushBase(Pointer(address))
    }

    public override fun toNative(obj: XamlCompositionBrushBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FallbackColorProperty() =
        ABI.IXamlCompositionBrushBaseStatics_Instance.get_FallbackColorProperty()
  }
}
