package Windows.Security.Credentials

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

@ABIMarker(IKeyCredentialOperationResult.ABI::class)
@Signature("{f53786c1-5261-4cdd-976d-cc909ac71620}")
@Guid("f53786c152614cdd976dcc909ac71620")
@WinRTInterface("f53786c152614cdd976dcc909ac71620")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyCredentialOperationResult.ByReference::class)
public interface IKeyCredentialOperationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Result(): IBuffer?

  @InterfaceMethod(1)
  public fun get_Status(): KeyCredentialStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyCredentialOperationResult> {
    public override fun getValue() = ABI.makeIKeyCredentialOperationResult(pointer.getPointer(0))

    public fun setValue(value: IKeyCredentialOperationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyCredentialOperationResult {
    public val __635150590_Ptr: Pointer?

    public val _635150590_VtblPtr: Pointer?
      get() = __635150590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Result(): IBuffer? {
      val fnPtr = _635150590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__635150590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): KeyCredentialStatus? {
      val fnPtr = _635150590_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyCredentialStatus>()
      val hr = fn.invokeHR(arrayOf(__635150590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyCredentialStatus>(result.getValue())
      return resultValue
    }
  }

  public class IKeyCredentialOperationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __635150590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyCredentialOperationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f53786c152614cdd976dcc909ac71620")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyCredentialOperationResult(ptr: Pointer?): WithDefault =
        IKeyCredentialOperationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyCredentialOperationResult {
      val address = segment.toRawLongValue()
      return makeIKeyCredentialOperationResult(Pointer(address))
    }

    public override fun toNative(obj: IKeyCredentialOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__635150590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyCredentialOperationResult):
        Array<IKeyCredentialOperationResult?> = (elements as
        Array<IKeyCredentialOperationResult?>).castToImpl<IKeyCredentialOperationResult,IKeyCredentialOperationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyCredentialOperationResult?> =
        arrayOfNulls<IKeyCredentialOperationResult_Impl>(size) as
        Array<IKeyCredentialOperationResult?>
  }
}
