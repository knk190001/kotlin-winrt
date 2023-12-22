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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorInt16Bit.ABI::class)
@Signature("{98a32d39-e6d6-44af-8afa-baebc44dc020}")
@Guid("98a32d39e6d644af8afabaebc44dc020")
@WinRTInterface("98a32d39e6d644af8afabaebc44dc020")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorInt16Bit.ByReference::class)
public interface ITensorInt16Bit : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Short>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorInt16Bit> {
    public override fun getValue() = ABI.makeITensorInt16Bit(pointer.getPointer(0))

    public fun setValue(value: ITensorInt16Bit_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorInt16Bit {
    public val __33369871_Ptr: Pointer?

    public val _33369871_VtblPtr: Pointer?
      get() = __33369871_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Short>? {
      val fnPtr = _33369871_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Short>>()
      val hr = fn.invokeHR(arrayOf(__33369871_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Short>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorInt16Bit_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33369871_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorInt16Bit, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98a32d39e6d644af8afabaebc44dc020")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorInt16Bit(ptr: Pointer?): WithDefault = ITensorInt16Bit_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorInt16Bit {
      val address = segment.toRawLongValue()
      return makeITensorInt16Bit(Pointer(address))
    }

    public override fun toNative(obj: ITensorInt16Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33369871_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorInt16Bit): Array<ITensorInt16Bit?> = (elements as
        Array<ITensorInt16Bit?>).castToImpl<ITensorInt16Bit,ITensorInt16Bit_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorInt16Bit?> =
        arrayOfNulls<ITensorInt16Bit_Impl>(size) as Array<ITensorInt16Bit?>
  }
}
