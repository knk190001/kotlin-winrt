package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardPinResetDeferral.ABI::class)
@Signature("{18c94aac-7805-4004-85e4-bbefac8f6884}")
@Guid("18c94aac7805400485e4bbefac8f6884")
@WinRTInterface("18c94aac7805400485e4bbefac8f6884")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardPinResetDeferral.ByReference::class)
public interface ISmartCardPinResetDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardPinResetDeferral> {
    public override fun getValue() = ABI.makeISmartCardPinResetDeferral(pointer.getPointer(0))

    public fun setValue(value: ISmartCardPinResetDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardPinResetDeferral {
    public val __197729163_Ptr: Pointer?

    public val _197729163_VtblPtr: Pointer?
      get() = __197729163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _197729163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__197729163_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardPinResetDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __197729163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardPinResetDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18c94aac7805400485e4bbefac8f6884")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardPinResetDeferral(ptr: Pointer?): WithDefault =
        ISmartCardPinResetDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardPinResetDeferral {
      val address = segment.toRawLongValue()
      return makeISmartCardPinResetDeferral(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardPinResetDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__197729163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardPinResetDeferral):
        Array<ISmartCardPinResetDeferral?> = (elements as
        Array<ISmartCardPinResetDeferral?>).castToImpl<ISmartCardPinResetDeferral,ISmartCardPinResetDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardPinResetDeferral?> =
        arrayOfNulls<ISmartCardPinResetDeferral_Impl>(size) as Array<ISmartCardPinResetDeferral?>
  }
}
