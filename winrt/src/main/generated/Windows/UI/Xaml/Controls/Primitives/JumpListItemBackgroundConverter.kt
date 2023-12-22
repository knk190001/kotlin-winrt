package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Data.IValueConverter
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(JumpListItemBackgroundConverter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.JumpListItemBackgroundConverter;{81177858-d224-410c-b16c-c5b6bb6188b2})")
@WinRTByReference(brClass = JumpListItemBackgroundConverter.ByReference::class)
public class JumpListItemBackgroundConverter(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IJumpListItemBackgroundConverter.WithDefault,
    IValueConverter.WithDefault, IWinRTObject {
  private val __1997378583_Interface: IJumpListItemBackgroundConverter.WithDefault by lazy {
    as_1997378583()
  }


  private val __723693737_Interface: IValueConverter.WithDefault by lazy {
    as_723693737()
  }


  public override val __1997378583_Ptr: JNAPointer? by lazy {
    __1997378583_Interface.__1997378583_Ptr
  }


  public override val __723693737_Ptr: JNAPointer? by lazy {
    __723693737_Interface.__723693737_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1997378583_Interface, __723693737_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1997378583(): IJumpListItemBackgroundConverter.WithDefault {
    if(pointer == NULL) {
      return(IJumpListItemBackgroundConverter.ABI.makeIJumpListItemBackgroundConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJumpListItemBackgroundConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJumpListItemBackgroundConverter.ABI.makeIJumpListItemBackgroundConverter(ref.value))
  }

  private fun as_723693737(): IValueConverter.WithDefault {
    if(pointer == NULL) {
      return(IValueConverter.ABI.makeIValueConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IValueConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IValueConverter.ABI.makeIValueConverter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<JumpListItemBackgroundConverter> {
    public override fun getValue() = JumpListItemBackgroundConverter(pointer.getPointer(0))

    public fun setValue(value: JumpListItemBackgroundConverter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JumpListItemBackgroundConverter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IJumpListItemBackgroundConverterStatics_Instance:
        IJumpListItemBackgroundConverterStatics by lazy {
      createIJumpListItemBackgroundConverterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.JumpListItemBackgroundConverter".toHandle(),
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

    public fun createIJumpListItemBackgroundConverterStatics():
        IJumpListItemBackgroundConverterStatics {
      val refiid = Guid.REFIID(IJumpListItemBackgroundConverterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.JumpListItemBackgroundConverter".toHandle(),refiid,interfacePtr)
      val result =
          IJumpListItemBackgroundConverterStatics.ABI.makeIJumpListItemBackgroundConverterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JumpListItemBackgroundConverter {
      val address = segment.toRawLongValue()
      return JumpListItemBackgroundConverter(Pointer(address))
    }

    public override fun toNative(obj: JumpListItemBackgroundConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnabledProperty() =
        ABI.IJumpListItemBackgroundConverterStatics_Instance.get_EnabledProperty()

    public fun get_DisabledProperty() =
        ABI.IJumpListItemBackgroundConverterStatics_Instance.get_DisabledProperty()
  }
}
