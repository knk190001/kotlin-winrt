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

@ABIMarker(CornerRadiusFilterConverter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusFilterConverter;{6f1a3ed2-f965-545e-bd44-441db1794f5f})")
@WinRTByReference(brClass = CornerRadiusFilterConverter.ByReference::class)
public class CornerRadiusFilterConverter(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICornerRadiusFilterConverter.WithDefault, IValueConverter.WithDefault,
    IWinRTObject {
  private val __1898173392_Interface: ICornerRadiusFilterConverter.WithDefault by lazy {
    as_1898173392()
  }


  private val __82778302_Interface: IValueConverter.WithDefault by lazy {
    as_82778302()
  }


  public override val __1898173392_Ptr: JNAPointer? by lazy {
    __1898173392_Interface.__1898173392_Ptr
  }


  public override val __82778302_Ptr: JNAPointer? by lazy {
    __82778302_Interface.__82778302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1898173392_Interface, __82778302_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1898173392(): ICornerRadiusFilterConverter.WithDefault {
    if(pointer == NULL) {
      return(ICornerRadiusFilterConverter.ABI.makeICornerRadiusFilterConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICornerRadiusFilterConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICornerRadiusFilterConverter.ABI.makeICornerRadiusFilterConverter(ref.value))
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
      IByReference<CornerRadiusFilterConverter> {
    public override fun getValue() = CornerRadiusFilterConverter(pointer.getPointer(0))

    public fun setValue(value: CornerRadiusFilterConverter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CornerRadiusFilterConverter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICornerRadiusFilterConverterStatics_Instance: ICornerRadiusFilterConverterStatics by
        lazy {
      createICornerRadiusFilterConverterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusFilterConverter".toHandle(),
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

    public fun createICornerRadiusFilterConverterStatics(): ICornerRadiusFilterConverterStatics {
      val refiid = Guid.REFIID(ICornerRadiusFilterConverterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.CornerRadiusFilterConverter".toHandle(),refiid,interfacePtr)
      val result =
          ICornerRadiusFilterConverterStatics.ABI.makeICornerRadiusFilterConverterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CornerRadiusFilterConverter {
      val address = segment.toRawLongValue()
      return CornerRadiusFilterConverter(Pointer(address))
    }

    public override fun toNative(obj: CornerRadiusFilterConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FilterProperty() =
        ABI.ICornerRadiusFilterConverterStatics_Instance.get_FilterProperty()

    public fun get_ScaleProperty() =
        ABI.ICornerRadiusFilterConverterStatics_Instance.get_ScaleProperty()
  }
}
