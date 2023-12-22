package Windows.UI.Input

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISystemFunctionLockIndicatorChangedEventArgs.ABI::class)
@Signature("{b212b94e-7a6f-58ae-b304-bae61d0371b9}")
@Guid("b212b94e7a6f58aeb304bae61d0371b9")
@WinRTInterface("b212b94e7a6f58aeb304bae61d0371b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemFunctionLockIndicatorChangedEventArgs.ByReference::class)
public interface ISystemFunctionLockIndicatorChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_IsIndicatorOn(): Boolean

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemFunctionLockIndicatorChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISystemFunctionLockIndicatorChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISystemFunctionLockIndicatorChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemFunctionLockIndicatorChangedEventArgs {
    public val __1091051538_Ptr: Pointer?

    public val _1091051538_VtblPtr: Pointer?
      get() = __1091051538_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _1091051538_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1091051538_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsIndicatorOn(): Boolean {
      val fnPtr = _1091051538_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1091051538_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1091051538_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1091051538_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1091051538_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091051538_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemFunctionLockIndicatorChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1091051538_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemFunctionLockIndicatorChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b212b94e7a6f58aeb304bae61d0371b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemFunctionLockIndicatorChangedEventArgs(ptr: Pointer?): WithDefault =
        ISystemFunctionLockIndicatorChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISystemFunctionLockIndicatorChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISystemFunctionLockIndicatorChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISystemFunctionLockIndicatorChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1091051538_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemFunctionLockIndicatorChangedEventArgs):
        Array<ISystemFunctionLockIndicatorChangedEventArgs?> = (elements as
        Array<ISystemFunctionLockIndicatorChangedEventArgs?>).castToImpl<ISystemFunctionLockIndicatorChangedEventArgs,ISystemFunctionLockIndicatorChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemFunctionLockIndicatorChangedEventArgs?> =
        arrayOfNulls<ISystemFunctionLockIndicatorChangedEventArgs_Impl>(size) as
        Array<ISystemFunctionLockIndicatorChangedEventArgs?>
  }
}
