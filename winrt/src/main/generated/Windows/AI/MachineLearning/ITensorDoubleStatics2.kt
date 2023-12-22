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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorDoubleStatics2.ABI::class)
@Signature("{93a570de-5e9a-5094-85c8-592c655e68ac}")
@Guid("93a570de5e9a509485c8592c655e68ac")
@WinRTInterface("93a570de5e9a509485c8592c655e68ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorDoubleStatics2.ByReference::class)
public interface ITensorDoubleStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Double>):
      TensorDouble?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorDouble?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorDoubleStatics2> {
    public override fun getValue() = ABI.makeITensorDoubleStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorDoubleStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorDoubleStatics2 {
    public val __1772335318_Ptr: Pointer?

    public val _1772335318_VtblPtr: Pointer?
      get() = __1772335318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Double>):
        TensorDouble? {
      val fnPtr = _1772335318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorDouble>()
      val hr = fn.invokeHR(arrayOf(__1772335318_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorDouble>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorDouble? {
      val fnPtr = _1772335318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorDouble>()
      val hr = fn.invokeHR(arrayOf(__1772335318_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorDouble>(result.getValue())
      return resultValue
    }
  }

  public class ITensorDoubleStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1772335318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorDoubleStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93a570de5e9a509485c8592c655e68ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorDoubleStatics2(ptr: Pointer?): WithDefault =
        ITensorDoubleStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorDoubleStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorDoubleStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorDoubleStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1772335318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorDoubleStatics2): Array<ITensorDoubleStatics2?> =
        (elements as
        Array<ITensorDoubleStatics2?>).castToImpl<ITensorDoubleStatics2,ITensorDoubleStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorDoubleStatics2?> =
        arrayOfNulls<ITensorDoubleStatics2_Impl>(size) as Array<ITensorDoubleStatics2?>
  }
}
