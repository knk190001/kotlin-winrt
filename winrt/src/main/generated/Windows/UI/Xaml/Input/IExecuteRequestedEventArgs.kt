package Windows.UI.Xaml.Input

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

@ABIMarker(IExecuteRequestedEventArgs.ABI::class)
@Signature("{e07fa734-a0b6-5755-9e87-24f54cca9372}")
@Guid("e07fa734a0b657559e8724f54cca9372")
@WinRTInterface("e07fa734a0b657559e8724f54cca9372")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExecuteRequestedEventArgs.ByReference::class)
public interface IExecuteRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parameter(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExecuteRequestedEventArgs> {
    public override fun getValue() = ABI.makeIExecuteRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExecuteRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExecuteRequestedEventArgs {
    public val __1653380360_Ptr: Pointer?

    public val _1653380360_VtblPtr: Pointer?
      get() = __1653380360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameter(): IUnknown? {
      val fnPtr = _1653380360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1653380360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IExecuteRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1653380360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExecuteRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e07fa734a0b657559e8724f54cca9372")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExecuteRequestedEventArgs(ptr: Pointer?): WithDefault =
        IExecuteRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExecuteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExecuteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExecuteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1653380360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExecuteRequestedEventArgs):
        Array<IExecuteRequestedEventArgs?> = (elements as
        Array<IExecuteRequestedEventArgs?>).castToImpl<IExecuteRequestedEventArgs,IExecuteRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExecuteRequestedEventArgs?> =
        arrayOfNulls<IExecuteRequestedEventArgs_Impl>(size) as Array<IExecuteRequestedEventArgs?>
  }
}
