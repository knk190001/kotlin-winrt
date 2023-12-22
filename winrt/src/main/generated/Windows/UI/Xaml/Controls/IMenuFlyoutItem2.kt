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

@ABIMarker(IMenuFlyoutItem2.ABI::class)
@Signature("{0ae266eb-028c-4423-a8e3-989fd9dd7126}")
@Guid("0ae266eb028c4423a8e3989fd9dd7126")
@WinRTInterface("0ae266eb028c4423a8e3989fd9dd7126")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItem2.ByReference::class)
public interface IMenuFlyoutItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Icon(): IconElement?

  @InterfaceMethod(1)
  public fun put_Icon(value: IconElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItem2> {
    public override fun getValue() = ABI.makeIMenuFlyoutItem2(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItem2 {
    public val __171815991_Ptr: Pointer?

    public val _171815991_VtblPtr: Pointer?
      get() = __171815991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _171815991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__171815991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _171815991_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__171815991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMenuFlyoutItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __171815991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ae266eb028c4423a8e3989fd9dd7126")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItem2(ptr: Pointer?): WithDefault = IMenuFlyoutItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItem2 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItem2(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__171815991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItem2): Array<IMenuFlyoutItem2?> = (elements as
        Array<IMenuFlyoutItem2?>).castToImpl<IMenuFlyoutItem2,IMenuFlyoutItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItem2?> =
        arrayOfNulls<IMenuFlyoutItem2_Impl>(size) as Array<IMenuFlyoutItem2?>
  }
}
