package Microsoft.UI.Xaml.Input

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
@Signature("{e4bf6d7d-f6eb-53ca-a2d4-c741ec871e38}")
@Guid("e4bf6d7df6eb53caa2d4c741ec871e38")
@WinRTInterface("e4bf6d7df6eb53caa2d4c741ec871e38")
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
    public val __738338745_Ptr: Pointer?

    public val _738338745_VtblPtr: Pointer?
      get() = __738338745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameter(): IUnknown? {
      val fnPtr = _738338745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__738338745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanExecute(): Boolean {
      val fnPtr = _738338745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__738338745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_CanExecute(value: Boolean): Unit {
      val fnPtr = _738338745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__738338745_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICanExecuteRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __738338745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICanExecuteRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4bf6d7df6eb53caa2d4c741ec871e38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICanExecuteRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICanExecuteRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICanExecuteRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICanExecuteRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICanExecuteRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__738338745_Ptr))
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
