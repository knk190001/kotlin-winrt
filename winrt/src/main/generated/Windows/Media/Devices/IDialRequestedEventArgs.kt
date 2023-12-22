package Windows.Media.Devices

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDialRequestedEventArgs.ABI::class)
@Signature("{037b929e-953c-4286-8866-4f0f376c855a}")
@Guid("037b929e953c428688664f0f376c855a")
@WinRTInterface("037b929e953c428688664f0f376c855a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialRequestedEventArgs.ByReference::class)
public interface IDialRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Handled(): Unit

  @InterfaceMethod(1)
  public fun get_Contact(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialRequestedEventArgs> {
    public override fun getValue() = ABI.makeIDialRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDialRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialRequestedEventArgs {
    public val __1319969606_Ptr: Pointer?

    public val _1319969606_VtblPtr: Pointer?
      get() = __1319969606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Handled(): Unit {
      val fnPtr = _1319969606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1319969606_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Contact(): IUnknown? {
      val fnPtr = _1319969606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1319969606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IDialRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1319969606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("037b929e953c428688664f0f376c855a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialRequestedEventArgs(ptr: Pointer?): WithDefault =
        IDialRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDialRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDialRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1319969606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialRequestedEventArgs): Array<IDialRequestedEventArgs?>
        = (elements as
        Array<IDialRequestedEventArgs?>).castToImpl<IDialRequestedEventArgs,IDialRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialRequestedEventArgs?> =
        arrayOfNulls<IDialRequestedEventArgs_Impl>(size) as Array<IDialRequestedEventArgs?>
  }
}
