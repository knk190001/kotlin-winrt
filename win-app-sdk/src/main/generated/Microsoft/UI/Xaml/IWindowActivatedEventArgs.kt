package Microsoft.UI.Xaml

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

@ABIMarker(IWindowActivatedEventArgs.ABI::class)
@Signature("{c723a5ea-82c4-5dd6-861b-70ef573b88d6}")
@Guid("c723a5ea82c45dd6861b70ef573b88d6")
@WinRTInterface("c723a5ea82c45dd6861b70ef573b88d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowActivatedEventArgs.ByReference::class)
public interface IWindowActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_WindowActivationState(): WindowActivationState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowActivatedEventArgs> {
    public override fun getValue() = ABI.makeIWindowActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWindowActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowActivatedEventArgs {
    public val __288635677_Ptr: Pointer?

    public val _288635677_VtblPtr: Pointer?
      get() = __288635677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _288635677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__288635677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _288635677_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__288635677_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_WindowActivationState(): WindowActivationState? {
      val fnPtr = _288635677_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowActivationState>()
      val hr = fn.invokeHR(arrayOf(__288635677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowActivationState>(result.getValue())
      return resultValue
    }
  }

  public class IWindowActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __288635677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c723a5ea82c45dd6861b70ef573b88d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowActivatedEventArgs(ptr: Pointer?): WithDefault =
        IWindowActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWindowActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWindowActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__288635677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowActivatedEventArgs):
        Array<IWindowActivatedEventArgs?> = (elements as
        Array<IWindowActivatedEventArgs?>).castToImpl<IWindowActivatedEventArgs,IWindowActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowActivatedEventArgs?> =
        arrayOfNulls<IWindowActivatedEventArgs_Impl>(size) as Array<IWindowActivatedEventArgs?>
  }
}
