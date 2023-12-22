package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ICmsAttachedSignatureStatics.ABI::class)
@Signature("{87989c8e-b0ad-498d-a7f5-78b59bce4b36}")
@Guid("87989c8eb0ad498da7f578b59bce4b36")
@WinRTInterface("87989c8eb0ad498da7f578b59bce4b36")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsAttachedSignatureStatics.ByReference::class)
public interface ICmsAttachedSignatureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GenerateSignatureAsync(
    `data`: IBuffer?,
    signers: IIterable<CmsSignerInfo?>?,
    certificates: IIterable<Certificate?>?
  ): IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsAttachedSignatureStatics> {
    public override fun getValue() = ABI.makeICmsAttachedSignatureStatics(pointer.getPointer(0))

    public fun setValue(value: ICmsAttachedSignatureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsAttachedSignatureStatics {
    public val __1995183468_Ptr: Pointer?

    public val _1995183468_VtblPtr: Pointer?
      get() = __1995183468_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GenerateSignatureAsync(
      `data`: IBuffer?,
      signers: IIterable<CmsSignerInfo?>?,
      certificates: IIterable<Certificate?>?
    ): IAsyncOperation<IBuffer?>? {
      val fnPtr = _1995183468_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1995183468_Ptr, marshalToNative(data),
          marshalToNative(signers), marshalToNative(certificates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class ICmsAttachedSignatureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1995183468_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsAttachedSignatureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87989c8eb0ad498da7f578b59bce4b36")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsAttachedSignatureStatics(ptr: Pointer?): WithDefault =
        ICmsAttachedSignatureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsAttachedSignatureStatics {
      val address = segment.toRawLongValue()
      return makeICmsAttachedSignatureStatics(Pointer(address))
    }

    public override fun toNative(obj: ICmsAttachedSignatureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1995183468_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsAttachedSignatureStatics):
        Array<ICmsAttachedSignatureStatics?> = (elements as
        Array<ICmsAttachedSignatureStatics?>).castToImpl<ICmsAttachedSignatureStatics,ICmsAttachedSignatureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsAttachedSignatureStatics?> =
        arrayOfNulls<ICmsAttachedSignatureStatics_Impl>(size) as
        Array<ICmsAttachedSignatureStatics?>
  }
}
