package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICmsAttachedSignature.ABI::class)
@Signature("{61899d9d-3757-4ecb-bddc-0ca357d7a936}")
@Guid("61899d9d37574ecbbddc0ca357d7a936")
@WinRTInterface("61899d9d37574ecbbddc0ca357d7a936")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsAttachedSignature.ByReference::class)
public interface ICmsAttachedSignature : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Certificates(): IVectorView<Certificate?>?

  @InterfaceMethod(1)
  public fun get_Content(): Array<Byte>?

  @InterfaceMethod(2)
  public fun get_Signers(): IVectorView<CmsSignerInfo?>?

  @InterfaceMethod(3)
  public fun VerifySignature(): SignatureValidationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsAttachedSignature> {
    public override fun getValue() = ABI.makeICmsAttachedSignature(pointer.getPointer(0))

    public fun setValue(value: ICmsAttachedSignature_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsAttachedSignature {
    public val __1260217369_Ptr: Pointer?

    public val _1260217369_VtblPtr: Pointer?
      get() = __1260217369_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Certificates(): IVectorView<Certificate?>? {
      val fnPtr = _1260217369_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__1260217369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Content(): Array<Byte>? {
      val fnPtr = _1260217369_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1260217369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Signers(): IVectorView<CmsSignerInfo?>? {
      val fnPtr = _1260217369_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CmsSignerInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1260217369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CmsSignerInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun VerifySignature(): SignatureValidationResult? {
      val fnPtr = _1260217369_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SignatureValidationResult>()
      val hr = fn.invokeHR(arrayOf(__1260217369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SignatureValidationResult>(result.getValue())
      return resultValue
    }
  }

  public class ICmsAttachedSignature_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1260217369_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsAttachedSignature, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61899d9d37574ecbbddc0ca357d7a936")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsAttachedSignature(ptr: Pointer?): WithDefault =
        ICmsAttachedSignature_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsAttachedSignature {
      val address = segment.toRawLongValue()
      return makeICmsAttachedSignature(Pointer(address))
    }

    public override fun toNative(obj: ICmsAttachedSignature): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1260217369_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsAttachedSignature): Array<ICmsAttachedSignature?> =
        (elements as
        Array<ICmsAttachedSignature?>).castToImpl<ICmsAttachedSignature,ICmsAttachedSignature_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsAttachedSignature?> =
        arrayOfNulls<ICmsAttachedSignature_Impl>(size) as Array<ICmsAttachedSignature?>
  }
}
