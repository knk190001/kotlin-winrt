package Microsoft.UI.Xaml.Controls.Primitives

import Windows.Foundation.IReference
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollControllerAddScrollVelocityRequestedEventArgs.ABI::class)
@Signature("{317bbc1a-0cf7-5815-a8a7-bd7e6eef966a}")
@Guid("317bbc1a0cf75815a8a7bd7e6eef966a")
@WinRTInterface("317bbc1a0cf75815a8a7bd7e6eef966a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerAddScrollVelocityRequestedEventArgs.ByReference::class)
public interface IScrollControllerAddScrollVelocityRequestedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OffsetVelocity(): Float

  @InterfaceMethod(1)
  public fun get_InertiaDecayRate(): IReference<Float>?

  @InterfaceMethod(2)
  public fun get_CorrelationId(): Int

  @InterfaceMethod(3)
  public fun put_CorrelationId(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerAddScrollVelocityRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollControllerAddScrollVelocityRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerAddScrollVelocityRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerAddScrollVelocityRequestedEventArgs {
    public val __773200122_Ptr: Pointer?

    public val _773200122_VtblPtr: Pointer?
      get() = __773200122_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OffsetVelocity(): Float {
      val fnPtr = _773200122_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__773200122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_InertiaDecayRate(): IReference<Float>? {
      val fnPtr = _773200122_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__773200122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CorrelationId(): Int {
      val fnPtr = _773200122_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__773200122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CorrelationId(value: Int): Unit {
      val fnPtr = _773200122_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__773200122_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollControllerAddScrollVelocityRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __773200122_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerAddScrollVelocityRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("317bbc1a0cf75815a8a7bd7e6eef966a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerAddScrollVelocityRequestedEventArgs(ptr: Pointer?): WithDefault
        = IScrollControllerAddScrollVelocityRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerAddScrollVelocityRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollControllerAddScrollVelocityRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerAddScrollVelocityRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__773200122_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerAddScrollVelocityRequestedEventArgs):
        Array<IScrollControllerAddScrollVelocityRequestedEventArgs?> = (elements as
        Array<IScrollControllerAddScrollVelocityRequestedEventArgs?>).castToImpl<IScrollControllerAddScrollVelocityRequestedEventArgs,IScrollControllerAddScrollVelocityRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IScrollControllerAddScrollVelocityRequestedEventArgs?> =
        arrayOfNulls<IScrollControllerAddScrollVelocityRequestedEventArgs_Impl>(size) as
        Array<IScrollControllerAddScrollVelocityRequestedEventArgs?>
  }
}
