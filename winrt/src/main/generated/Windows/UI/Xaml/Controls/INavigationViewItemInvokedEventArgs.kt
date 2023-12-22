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

@ABIMarker(INavigationViewItemInvokedEventArgs.ABI::class)
@Signature("{29496822-55d2-49fa-964b-f1dbafef85c4}")
@Guid("2949682255d249fa964bf1dbafef85c4")
@WinRTInterface("2949682255d249fa964bf1dbafef85c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemInvokedEventArgs.ByReference::class)
public interface INavigationViewItemInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InvokedItem(): IUnknown?

  @InterfaceMethod(1)
  public fun get_IsSettingsInvoked(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemInvokedEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemInvokedEventArgs {
    public val __1530944557_Ptr: Pointer?

    public val _1530944557_VtblPtr: Pointer?
      get() = __1530944557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InvokedItem(): IUnknown? {
      val fnPtr = _1530944557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1530944557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsSettingsInvoked(): Boolean {
      val fnPtr = _1530944557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1530944557_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigationViewItemInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1530944557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2949682255d249fa964bf1dbafef85c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemInvokedEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewItemInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1530944557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemInvokedEventArgs):
        Array<INavigationViewItemInvokedEventArgs?> = (elements as
        Array<INavigationViewItemInvokedEventArgs?>).castToImpl<INavigationViewItemInvokedEventArgs,INavigationViewItemInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItemInvokedEventArgs?> =
        arrayOfNulls<INavigationViewItemInvokedEventArgs_Impl>(size) as
        Array<INavigationViewItemInvokedEventArgs?>
  }
}
