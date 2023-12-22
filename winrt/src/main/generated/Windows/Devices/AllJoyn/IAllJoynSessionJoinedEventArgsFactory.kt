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

@ABIMarker(IAllJoynSessionJoinedEventArgsFactory.ABI::class)
@Signature("{6824d689-d6cb-4d9e-a09e-35806870b17f}")
@Guid("6824d689d6cb4d9ea09e35806870b17f")
@WinRTInterface("6824d689d6cb4d9ea09e35806870b17f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynSessionJoinedEventArgsFactory.ByReference::class)
public interface IAllJoynSessionJoinedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(session: AllJoynSession?): AllJoynSessionJoinedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynSessionJoinedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynSessionJoinedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynSessionJoinedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynSessionJoinedEventArgsFactory {
    public val __1086052287_Ptr: Pointer?

    public val _1086052287_VtblPtr: Pointer?
      get() = __1086052287_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(session: AllJoynSession?): AllJoynSessionJoinedEventArgs? {
      val fnPtr = _1086052287_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynSessionJoinedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1086052287_Ptr, marshalToNative(session), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynSessionJoinedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynSessionJoinedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1086052287_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynSessionJoinedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6824d689d6cb4d9ea09e35806870b17f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynSessionJoinedEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynSessionJoinedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynSessionJoinedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynSessionJoinedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynSessionJoinedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1086052287_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynSessionJoinedEventArgsFactory):
        Array<IAllJoynSessionJoinedEventArgsFactory?> = (elements as
        Array<IAllJoynSessionJoinedEventArgsFactory?>).castToImpl<IAllJoynSessionJoinedEventArgsFactory,IAllJoynSessionJoinedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynSessionJoinedEventArgsFactory?> =
        arrayOfNulls<IAllJoynSessionJoinedEventArgsFactory_Impl>(size) as
        Array<IAllJoynSessionJoinedEventArgsFactory?>
  }
}
