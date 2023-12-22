package Windows.UI.Popups

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UICommand.ABI::class)
@Signature("rc(Windows.UI.Popups.UICommand;{4ff93a75-4145-47ff-ac7f-dff1c1fa5b0f})")
@WinRTByReference(brClass = UICommand.ByReference::class)
public class UICommand(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUICommand.WithDefault, IWinRTObject {
  private val __250994524_Interface: IUICommand.WithDefault by lazy {
    as_250994524()
  }


  public override val __250994524_Ptr: JNAPointer? by lazy {
    __250994524_Interface.__250994524_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__250994524_Interface)

  public constructor() : this(ABI.activate())

  public constructor(label: String) : this(ABI.activate(label))

  public constructor(label: String, action: UICommandInvokedHandler) : this(ABI.activate(label,
      action))

  public constructor(
    label: String,
    action: UICommandInvokedHandler,
    commandId: IUnknown
  ) : this(ABI.activate(label, action, commandId))

  private fun as_250994524(): IUICommand.WithDefault {
    if(pointer == NULL) {
      return(IUICommand.ABI.makeIUICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUICommand.ABI.makeIUICommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UICommand> {
    public override fun getValue() = UICommand(pointer.getPointer(0))

    public fun setValue(value: UICommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UICommand, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IUICommandFactory_Instance: IUICommandFactory by lazy {
      createIUICommandFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Popups.UICommand".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIUICommandFactory(): IUICommandFactory {
      val refiid = Guid.REFIID(IUICommandFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Popups.UICommand".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUICommandFactory.ABI.makeIUICommandFactory(factoryActivatorPtr.value))
    }

    public fun activate(label: String): JNAPointer? =
        IUICommandFactory_Instance.Create(label)?.pointer

    public fun activate(label: String, action: UICommandInvokedHandler): JNAPointer? =
        IUICommandFactory_Instance.CreateWithHandler(label, action)?.pointer

    public fun activate(
      label: String,
      action: UICommandInvokedHandler,
      commandId: IUnknown
    ): JNAPointer? = IUICommandFactory_Instance.CreateWithHandlerAndId(label, action,
        commandId)?.pointer

    public override fun fromNative(segment: MemoryAddress): UICommand {
      val address = segment.toRawLongValue()
      return UICommand(Pointer(address))
    }

    public override fun toNative(obj: UICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
