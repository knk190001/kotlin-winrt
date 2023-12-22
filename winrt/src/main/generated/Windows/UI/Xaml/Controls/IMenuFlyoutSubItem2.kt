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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMenuFlyoutSubItem2.ABI::class)
@Signature("{ac935626-190a-4de2-8d71-7cc4747da580}")
@Guid("ac935626190a4de28d717cc4747da580")
@WinRTInterface("ac935626190a4de28d717cc4747da580")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutSubItem2.ByReference::class)
public interface IMenuFlyoutSubItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Icon(): IconElement?

  @InterfaceMethod(1)
  public fun put_Icon(value: IconElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutSubItem2> {
    public override fun getValue() = ABI.makeIMenuFlyoutSubItem2(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutSubItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutSubItem2 {
    public val __2049499285_Ptr: Pointer?

    public val _2049499285_VtblPtr: Pointer?
      get() = __2049499285_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _2049499285_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__2049499285_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _2049499285_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2049499285_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMenuFlyoutSubItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2049499285_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutSubItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac935626190a4de28d717cc4747da580")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutSubItem2(ptr: Pointer?): WithDefault = IMenuFlyoutSubItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutSubItem2 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutSubItem2(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutSubItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2049499285_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutSubItem2): Array<IMenuFlyoutSubItem2?> =
        (elements as
        Array<IMenuFlyoutSubItem2?>).castToImpl<IMenuFlyoutSubItem2,IMenuFlyoutSubItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutSubItem2?> =
        arrayOfNulls<IMenuFlyoutSubItem2_Impl>(size) as Array<IMenuFlyoutSubItem2?>
  }
}
