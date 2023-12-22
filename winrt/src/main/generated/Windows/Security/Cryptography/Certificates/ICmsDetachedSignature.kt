package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(ICmsDetachedSignature.ABI::class)
@Signature("{0f1ef154-f65e-4536-8339-5944081db2ca}")
@Guid("0f1ef154f65e453683395944081db2ca")
@WinRTInterface("0f1ef154f65e453683395944081db2ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsDetachedSignature.ByReference::class)
public interface ICmsDetachedSignature : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Certificates(): IVectorView<Certificate?>?

  @InterfaceMethod(1)
  public fun get_Signers(): IVectorView<CmsSignerInfo?>?

  @InterfaceMethod(2)
  public fun VerifySignatureAsync(`data`: IInputStream?):
      IAsyncOperation<SignatureValidationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsDetachedSignature> {
    public override fun getValue() = ABI.makeICmsDetachedSignature(pointer.getPointer(0))

    public fun setValue(value: ICmsDetachedSignature_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsDetachedSignature {
    public val __93257227_Ptr: Pointer?

    public val _93257227_VtblPtr: Pointer?
      get() = __93257227_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Certificates(): IVectorView<Certificate?>? {
      val fnPtr = _93257227_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__93257227_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Signers(): IVectorView<CmsSignerInfo?>? {
      val fnPtr = _93257227_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CmsSignerInfo?>>()
      val hr = fn.invokeHR(arrayOf(__93257227_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CmsSignerInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun VerifySignatureAsync(`data`: IInputStream?):
        IAsyncOperation<SignatureValidationResult?>? {
      val fnPtr = _93257227_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SignatureValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__93257227_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SignatureValidationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ICmsDetachedSignature_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93257227_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsDetachedSignature, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f1ef154f65e453683395944081db2ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsDetachedSignature(ptr: Pointer?): WithDefault =
        ICmsDetachedSignature_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsDetachedSignature {
      val address = segment.toRawLongValue()
      return makeICmsDetachedSignature(Pointer(address))
    }

    public override fun toNative(obj: ICmsDetachedSignature): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93257227_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsDetachedSignature): Array<ICmsDetachedSignature?> =
        (elements as
        Array<ICmsDetachedSignature?>).castToImpl<ICmsDetachedSignature,ICmsDetachedSignature_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsDetachedSignature?> =
        arrayOfNulls<ICmsDetachedSignature_Impl>(size) as Array<ICmsDetachedSignature?>
  }
}
