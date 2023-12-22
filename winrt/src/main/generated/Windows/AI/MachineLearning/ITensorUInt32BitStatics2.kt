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

@ABIMarker(ITensorUInt32BitStatics2.ABI::class)
@Signature("{ef1a1f1c-314e-569d-b496-5c8447d20cd2}")
@Guid("ef1a1f1c314e569db4965c8447d20cd2")
@WinRTInterface("ef1a1f1c314e569db4965c8447d20cd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt32BitStatics2.ByReference::class)
public interface ITensorUInt32BitStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<WinDef.UINT>):
      TensorUInt32Bit?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt32Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt32BitStatics2> {
    public override fun getValue() = ABI.makeITensorUInt32BitStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt32BitStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt32BitStatics2 {
    public val __2048822135_Ptr: Pointer?

    public val _2048822135_VtblPtr: Pointer?
      get() = __2048822135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>,
        `data`: Array<WinDef.UINT>): TensorUInt32Bit? {
      val fnPtr = _2048822135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__2048822135_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt32Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt32Bit? {
      val fnPtr = _2048822135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__2048822135_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt32Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt32BitStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2048822135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt32BitStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef1a1f1c314e569db4965c8447d20cd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt32BitStatics2(ptr: Pointer?): WithDefault =
        ITensorUInt32BitStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt32BitStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorUInt32BitStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt32BitStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2048822135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt32BitStatics2):
        Array<ITensorUInt32BitStatics2?> = (elements as
        Array<ITensorUInt32BitStatics2?>).castToImpl<ITensorUInt32BitStatics2,ITensorUInt32BitStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt32BitStatics2?> =
        arrayOfNulls<ITensorUInt32BitStatics2_Impl>(size) as Array<ITensorUInt32BitStatics2?>
  }
}
