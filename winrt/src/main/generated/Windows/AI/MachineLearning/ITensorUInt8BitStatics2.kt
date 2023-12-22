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
import kotlin.Byte
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorUInt8BitStatics2.ABI::class)
@Signature("{2ba042d6-373e-5a3a-a2fc-a6c41bd52789}")
@Guid("2ba042d6373e5a3aa2fca6c41bd52789")
@WinRTInterface("2ba042d6373e5a3aa2fca6c41bd52789")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorUInt8BitStatics2.ByReference::class)
public interface ITensorUInt8BitStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Byte>):
      TensorUInt8Bit?

  @InterfaceMethod(1)
  public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt8Bit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorUInt8BitStatics2> {
    public override fun getValue() = ABI.makeITensorUInt8BitStatics2(pointer.getPointer(0))

    public fun setValue(value: ITensorUInt8BitStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorUInt8BitStatics2 {
    public val __598277364_Ptr: Pointer?

    public val _598277364_VtblPtr: Pointer?
      get() = __598277364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Byte>):
        TensorUInt8Bit? {
      val fnPtr = _598277364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__598277364_Ptr, shape.size,marshalToNative(shape),
          data.size,marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt8Bit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer?): TensorUInt8Bit? {
      val fnPtr = _598277364_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorUInt8Bit>()
      val hr = fn.invokeHR(arrayOf(__598277364_Ptr, shape.size,marshalToNative(shape),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorUInt8Bit>(result.getValue())
      return resultValue
    }
  }

  public class ITensorUInt8BitStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __598277364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorUInt8BitStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ba042d6373e5a3aa2fca6c41bd52789")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorUInt8BitStatics2(ptr: Pointer?): WithDefault =
        ITensorUInt8BitStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorUInt8BitStatics2 {
      val address = segment.toRawLongValue()
      return makeITensorUInt8BitStatics2(Pointer(address))
    }

    public override fun toNative(obj: ITensorUInt8BitStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__598277364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorUInt8BitStatics2): Array<ITensorUInt8BitStatics2?>
        = (elements as
        Array<ITensorUInt8BitStatics2?>).castToImpl<ITensorUInt8BitStatics2,ITensorUInt8BitStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorUInt8BitStatics2?> =
        arrayOfNulls<ITensorUInt8BitStatics2_Impl>(size) as Array<ITensorUInt8BitStatics2?>
  }
}
