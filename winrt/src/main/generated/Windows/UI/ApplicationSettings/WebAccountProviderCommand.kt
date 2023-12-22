package Windows.UI.ApplicationSettings

import Windows.Security.Credentials.WebAccountProvider
import Windows.UI.ApplicationSettings.IWebAccountProviderCommandFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebAccountProviderCommand.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.WebAccountProviderCommand;{d69bdd9a-a0a6-4e9b-88dc-c71e757a3501})")
@WinRTByReference(brClass = WebAccountProviderCommand.ByReference::class)
public class WebAccountProviderCommand(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountProviderCommand.WithDefault, IWinRTObject {
  private val __1414824028_Interface: IWebAccountProviderCommand.WithDefault by lazy {
    as_1414824028()
  }


  public override val __1414824028_Ptr: JNAPointer? by lazy {
    __1414824028_Interface.__1414824028_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1414824028_Interface)

  public constructor(webAccountProvider: WebAccountProvider,
      invoked: WebAccountProviderCommandInvokedHandler) : this(ABI.activate(webAccountProvider,
      invoked))

  private fun as_1414824028(): IWebAccountProviderCommand.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountProviderCommand.ABI.makeIWebAccountProviderCommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountProviderCommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountProviderCommand.ABI.makeIWebAccountProviderCommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountProviderCommand> {
    public override fun getValue() = WebAccountProviderCommand(pointer.getPointer(0))

    public fun setValue(value: WebAccountProviderCommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountProviderCommand, MemoryAddress> {
    public val IWebAccountProviderCommandFactory_Instance: IWebAccountProviderCommandFactory by
        lazy {
      createIWebAccountProviderCommandFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAccountProviderCommandFactory(): IWebAccountProviderCommandFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.WebAccountProviderCommand".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebAccountProviderCommandFactory.ABI.makeIWebAccountProviderCommandFactory(factoryActivatorPtr.value))
    }

    public fun activate(webAccountProvider: WebAccountProvider,
        invoked: WebAccountProviderCommandInvokedHandler): JNAPointer? =
        IWebAccountProviderCommandFactory_Instance.CreateWebAccountProviderCommand(webAccountProvider,
        invoked)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebAccountProviderCommand {
      val address = segment.toRawLongValue()
      return WebAccountProviderCommand(Pointer(address))
    }

    public override fun toNative(obj: WebAccountProviderCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
