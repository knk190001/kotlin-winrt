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

@ABIMarker(ITensorUInt16BitStatics2.ABI::class)
@Signature("{8af40c64-d69f-5315-9348-490877bbd642}")
@Guid("8af40c64d69f53159348490877bbd642")
@WinRTInterface("8af40c64d69f53159348490877bbd642")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt16BitStatics2.ByReference::class)
public interface ITensorUInt16BitStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<WinDef.USHORT>):
      TensorUInt16Bit?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt16Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt16BitStatics2> {
    public override fun getValue() = ABI.makeITensorUInt16BitStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt16BitStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt16BitStatics2 {
    public val __945685245_Ptr: Pointer?

    public val _945685245_VtblPtr: Pointer?
      get() = __945685245_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>,
        `data`: Array<WinDef.USHORT>): TensorUInt16Bit? {
      val fnPtr = _945685245_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__945685245_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt16Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt16Bit? {
      val fnPtr = _945685245_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt16Bit>()
      val hr = fn.invokeHR(arrayOf(__945685245_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt16Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt16BitStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945685245_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt16BitStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8af40c64d69f53159348490877bbd642")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt16BitStatics2(ptr: Pointer?): WithDefault =
        ITensorUInt16BitStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt16BitStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorUInt16BitStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt16BitStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945685245_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt16BitStatics2):
        Array<ITensorUInt16BitStatics2?> = (elements as
        Array<ITensorUInt16BitStatics2?>).castToImpl<ITensorUInt16BitStatics2,ITensorUInt16BitStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt16BitStatics2?> =
        arrayOfNulls<ITensorUInt16BitStatics2_Impl>(size) as Array<ITensorUInt16BitStatics2?>
  }
}
