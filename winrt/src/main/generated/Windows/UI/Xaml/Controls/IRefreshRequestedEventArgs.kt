package Windows.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRefreshRequestedEventArgs.ABI::class)
@Signature("{1b089f43-cfcf-4ac6-b31f-8dab6eefdd93}")
@Guid("1b089f43cfcf4ac6b31f8dab6eefdd93")
@WinRTInterface("1b089f43cfcf4ac6b31f8dab6eefdd93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshRequestedEventArgs.ByReference::class)
public interface IRefreshRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshRequestedEventArgs> {
    public override fun getValue() = ABI.makeIRefreshRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRefreshRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshRequestedEventArgs {
    public val __152209512_Ptr: Pointer?

    public val _152209512_VtblPtr: Pointer?
      get() = __152209512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _152209512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__152209512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IRefreshRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __152209512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b089f43cfcf4ac6b31f8dab6eefdd93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshRequestedEventArgs(ptr: Pointer?): WithDefault =
        IRefreshRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRefreshRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRefreshRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__152209512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshRequestedEventArgs):
        Array<IRefreshRequestedEventArgs?> = (elements as
        Array<IRefreshRequestedEventArgs?>).castToImpl<IRefreshRequestedEventArgs,IRefreshRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshRequestedEventArgs?> =
        arrayOfNulls<IRefreshRequestedEventArgs_Impl>(size) as Array<IRefreshRequestedEventArgs?>
  }
}
