package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IFlyoutBaseClosingEventArgs.ABI::class)
@Signature("{d075852d-b09a-4fd1-b005-db2ba01206fb}")
@Guid("d075852db09a4fd1b005db2ba01206fb")
@WinRTInterface("d075852db09a4fd1b005db2ba01206fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseClosingEventArgs.ByReference::class)
public interface IFlyoutBaseClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseClosingEventArgs> {
    public override fun getValue() = ABI.makeIFlyoutBaseClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseClosingEventArgs {
    public val __1641784522_Ptr: Pointer?

    public val _1641784522_VtblPtr: Pointer?
      get() = __1641784522_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1641784522_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1641784522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1641784522_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1641784522_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBaseClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1641784522_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d075852db09a4fd1b005db2ba01206fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseClosingEventArgs(ptr: Pointer?): WithDefault =
        IFlyoutBaseClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1641784522_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseClosingEventArgs):
        Array<IFlyoutBaseClosingEventArgs?> = (elements as
        Array<IFlyoutBaseClosingEventArgs?>).castToImpl<IFlyoutBaseClosingEventArgs,IFlyoutBaseClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseClosingEventArgs?> =
        arrayOfNulls<IFlyoutBaseClosingEventArgs_Impl>(size) as Array<IFlyoutBaseClosingEventArgs?>
  }
}
