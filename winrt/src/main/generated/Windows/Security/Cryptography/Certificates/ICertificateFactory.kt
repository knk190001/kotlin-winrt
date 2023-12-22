package Windows.Security.Cryptography.Certificates

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

@ABIMarker(ICertificateFactory.ABI::class)
@Signature("{17b4221c-4baf-44a2-9608-04fb62b16942}")
@Guid("17b4221c4baf44a2960804fb62b16942")
@WinRTInterface("17b4221c4baf44a2960804fb62b16942")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateFactory.ByReference::class)
public interface ICertificateFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCertificate(certBlob: IBuffer?): Certificate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateFactory> {
    public override fun getValue() = ABI.makeICertificateFactory(pointer.getPointer(0))

    public fun setValue(value: ICertificateFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateFactory {
    public val __399869471_Ptr: Pointer?

    public val _399869471_VtblPtr: Pointer?
      get() = __399869471_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCertificate(certBlob: IBuffer?): Certificate? {
      val fnPtr = _399869471_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__399869471_Ptr, marshalToNative(certBlob), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __399869471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17b4221c4baf44a2960804fb62b16942")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateFactory(ptr: Pointer?): WithDefault = ICertificateFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateFactory {
      val address = segment.toRawLongValue()
      return makeICertificateFactory(Pointer(address))
    }

    public override fun toNative(obj: ICertificateFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__399869471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateFactory): Array<ICertificateFactory?> =
        (elements as
        Array<ICertificateFactory?>).castToImpl<ICertificateFactory,ICertificateFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateFactory?> =
        arrayOfNulls<ICertificateFactory_Impl>(size) as Array<ICertificateFactory?>
  }
}
