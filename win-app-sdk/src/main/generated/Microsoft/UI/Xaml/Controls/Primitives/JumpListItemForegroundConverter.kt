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

@ABIMarker(JumpListItemForegroundConverter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.JumpListItemForegroundConverter;{7308e0e4-102f-571a-bfdc-c8f411f07400})")
@WinRTByReference(brClass = JumpListItemForegroundConverter.ByReference::class)
public class JumpListItemForegroundConverter(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IJumpListItemForegroundConverter.WithDefault,
    IValueConverter.WithDefault, IWinRTObject {
  private val __1029403533_Interface: IJumpListItemForegroundConverter.WithDefault by lazy {
    as_1029403533()
  }


  private val __82778302_Interface: IValueConverter.WithDefault by lazy {
    as_82778302()
  }


  public override val __1029403533_Ptr: JNAPointer? by lazy {
    __1029403533_Interface.__1029403533_Ptr
  }


  public override val __82778302_Ptr: JNAPointer? by lazy {
    __82778302_Interface.__82778302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1029403533_Interface, __82778302_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1029403533(): IJumpListItemForegroundConverter.WithDefault {
    if(pointer == NULL) {
      return(IJumpListItemForegroundConverter.ABI.makeIJumpListItemForegroundConverter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJumpListItemForegroundConverter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJumpListItemForegroundConverter.ABI.makeIJumpListItemForegroundConverter(ref.value))
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
      IByReference<JumpListItemForegroundConverter> {
    public override fun getValue() = JumpListItemForegroundConverter(pointer.getPointer(0))

    public fun setValue(value: JumpListItemForegroundConverter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JumpListItemForegroundConverter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IJumpListItemForegroundConverterStatics_Instance:
        IJumpListItemForegroundConverterStatics by lazy {
      createIJumpListItemForegroundConverterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.JumpListItemForegroundConverter".toHandle(),
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

    public fun createIJumpListItemForegroundConverterStatics():
        IJumpListItemForegroundConverterStatics {
      val refiid = Guid.REFIID(IJumpListItemForegroundConverterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.JumpListItemForegroundConverter".toHandle(),refiid,interfacePtr)
      val result =
          IJumpListItemForegroundConverterStatics.ABI.makeIJumpListItemForegroundConverterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): JumpListItemForegroundConverter {
      val address = segment.toRawLongValue()
      return JumpListItemForegroundConverter(Pointer(address))
    }

    public override fun toNative(obj: JumpListItemForegroundConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnabledProperty() =
        ABI.IJumpListItemForegroundConverterStatics_Instance.get_EnabledProperty()

    public fun get_DisabledProperty() =
        ABI.IJumpListItemForegroundConverterStatics_Instance.get_DisabledProperty()
  }
}
