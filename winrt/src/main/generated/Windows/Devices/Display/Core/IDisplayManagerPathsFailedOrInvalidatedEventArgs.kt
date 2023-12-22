package Windows.Devices.Display.Core

import Windows.Foundation.Deferral
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

@ABIMarker(IDisplayManagerPathsFailedOrInvalidatedEventArgs.ABI::class)
@Signature("{03a65659-1dec-5c15-b2a2-8fe9129869fe}")
@Guid("03a656591dec5c15b2a28fe9129869fe")
@WinRTInterface("03a656591dec5c15b2a28fe9129869fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayManagerPathsFailedOrInvalidatedEventArgs.ByReference::class)
public interface IDisplayManagerPathsFailedOrInvalidatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayManagerPathsFailedOrInvalidatedEventArgs> {
    public override fun getValue() =
        ABI.makeIDisplayManagerPathsFailedOrInvalidatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDisplayManagerPathsFailedOrInvalidatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayManagerPathsFailedOrInvalidatedEventArgs {
    public val __1683554769_Ptr: Pointer?

    public val _1683554769_VtblPtr: Pointer?
      get() = __1683554769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1683554769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1683554769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1683554769_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683554769_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1683554769_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1683554769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayManagerPathsFailedOrInvalidatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1683554769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayManagerPathsFailedOrInvalidatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03a656591dec5c15b2a28fe9129869fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayManagerPathsFailedOrInvalidatedEventArgs(ptr: Pointer?): WithDefault =
        IDisplayManagerPathsFailedOrInvalidatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDisplayManagerPathsFailedOrInvalidatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDisplayManagerPathsFailedOrInvalidatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDisplayManagerPathsFailedOrInvalidatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1683554769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayManagerPathsFailedOrInvalidatedEventArgs):
        Array<IDisplayManagerPathsFailedOrInvalidatedEventArgs?> = (elements as
        Array<IDisplayManagerPathsFailedOrInvalidatedEventArgs?>).castToImpl<IDisplayManagerPathsFailedOrInvalidatedEventArgs,IDisplayManagerPathsFailedOrInvalidatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayManagerPathsFailedOrInvalidatedEventArgs?>
        = arrayOfNulls<IDisplayManagerPathsFailedOrInvalidatedEventArgs_Impl>(size) as
        Array<IDisplayManagerPathsFailedOrInvalidatedEventArgs?>
  }
}
