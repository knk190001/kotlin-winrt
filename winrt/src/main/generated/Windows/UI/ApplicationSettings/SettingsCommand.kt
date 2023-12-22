package Windows.UI.ApplicationSettings

import Windows.UI.ApplicationSettings.ISettingsCommandFactory.ABI.IID
import Windows.UI.Popups.IUICommand
import Windows.UI.Popups.UICommandInvokedHandler
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(SettingsCommand.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.SettingsCommand;{4ff93a75-4145-47ff-ac7f-dff1c1fa5b0f})")
@WinRTByReference(brClass = SettingsCommand.ByReference::class)
public class SettingsCommand(
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

  public constructor(
    settingsCommandId: IUnknown,
    label: String,
    handler: UICommandInvokedHandler
  ) : this(ABI.activate(settingsCommandId, label, handler))

  private fun as_250994524(): IUICommand.WithDefault {
    if(pointer == NULL) {
      return(IUICommand.ABI.makeIUICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUICommand.ABI.makeIUICommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SettingsCommand> {
    public override fun getValue() = SettingsCommand(pointer.getPointer(0))

    public fun setValue(value: SettingsCommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsCommand, MemoryAddress> {
    public val ISettingsCommandStatics_Instance: ISettingsCommandStatics by lazy {
      createISettingsCommandStatics()
    }


    public val ISettingsCommandFactory_Instance: ISettingsCommandFactory by lazy {
      createISettingsCommandFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISettingsCommandStatics(): ISettingsCommandStatics {
      val refiid = Guid.REFIID(ISettingsCommandStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.SettingsCommand".toHandle(),refiid,interfacePtr)
      val result = ISettingsCommandStatics.ABI.makeISettingsCommandStatics(interfacePtr.value)
      return result
    }

    public fun createISettingsCommandFactory(): ISettingsCommandFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.SettingsCommand".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISettingsCommandFactory.ABI.makeISettingsCommandFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      settingsCommandId: IUnknown,
      label: String,
      handler: UICommandInvokedHandler
    ): JNAPointer? = ISettingsCommandFactory_Instance.CreateSettingsCommand(settingsCommandId,
        label, handler)?.pointer

    public override fun fromNative(segment: MemoryAddress): SettingsCommand {
      val address = segment.toRawLongValue()
      return SettingsCommand(Pointer(address))
    }

    public override fun toNative(obj: SettingsCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AccountsCommand() = ABI.ISettingsCommandStatics_Instance.get_AccountsCommand()
  }
}
