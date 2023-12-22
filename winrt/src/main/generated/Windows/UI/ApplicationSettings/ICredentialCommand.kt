package Windows.UI.ApplicationSettings

import Windows.Security.Credentials.PasswordCredential
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICredentialCommand.ABI::class)
@Signature("{a5f665e6-6143-4a7a-a971-b017ba978ce2}")
@Guid("a5f665e661434a7aa971b017ba978ce2")
@WinRTInterface("a5f665e661434a7aa971b017ba978ce2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICredentialCommand.ByReference::class)
public interface ICredentialCommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PasswordCredential(): PasswordCredential?

  @InterfaceMethod(1)
  public fun get_CredentialDeleted(): CredentialCommandCredentialDeletedHandler?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICredentialCommand> {
    public override fun getValue() = ABI.makeICredentialCommand(pointer.getPointer(0))

    public fun setValue(value: ICredentialCommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICredentialCommand {
    public val __711244719_Ptr: Pointer?

    public val _711244719_VtblPtr: Pointer?
      get() = __711244719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PasswordCredential(): PasswordCredential? {
      val fnPtr = _711244719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__711244719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CredentialDeleted(): CredentialCommandCredentialDeletedHandler? {
      val fnPtr = _711244719_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CredentialCommandCredentialDeletedHandler>()
      val hr = fn.invokeHR(arrayOf(__711244719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<CredentialCommandCredentialDeletedHandler>(result.getValue())
      return resultValue
    }
  }

  public class ICredentialCommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __711244719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICredentialCommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5f665e661434a7aa971b017ba978ce2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICredentialCommand(ptr: Pointer?): WithDefault = ICredentialCommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICredentialCommand {
      val address = segment.toRawLongValue()
      return makeICredentialCommand(Pointer(address))
    }

    public override fun toNative(obj: ICredentialCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__711244719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICredentialCommand): Array<ICredentialCommand?> =
        (elements as
        Array<ICredentialCommand?>).castToImpl<ICredentialCommand,ICredentialCommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICredentialCommand?> =
        arrayOfNulls<ICredentialCommand_Impl>(size) as Array<ICredentialCommand?>
  }
}
