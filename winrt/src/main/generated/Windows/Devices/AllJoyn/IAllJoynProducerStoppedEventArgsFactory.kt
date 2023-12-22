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

@ABIMarker(IAllJoynProducerStoppedEventArgsFactory.ABI::class)
@Signature("{56529961-b219-4d6e-9f78-fa3f99fa8fe5}")
@Guid("56529961b2194d6e9f78fa3f99fa8fe5")
@WinRTInterface("56529961b2194d6e9f78fa3f99fa8fe5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynProducerStoppedEventArgsFactory.ByReference::class)
public interface IAllJoynProducerStoppedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(status: Int): AllJoynProducerStoppedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynProducerStoppedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynProducerStoppedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynProducerStoppedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynProducerStoppedEventArgsFactory {
    public val __721700061_Ptr: Pointer?

    public val _721700061_VtblPtr: Pointer?
      get() = __721700061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(status: Int): AllJoynProducerStoppedEventArgs? {
      val fnPtr = _721700061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynProducerStoppedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__721700061_Ptr, status, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynProducerStoppedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynProducerStoppedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __721700061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynProducerStoppedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56529961b2194d6e9f78fa3f99fa8fe5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynProducerStoppedEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynProducerStoppedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynProducerStoppedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynProducerStoppedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynProducerStoppedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__721700061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynProducerStoppedEventArgsFactory):
        Array<IAllJoynProducerStoppedEventArgsFactory?> = (elements as
        Array<IAllJoynProducerStoppedEventArgsFactory?>).castToImpl<IAllJoynProducerStoppedEventArgsFactory,IAllJoynProducerStoppedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynProducerStoppedEventArgsFactory?> =
        arrayOfNulls<IAllJoynProducerStoppedEventArgsFactory_Impl>(size) as
        Array<IAllJoynProducerStoppedEventArgsFactory?>
  }
}
