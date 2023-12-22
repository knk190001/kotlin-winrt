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

@ABIMarker(ISystemFunctionButtonEventArgs.ABI::class)
@Signature("{4833896f-80d1-5dd6-92a7-62a508ffef5a}")
@Guid("4833896f80d15dd692a762a508ffef5a")
@WinRTInterface("4833896f80d15dd692a762a508ffef5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemFunctionButtonEventArgs.ByReference::class)
public interface ISystemFunctionButtonEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemFunctionButtonEventArgs> {
    public override fun getValue() = ABI.makeISystemFunctionButtonEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISystemFunctionButtonEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemFunctionButtonEventArgs {
    public val __1553575088_Ptr: Pointer?

    public val _1553575088_VtblPtr: Pointer?
      get() = __1553575088_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _1553575088_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1553575088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1553575088_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1553575088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1553575088_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1553575088_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemFunctionButtonEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1553575088_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemFunctionButtonEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4833896f80d15dd692a762a508ffef5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemFunctionButtonEventArgs(ptr: Pointer?): WithDefault =
        ISystemFunctionButtonEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemFunctionButtonEventArgs {
      val address = segment.toRawLongValue()
      return makeISystemFunctionButtonEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISystemFunctionButtonEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1553575088_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemFunctionButtonEventArgs):
        Array<ISystemFunctionButtonEventArgs?> = (elements as
        Array<ISystemFunctionButtonEventArgs?>).castToImpl<ISystemFunctionButtonEventArgs,ISystemFunctionButtonEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemFunctionButtonEventArgs?> =
        arrayOfNulls<ISystemFunctionButtonEventArgs_Impl>(size) as
        Array<ISystemFunctionButtonEventArgs?>
  }
}
