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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyCredentialRetrievalResult.ABI::class)
@Signature("{58cd7703-8d87-4249-9b58-f6598cc9644e}")
@Guid("58cd77038d8742499b58f6598cc9644e")
@WinRTInterface("58cd77038d8742499b58f6598cc9644e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyCredentialRetrievalResult.ByReference::class)
public interface IKeyCredentialRetrievalResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Credential(): KeyCredential?

  @InterfaceMethod(1)
  public fun get_Status(): KeyCredentialStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyCredentialRetrievalResult> {
    public override fun getValue() = ABI.makeIKeyCredentialRetrievalResult(pointer.getPointer(0))

    public fun setValue(value: IKeyCredentialRetrievalResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyCredentialRetrievalResult {
    public val __1053312267_Ptr: Pointer?

    public val _1053312267_VtblPtr: Pointer?
      get() = __1053312267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Credential(): KeyCredential? {
      val fnPtr = _1053312267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyCredential>()
      val hr = fn.invokeHR(arrayOf(__1053312267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): KeyCredentialStatus? {
      val fnPtr = _1053312267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyCredentialStatus>()
      val hr = fn.invokeHR(arrayOf(__1053312267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyCredentialStatus>(result.getValue())
      return resultValue
    }
  }

  public class IKeyCredentialRetrievalResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1053312267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyCredentialRetrievalResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58cd77038d8742499b58f6598cc9644e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyCredentialRetrievalResult(ptr: Pointer?): WithDefault =
        IKeyCredentialRetrievalResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyCredentialRetrievalResult {
      val address = segment.toRawLongValue()
      return makeIKeyCredentialRetrievalResult(Pointer(address))
    }

    public override fun toNative(obj: IKeyCredentialRetrievalResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1053312267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyCredentialRetrievalResult):
        Array<IKeyCredentialRetrievalResult?> = (elements as
        Array<IKeyCredentialRetrievalResult?>).castToImpl<IKeyCredentialRetrievalResult,IKeyCredentialRetrievalResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyCredentialRetrievalResult?> =
        arrayOfNulls<IKeyCredentialRetrievalResult_Impl>(size) as
        Array<IKeyCredentialRetrievalResult?>
  }
}
