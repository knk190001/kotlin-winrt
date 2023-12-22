package Windows.AI.MachineLearning

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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorStringStatics2.ABI::class)
@Signature("{9e355ed0-c8e2-5254-9137-0193a3668fd8}")
@Guid("9e355ed0c8e2525491370193a3668fd8")
@WinRTInterface("9e355ed0c8e2525491370193a3668fd8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorStringStatics2.ByReference::class)
public interface ITensorStringStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<String?>):
      TensorString?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorStringStatics2> {
    public override fun getValue() = ABI.makeITensorStringStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorStringStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorStringStatics2 {
    public val __1517901078_Ptr: Pointer?

    public val _1517901078_VtblPtr: Pointer?
      get() = __1517901078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>,
        `data`: Array<String?>): TensorString? {
      val fnPtr = _1517901078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorString>()
      val hr = fn.invokeHR(arrayOf(__1517901078_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorString>(result.getValue())
      return resultValue
    }
  }

  public class ITensorStringStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1517901078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorStringStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e355ed0c8e2525491370193a3668fd8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorStringStatics2(ptr: Pointer?): WithDefault =
        ITensorStringStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorStringStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorStringStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorStringStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1517901078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorStringStatics2): Array<ITensorStringStatics2?> =
        (elements as
        Array<ITensorStringStatics2?>).castToImpl<ITensorStringStatics2,ITensorStringStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorStringStatics2?> =
        arrayOfNulls<ITensorStringStatics2_Impl>(size) as Array<ITensorStringStatics2?>
  }
}
