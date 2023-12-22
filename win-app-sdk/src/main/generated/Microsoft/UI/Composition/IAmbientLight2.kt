package Microsoft.UI.Composition

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

@ABIMarker(IAmbientLight2.ABI::class)
@Signature("{3356f963-040c-54d4-9dfc-b61c51aaadd1}")
@Guid("3356f963040c54d49dfcb61c51aaadd1")
@WinRTInterface("3356f963040c54d49dfcb61c51aaadd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAmbientLight2.ByReference::class)
public interface IAmbientLight2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Intensity(): Float

  @InterfaceMethod(1)
  public fun put_Intensity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAmbientLight2>
      {
    public override fun getValue() = ABI.makeIAmbientLight2(pointer.getPointer(0))

    public fun setValue(value: IAmbientLight2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAmbientLight2 {
    public val __1344150757_Ptr: Pointer?

    public val _1344150757_VtblPtr: Pointer?
      get() = __1344150757_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Intensity(): Float {
      val fnPtr = _1344150757_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1344150757_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Intensity(value: Float): Unit {
      val fnPtr = _1344150757_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1344150757_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAmbientLight2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1344150757_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAmbientLight2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3356f963040c54d49dfcb61c51aaadd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAmbientLight2(ptr: Pointer?): WithDefault = IAmbientLight2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAmbientLight2 {
      val address = segment.toRawLongValue()
      return makeIAmbientLight2(Pointer(address))
    }

    public override fun toNative(obj: IAmbientLight2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1344150757_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAmbientLight2): Array<IAmbientLight2?> = (elements as
        Array<IAmbientLight2?>).castToImpl<IAmbientLight2,IAmbientLight2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAmbientLight2?> =
        arrayOfNulls<IAmbientLight2_Impl>(size) as Array<IAmbientLight2?>
  }
}
