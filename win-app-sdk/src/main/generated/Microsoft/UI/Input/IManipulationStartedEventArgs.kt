package Microsoft.UI.Input

import Windows.Foundation.Point
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

@ABIMarker(IManipulationStartedEventArgs.ABI::class)
@Signature("{4a616613-eef1-5f1b-a768-0775478d49d4}")
@Guid("4a616613eef15f1ba7680775478d49d4")
@WinRTInterface("4a616613eef15f1ba7680775478d49d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationStartedEventArgs.ByReference::class)
public interface IManipulationStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cumulative(): ManipulationDelta?

  @InterfaceMethod(1)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(2)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationStartedEventArgs> {
    public override fun getValue() = ABI.makeIManipulationStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationStartedEventArgs {
    public val __1317791028_Ptr: Pointer?

    public val _1317791028_VtblPtr: Pointer?
      get() = __1317791028_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cumulative(): ManipulationDelta? {
      val fnPtr = _1317791028_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1317791028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _1317791028_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1317791028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): Point? {
      val fnPtr = _1317791028_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1317791028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IManipulationStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1317791028_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a616613eef15f1ba7680775478d49d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationStartedEventArgs(ptr: Pointer?): WithDefault =
        IManipulationStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1317791028_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationStartedEventArgs):
        Array<IManipulationStartedEventArgs?> = (elements as
        Array<IManipulationStartedEventArgs?>).castToImpl<IManipulationStartedEventArgs,IManipulationStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationStartedEventArgs?> =
        arrayOfNulls<IManipulationStartedEventArgs_Impl>(size) as
        Array<IManipulationStartedEventArgs?>
  }
}
