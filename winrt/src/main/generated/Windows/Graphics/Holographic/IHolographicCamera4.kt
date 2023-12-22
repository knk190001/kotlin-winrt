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

@ABIMarker(IHolographicCamera4.ABI::class)
@Signature("{9a2531d6-4723-4f39-a9a5-9d05181d9b44}")
@Guid("9a2531d647234f39a9a59d05181d9b44")
@WinRTInterface("9a2531d647234f39a9a59d05181d9b44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicCamera4.ByReference::class)
public interface IHolographicCamera4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanOverrideViewport(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicCamera4> {
    public override fun getValue() = ABI.makeIHolographicCamera4(pointer.getPointer(0))

    public fun setValue(value: IHolographicCamera4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicCamera4 {
    public val __2125569868_Ptr: Pointer?

    public val _2125569868_VtblPtr: Pointer?
      get() = __2125569868_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanOverrideViewport(): Boolean {
      val fnPtr = _2125569868_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2125569868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHolographicCamera4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2125569868_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicCamera4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a2531d647234f39a9a59d05181d9b44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicCamera4(ptr: Pointer?): WithDefault = IHolographicCamera4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicCamera4 {
      val address = segment.toRawLongValue()
      return makeIHolographicCamera4(Pointer(address))
    }

    public override fun toNative(obj: IHolographicCamera4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2125569868_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicCamera4): Array<IHolographicCamera4?> =
        (elements as
        Array<IHolographicCamera4?>).castToImpl<IHolographicCamera4,IHolographicCamera4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicCamera4?> =
        arrayOfNulls<IHolographicCamera4_Impl>(size) as Array<IHolographicCamera4?>
  }
}
