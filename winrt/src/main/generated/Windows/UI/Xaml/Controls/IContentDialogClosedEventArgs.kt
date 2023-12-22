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

@ABIMarker(IContentDialogClosedEventArgs.ABI::class)
@Signature("{905522ef-2cba-4af8-b666-cc36c22732fb}")
@Guid("905522ef2cba4af8b666cc36c22732fb")
@WinRTInterface("905522ef2cba4af8b666cc36c22732fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogClosedEventArgs.ByReference::class)
public interface IContentDialogClosedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Result(): ContentDialogResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogClosedEventArgs> {
    public override fun getValue() = ABI.makeIContentDialogClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentDialogClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogClosedEventArgs {
    public val __731734202_Ptr: Pointer?

    public val _731734202_VtblPtr: Pointer?
      get() = __731734202_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Result(): ContentDialogResult? {
      val fnPtr = _731734202_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialogResult>()
      val hr = fn.invokeHR(arrayOf(__731734202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialogResult>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialogClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __731734202_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905522ef2cba4af8b666cc36c22732fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogClosedEventArgs(ptr: Pointer?): WithDefault =
        IContentDialogClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentDialogClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__731734202_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogClosedEventArgs):
        Array<IContentDialogClosedEventArgs?> = (elements as
        Array<IContentDialogClosedEventArgs?>).castToImpl<IContentDialogClosedEventArgs,IContentDialogClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogClosedEventArgs?> =
        arrayOfNulls<IContentDialogClosedEventArgs_Impl>(size) as
        Array<IContentDialogClosedEventArgs?>
  }
}
