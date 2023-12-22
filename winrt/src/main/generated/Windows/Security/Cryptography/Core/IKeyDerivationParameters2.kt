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

@ABIMarker(IKeyDerivationParameters2.ABI::class)
@Signature("{cd4166d1-417e-4f4c-b666-c0d879f3f8e0}")
@Guid("cd4166d1417e4f4cb666c0d879f3f8e0")
@WinRTInterface("cd4166d1417e4f4cb666c0d879f3f8e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationParameters2.ByReference::class)
public interface IKeyDerivationParameters2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Capi1KdfTargetAlgorithm(): Capi1KdfTargetAlgorithm?

  @InterfaceMethod(1)
  public fun put_Capi1KdfTargetAlgorithm(value: Capi1KdfTargetAlgorithm?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationParameters2> {
    public override fun getValue() = ABI.makeIKeyDerivationParameters2(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationParameters2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationParameters2 {
    public val __1133105763_Ptr: Pointer?

    public val _1133105763_VtblPtr: Pointer?
      get() = __1133105763_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Capi1KdfTargetAlgorithm(): Capi1KdfTargetAlgorithm? {
      val fnPtr = _1133105763_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Capi1KdfTargetAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__1133105763_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Capi1KdfTargetAlgorithm>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Capi1KdfTargetAlgorithm(value: Capi1KdfTargetAlgorithm?): Unit {
      val fnPtr = _1133105763_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1133105763_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeyDerivationParameters2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1133105763_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationParameters2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd4166d1417e4f4cb666c0d879f3f8e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationParameters2(ptr: Pointer?): WithDefault =
        IKeyDerivationParameters2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationParameters2 {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationParameters2(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationParameters2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1133105763_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationParameters2):
        Array<IKeyDerivationParameters2?> = (elements as
        Array<IKeyDerivationParameters2?>).castToImpl<IKeyDerivationParameters2,IKeyDerivationParameters2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationParameters2?> =
        arrayOfNulls<IKeyDerivationParameters2_Impl>(size) as Array<IKeyDerivationParameters2?>
  }
}
