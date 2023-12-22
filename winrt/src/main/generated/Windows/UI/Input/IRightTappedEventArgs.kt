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

@ABIMarker(IRightTappedEventArgs.ABI::class)
@Signature("{4cbf40bd-af7a-4a36-9476-b1dce141709a}")
@Guid("4cbf40bdaf7a4a369476b1dce141709a")
@WinRTInterface("4cbf40bdaf7a4a369476b1dce141709a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRightTappedEventArgs.ByReference::class)
public interface IRightTappedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRightTappedEventArgs> {
    public override fun getValue() = ABI.makeIRightTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRightTappedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRightTappedEventArgs {
    public val __1814265475_Ptr: Pointer?

    public val _1814265475_VtblPtr: Pointer?
      get() = __1814265475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _1814265475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1814265475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _1814265475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1814265475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IRightTappedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1814265475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRightTappedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cbf40bdaf7a4a369476b1dce141709a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRightTappedEventArgs(ptr: Pointer?): WithDefault =
        IRightTappedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRightTappedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRightTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRightTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1814265475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRightTappedEventArgs): Array<IRightTappedEventArgs?> =
        (elements as
        Array<IRightTappedEventArgs?>).castToImpl<IRightTappedEventArgs,IRightTappedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRightTappedEventArgs?> =
        arrayOfNulls<IRightTappedEventArgs_Impl>(size) as Array<IRightTappedEventArgs?>
  }
}
