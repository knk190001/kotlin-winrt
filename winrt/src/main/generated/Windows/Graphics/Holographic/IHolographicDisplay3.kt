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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicDisplay3.ABI::class)
@Signature("{fc4c6ac6-6480-5008-b29e-157d77c843f7}")
@Guid("fc4c6ac664805008b29e157d77c843f7")
@WinRTInterface("fc4c6ac664805008b29e157d77c843f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicDisplay3.ByReference::class)
public interface IHolographicDisplay3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetViewConfiguration(kind: HolographicViewConfigurationKind?):
      HolographicViewConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicDisplay3> {
    public override fun getValue() = ABI.makeIHolographicDisplay3(pointer.getPointer(0))

    public fun setValue(value: IHolographicDisplay3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicDisplay3 {
    public val __1033494196_Ptr: Pointer?

    public val _1033494196_VtblPtr: Pointer?
      get() = __1033494196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetViewConfiguration(kind: HolographicViewConfigurationKind?):
        HolographicViewConfiguration? {
      val fnPtr = _1033494196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicViewConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1033494196_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicViewConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicDisplay3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1033494196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicDisplay3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc4c6ac664805008b29e157d77c843f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicDisplay3(ptr: Pointer?): WithDefault = IHolographicDisplay3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicDisplay3 {
      val address = segment.toRawLongValue()
      return makeIHolographicDisplay3(Pointer(address))
    }

    public override fun toNative(obj: IHolographicDisplay3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1033494196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicDisplay3): Array<IHolographicDisplay3?> =
        (elements as
        Array<IHolographicDisplay3?>).castToImpl<IHolographicDisplay3,IHolographicDisplay3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicDisplay3?> =
        arrayOfNulls<IHolographicDisplay3_Impl>(size) as Array<IHolographicDisplay3?>
  }
}
