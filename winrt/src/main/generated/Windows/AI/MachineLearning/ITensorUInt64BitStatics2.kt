package Windows.AI.MachineLearning

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorUInt64BitStatics2.ABI::class)
@Signature("{085a687d-67e1-5b1e-b232-4fabe9ca20b3}")
@Guid("085a687d67e15b1eb2324fabe9ca20b3")
@WinRTInterface("085a687d67e15b1eb2324fabe9ca20b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt64BitStatics2.ByReference::class)
public interface ITensorUInt64BitStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<WinDef.ULONG>):
      TensorUInt64Bit?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt64Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt64BitStatics2> {
    public override fun getValue() = ABI.makeITensorUInt64BitStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt64BitStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt64BitStatics2 {
    public val __1624101578_Ptr: Pointer?

    public val _1624101578_VtblPtr: Pointer?
      get() = __1624101578_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>,
        `data`: Array<WinDef.ULONG>): TensorUInt64Bit? {
      val fnPtr = _1624101578_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__1624101578_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt64Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt64Bit? {
      val fnPtr = _1624101578_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt64Bit>()
      val hr = fn.invokeHR(arrayOf(__1624101578_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt64Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt64BitStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1624101578_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt64BitStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("085a687d67e15b1eb2324fabe9ca20b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt64BitStatics2(ptr: Pointer?): WithDefault =
        ITensorUInt64BitStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt64BitStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorUInt64BitStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt64BitStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1624101578_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt64BitStatics2):
        Array<ITensorUInt64BitStatics2?> = (elements as
        Array<ITensorUInt64BitStatics2?>).castToImpl<ITensorUInt64BitStatics2,ITensorUInt64BitStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt64BitStatics2?> =
        arrayOfNulls<ITensorUInt64BitStatics2_Impl>(size) as Array<ITensorUInt64BitStatics2?>
  }
}
