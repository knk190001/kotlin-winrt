package Windows.UI.Input

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IRadialControllerMenu.ABI::class)
@Signature("{8506b35d-f640-4412-aba0-bad077e5ea8a}")
@Guid("8506b35df6404412aba0bad077e5ea8a")
@WinRTInterface("8506b35df6404412aba0bad077e5ea8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerMenu.ByReference::class)
public interface IRadialControllerMenu : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVector<RadialControllerMenuItem?>?

  @InterfaceMethod(1)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun GetSelectedMenuItem(): RadialControllerMenuItem?

  @InterfaceMethod(4)
  public fun SelectMenuItem(menuItem: RadialControllerMenuItem?): Unit

  @InterfaceMethod(5)
  public fun TrySelectPreviouslySelectedMenuItem(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerMenu> {
    public override fun getValue() = ABI.makeIRadialControllerMenu(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerMenu_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerMenu {
    public val __520776936_Ptr: Pointer?

    public val _520776936_VtblPtr: Pointer?
      get() = __520776936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVector<RadialControllerMenuItem?>? {
      val fnPtr = _520776936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<RadialControllerMenuItem?>>()
      val hr = fn.invokeHR(arrayOf(__520776936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<RadialControllerMenuItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _520776936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__520776936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _520776936_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__520776936_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetSelectedMenuItem(): RadialControllerMenuItem? {
      val fnPtr = _520776936_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerMenuItem>()
      val hr = fn.invokeHR(arrayOf(__520776936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerMenuItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SelectMenuItem(menuItem: RadialControllerMenuItem?): Unit {
      val fnPtr = _520776936_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__520776936_Ptr, marshalToNative(menuItem),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun TrySelectPreviouslySelectedMenuItem(): Boolean {
      val fnPtr = _520776936_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__520776936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRadialControllerMenu_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __520776936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerMenu, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8506b35df6404412aba0bad077e5ea8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerMenu(ptr: Pointer?): WithDefault =
        IRadialControllerMenu_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerMenu {
      val address = segment.toRawLongValue()
      return makeIRadialControllerMenu(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerMenu): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__520776936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerMenu): Array<IRadialControllerMenu?> =
        (elements as
        Array<IRadialControllerMenu?>).castToImpl<IRadialControllerMenu,IRadialControllerMenu_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerMenu?> =
        arrayOfNulls<IRadialControllerMenu_Impl>(size) as Array<IRadialControllerMenu?>
  }
}
