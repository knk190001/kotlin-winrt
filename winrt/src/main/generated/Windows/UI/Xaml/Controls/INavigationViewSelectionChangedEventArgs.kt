package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewSelectionChangedEventArgs.ABI::class)
@Signature("{5aa509a0-3a5e-4f54-896c-98b85f819508}")
@Guid("5aa509a03a5e4f54896c98b85f819508")
@WinRTInterface("5aa509a03a5e4f54896c98b85f819508")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewSelectionChangedEventArgs.ByReference::class)
public interface INavigationViewSelectionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedItem(): IUnknown?

  @InterfaceMethod(1)
  public fun get_IsSettingsSelected(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewSelectionChangedEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewSelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewSelectionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewSelectionChangedEventArgs {
    public val __1023279994_Ptr: Pointer?

    public val _1023279994_VtblPtr: Pointer?
      get() = __1023279994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _1023279994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1023279994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSettingsSelected(): Boolean {
      val fnPtr = _1023279994_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1023279994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigationViewSelectionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1023279994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewSelectionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5aa509a03a5e4f54896c98b85f819508")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewSelectionChangedEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewSelectionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewSelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewSelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewSelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1023279994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewSelectionChangedEventArgs):
        Array<INavigationViewSelectionChangedEventArgs?> = (elements as
        Array<INavigationViewSelectionChangedEventArgs?>).castToImpl<INavigationViewSelectionChangedEventArgs,INavigationViewSelectionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewSelectionChangedEventArgs?> =
        arrayOfNulls<INavigationViewSelectionChangedEventArgs_Impl>(size) as
        Array<INavigationViewSelectionChangedEventArgs?>
  }
}
