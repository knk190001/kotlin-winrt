package Windows.UI.Input

import Windows.Devices.Haptics.SimpleHapticsController
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

@ABIMarker(IRadialControllerButtonHoldingEventArgs.ABI::class)
@Signature("{3d577eee-3cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577eee3cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577eee3cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerButtonHoldingEventArgs.ByReference::class)
public interface IRadialControllerButtonHoldingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contact(): RadialControllerScreenContact?

  @InterfaceMethod(1)
  public fun get_SimpleHapticsController(): SimpleHapticsController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerButtonHoldingEventArgs> {
    public override fun getValue() =
        ABI.makeIRadialControllerButtonHoldingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerButtonHoldingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerButtonHoldingEventArgs {
    public val __1153458769_Ptr: Pointer?

    public val _1153458769_VtblPtr: Pointer?
      get() = __1153458769_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contact(): RadialControllerScreenContact? {
      val fnPtr = _1153458769_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerScreenContact>()
      val hr = fn.invokeHR(arrayOf(__1153458769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerScreenContact>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SimpleHapticsController(): SimpleHapticsController? {
      val fnPtr = _1153458769_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleHapticsController>()
      val hr = fn.invokeHR(arrayOf(__1153458769_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleHapticsController>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerButtonHoldingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1153458769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerButtonHoldingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577eee3cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerButtonHoldingEventArgs(ptr: Pointer?): WithDefault =
        IRadialControllerButtonHoldingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerButtonHoldingEventArgs {
      val address = segment.toRawLongValue()
      return makeIRadialControllerButtonHoldingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerButtonHoldingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1153458769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerButtonHoldingEventArgs):
        Array<IRadialControllerButtonHoldingEventArgs?> = (elements as
        Array<IRadialControllerButtonHoldingEventArgs?>).castToImpl<IRadialControllerButtonHoldingEventArgs,IRadialControllerButtonHoldingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerButtonHoldingEventArgs?> =
        arrayOfNulls<IRadialControllerButtonHoldingEventArgs_Impl>(size) as
        Array<IRadialControllerButtonHoldingEventArgs?>
  }
}
