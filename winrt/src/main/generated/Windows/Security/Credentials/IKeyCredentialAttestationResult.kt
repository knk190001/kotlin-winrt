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

@ABIMarker(IKeyCredentialAttestationResult.ABI::class)
@Signature("{78aab3a1-a3c1-4103-b6cc-472c44171cbb}")
@Guid("78aab3a1a3c14103b6cc472c44171cbb")
@WinRTInterface("78aab3a1a3c14103b6cc472c44171cbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyCredentialAttestationResult.ByReference::class)
public interface IKeyCredentialAttestationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CertificateChainBuffer(): IBuffer?

  @InterfaceMethod(1)
  public fun get_AttestationBuffer(): IBuffer?

  @InterfaceMethod(2)
  public fun get_Status(): KeyCredentialAttestationStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyCredentialAttestationResult> {
    public override fun getValue() = ABI.makeIKeyCredentialAttestationResult(pointer.getPointer(0))

    public fun setValue(value: IKeyCredentialAttestationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyCredentialAttestationResult {
    public val __1805818151_Ptr: Pointer?

    public val _1805818151_VtblPtr: Pointer?
      get() = __1805818151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CertificateChainBuffer(): IBuffer? {
      val fnPtr = _1805818151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1805818151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AttestationBuffer(): IBuffer? {
      val fnPtr = _1805818151_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1805818151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): KeyCredentialAttestationStatus? {
      val fnPtr = _1805818151_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyCredentialAttestationStatus>()
      val hr = fn.invokeHR(arrayOf(__1805818151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyCredentialAttestationStatus>(result.getValue())
      return resultValue
    }
  }

  public class IKeyCredentialAttestationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1805818151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyCredentialAttestationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78aab3a1a3c14103b6cc472c44171cbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyCredentialAttestationResult(ptr: Pointer?): WithDefault =
        IKeyCredentialAttestationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyCredentialAttestationResult {
      val address = segment.toRawLongValue()
      return makeIKeyCredentialAttestationResult(Pointer(address))
    }

    public override fun toNative(obj: IKeyCredentialAttestationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1805818151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyCredentialAttestationResult):
        Array<IKeyCredentialAttestationResult?> = (elements as
        Array<IKeyCredentialAttestationResult?>).castToImpl<IKeyCredentialAttestationResult,IKeyCredentialAttestationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyCredentialAttestationResult?> =
        arrayOfNulls<IKeyCredentialAttestationResult_Impl>(size) as
        Array<IKeyCredentialAttestationResult?>
  }
}
