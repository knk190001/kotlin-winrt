package Windows.UI.Composition

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

@ABIMarker(ICompositionAnimation3.ABI::class)
@Signature("{d51e030d-7da4-4bd7-bc2d-f4517529f43a}")
@Guid("d51e030d7da44bd7bc2df4517529f43a")
@WinRTInterface("d51e030d7da44bd7bc2df4517529f43a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimation3.ByReference::class)
public interface ICompositionAnimation3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InitialValueExpressions(): InitialValueExpressionCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimation3> {
    public override fun getValue() = ABI.makeICompositionAnimation3(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimation3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimation3 {
    public val __1786839157_Ptr: Pointer?

    public val _1786839157_VtblPtr: Pointer?
      get() = __1786839157_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialValueExpressions(): InitialValueExpressionCollection? {
      val fnPtr = _1786839157_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InitialValueExpressionCollection>()
      val hr = fn.invokeHR(arrayOf(__1786839157_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InitialValueExpressionCollection>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionAnimation3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1786839157_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimation3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d51e030d7da44bd7bc2df4517529f43a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimation3(ptr: Pointer?): WithDefault =
        ICompositionAnimation3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimation3 {
      val address = segment.toRawLongValue()
      return makeICompositionAnimation3(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimation3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1786839157_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimation3): Array<ICompositionAnimation3?> =
        (elements as
        Array<ICompositionAnimation3?>).castToImpl<ICompositionAnimation3,ICompositionAnimation3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimation3?> =
        arrayOfNulls<ICompositionAnimation3_Impl>(size) as Array<ICompositionAnimation3?>
  }
}
