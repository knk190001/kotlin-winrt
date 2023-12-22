package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Collections.IObservableVector
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

@ABIMarker(ICommandBarFlyout.ABI::class)
@Signature("{18e2cc40-09cb-5f20-a715-f0b2039c5e18}")
@Guid("18e2cc4009cb5f20a715f0b2039c5e18")
@WinRTInterface("18e2cc4009cb5f20a715f0b2039c5e18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyout.ByReference::class)
public interface ICommandBarFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryCommands(): IObservableVector<ICommandBarElement?>?

  @InterfaceMethod(1)
  public fun get_SecondaryCommands(): IObservableVector<ICommandBarElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyout> {
    public override fun getValue() = ABI.makeICommandBarFlyout(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyout {
    public val __1111317674_Ptr: Pointer?

    public val _1111317674_VtblPtr: Pointer?
      get() = __1111317674_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryCommands(): IObservableVector<ICommandBarElement?>? {
      val fnPtr = _1111317674_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<ICommandBarElement?>>()
      val hr = fn.invokeHR(arrayOf(__1111317674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<ICommandBarElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SecondaryCommands(): IObservableVector<ICommandBarElement?>? {
      val fnPtr = _1111317674_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<ICommandBarElement?>>()
      val hr = fn.invokeHR(arrayOf(__1111317674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<ICommandBarElement?>>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111317674_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18e2cc4009cb5f20a715f0b2039c5e18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyout(ptr: Pointer?): WithDefault = ICommandBarFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarFlyout {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyout(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111317674_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyout): Array<ICommandBarFlyout?> = (elements
        as Array<ICommandBarFlyout?>).castToImpl<ICommandBarFlyout,ICommandBarFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyout?> =
        arrayOfNulls<ICommandBarFlyout_Impl>(size) as Array<ICommandBarFlyout?>
  }
}
