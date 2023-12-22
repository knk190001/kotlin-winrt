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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificateChain.ABI::class)
@Signature("{20bf5385-3691-4501-a62c-fd97278b31ee}")
@Guid("20bf538536914501a62cfd97278b31ee")
@WinRTInterface("20bf538536914501a62cfd97278b31ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateChain.ByReference::class)
public interface ICertificateChain : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Validate(): ChainValidationResult?

  @InterfaceMethod(1)
  public fun Validate(parameter: ChainValidationParameters?): ChainValidationResult?

  @InterfaceMethod(2)
  public fun GetCertificates(includeRoot: Boolean): IVectorView<Certificate?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateChain> {
    public override fun getValue() = ABI.makeICertificateChain(pointer.getPointer(0))

    public fun setValue(value: ICertificateChain_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateChain {
    public val __519924056_Ptr: Pointer?

    public val _519924056_VtblPtr: Pointer?
      get() = __519924056_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Validate(): ChainValidationResult? {
      val fnPtr = _519924056_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChainValidationResult>()
      val hr = fn.invokeHR(arrayOf(__519924056_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChainValidationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Validate(parameter: ChainValidationParameters?): ChainValidationResult? {
      val fnPtr = _519924056_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChainValidationResult>()
      val hr = fn.invokeHR(arrayOf(__519924056_Ptr, marshalToNative(parameter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChainValidationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetCertificates(includeRoot: Boolean): IVectorView<Certificate?>? {
      val fnPtr = _519924056_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__519924056_Ptr, includeRoot, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateChain_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __519924056_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateChain, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20bf538536914501a62cfd97278b31ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateChain(ptr: Pointer?): WithDefault = ICertificateChain_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateChain {
      val address = segment.toRawLongValue()
      return makeICertificateChain(Pointer(address))
    }

    public override fun toNative(obj: ICertificateChain): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__519924056_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateChain): Array<ICertificateChain?> = (elements
        as Array<ICertificateChain?>).castToImpl<ICertificateChain,ICertificateChain_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateChain?> =
        arrayOfNulls<ICertificateChain_Impl>(size) as Array<ICertificateChain?>
  }
}
