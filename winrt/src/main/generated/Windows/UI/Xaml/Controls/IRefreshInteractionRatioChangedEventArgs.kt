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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRefreshInteractionRatioChangedEventArgs.ABI::class)
@Signature("{d7e47820-dc47-4b8e-bb27-7f0a83f29a07}")
@Guid("d7e47820dc474b8ebb277f0a83f29a07")
@WinRTInterface("d7e47820dc474b8ebb277f0a83f29a07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshInteractionRatioChangedEventArgs.ByReference::class)
public interface IRefreshInteractionRatioChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionRatio(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshInteractionRatioChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIRefreshInteractionRatioChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRefreshInteractionRatioChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshInteractionRatioChangedEventArgs {
    public val __877119707_Ptr: Pointer?

    public val _877119707_VtblPtr: Pointer?
      get() = __877119707_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionRatio(): Double {
      val fnPtr = _877119707_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__877119707_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IRefreshInteractionRatioChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __877119707_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshInteractionRatioChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7e47820dc474b8ebb277f0a83f29a07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshInteractionRatioChangedEventArgs(ptr: Pointer?): WithDefault =
        IRefreshInteractionRatioChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRefreshInteractionRatioChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRefreshInteractionRatioChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRefreshInteractionRatioChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__877119707_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshInteractionRatioChangedEventArgs):
        Array<IRefreshInteractionRatioChangedEventArgs?> = (elements as
        Array<IRefreshInteractionRatioChangedEventArgs?>).castToImpl<IRefreshInteractionRatioChangedEventArgs,IRefreshInteractionRatioChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshInteractionRatioChangedEventArgs?> =
        arrayOfNulls<IRefreshInteractionRatioChangedEventArgs_Impl>(size) as
        Array<IRefreshInteractionRatioChangedEventArgs?>
  }
}
