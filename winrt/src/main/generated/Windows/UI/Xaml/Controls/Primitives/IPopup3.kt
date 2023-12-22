package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPopup3.ABI::class)
@Signature("{f9c46915-a65c-5f68-9f54-310a1b51095f}")
@Guid("f9c46915a65c5f689f54310a1b51095f")
@WinRTInterface("f9c46915a65c5f689f54310a1b51095f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopup3.ByReference::class)
public interface IPopup3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldConstrainToRootBounds(): Boolean

  @InterfaceMethod(1)
  public fun put_ShouldConstrainToRootBounds(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsConstrainedToRootBounds(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopup3> {
    public override fun getValue() = ABI.makeIPopup3(pointer.getPointer(0))

    public fun setValue(value: IPopup3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopup3 {
    public val __1185883421_Ptr: Pointer?

    public val _1185883421_VtblPtr: Pointer?
      get() = __1185883421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldConstrainToRootBounds(): Boolean {
      val fnPtr = _1185883421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1185883421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ShouldConstrainToRootBounds(value: Boolean): Unit {
      val fnPtr = _1185883421_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1185883421_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsConstrainedToRootBounds(): Boolean {
      val fnPtr = _1185883421_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1185883421_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPopup3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1185883421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopup3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9c46915a65c5f689f54310a1b51095f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopup3(ptr: Pointer?): WithDefault = IPopup3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopup3 {
      val address = segment.toRawLongValue()
      return makeIPopup3(Pointer(address))
    }

    public override fun toNative(obj: IPopup3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1185883421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopup3): Array<IPopup3?> = (elements as
        Array<IPopup3?>).castToImpl<IPopup3,IPopup3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopup3?> = arrayOfNulls<IPopup3_Impl>(size) as
        Array<IPopup3?>
  }
}
