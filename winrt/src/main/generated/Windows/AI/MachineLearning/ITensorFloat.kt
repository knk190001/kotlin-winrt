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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorFloat.ABI::class)
@Signature("{f2282d82-aa02-42c8-a0c8-df1efc9676e1}")
@Guid("f2282d82aa0242c8a0c8df1efc9676e1")
@WinRTInterface("f2282d82aa0242c8a0c8df1efc9676e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorFloat.ByReference::class)
public interface ITensorFloat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Float>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITensorFloat> {
    public override fun getValue() = ABI.makeITensorFloat(pointer.getPointer(0))

    public fun setValue(value: ITensorFloat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorFloat {
    public val __1372449148_Ptr: Pointer?

    public val _1372449148_VtblPtr: Pointer?
      get() = __1372449148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Float>? {
      val fnPtr = _1372449148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Float>>()
      val hr = fn.invokeHR(arrayOf(__1372449148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Float>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorFloat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1372449148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorFloat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2282d82aa0242c8a0c8df1efc9676e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorFloat(ptr: Pointer?): WithDefault = ITensorFloat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorFloat {
      val address = segment.toRawLongValue()
      return makeITensorFloat(Pointer(address))
    }

    public override fun toNative(obj: ITensorFloat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1372449148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorFloat): Array<ITensorFloat?> = (elements as
        Array<ITensorFloat?>).castToImpl<ITensorFloat,ITensorFloat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorFloat?> =
        arrayOfNulls<ITensorFloat_Impl>(size) as Array<ITensorFloat?>
  }
}
