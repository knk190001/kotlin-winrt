package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ICmsDetachedSignatureStatics.ABI::class)
@Signature("{3d114cfd-bf9b-4682-9be6-91f57c053808}")
@Guid("3d114cfdbf9b46829be691f57c053808")
@WinRTInterface("3d114cfdbf9b46829be691f57c053808")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsDetachedSignatureStatics.ByReference::class)
public interface ICmsDetachedSignatureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GenerateSignatureAsync(
    `data`: IInputStream?,
    signers: IIterable<CmsSignerInfo?>?,
    certificates: IIterable<Certificate?>?
  ): IAsyncOperation<IBuffer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsDetachedSignatureStatics> {
    public override fun getValue() = ABI.makeICmsDetachedSignatureStatics(pointer.getPointer(0))

    public fun setValue(value: ICmsDetachedSignatureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsDetachedSignatureStatics {
    public val __302565178_Ptr: Pointer?

    public val _302565178_VtblPtr: Pointer?
      get() = __302565178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GenerateSignatureAsync(
      `data`: IInputStream?,
      signers: IIterable<CmsSignerInfo?>?,
      certificates: IIterable<Certificate?>?
    ): IAsyncOperation<IBuffer?>? {
      val fnPtr = _302565178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__302565178_Ptr, marshalToNative(data), marshalToNative(signers),
          marshalToNative(certificates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }
  }

  public class ICmsDetachedSignatureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __302565178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsDetachedSignatureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d114cfdbf9b46829be691f57c053808")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsDetachedSignatureStatics(ptr: Pointer?): WithDefault =
        ICmsDetachedSignatureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsDetachedSignatureStatics {
      val address = segment.toRawLongValue()
      return makeICmsDetachedSignatureStatics(Pointer(address))
    }

    public override fun toNative(obj: ICmsDetachedSignatureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__302565178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsDetachedSignatureStatics):
        Array<ICmsDetachedSignatureStatics?> = (elements as
        Array<ICmsDetachedSignatureStatics?>).castToImpl<ICmsDetachedSignatureStatics,ICmsDetachedSignatureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsDetachedSignatureStatics?> =
        arrayOfNulls<ICmsDetachedSignatureStatics_Impl>(size) as
        Array<ICmsDetachedSignatureStatics?>
  }
}
