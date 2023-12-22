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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialControllerScreenContactContinuedEventArgs2.ABI::class)
@Signature("{3d577ef1-3cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef13cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef13cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerScreenContactContinuedEventArgs2.ByReference::class)
public interface IRadialControllerScreenContactContinuedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsButtonPressed(): Boolean

  @InterfaceMethod(1)
  public fun get_SimpleHapticsController(): SimpleHapticsController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerScreenContactContinuedEventArgs2> {
    public override fun getValue() =
        ABI.makeIRadialControllerScreenContactContinuedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerScreenContactContinuedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerScreenContactContinuedEventArgs2 {
    public val __77978189_Ptr: Pointer?

    public val _77978189_VtblPtr: Pointer?
      get() = __77978189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsButtonPressed(): Boolean {
      val fnPtr = _77978189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__77978189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SimpleHapticsController(): SimpleHapticsController? {
      val fnPtr = _77978189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleHapticsController>()
      val hr = fn.invokeHR(arrayOf(__77978189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleHapticsController>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerScreenContactContinuedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __77978189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerScreenContactContinuedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef13cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerScreenContactContinuedEventArgs2(ptr: Pointer?): WithDefault =
        IRadialControllerScreenContactContinuedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerScreenContactContinuedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIRadialControllerScreenContactContinuedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerScreenContactContinuedEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__77978189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerScreenContactContinuedEventArgs2):
        Array<IRadialControllerScreenContactContinuedEventArgs2?> = (elements as
        Array<IRadialControllerScreenContactContinuedEventArgs2?>).castToImpl<IRadialControllerScreenContactContinuedEventArgs2,IRadialControllerScreenContactContinuedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IRadialControllerScreenContactContinuedEventArgs2?> =
        arrayOfNulls<IRadialControllerScreenContactContinuedEventArgs2_Impl>(size) as
        Array<IRadialControllerScreenContactContinuedEventArgs2?>
  }
}
