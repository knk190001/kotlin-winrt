package Windows.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStackPanel4.ABI::class)
@Signature("{43ebf7f6-3196-412e-8a95-add002ff43f0}")
@Guid("43ebf7f63196412e8a95add002ff43f0")
@WinRTInterface("43ebf7f63196412e8a95add002ff43f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackPanel4.ByReference::class)
public interface IStackPanel4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Spacing(): Double

  @InterfaceMethod(1)
  public fun put_Spacing(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStackPanel4> {
    public override fun getValue() = ABI.makeIStackPanel4(pointer.getPointer(0))

    public fun setValue(value: IStackPanel4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackPanel4 {
    public val __1695737412_Ptr: Pointer?

    public val _1695737412_VtblPtr: Pointer?
      get() = __1695737412_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Spacing(): Double {
      val fnPtr = _1695737412_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1695737412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Spacing(value: Double): Unit {
      val fnPtr = _1695737412_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1695737412_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStackPanel4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1695737412_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackPanel4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43ebf7f63196412e8a95add002ff43f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackPanel4(ptr: Pointer?): WithDefault = IStackPanel4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackPanel4 {
      val address = segment.toRawLongValue()
      return makeIStackPanel4(Pointer(address))
    }

    public override fun toNative(obj: IStackPanel4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1695737412_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackPanel4): Array<IStackPanel4?> = (elements as
        Array<IStackPanel4?>).castToImpl<IStackPanel4,IStackPanel4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackPanel4?> =
        arrayOfNulls<IStackPanel4_Impl>(size) as Array<IStackPanel4?>
  }
}
