package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ITensorInt32BitStatics.ABI::class)
@Signature("{6539864b-52fa-4e35-907c-834cac417b50}")
@Guid("6539864b52fa4e35907c834cac417b50")
@WinRTInterface("6539864b52fa4e35907c834cac417b50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt32BitStatics.ByReference::class)
public interface ITensorInt32BitStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(): TensorInt32Bit?

  @InterfaceMethod(1)
  public fun Create(shape: IIterable<Long>?): TensorInt32Bit?

  @InterfaceMethod(2)
  public fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Int>): TensorInt32Bit?

  @InterfaceMethod(3)
  public fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Int>?): TensorInt32Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt32BitStatics> {
    public override fun getValue() = ABI.makeITensorInt32BitStatics(pointer.getPointer(0))

    public fun setValue(value: ITensorInt32BitStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt32BitStatics {
    public val __153322830_Ptr: Pointer?

    public val _153322830_VtblPtr: Pointer?
      get() = __153322830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(): TensorInt32Bit? {
      val fnPtr = _153322830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__153322830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt32Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Create(shape: IIterable<Long>?): TensorInt32Bit? {
      val fnPtr = _153322830_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__153322830_Ptr, marshalToNative(shape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt32Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromArray(shape: IIterable<Long>?, `data`: Array<Int>):
        TensorInt32Bit? {
      val fnPtr = _153322830_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__153322830_Ptr, marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt32Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIterable(shape: IIterable<Long>?, `data`: IIterable<Int>?):
        TensorInt32Bit? {
      val fnPtr = _153322830_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorInt32Bit>()
      val hr = fn.invokeHR(arrayOf(__153322830_Ptr, marshalToNative(shape), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorInt32Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt32BitStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __153322830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt32BitStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6539864b52fa4e35907c834cac417b50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt32BitStatics(ptr: Pointer?): WithDefault =
        ITensorInt32BitStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt32BitStatics {
      val address = segment.toRawLongValue()
      return makeITensorInt32BitStatics(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt32BitStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__153322830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt32BitStatics): Array<ITensorInt32BitStatics?> =
        (elements as
        Array<ITensorInt32BitStatics?>).castToImpl<ITensorInt32BitStatics,ITensorInt32BitStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt32BitStatics?> =
        arrayOfNulls<ITensorInt32BitStatics_Impl>(size) as Array<ITensorInt32BitStatics?>
  }
}
