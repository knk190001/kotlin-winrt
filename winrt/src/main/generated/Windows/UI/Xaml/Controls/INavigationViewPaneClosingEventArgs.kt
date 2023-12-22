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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewPaneClosingEventArgs.ABI::class)
@Signature("{955575ba-75f5-432d-b49b-60e47552d5ee}")
@Guid("955575ba75f5432db49b60e47552d5ee")
@WinRTInterface("955575ba75f5432db49b60e47552d5ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewPaneClosingEventArgs.ByReference::class)
public interface INavigationViewPaneClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewPaneClosingEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewPaneClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewPaneClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewPaneClosingEventArgs {
    public val __1279909249_Ptr: Pointer?

    public val _1279909249_VtblPtr: Pointer?
      get() = __1279909249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1279909249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1279909249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1279909249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1279909249_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INavigationViewPaneClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1279909249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewPaneClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("955575ba75f5432db49b60e47552d5ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewPaneClosingEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewPaneClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewPaneClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewPaneClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewPaneClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1279909249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewPaneClosingEventArgs):
        Array<INavigationViewPaneClosingEventArgs?> = (elements as
        Array<INavigationViewPaneClosingEventArgs?>).castToImpl<INavigationViewPaneClosingEventArgs,INavigationViewPaneClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewPaneClosingEventArgs?> =
        arrayOfNulls<INavigationViewPaneClosingEventArgs_Impl>(size) as
        Array<INavigationViewPaneClosingEventArgs?>
  }
}
