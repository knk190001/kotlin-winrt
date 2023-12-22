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
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorInt64Bit.ABI::class)
@Signature("{499665ba-1fa2-45ad-af25-a0bd9bda4c87}")
@Guid("499665ba1fa245adaf25a0bd9bda4c87")
@WinRTInterface("499665ba1fa245adaf25a0bd9bda4c87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt64Bit.ByReference::class)
public interface ITensorInt64Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Long>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt64Bit> {
    public override fun getValue() = ABI.makeITensorInt64Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorInt64Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt64Bit {
    public val __28811848_Ptr: Pointer?

    public val _28811848_VtblPtr: Pointer?
      get() = __28811848_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Long>? {
      val fnPtr = _28811848_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Long>>()
      val hr = fn.invokeHR(arrayOf(__28811848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Long>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt64Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __28811848_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt64Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("499665ba1fa245adaf25a0bd9bda4c87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt64Bit(ptr: Pointer?): WithDefault = ITensorInt64Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt64Bit {
      val address = segment.toRawLongValue()
      return makeITensorInt64Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt64Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__28811848_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt64Bit): Array<ITensorInt64Bit?> = (elements as
        Array<ITensorInt64Bit?>).castToImpl<ITensorInt64Bit,ITensorInt64Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt64Bit?> =
        arrayOfNulls<ITensorInt64Bit_Impl>(size) as Array<ITensorInt64Bit?>
  }
}
