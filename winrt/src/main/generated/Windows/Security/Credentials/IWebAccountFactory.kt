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

@ABIMarker(IWebAccountFactory.ABI::class)
@Signature("{ac9afb39-1de9-4e92-b78f-0581a87f6e5c}")
@Guid("ac9afb391de94e92b78f0581a87f6e5c")
@WinRTInterface("ac9afb391de94e92b78f0581a87f6e5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountFactory.ByReference::class)
public interface IWebAccountFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWebAccount(
    webAccountProvider: WebAccountProvider?,
    userName: String?,
    state: WebAccountState?
  ): WebAccount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountFactory> {
    public override fun getValue() = ABI.makeIWebAccountFactory(pointer.getPointer(0))

    public fun setValue(value: IWebAccountFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountFactory {
    public val __1900331265_Ptr: Pointer?

    public val _1900331265_VtblPtr: Pointer?
      get() = __1900331265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWebAccount(
      webAccountProvider: WebAccountProvider?,
      userName: String?,
      state: WebAccountState?
    ): WebAccount? {
      val fnPtr = _1900331265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__1900331265_Ptr, marshalToNative(webAccountProvider),
          marshalToNative(userName), marshalToNative(state), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1900331265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac9afb391de94e92b78f0581a87f6e5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountFactory(ptr: Pointer?): WithDefault = IWebAccountFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountFactory {
      val address = segment.toRawLongValue()
      return makeIWebAccountFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1900331265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountFactory): Array<IWebAccountFactory?> =
        (elements as
        Array<IWebAccountFactory?>).castToImpl<IWebAccountFactory,IWebAccountFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountFactory?> =
        arrayOfNulls<IWebAccountFactory_Impl>(size) as Array<IWebAccountFactory?>
  }
}
