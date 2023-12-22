package Windows.Graphics.Holographic

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

@ABIMarker(IHolographicCamera5.ABI::class)
@Signature("{229706f2-628d-4ef5-9c08-a63fdd7787c6}")
@Guid("229706f2628d4ef59c08a63fdd7787c6")
@WinRTInterface("229706f2628d4ef59c08a63fdd7787c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCamera5.ByReference::class)
public interface IHolographicCamera5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsHardwareContentProtectionSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsHardwareContentProtectionEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsHardwareContentProtectionEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCamera5> {
    public override fun getValue() = ABI.makeIHolographicCamera5(pointer.getPointer(0))

    public fun setValue(value: IHolographicCamera5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCamera5 {
    public val __2125569867_Ptr: Pointer?

    public val _2125569867_VtblPtr: Pointer?
      get() = __2125569867_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsHardwareContentProtectionSupported(): Boolean {
      val fnPtr = _2125569867_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2125569867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsHardwareContentProtectionEnabled(): Boolean {
      val fnPtr = _2125569867_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2125569867_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsHardwareContentProtectionEnabled(value: Boolean): Unit {
      val fnPtr = _2125569867_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2125569867_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHolographicCamera5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2125569867_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCamera5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("229706f2628d4ef59c08a63fdd7787c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCamera5(ptr: Pointer?): WithDefault = IHolographicCamera5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCamera5 {
      val address = segment.toRawLongValue()
      return makeIHolographicCamera5(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCamera5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2125569867_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCamera5): Array<IHolographicCamera5?> =
        (elements as
        Array<IHolographicCamera5?>).castToImpl<IHolographicCamera5,IHolographicCamera5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCamera5?> =
        arrayOfNulls<IHolographicCamera5_Impl>(size) as Array<IHolographicCamera5?>
  }
}
