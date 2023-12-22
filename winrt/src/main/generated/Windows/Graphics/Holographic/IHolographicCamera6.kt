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

@ABIMarker(IHolographicCamera6.ABI::class)
@Signature("{0209194f-632d-5154-ab52-0b5d15b12505}")
@Guid("0209194f632d5154ab520b5d15b12505")
@WinRTInterface("0209194f632d5154ab520b5d15b12505")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCamera6.ByReference::class)
public interface IHolographicCamera6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewConfiguration(): HolographicViewConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCamera6> {
    public override fun getValue() = ABI.makeIHolographicCamera6(pointer.getPointer(0))

    public fun setValue(value: IHolographicCamera6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCamera6 {
    public val __2125569866_Ptr: Pointer?

    public val _2125569866_VtblPtr: Pointer?
      get() = __2125569866_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewConfiguration(): HolographicViewConfiguration? {
      val fnPtr = _2125569866_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicViewConfiguration>()
      val hr = fn.invokeHR(arrayOf(__2125569866_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicViewConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicCamera6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2125569866_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCamera6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0209194f632d5154ab520b5d15b12505")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCamera6(ptr: Pointer?): WithDefault = IHolographicCamera6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCamera6 {
      val address = segment.toRawLongValue()
      return makeIHolographicCamera6(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCamera6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2125569866_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCamera6): Array<IHolographicCamera6?> =
        (elements as
        Array<IHolographicCamera6?>).castToImpl<IHolographicCamera6,IHolographicCamera6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCamera6?> =
        arrayOfNulls<IHolographicCamera6_Impl>(size) as Array<IHolographicCamera6?>
  }
}
