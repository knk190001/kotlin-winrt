package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IRoutedEventArgs.ABI::class)
@Signature("{5c985ac6-d802-4b38-a223-bf070c43fedf}")
@Guid("5c985ac6d8024b38a223bf070c43fedf")
@WinRTInterface("5c985ac6d8024b38a223bf070c43fedf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRoutedEventArgs.ByReference::class)
public interface IRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OriginalSource(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRoutedEventArgs> {
    public override fun getValue() = ABI.makeIRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRoutedEventArgs {
    public val __1237115146_Ptr: Pointer?

    public val _1237115146_VtblPtr: Pointer?
      get() = __1237115146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OriginalSource(): IUnknown? {
      val fnPtr = _1237115146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1237115146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237115146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c985ac6d8024b38a223bf070c43fedf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRoutedEventArgs(ptr: Pointer?): WithDefault = IRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237115146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRoutedEventArgs): Array<IRoutedEventArgs?> = (elements as
        Array<IRoutedEventArgs?>).castToImpl<IRoutedEventArgs,IRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRoutedEventArgs?> =
        arrayOfNulls<IRoutedEventArgs_Impl>(size) as Array<IRoutedEventArgs?>
  }
}
