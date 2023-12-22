package Windows.Web.Syndication

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

@ABIMarker(ISyndicationClientFactory.ABI::class)
@Signature("{2ec4b32c-a79b-4114-b29a-05dffbafb9a4}")
@Guid("2ec4b32ca79b4114b29a05dffbafb9a4")
@WinRTInterface("2ec4b32ca79b4114b29a05dffbafb9a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationClientFactory.ByReference::class)
public interface ISyndicationClientFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationClient(serverCredential: PasswordCredential?): SyndicationClient?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationClientFactory> {
    public override fun getValue() = ABI.makeISyndicationClientFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationClientFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationClientFactory {
    public val __1383973617_Ptr: Pointer?

    public val _1383973617_VtblPtr: Pointer?
      get() = __1383973617_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationClient(serverCredential: PasswordCredential?):
        SyndicationClient? {
      val fnPtr = _1383973617_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationClient>()
      val hr = fn.invokeHR(arrayOf(__1383973617_Ptr, marshalToNative(serverCredential), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationClient>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationClientFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1383973617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationClientFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ec4b32ca79b4114b29a05dffbafb9a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationClientFactory(ptr: Pointer?): WithDefault =
        ISyndicationClientFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationClientFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationClientFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationClientFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1383973617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationClientFactory):
        Array<ISyndicationClientFactory?> = (elements as
        Array<ISyndicationClientFactory?>).castToImpl<ISyndicationClientFactory,ISyndicationClientFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationClientFactory?> =
        arrayOfNulls<ISyndicationClientFactory_Impl>(size) as Array<ISyndicationClientFactory?>
  }
}
