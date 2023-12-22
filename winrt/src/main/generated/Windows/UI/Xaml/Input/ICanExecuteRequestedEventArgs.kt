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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICanExecuteRequestedEventArgs.ABI::class)
@Signature("{c8e75256-1950-505d-993b-75907ef96830}")
@Guid("c8e752561950505d993b75907ef96830")
@WinRTInterface("c8e752561950505d993b75907ef96830")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICanExecuteRequestedEventArgs.ByReference::class)
public interface ICanExecuteRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parameter(): IUnknown?

  @InterfaceMethod(1)
  public fun get_CanExecute(): Boolean

  @InterfaceMethod(2)
  public fun put_CanExecute(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICanExecuteRequestedEventArgs> {
    public override fun getValue() = ABI.makeICanExecuteRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICanExecuteRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICanExecuteRequestedEventArgs {
    public val __1009782012_Ptr: Pointer?

    public val _1009782012_VtblPtr: Pointer?
      get() = __1009782012_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameter(): IUnknown? {
      val fnPtr = _1009782012_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1009782012_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanExecute(): Boolean {
      val fnPtr = _1009782012_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1009782012_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_CanExecute(value: Boolean): Unit {
      val fnPtr = _1009782012_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1009782012_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICanExecuteRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1009782012_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICanExecuteRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8e752561950505d993b75907ef96830")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICanExecuteRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICanExecuteRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICanExecuteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICanExecuteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICanExecuteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1009782012_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICanExecuteRequestedEventArgs):
        Array<ICanExecuteRequestedEventArgs?> = (elements as
        Array<ICanExecuteRequestedEventArgs?>).castToImpl<ICanExecuteRequestedEventArgs,ICanExecuteRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICanExecuteRequestedEventArgs?> =
        arrayOfNulls<ICanExecuteRequestedEventArgs_Impl>(size) as
        Array<ICanExecuteRequestedEventArgs?>
  }
}
