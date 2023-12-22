package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynProducerStoppedEventArgs.ABI::class)
@Signature("{51309770-4937-492d-8080-236439987ceb}")
@Guid("513097704937492d8080236439987ceb")
@WinRTInterface("513097704937492d8080236439987ceb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynProducerStoppedEventArgs.ByReference::class)
public interface IAllJoynProducerStoppedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynProducerStoppedEventArgs> {
    public override fun getValue() = ABI.makeIAllJoynProducerStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynProducerStoppedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynProducerStoppedEventArgs {
    public val __1120223379_Ptr: Pointer?

    public val _1120223379_VtblPtr: Pointer?
      get() = __1120223379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): Int {
      val fnPtr = _1120223379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1120223379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynProducerStoppedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1120223379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynProducerStoppedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("513097704937492d8080236439987ceb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynProducerStoppedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynProducerStoppedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynProducerStoppedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynProducerStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynProducerStoppedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1120223379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynProducerStoppedEventArgs):
        Array<IAllJoynProducerStoppedEventArgs?> = (elements as
        Array<IAllJoynProducerStoppedEventArgs?>).castToImpl<IAllJoynProducerStoppedEventArgs,IAllJoynProducerStoppedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynProducerStoppedEventArgs?> =
        arrayOfNulls<IAllJoynProducerStoppedEventArgs_Impl>(size) as
        Array<IAllJoynProducerStoppedEventArgs?>
  }
}
