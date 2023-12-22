package Microsoft.UI.Xaml

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

@ABIMarker(IWindowVisibilityChangedEventArgs.ABI::class)
@Signature("{7bb24a6d-070c-5cb6-8e9c-547905be8265}")
@Guid("7bb24a6d070c5cb68e9c547905be8265")
@WinRTInterface("7bb24a6d070c5cb68e9c547905be8265")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowVisibilityChangedEventArgs.ByReference::class)
public interface IWindowVisibilityChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Visible(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowVisibilityChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIWindowVisibilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowVisibilityChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowVisibilityChangedEventArgs {
    public val __1632965172_Ptr: Pointer?

    public val _1632965172_VtblPtr: Pointer?
      get() = __1632965172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1632965172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1632965172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1632965172_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1632965172_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Visible(): Boolean {
      val fnPtr = _1632965172_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1632965172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWindowVisibilityChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1632965172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowVisibilityChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bb24a6d070c5cb68e9c547905be8265")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowVisibilityChangedEventArgs(ptr: Pointer?): WithDefault =
        IWindowVisibilityChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowVisibilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowVisibilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowVisibilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1632965172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowVisibilityChangedEventArgs):
        Array<IWindowVisibilityChangedEventArgs?> = (elements as
        Array<IWindowVisibilityChangedEventArgs?>).castToImpl<IWindowVisibilityChangedEventArgs,IWindowVisibilityChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowVisibilityChangedEventArgs?> =
        arrayOfNulls<IWindowVisibilityChangedEventArgs_Impl>(size) as
        Array<IWindowVisibilityChangedEventArgs?>
  }
}
