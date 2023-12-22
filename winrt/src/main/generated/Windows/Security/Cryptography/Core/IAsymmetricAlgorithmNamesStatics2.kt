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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAsymmetricAlgorithmNamesStatics2.ABI::class)
@Signature("{f141c0d6-4bff-4f23-ba66-6045b137d5df}")
@Guid("f141c0d64bff4f23ba666045b137d5df")
@WinRTInterface("f141c0d64bff4f23ba666045b137d5df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsymmetricAlgorithmNamesStatics2.ByReference::class)
public interface IAsymmetricAlgorithmNamesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EcdsaSha256(): String?

  @InterfaceMethod(1)
  public fun get_EcdsaSha384(): String?

  @InterfaceMethod(2)
  public fun get_EcdsaSha512(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAsymmetricAlgorithmNamesStatics2> {
    public override fun getValue() =
        ABI.makeIAsymmetricAlgorithmNamesStatics2(pointer.getPointer(0))

    public fun setValue(value: IAsymmetricAlgorithmNamesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsymmetricAlgorithmNamesStatics2 {
    public val __1205567161_Ptr: Pointer?

    public val _1205567161_VtblPtr: Pointer?
      get() = __1205567161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EcdsaSha256(): String? {
      val fnPtr = _1205567161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205567161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EcdsaSha384(): String? {
      val fnPtr = _1205567161_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205567161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EcdsaSha512(): String? {
      val fnPtr = _1205567161_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1205567161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAsymmetricAlgorithmNamesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1205567161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsymmetricAlgorithmNamesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f141c0d64bff4f23ba666045b137d5df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsymmetricAlgorithmNamesStatics2(ptr: Pointer?): WithDefault =
        IAsymmetricAlgorithmNamesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsymmetricAlgorithmNamesStatics2 {
      val address = segment.toRawLongValue()
      return makeIAsymmetricAlgorithmNamesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAsymmetricAlgorithmNamesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1205567161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsymmetricAlgorithmNamesStatics2):
        Array<IAsymmetricAlgorithmNamesStatics2?> = (elements as
        Array<IAsymmetricAlgorithmNamesStatics2?>).castToImpl<IAsymmetricAlgorithmNamesStatics2,IAsymmetricAlgorithmNamesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsymmetricAlgorithmNamesStatics2?> =
        arrayOfNulls<IAsymmetricAlgorithmNamesStatics2_Impl>(size) as
        Array<IAsymmetricAlgorithmNamesStatics2?>
  }
}
