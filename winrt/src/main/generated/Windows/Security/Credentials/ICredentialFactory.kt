package Windows.Security.Credentials

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICredentialFactory.ABI::class)
@Signature("{54ef13a1-bf26-47b5-97dd-de779b7cad58}")
@Guid("54ef13a1bf2647b597ddde779b7cad58")
@WinRTInterface("54ef13a1bf2647b597ddde779b7cad58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICredentialFactory.ByReference::class)
public interface ICredentialFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePasswordCredential(
    resource: String?,
    userName: String?,
    password: String?
  ): PasswordCredential?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICredentialFactory> {
    public override fun getValue() = ABI.makeICredentialFactory(pointer.getPointer(0))

    public fun setValue(value: ICredentialFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICredentialFactory {
    public val __1735904035_Ptr: Pointer?

    public val _1735904035_VtblPtr: Pointer?
      get() = __1735904035_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePasswordCredential(
      resource: String?,
      userName: String?,
      password: String?
    ): PasswordCredential? {
      val fnPtr = _1735904035_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__1735904035_Ptr, marshalToNative(resource),
          marshalToNative(userName), marshalToNative(password), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }
  }

  public class ICredentialFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1735904035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICredentialFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54ef13a1bf2647b597ddde779b7cad58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICredentialFactory(ptr: Pointer?): WithDefault = ICredentialFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICredentialFactory {
      val address = segment.toRawLongValue()
      return makeICredentialFactory(Pointer(address))
    }

    public override fun toNative(obj: ICredentialFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1735904035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICredentialFactory): Array<ICredentialFactory?> =
        (elements as
        Array<ICredentialFactory?>).castToImpl<ICredentialFactory,ICredentialFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICredentialFactory?> =
        arrayOfNulls<ICredentialFactory_Impl>(size) as Array<ICredentialFactory?>
  }
}
