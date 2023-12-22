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

@ABIMarker(IAllJoynSessionLostEventArgsFactory.ABI::class)
@Signature("{13bbfd32-d2f4-49c9-980e-2805e13586b1}")
@Guid("13bbfd32d2f449c9980e2805e13586b1")
@WinRTInterface("13bbfd32d2f449c9980e2805e13586b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynSessionLostEventArgsFactory.ByReference::class)
public interface IAllJoynSessionLostEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(reason: AllJoynSessionLostReason?): AllJoynSessionLostEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynSessionLostEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIAllJoynSessionLostEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynSessionLostEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynSessionLostEventArgsFactory {
    public val __1833133916_Ptr: Pointer?

    public val _1833133916_VtblPtr: Pointer?
      get() = __1833133916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(reason: AllJoynSessionLostReason?): AllJoynSessionLostEventArgs? {
      val fnPtr = _1833133916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynSessionLostEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1833133916_Ptr, marshalToNative(reason), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynSessionLostEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynSessionLostEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1833133916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynSessionLostEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13bbfd32d2f449c9980e2805e13586b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynSessionLostEventArgsFactory(ptr: Pointer?): WithDefault =
        IAllJoynSessionLostEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynSessionLostEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynSessionLostEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynSessionLostEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1833133916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynSessionLostEventArgsFactory):
        Array<IAllJoynSessionLostEventArgsFactory?> = (elements as
        Array<IAllJoynSessionLostEventArgsFactory?>).castToImpl<IAllJoynSessionLostEventArgsFactory,IAllJoynSessionLostEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynSessionLostEventArgsFactory?> =
        arrayOfNulls<IAllJoynSessionLostEventArgsFactory_Impl>(size) as
        Array<IAllJoynSessionLostEventArgsFactory?>
  }
}
