package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Input.IXamlUICommandFactory.ABI.IID
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

@ABIMarker(XamlUICommand.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.XamlUICommand;{a457f2cb-51e0-541c-9c42-dd1dcbdf58fb})")
@WinRTByReference(brClass = XamlUICommand.ByReference::class)
public open class XamlUICommand(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IXamlUICommand.WithDefault, ICommand.WithDefault, IWinRTObject {
  private val __1509254564_Interface: IXamlUICommand.WithDefault by lazy {
    as_1509254564()
  }


  private val __1554456544_Interface: ICommand.WithDefault by lazy {
    as_1554456544()
  }


  public override val __1509254564_Ptr: JNAPointer? by lazy {
    __1509254564_Interface.__1509254564_Ptr
  }


  public override val __1554456544_Ptr: JNAPointer? by lazy {
    __1554456544_Interface.__1554456544_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1509254564_Interface, __1554456544_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1509254564(): IXamlUICommand.WithDefault {
    if(pointer == NULL) {
      return(IXamlUICommand.ABI.makeIXamlUICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlUICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlUICommand.ABI.makeIXamlUICommand(ref.value))
  }

  private fun as_1554456544(): ICommand.WithDefault {
    if(pointer == NULL) {
      return(ICommand.ABI.makeICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommand.ABI.makeICommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XamlUICommand>
      {
    public override fun getValue() = XamlUICommand(pointer.getPointer(0))

    public fun setValue(value: XamlUICommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlUICommand, MemoryAddress> {
    public val IXamlUICommandStatics_Instance: IXamlUICommandStatics by lazy {
      createIXamlUICommandStatics()
    }


    public val IXamlUICommandFactory_Instance: IXamlUICommandFactory by lazy {
      createIXamlUICommandFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlUICommandStatics(): IXamlUICommandStatics {
      val refiid = Guid.REFIID(IXamlUICommandStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.XamlUICommand".toHandle(),refiid,interfacePtr)
      val result = IXamlUICommandStatics.ABI.makeIXamlUICommandStatics(interfacePtr.value)
      return result
    }

    public fun createIXamlUICommandFactory(): IXamlUICommandFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.XamlUICommand".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXamlUICommandFactory.ABI.makeIXamlUICommandFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IXamlUICommandFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): XamlUICommand {
      val address = segment.toRawLongValue()
      return XamlUICommand(Pointer(address))
    }

    public override fun toNative(obj: XamlUICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LabelProperty() = ABI.IXamlUICommandStatics_Instance.get_LabelProperty()

    public fun get_IconSourceProperty() =
        ABI.IXamlUICommandStatics_Instance.get_IconSourceProperty()

    public fun get_KeyboardAcceleratorsProperty() =
        ABI.IXamlUICommandStatics_Instance.get_KeyboardAcceleratorsProperty()

    public fun get_AccessKeyProperty() = ABI.IXamlUICommandStatics_Instance.get_AccessKeyProperty()

    public fun get_DescriptionProperty() =
        ABI.IXamlUICommandStatics_Instance.get_DescriptionProperty()

    public fun get_CommandProperty() = ABI.IXamlUICommandStatics_Instance.get_CommandProperty()
  }
}
