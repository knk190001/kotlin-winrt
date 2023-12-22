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

@ABIMarker(ICredentialCommandFactory.ABI::class)
@Signature("{27e88c17-bc3e-4b80-9495-4ed720e48a91}")
@Guid("27e88c17bc3e4b8094954ed720e48a91")
@WinRTInterface("27e88c17bc3e4b8094954ed720e48a91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICredentialCommandFactory.ByReference::class)
public interface ICredentialCommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCredentialCommand(passwordCredential: PasswordCredential?): CredentialCommand?

  @InterfaceMethod(1)
  public fun CreateCredentialCommandWithHandler(passwordCredential: PasswordCredential?,
      deleted: CredentialCommandCredentialDeletedHandler?): CredentialCommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICredentialCommandFactory> {
    public override fun getValue() = ABI.makeICredentialCommandFactory(pointer.getPointer(0))

    public fun setValue(value: ICredentialCommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICredentialCommandFactory {
    public val __1108059557_Ptr: Pointer?

    public val _1108059557_VtblPtr: Pointer?
      get() = __1108059557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCredentialCommand(passwordCredential: PasswordCredential?):
        CredentialCommand? {
      val fnPtr = _1108059557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CredentialCommand>()
      val hr = fn.invokeHR(arrayOf(__1108059557_Ptr, marshalToNative(passwordCredential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CredentialCommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCredentialCommandWithHandler(passwordCredential: PasswordCredential?,
        deleted: CredentialCommandCredentialDeletedHandler?): CredentialCommand? {
      val fnPtr = _1108059557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CredentialCommand>()
      val hr = fn.invokeHR(arrayOf(__1108059557_Ptr, marshalToNative(passwordCredential),
          marshalToNative(deleted), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CredentialCommand>(result.getValue())
      return resultValue
    }
  }

  public class ICredentialCommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1108059557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICredentialCommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27e88c17bc3e4b8094954ed720e48a91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICredentialCommandFactory(ptr: Pointer?): WithDefault =
        ICredentialCommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICredentialCommandFactory {
      val address = segment.toRawLongValue()
      return makeICredentialCommandFactory(Pointer(address))
    }

    public override fun toNative(obj: ICredentialCommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1108059557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICredentialCommandFactory):
        Array<ICredentialCommandFactory?> = (elements as
        Array<ICredentialCommandFactory?>).castToImpl<ICredentialCommandFactory,ICredentialCommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICredentialCommandFactory?> =
        arrayOfNulls<ICredentialCommandFactory_Impl>(size) as Array<ICredentialCommandFactory?>
  }
}
