package Windows.Security.Cryptography.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAsymmetricKeyAlgorithmProvider2.ABI::class)
@Signature("{4e322a7e-7c4d-4997-ac4f-1b848b36306e}")
@Guid("4e322a7e7c4d4997ac4f1b848b36306e")
@WinRTInterface("4e322a7e7c4d4997ac4f1b848b36306e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsymmetricKeyAlgorithmProvider2.ByReference::class)
public interface IAsymmetricKeyAlgorithmProvider2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateKeyPairWithCurveName(curveName: String?): CryptographicKey?

  @InterfaceMethod(1)
  public fun CreateKeyPairWithCurveParameters(parameters: Array<Byte>): CryptographicKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsymmetricKeyAlgorithmProvider2> {
    public override fun getValue() = ABI.makeIAsymmetricKeyAlgorithmProvider2(pointer.getPointer(0))

    public fun setValue(value: IAsymmetricKeyAlgorithmProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsymmetricKeyAlgorithmProvider2 {
    public val __1679163472_Ptr: Pointer?

    public val _1679163472_VtblPtr: Pointer?
      get() = __1679163472_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateKeyPairWithCurveName(curveName: String?): CryptographicKey? {
      val fnPtr = _1679163472_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__1679163472_Ptr, marshalToNative(curveName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateKeyPairWithCurveParameters(parameters: Array<Byte>):
        CryptographicKey? {
      val fnPtr = _1679163472_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__1679163472_Ptr, parameters.size,marshalToNative(parameters),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }
  }

  public class IAsymmetricKeyAlgorithmProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1679163472_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsymmetricKeyAlgorithmProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e322a7e7c4d4997ac4f1b848b36306e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsymmetricKeyAlgorithmProvider2(ptr: Pointer?): WithDefault =
        IAsymmetricKeyAlgorithmProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsymmetricKeyAlgorithmProvider2 {
      val address = segment.toRawLongValue()
      return makeIAsymmetricKeyAlgorithmProvider2(Pointer(address))
    }

    public override fun toNative(obj: IAsymmetricKeyAlgorithmProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1679163472_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsymmetricKeyAlgorithmProvider2):
        Array<IAsymmetricKeyAlgorithmProvider2?> = (elements as
        Array<IAsymmetricKeyAlgorithmProvider2?>).castToImpl<IAsymmetricKeyAlgorithmProvider2,IAsymmetricKeyAlgorithmProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsymmetricKeyAlgorithmProvider2?> =
        arrayOfNulls<IAsymmetricKeyAlgorithmProvider2_Impl>(size) as
        Array<IAsymmetricKeyAlgorithmProvider2?>
  }
}
