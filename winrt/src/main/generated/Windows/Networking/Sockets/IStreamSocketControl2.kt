package Windows.Networking.Sockets

import Windows.Foundation.Collections.IVector
import Windows.Security.Cryptography.Certificates.ChainValidationResult
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

@ABIMarker(IStreamSocketControl2.ABI::class)
@Signature("{c2d09a56-060f-44c1-b8e2-1fbf60bd62c5}")
@Guid("c2d09a56060f44c1b8e21fbf60bd62c5")
@WinRTInterface("c2d09a56060f44c1b8e21fbf60bd62c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketControl2.ByReference::class)
public interface IStreamSocketControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IgnorableServerCertificateErrors(): IVector<ChainValidationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketControl2> {
    public override fun getValue() = ABI.makeIStreamSocketControl2(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketControl2 {
    public val __1800417632_Ptr: Pointer?

    public val _1800417632_VtblPtr: Pointer?
      get() = __1800417632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IgnorableServerCertificateErrors(): IVector<ChainValidationResult?>? {
      val fnPtr = _1800417632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ChainValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1800417632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ChainValidationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1800417632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2d09a56060f44c1b8e21fbf60bd62c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketControl2(ptr: Pointer?): WithDefault =
        IStreamSocketControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketControl2 {
      val address = segment.toRawLongValue()
      return makeIStreamSocketControl2(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1800417632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketControl2): Array<IStreamSocketControl2?> =
        (elements as
        Array<IStreamSocketControl2?>).castToImpl<IStreamSocketControl2,IStreamSocketControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketControl2?> =
        arrayOfNulls<IStreamSocketControl2_Impl>(size) as Array<IStreamSocketControl2?>
  }
}
