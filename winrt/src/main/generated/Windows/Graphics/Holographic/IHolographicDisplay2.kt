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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicDisplay2.ABI::class)
@Signature("{75ac3f82-e755-436c-8d96-4d32d131473e}")
@Guid("75ac3f82e755436c8d964d32d131473e")
@WinRTInterface("75ac3f82e755436c8d964d32d131473e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicDisplay2.ByReference::class)
public interface IHolographicDisplay2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RefreshRate(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicDisplay2> {
    public override fun getValue() = ABI.makeIHolographicDisplay2(pointer.getPointer(0))

    public fun setValue(value: IHolographicDisplay2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicDisplay2 {
    public val __1033494197_Ptr: Pointer?

    public val _1033494197_VtblPtr: Pointer?
      get() = __1033494197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RefreshRate(): Double {
      val fnPtr = _1033494197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1033494197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IHolographicDisplay2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1033494197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicDisplay2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75ac3f82e755436c8d964d32d131473e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicDisplay2(ptr: Pointer?): WithDefault = IHolographicDisplay2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicDisplay2 {
      val address = segment.toRawLongValue()
      return makeIHolographicDisplay2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicDisplay2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1033494197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicDisplay2): Array<IHolographicDisplay2?> =
        (elements as
        Array<IHolographicDisplay2?>).castToImpl<IHolographicDisplay2,IHolographicDisplay2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicDisplay2?> =
        arrayOfNulls<IHolographicDisplay2_Impl>(size) as Array<IHolographicDisplay2?>
  }
}
