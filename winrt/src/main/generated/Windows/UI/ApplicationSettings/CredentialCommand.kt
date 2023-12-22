package Windows.UI.ApplicationSettings

import Windows.Security.Credentials.PasswordCredential
import Windows.UI.ApplicationSettings.ICredentialCommandFactory.ABI.IID
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

@ABIMarker(CredentialCommand.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.CredentialCommand;{a5f665e6-6143-4a7a-a971-b017ba978ce2})")
@WinRTByReference(brClass = CredentialCommand.ByReference::class)
public class CredentialCommand(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICredentialCommand.WithDefault, IWinRTObject {
  private val __711244719_Interface: ICredentialCommand.WithDefault by lazy {
    as_711244719()
  }


  public override val __711244719_Ptr: JNAPointer? by lazy {
    __711244719_Interface.__711244719_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__711244719_Interface)

  public constructor(passwordCredential: PasswordCredential) :
      this(ABI.activate(passwordCredential))

  public constructor(passwordCredential: PasswordCredential,
      deleted: CredentialCommandCredentialDeletedHandler) : this(ABI.activate(passwordCredential,
      deleted))

  private fun as_711244719(): ICredentialCommand.WithDefault {
    if(pointer == NULL) {
      return(ICredentialCommand.ABI.makeICredentialCommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICredentialCommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICredentialCommand.ABI.makeICredentialCommand(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CredentialCommand> {
    public override fun getValue() = CredentialCommand(pointer.getPointer(0))

    public fun setValue(value: CredentialCommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CredentialCommand, MemoryAddress> {
    public val ICredentialCommandFactory_Instance: ICredentialCommandFactory by lazy {
      createICredentialCommandFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICredentialCommandFactory(): ICredentialCommandFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.CredentialCommand".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICredentialCommandFactory.ABI.makeICredentialCommandFactory(factoryActivatorPtr.value))
    }

    public fun activate(passwordCredential: PasswordCredential): JNAPointer? =
        ICredentialCommandFactory_Instance.CreateCredentialCommand(passwordCredential)?.pointer

    public fun activate(passwordCredential: PasswordCredential,
        deleted: CredentialCommandCredentialDeletedHandler): JNAPointer? =
        ICredentialCommandFactory_Instance.CreateCredentialCommandWithHandler(passwordCredential,
        deleted)?.pointer

    public override fun fromNative(segment: MemoryAddress): CredentialCommand {
      val address = segment.toRawLongValue()
      return CredentialCommand(Pointer(address))
    }

    public override fun toNative(obj: CredentialCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
