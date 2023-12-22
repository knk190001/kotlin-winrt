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

@ABIMarker(IAllJoynBusObjectStoppedEventArgs.ABI::class)
@Signature("{de102115-ef8e-4d42-b93b-a2ae74519766}")
@Guid("de102115ef8e4d42b93ba2ae74519766")
@WinRTInterface("de102115ef8e4d42b93ba2ae74519766")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusObjectStoppedEventArgs.ByReference::class)
public interface IAllJoynBusObjectStoppedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusObjectStoppedEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynBusObjectStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusObjectStoppedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusObjectStoppedEventArgs {
    public val __167833352_Ptr: Pointer?

    public val _167833352_VtblPtr: Pointer?
      get() = __167833352_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): Int {
      val fnPtr = _167833352_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__167833352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynBusObjectStoppedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __167833352_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusObjectStoppedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de102115ef8e4d42b93ba2ae74519766")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusObjectStoppedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynBusObjectStoppedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynBusObjectStoppedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusObjectStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusObjectStoppedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__167833352_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusObjectStoppedEventArgs):
        Array<IAllJoynBusObjectStoppedEventArgs?> = (elements as
        Array<IAllJoynBusObjectStoppedEventArgs?>).castToImpl<IAllJoynBusObjectStoppedEventArgs,IAllJoynBusObjectStoppedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusObjectStoppedEventArgs?> =
        arrayOfNulls<IAllJoynBusObjectStoppedEventArgs_Impl>(size) as
        Array<IAllJoynBusObjectStoppedEventArgs?>
  }
}
