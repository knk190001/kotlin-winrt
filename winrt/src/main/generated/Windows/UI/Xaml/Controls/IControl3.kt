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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IControl3.ABI::class)
@Signature("{077b29e4-dade-4f55-9b96-09e21b28eb1c}")
@Guid("077b29e4dade4f559b9609e21b28eb1c")
@WinRTInterface("077b29e4dade4f559b9609e21b28eb1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControl3.ByReference::class)
public interface IControl3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseSystemFocusVisuals(): Boolean

  @InterfaceMethod(1)
  public fun put_UseSystemFocusVisuals(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IControl3> {
    public override fun getValue() = ABI.makeIControl3(pointer.getPointer(0))

    public fun setValue(value: IControl3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControl3 {
    public val __1055668590_Ptr: Pointer?

    public val _1055668590_VtblPtr: Pointer?
      get() = __1055668590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseSystemFocusVisuals(): Boolean {
      val fnPtr = _1055668590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1055668590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_UseSystemFocusVisuals(value: Boolean): Unit {
      val fnPtr = _1055668590_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668590_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControl3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1055668590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControl3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("077b29e4dade4f559b9609e21b28eb1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControl3(ptr: Pointer?): WithDefault = IControl3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControl3 {
      val address = segment.toRawLongValue()
      return makeIControl3(Pointer(address))
    }

    public override fun toNative(obj: IControl3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1055668590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControl3): Array<IControl3?> = (elements as
        Array<IControl3?>).castToImpl<IControl3,IControl3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControl3?> = arrayOfNulls<IControl3_Impl>(size)
        as Array<IControl3?>
  }
}
