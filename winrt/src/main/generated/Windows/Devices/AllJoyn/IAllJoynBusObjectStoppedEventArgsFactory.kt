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

@ABIMarker(IAllJoynBusObjectStoppedEventArgsFactory.ABI::class)
@Signature("{6b22fd48-d0a3-4255-953a-4772b4028073}")
@Guid("6b22fd48d0a34255953a4772b4028073")
@WinRTInterface("6b22fd48d0a34255953a4772b4028073")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusObjectStoppedEventArgsFactory.ByReference::class)
public interface IAllJoynBusObjectStoppedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(status: Int): AllJoynBusObjectStoppedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusObjectStoppedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynBusObjectStoppedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusObjectStoppedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusObjectStoppedEventArgsFactory {
    public val __197775118_Ptr: Pointer?

    public val _197775118_VtblPtr: Pointer?
      get() = __197775118_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(status: Int): AllJoynBusObjectStoppedEventArgs? {
      val fnPtr = _197775118_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynBusObjectStoppedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__197775118_Ptr, status, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynBusObjectStoppedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynBusObjectStoppedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __197775118_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusObjectStoppedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b22fd48d0a34255953a4772b4028073")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusObjectStoppedEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynBusObjectStoppedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynBusObjectStoppedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusObjectStoppedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusObjectStoppedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__197775118_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusObjectStoppedEventArgsFactory):
        Array<IAllJoynBusObjectStoppedEventArgsFactory?> = (elements as
        Array<IAllJoynBusObjectStoppedEventArgsFactory?>).castToImpl<IAllJoynBusObjectStoppedEventArgsFactory,IAllJoynBusObjectStoppedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusObjectStoppedEventArgsFactory?> =
        arrayOfNulls<IAllJoynBusObjectStoppedEventArgsFactory_Impl>(size) as
        Array<IAllJoynBusObjectStoppedEventArgsFactory?>
  }
}
