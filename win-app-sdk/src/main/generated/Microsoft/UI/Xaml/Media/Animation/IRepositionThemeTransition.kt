package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IRepositionThemeTransition.ABI::class)
@Signature("{7728e3f0-24b1-5484-824a-c0b41c2745d5}")
@Guid("7728e3f024b15484824ac0b41c2745d5")
@WinRTInterface("7728e3f024b15484824ac0b41c2745d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepositionThemeTransition.ByReference::class)
public interface IRepositionThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStaggeringEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsStaggeringEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepositionThemeTransition> {
    public override fun getValue() = ABI.makeIRepositionThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IRepositionThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepositionThemeTransition {
    public val __1810823783_Ptr: Pointer?

    public val _1810823783_VtblPtr: Pointer?
      get() = __1810823783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStaggeringEnabled(): Boolean {
      val fnPtr = _1810823783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1810823783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsStaggeringEnabled(value: Boolean): Unit {
      val fnPtr = _1810823783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1810823783_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRepositionThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1810823783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepositionThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7728e3f024b15484824ac0b41c2745d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepositionThemeTransition(ptr: Pointer?): WithDefault =
        IRepositionThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepositionThemeTransition {
      val address = segment.toRawLongValue()
      return makeIRepositionThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IRepositionThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1810823783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepositionThemeTransition):
        Array<IRepositionThemeTransition?> = (elements as
        Array<IRepositionThemeTransition?>).castToImpl<IRepositionThemeTransition,IRepositionThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepositionThemeTransition?> =
        arrayOfNulls<IRepositionThemeTransition_Impl>(size) as Array<IRepositionThemeTransition?>
  }
}
