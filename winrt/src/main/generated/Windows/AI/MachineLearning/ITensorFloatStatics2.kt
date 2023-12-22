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
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorFloatStatics2.ABI::class)
@Signature("{24610bc1-5e44-5713-b281-8f4ad4d555e8}")
@Guid("24610bc15e445713b2818f4ad4d555e8")
@WinRTInterface("24610bc15e445713b2818f4ad4d555e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorFloatStatics2.ByReference::class)
public interface ITensorFloatStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Float>):
      TensorFloat?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorFloat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorFloatStatics2> {
    public override fun getValue() = ABI.makeITensorFloatStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorFloatStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorFloatStatics2 {
    public val __57913265_Ptr: Pointer?

    public val _57913265_VtblPtr: Pointer?
      get() = __57913265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Float>):
        TensorFloat? {
      val fnPtr = _57913265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat>()
      val hr = fn.invokeHR(arrayOf(__57913265_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorFloat? {
      val fnPtr = _57913265_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorFloat>()
      val hr = fn.invokeHR(arrayOf(__57913265_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorFloat>(result.getValue())
      return resultValue
    }
  }

  public class ITensorFloatStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __57913265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorFloatStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24610bc15e445713b2818f4ad4d555e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorFloatStatics2(ptr: Pointer?): WithDefault = ITensorFloatStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorFloatStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorFloatStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorFloatStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__57913265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorFloatStatics2): Array<ITensorFloatStatics2?> =
        (elements as
        Array<ITensorFloatStatics2?>).castToImpl<ITensorFloatStatics2,ITensorFloatStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorFloatStatics2?> =
        arrayOfNulls<ITensorFloatStatics2_Impl>(size) as Array<ITensorFloatStatics2?>
  }
}
