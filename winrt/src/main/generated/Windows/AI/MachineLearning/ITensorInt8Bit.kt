package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorInt8Bit.ABI::class)
@Signature("{cddd97c5-ffd8-4fef-aefb-30e1a485b2ee}")
@Guid("cddd97c5ffd84fefaefb30e1a485b2ee")
@WinRTInterface("cddd97c5ffd84fefaefb30e1a485b2ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt8Bit.ByReference::class)
public interface ITensorInt8Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITensorInt8Bit>
      {
    public override fun getValue() = ABI.makeITensorInt8Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorInt8Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt8Bit {
    public val __1940517812_Ptr: Pointer?

    public val _1940517812_VtblPtr: Pointer?
      get() = __1940517812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Byte>? {
      val fnPtr = _1940517812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Byte>>()
      val hr = fn.invokeHR(arrayOf(__1940517812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Byte>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt8Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1940517812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt8Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cddd97c5ffd84fefaefb30e1a485b2ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt8Bit(ptr: Pointer?): WithDefault = ITensorInt8Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt8Bit {
      val address = segment.toRawLongValue()
      return makeITensorInt8Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt8Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1940517812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt8Bit): Array<ITensorInt8Bit?> = (elements as
        Array<ITensorInt8Bit?>).castToImpl<ITensorInt8Bit,ITensorInt8Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt8Bit?> =
        arrayOfNulls<ITensorInt8Bit_Impl>(size) as Array<ITensorInt8Bit?>
  }
}
