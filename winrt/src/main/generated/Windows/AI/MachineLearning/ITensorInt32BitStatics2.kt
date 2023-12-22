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

@ABIMarker(ITensorInt32BitStatics2.ABI::class)
@Signature("{7c4b079a-e956-5ce0-a3bd-157d9d79b5ec}")
@Guid("7c4b079ae9565ce0a3bd157d9d79b5ec")
@WinRTInterface("7c4b079ae9565ce0a3bd157d9d79b5ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt32BitStatics2.ByReference::class)
public interface ITensorInt32BitStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Int>):
      TensorInt32Bit?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorInt32Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt32BitStatics2> {
    public override fun getValue() = ABI.makeITensorInt32BitStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorInt32BitStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt32BitStatics2 {
    public val __458040484_Ptr: Pointer?

    public val _458040484_VtblPtr: Pointer?
      get() = __458040484_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Int>):
        TensorInt32Bit? {
      val fnPtr = _458040484_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__458040484_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt32Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorInt32Bit? {
      val fnPtr = _458040484_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__458040484_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt32Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt32BitStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __458040484_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt32BitStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c4b079ae9565ce0a3bd157d9d79b5ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt32BitStatics2(ptr: Pointer?): WithDefault =
        ITensorInt32BitStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt32BitStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorInt32BitStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt32BitStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__458040484_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt32BitStatics2): Array<ITensorInt32BitStatics2?>
        = (elements as
        Array<ITensorInt32BitStatics2?>).castToImpl<ITensorInt32BitStatics2,ITensorInt32BitStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt32BitStatics2?> =
        arrayOfNulls<ITensorInt32BitStatics2_Impl>(size) as Array<ITensorInt32BitStatics2?>
  }
}
