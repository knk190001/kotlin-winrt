package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IUserControl.ABI::class)
@Signature("{ab8a0a51-44cf-5337-ad77-8eda1795e9f6}")
@Guid("ab8a0a5144cf5337ad778eda1795e9f6")
@WinRTInterface("ab8a0a5144cf5337ad778eda1795e9f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserControl.ByReference::class)
public interface IUserControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): UIElement?

  @InterfaceMethod(1)
  public fun put_Content(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserControl> {
    public override fun getValue() = ABI.makeIUserControl(pointer.getPointer(0))

    public fun setValue(value: IUserControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserControl {
    public val __912857365_Ptr: Pointer?

    public val _912857365_VtblPtr: Pointer?
      get() = __912857365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): UIElement? {
      val fnPtr = _912857365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__912857365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _912857365_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__912857365_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __912857365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab8a0a5144cf5337ad778eda1795e9f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserControl(ptr: Pointer?): WithDefault = IUserControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserControl {
      val address = segment.toRawLongValue()
      return makeIUserControl(Pointer(address))
    }

    public override fun toNative(obj: IUserControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__912857365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserControl): Array<IUserControl?> = (elements as
        Array<IUserControl?>).castToImpl<IUserControl,IUserControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserControl?> =
        arrayOfNulls<IUserControl_Impl>(size) as Array<IUserControl?>
  }
}
