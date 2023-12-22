package Microsoft.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBoxTextSubmittedEventArgs.ABI::class)
@Signature("{0d7a9794-73b5-585e-bfbb-de6df7eb9fcf}")
@Guid("0d7a979473b5585ebfbbde6df7eb9fcf")
@WinRTInterface("0d7a979473b5585ebfbbde6df7eb9fcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxTextSubmittedEventArgs.ByReference::class)
public interface IComboBoxTextSubmittedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxTextSubmittedEventArgs> {
    public override fun getValue() = ABI.makeIComboBoxTextSubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IComboBoxTextSubmittedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxTextSubmittedEventArgs {
    public val __1930724051_Ptr: Pointer?

    public val _1930724051_VtblPtr: Pointer?
      get() = __1930724051_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _1930724051_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1930724051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1930724051_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1930724051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1930724051_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1930724051_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBoxTextSubmittedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1930724051_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxTextSubmittedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d7a979473b5585ebfbbde6df7eb9fcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxTextSubmittedEventArgs(ptr: Pointer?): WithDefault =
        IComboBoxTextSubmittedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxTextSubmittedEventArgs {
      val address = segment.toRawLongValue()
      return makeIComboBoxTextSubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxTextSubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1930724051_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxTextSubmittedEventArgs):
        Array<IComboBoxTextSubmittedEventArgs?> = (elements as
        Array<IComboBoxTextSubmittedEventArgs?>).castToImpl<IComboBoxTextSubmittedEventArgs,IComboBoxTextSubmittedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxTextSubmittedEventArgs?> =
        arrayOfNulls<IComboBoxTextSubmittedEventArgs_Impl>(size) as
        Array<IComboBoxTextSubmittedEventArgs?>
  }
}
