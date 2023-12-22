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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorBoolean.ABI::class)
@Signature("{50f311ed-29e9-4a5c-a44d-8fc512584eed}")
@Guid("50f311ed29e94a5ca44d8fc512584eed")
@WinRTInterface("50f311ed29e94a5ca44d8fc512584eed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorBoolean.ByReference::class)
public interface ITensorBoolean : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsVectorView(): IVectorView<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITensorBoolean>
      {
    public override fun getValue() = ABI.makeITensorBoolean(pointer.getPointer(0))

    public fun setValue(value: ITensorBoolean_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorBoolean {
    public val __462485072_Ptr: Pointer?

    public val _462485072_VtblPtr: Pointer?
      get() = __462485072_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsVectorView(): IVectorView<Boolean>? {
      val fnPtr = _462485072_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__462485072_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorBoolean_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __462485072_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorBoolean, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50f311ed29e94a5ca44d8fc512584eed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorBoolean(ptr: Pointer?): WithDefault = ITensorBoolean_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorBoolean {
      val address = segment.toRawLongValue()
      return makeITensorBoolean(Pointer(address))
    }

    public override fun toNative(obj: ITensorBoolean): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__462485072_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorBoolean): Array<ITensorBoolean?> = (elements as
        Array<ITensorBoolean?>).castToImpl<ITensorBoolean,ITensorBoolean_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorBoolean?> =
        arrayOfNulls<ITensorBoolean_Impl>(size) as Array<ITensorBoolean?>
  }
}
