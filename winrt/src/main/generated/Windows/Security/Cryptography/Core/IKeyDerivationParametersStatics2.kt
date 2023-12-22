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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyDerivationParametersStatics2.ABI::class)
@Signature("{a5783dd5-58e3-4efb-b283-a1653126e1be}")
@Guid("a5783dd558e34efbb283a1653126e1be")
@WinRTInterface("a5783dd558e34efbb283a1653126e1be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationParametersStatics2.ByReference::class)
public interface IKeyDerivationParametersStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun BuildForCapi1Kdf(capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm?):
      KeyDerivationParameters?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationParametersStatics2> {
    public override fun getValue() = ABI.makeIKeyDerivationParametersStatics2(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationParametersStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationParametersStatics2 {
    public val __986099358_Ptr: Pointer?

    public val _986099358_VtblPtr: Pointer?
      get() = __986099358_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BuildForCapi1Kdf(capi1KdfTargetAlgorithm: Capi1KdfTargetAlgorithm?):
        KeyDerivationParameters? {
      val fnPtr = _986099358_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyDerivationParameters>()
      val hr = fn.invokeHR(arrayOf(__986099358_Ptr, marshalToNative(capi1KdfTargetAlgorithm),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyDerivationParameters>(result.getValue())
      return resultValue
    }
  }

  public class IKeyDerivationParametersStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __986099358_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationParametersStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5783dd558e34efbb283a1653126e1be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationParametersStatics2(ptr: Pointer?): WithDefault =
        IKeyDerivationParametersStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationParametersStatics2 {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationParametersStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationParametersStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__986099358_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationParametersStatics2):
        Array<IKeyDerivationParametersStatics2?> = (elements as
        Array<IKeyDerivationParametersStatics2?>).castToImpl<IKeyDerivationParametersStatics2,IKeyDerivationParametersStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationParametersStatics2?> =
        arrayOfNulls<IKeyDerivationParametersStatics2_Impl>(size) as
        Array<IKeyDerivationParametersStatics2?>
  }
}
