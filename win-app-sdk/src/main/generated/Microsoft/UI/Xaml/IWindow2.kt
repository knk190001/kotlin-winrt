package Microsoft.UI.Xaml

import Microsoft.UI.Windowing.AppWindow
import Microsoft.UI.Xaml.Media.SystemBackdrop
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

@ABIMarker(IWindow2.ABI::class)
@Signature("{42febaa5-1c32-522a-a591-57618c6f665d}")
@Guid("42febaa51c32522aa59157618c6f665d")
@WinRTInterface("42febaa51c32522aa59157618c6f665d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindow2.ByReference::class)
public interface IWindow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SystemBackdrop(): SystemBackdrop?

  @InterfaceMethod(1)
  public fun put_SystemBackdrop(value: SystemBackdrop?): Unit

  @InterfaceMethod(2)
  public fun get_AppWindow(): AppWindow?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindow2> {
    public override fun getValue() = ABI.makeIWindow2(pointer.getPointer(0))

    public fun setValue(value: IWindow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindow2 {
    public val __596026341_Ptr: Pointer?

    public val _596026341_VtblPtr: Pointer?
      get() = __596026341_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SystemBackdrop(): SystemBackdrop? {
      val fnPtr = _596026341_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdrop>()
      val hr = fn.invokeHR(arrayOf(__596026341_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdrop>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SystemBackdrop(value: SystemBackdrop?): Unit {
      val fnPtr = _596026341_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__596026341_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppWindow(): AppWindow? {
      val fnPtr = _596026341_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindow>()
      val hr = fn.invokeHR(arrayOf(__596026341_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindow>(result.getValue())
      return resultValue
    }
  }

  public class IWindow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __596026341_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42febaa51c32522aa59157618c6f665d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindow2(ptr: Pointer?): WithDefault = IWindow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindow2 {
      val address = segment.toRawLongValue()
      return makeIWindow2(Pointer(address))
    }

    public override fun toNative(obj: IWindow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__596026341_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindow2): Array<IWindow2?> = (elements as
        Array<IWindow2?>).castToImpl<IWindow2,IWindow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindow2?> = arrayOfNulls<IWindow2_Impl>(size) as
        Array<IWindow2?>
  }
}
