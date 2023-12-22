package Windows.UI.Xaml.Controls

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

@ABIMarker(IRefreshStateChangedEventArgs.ABI::class)
@Signature("{bb6c901e-21fe-4109-af80-73ec661b678a}")
@Guid("bb6c901e21fe4109af8073ec661b678a")
@WinRTInterface("bb6c901e21fe4109af8073ec661b678a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshStateChangedEventArgs.ByReference::class)
public interface IRefreshStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldState(): RefreshVisualizerState?

  @InterfaceMethod(1)
  public fun get_NewState(): RefreshVisualizerState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshStateChangedEventArgs> {
    public override fun getValue() = ABI.makeIRefreshStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRefreshStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshStateChangedEventArgs {
    public val __1263851787_Ptr: Pointer?

    public val _1263851787_VtblPtr: Pointer?
      get() = __1263851787_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldState(): RefreshVisualizerState? {
      val fnPtr = _1263851787_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshVisualizerState>()
      val hr = fn.invokeHR(arrayOf(__1263851787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshVisualizerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewState(): RefreshVisualizerState? {
      val fnPtr = _1263851787_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshVisualizerState>()
      val hr = fn.invokeHR(arrayOf(__1263851787_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshVisualizerState>(result.getValue())
      return resultValue
    }
  }

  public class IRefreshStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1263851787_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb6c901e21fe4109af8073ec661b678a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IRefreshStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRefreshStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRefreshStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1263851787_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshStateChangedEventArgs):
        Array<IRefreshStateChangedEventArgs?> = (elements as
        Array<IRefreshStateChangedEventArgs?>).castToImpl<IRefreshStateChangedEventArgs,IRefreshStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshStateChangedEventArgs?> =
        arrayOfNulls<IRefreshStateChangedEventArgs_Impl>(size) as
        Array<IRefreshStateChangedEventArgs?>
  }
}
