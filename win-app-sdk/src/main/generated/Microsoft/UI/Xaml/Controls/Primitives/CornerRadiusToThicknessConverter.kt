package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Data.IValueConverter
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(CornerRadiusToThicknessConverter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusToThicknessConverter;{b36aa8ae-166e-5ca5-93d2-95e9907c1222})")
@WinRTByReference(brClass = CornerRadiusToThicknessConverter.ByReference::class)
public class CornerRadiusToThicknessConverter(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICornerRadiusToThicknessConverter.WithDefault,
    IValueConverter.WithDefault, IWinRTObject {
  private val __617514143_Interface: ICornerRadiusToThicknessConverter.WithDefault by lazy {
    as_617514143()
  }


  private val __82778302_Interface: IValueConverter.WithDefault by lazy {
    as_82778302()
  }


  public override val __617514143_Ptr: JNAPointer? by lazy {
    __617514143_Interface.__617514143_Ptr
  }


  public override val __82778302_Ptr: JNAPointer? by lazy {
    __82778302_Interface.__82778302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__617514143_Interface, __82778302_Interface)

  public constructor() : this(ABI.activate())

  private fun as_617514143(): ICornerRadiusToThicknessConverter.WithDefault {
    if(pointer == NULL) {
      return(ICornerRadiusToThicknessConverter.ABI.makeICornerRadiusToThicknessConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICornerRadiusToThicknessConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICornerRadiusToThicknessConverter.ABI.makeICornerRadiusToThicknessConverter(ref.value))
  }

  private fun as_82778302(): IValueConverter.WithDefault {
    if(pointer == NULL) {
      return(IValueConverter.ABI.makeIValueConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IValueConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IValueConverter.ABI.makeIValueConverter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CornerRadiusToThicknessConverter> {
    public override fun getValue() = CornerRadiusToThicknessConverter(pointer.getPointer(0))

    public fun setValue(value: CornerRadiusToThicknessConverter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CornerRadiusToThicknessConverter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICornerRadiusToThicknessConverterStatics_Instance:
        ICornerRadiusToThicknessConverterStatics by lazy {
      createICornerRadiusToThicknessConverterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusToThicknessConverter".toHandle(),
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

    public fun createICornerRadiusToThicknessConverterStatics():
        ICornerRadiusToThicknessConverterStatics {
      val refiid = Guid.REFIID(ICornerRadiusToThicknessConverterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusToThicknessConverter".toHandle(),refiid,interfacePtr)
      val result =
          ICornerRadiusToThicknessConverterStatics.ABI.makeICornerRadiusToThicknessConverterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CornerRadiusToThicknessConverter {
      val address = segment.toRawLongValue()
      return CornerRadiusToThicknessConverter(Pointer(address))
    }

    public override fun toNative(obj: CornerRadiusToThicknessConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ConversionKindProperty() =
        ABI.ICornerRadiusToThicknessConverterStatics_Instance.get_ConversionKindProperty()

    public fun get_MultiplierProperty() =
        ABI.ICornerRadiusToThicknessConverterStatics_Instance.get_MultiplierProperty()
  }
}
