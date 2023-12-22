package Windows.UI.Input

import Windows.Devices.Input.PointerDeviceType
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

@ABIMarker(IHoldingEventArgs.ABI::class)
@Signature("{2bf755c5-e799-41b4-bb40-242f40959b71}")
@Guid("2bf755c5e79941b4bb40242f40959b71")
@WinRTInterface("2bf755c5e79941b4bb40242f40959b71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHoldingEventArgs.ByReference::class)
public interface IHoldingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  @InterfaceMethod(2)
  public fun get_HoldingState(): HoldingState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHoldingEventArgs> {
    public override fun getValue() = ABI.makeIHoldingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHoldingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHoldingEventArgs {
    public val __751689758_Ptr: Pointer?

    public val _751689758_VtblPtr: Pointer?
      get() = __751689758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _751689758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__751689758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _751689758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__751689758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HoldingState(): HoldingState? {
      val fnPtr = _751689758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HoldingState>()
      val hr = fn.invokeHR(arrayOf(__751689758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HoldingState>(result.getValue())
      return resultValue
    }
  }

  public class IHoldingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __751689758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHoldingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bf755c5e79941b4bb40242f40959b71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHoldingEventArgs(ptr: Pointer?): WithDefault = IHoldingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHoldingEventArgs {
      val address = segment.toRawLongValue()
      return makeIHoldingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHoldingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__751689758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHoldingEventArgs): Array<IHoldingEventArgs?> = (elements
        as Array<IHoldingEventArgs?>).castToImpl<IHoldingEventArgs,IHoldingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHoldingEventArgs?> =
        arrayOfNulls<IHoldingEventArgs_Impl>(size) as Array<IHoldingEventArgs?>
  }
}
