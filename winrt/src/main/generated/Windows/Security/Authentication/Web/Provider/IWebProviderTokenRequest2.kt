package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Security.Authentication.Web.TokenBindingKeyType
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IWebProviderTokenRequest2.ABI::class)
@Signature("{b5d72e4c-10b1-4aa6-88b1-0b6c9e0c1e46}")
@Guid("b5d72e4c10b14aa688b10b6c9e0c1e46")
@WinRTInterface("b5d72e4c10b14aa688b10b6c9e0c1e46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebProviderTokenRequest2.ByReference::class)
public interface IWebProviderTokenRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetApplicationTokenBindingKeyIdAsync(keyType: TokenBindingKeyType?, target: Uri?):
      IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebProviderTokenRequest2> {
    public override fun getValue() = ABI.makeIWebProviderTokenRequest2(pointer.getPointer(0))

    public fun setValue(value: IWebProviderTokenRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebProviderTokenRequest2 {
    public val __724753442_Ptr: Pointer?

    public val _724753442_VtblPtr: Pointer?
      get() = __724753442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetApplicationTokenBindingKeyIdAsync(keyType: TokenBindingKeyType?,
        target: Uri?): IAsyncOperation<IBuffer?>? {
      val fnPtr = _724753442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__724753442_Ptr, marshalToNative(keyType),
          marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebProviderTokenRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __724753442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebProviderTokenRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5d72e4c10b14aa688b10b6c9e0c1e46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebProviderTokenRequest2(ptr: Pointer?): WithDefault =
        IWebProviderTokenRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebProviderTokenRequest2 {
      val address = segment.toRawLongValue()
      return makeIWebProviderTokenRequest2(Pointer(address))
    }

    public override fun toNative(obj: IWebProviderTokenRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__724753442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebProviderTokenRequest2):
        Array<IWebProviderTokenRequest2?> = (elements as
        Array<IWebProviderTokenRequest2?>).castToImpl<IWebProviderTokenRequest2,IWebProviderTokenRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebProviderTokenRequest2?> =
        arrayOfNulls<IWebProviderTokenRequest2_Impl>(size) as Array<IWebProviderTokenRequest2?>
  }
}
