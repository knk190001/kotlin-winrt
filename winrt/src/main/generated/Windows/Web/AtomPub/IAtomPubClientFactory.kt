package Windows.Web.AtomPub

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

@ABIMarker(IAtomPubClientFactory.ABI::class)
@Signature("{49d55012-57cb-4bde-ab9f-2610b172777b}")
@Guid("49d5501257cb4bdeab9f2610b172777b")
@WinRTInterface("49d5501257cb4bdeab9f2610b172777b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAtomPubClientFactory.ByReference::class)
public interface IAtomPubClientFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAtomPubClientWithCredentials(serverCredential: PasswordCredential?):
      AtomPubClient?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAtomPubClientFactory> {
    public override fun getValue() = ABI.makeIAtomPubClientFactory(pointer.getPointer(0))

    public fun setValue(value: IAtomPubClientFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAtomPubClientFactory {
    public val __1605228939_Ptr: Pointer?

    public val _1605228939_VtblPtr: Pointer?
      get() = __1605228939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAtomPubClientWithCredentials(serverCredential: PasswordCredential?):
        AtomPubClient? {
      val fnPtr = _1605228939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AtomPubClient>()
      val hr = fn.invokeHR(arrayOf(__1605228939_Ptr, marshalToNative(serverCredential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AtomPubClient>(result.getValue())
      return resultValue
    }
  }

  public class IAtomPubClientFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1605228939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAtomPubClientFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49d5501257cb4bdeab9f2610b172777b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAtomPubClientFactory(ptr: Pointer?): WithDefault =
        IAtomPubClientFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAtomPubClientFactory {
      val address = segment.toRawLongValue()
      return makeIAtomPubClientFactory(Pointer(address))
    }

    public override fun toNative(obj: IAtomPubClientFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1605228939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAtomPubClientFactory): Array<IAtomPubClientFactory?> =
        (elements as
        Array<IAtomPubClientFactory?>).castToImpl<IAtomPubClientFactory,IAtomPubClientFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAtomPubClientFactory?> =
        arrayOfNulls<IAtomPubClientFactory_Impl>(size) as Array<IAtomPubClientFactory?>
  }
}
