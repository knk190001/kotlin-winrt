package Windows.UI.Composition

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

@ABIMarker(IDistantLight2.ABI::class)
@Signature("{dbcdaa1c-294b-48d7-b60e-76df64aa392b}")
@Guid("dbcdaa1c294b48d7b60e76df64aa392b")
@WinRTInterface("dbcdaa1c294b48d7b60e76df64aa392b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDistantLight2.ByReference::class)
public interface IDistantLight2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Intensity(): Float

  @InterfaceMethod(1)
  public fun put_Intensity(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDistantLight2>
      {
    public override fun getValue() = ABI.makeIDistantLight2(pointer.getPointer(0))

    public fun setValue(value: IDistantLight2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDistantLight2 {
    public val __844432689_Ptr: Pointer?

    public val _844432689_VtblPtr: Pointer?
      get() = __844432689_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Intensity(): Float {
      val fnPtr = _844432689_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__844432689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Intensity(value: Float): Unit {
      val fnPtr = _844432689_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__844432689_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDistantLight2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __844432689_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDistantLight2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dbcdaa1c294b48d7b60e76df64aa392b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDistantLight2(ptr: Pointer?): WithDefault = IDistantLight2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDistantLight2 {
      val address = segment.toRawLongValue()
      return makeIDistantLight2(Pointer(address))
    }

    public override fun toNative(obj: IDistantLight2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__844432689_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDistantLight2): Array<IDistantLight2?> = (elements as
        Array<IDistantLight2?>).castToImpl<IDistantLight2,IDistantLight2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDistantLight2?> =
        arrayOfNulls<IDistantLight2_Impl>(size) as Array<IDistantLight2?>
  }
}
