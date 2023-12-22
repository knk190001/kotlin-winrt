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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRedirectVisual.ABI::class)
@Signature("{6c10081a-cde1-50d9-ac05-78d6845b656f}")
@Guid("6c10081acde150d9ac0578d6845b656f")
@WinRTInterface("6c10081acde150d9ac0578d6845b656f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRedirectVisual.ByReference::class)
public interface IRedirectVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): Visual?

  @InterfaceMethod(1)
  public fun put_Source(value: Visual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRedirectVisual> {
    public override fun getValue() = ABI.makeIRedirectVisual(pointer.getPointer(0))

    public fun setValue(value: IRedirectVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRedirectVisual {
    public val __1450000021_Ptr: Pointer?

    public val _1450000021_VtblPtr: Pointer?
      get() = __1450000021_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): Visual? {
      val fnPtr = _1450000021_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1450000021_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: Visual?): Unit {
      val fnPtr = _1450000021_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1450000021_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRedirectVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1450000021_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRedirectVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6c10081acde150d9ac0578d6845b656f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRedirectVisual(ptr: Pointer?): WithDefault = IRedirectVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRedirectVisual {
      val address = segment.toRawLongValue()
      return makeIRedirectVisual(Pointer(address))
    }

    public override fun toNative(obj: IRedirectVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1450000021_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRedirectVisual): Array<IRedirectVisual?> = (elements as
        Array<IRedirectVisual?>).castToImpl<IRedirectVisual,IRedirectVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRedirectVisual?> =
        arrayOfNulls<IRedirectVisual_Impl>(size) as Array<IRedirectVisual?>
  }
}
