package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IRangeBaseOverrides.ABI::class)
@Signature("{b3deb76f-68a6-5c14-a824-ab58e8774745}")
@Guid("b3deb76f68a65c14a824ab58e8774745")
@WinRTInterface("b3deb76f68a65c14a824ab58e8774745")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeBaseOverrides.ByReference::class)
public interface IRangeBaseOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnMinimumChanged(oldMinimum: Double, newMinimum: Double): Unit

  @InterfaceMethod(1)
  public fun OnMaximumChanged(oldMaximum: Double, newMaximum: Double): Unit

  @InterfaceMethod(2)
  public fun OnValueChanged(oldValue: Double, newValue: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeBaseOverrides> {
    public override fun getValue() = ABI.makeIRangeBaseOverrides(pointer.getPointer(0))

    public fun setValue(value: IRangeBaseOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeBaseOverrides {
    public val __1771524650_Ptr: Pointer?

    public val _1771524650_VtblPtr: Pointer?
      get() = __1771524650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnMinimumChanged(oldMinimum: Double, newMinimum: Double): Unit {
      val fnPtr = _1771524650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1771524650_Ptr, oldMinimum, newMinimum,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnMaximumChanged(oldMaximum: Double, newMaximum: Double): Unit {
      val fnPtr = _1771524650_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1771524650_Ptr, oldMaximum, newMaximum,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnValueChanged(oldValue: Double, newValue: Double): Unit {
      val fnPtr = _1771524650_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1771524650_Ptr, oldValue, newValue,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRangeBaseOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1771524650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeBaseOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3deb76f68a65c14a824ab58e8774745")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeBaseOverrides(ptr: Pointer?): WithDefault = IRangeBaseOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeBaseOverrides {
      val address = segment.toRawLongValue()
      return makeIRangeBaseOverrides(Pointer(address))
    }

    public override fun toNative(obj: IRangeBaseOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1771524650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeBaseOverrides): Array<IRangeBaseOverrides?> =
        (elements as
        Array<IRangeBaseOverrides?>).castToImpl<IRangeBaseOverrides,IRangeBaseOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeBaseOverrides?> =
        arrayOfNulls<IRangeBaseOverrides_Impl>(size) as Array<IRangeBaseOverrides?>
  }
}
