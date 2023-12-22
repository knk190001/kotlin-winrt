package Microsoft.UI.Xaml

import Windows.Foundation.Size
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

@ABIMarker(IWindowSizeChangedEventArgs.ABI::class)
@Signature("{542f6f2c-4b64-5c72-a7a5-3a7e0664b8ff}")
@Guid("542f6f2c4b645c72a7a53a7e0664b8ff")
@WinRTInterface("542f6f2c4b645c72a7a53a7e0664b8ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowSizeChangedEventArgs.ByReference::class)
public interface IWindowSizeChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Size(): Size?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowSizeChangedEventArgs> {
    public override fun getValue() = ABI.makeIWindowSizeChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowSizeChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowSizeChangedEventArgs {
    public val __1650492933_Ptr: Pointer?

    public val _1650492933_VtblPtr: Pointer?
      get() = __1650492933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1650492933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1650492933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1650492933_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1650492933_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Size(): Size? {
      val fnPtr = _1650492933_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1650492933_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }
  }

  public class IWindowSizeChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1650492933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowSizeChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("542f6f2c4b645c72a7a53a7e0664b8ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowSizeChangedEventArgs(ptr: Pointer?): WithDefault =
        IWindowSizeChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowSizeChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowSizeChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowSizeChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1650492933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowSizeChangedEventArgs):
        Array<IWindowSizeChangedEventArgs?> = (elements as
        Array<IWindowSizeChangedEventArgs?>).castToImpl<IWindowSizeChangedEventArgs,IWindowSizeChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowSizeChangedEventArgs?> =
        arrayOfNulls<IWindowSizeChangedEventArgs_Impl>(size) as Array<IWindowSizeChangedEventArgs?>
  }
}
