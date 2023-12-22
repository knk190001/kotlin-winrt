package Windows.UI.Input

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

@ABIMarker(IRadialControllerControlAcquiredEventArgs.ABI::class)
@Signature("{206aa439-e651-11e5-bf62-2c27d7404e85}")
@Guid("206aa439e65111e5bf622c27d7404e85")
@WinRTInterface("206aa439e65111e5bf622c27d7404e85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerControlAcquiredEventArgs.ByReference::class)
public interface IRadialControllerControlAcquiredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contact(): RadialControllerScreenContact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerControlAcquiredEventArgs> {
    public override fun getValue() =
        ABI.makeIRadialControllerControlAcquiredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerControlAcquiredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerControlAcquiredEventArgs {
    public val __372387563_Ptr: Pointer?

    public val _372387563_VtblPtr: Pointer?
      get() = __372387563_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contact(): RadialControllerScreenContact? {
      val fnPtr = _372387563_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerScreenContact>()
      val hr = fn.invokeHR(arrayOf(__372387563_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerScreenContact>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerControlAcquiredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __372387563_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerControlAcquiredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("206aa439e65111e5bf622c27d7404e85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerControlAcquiredEventArgs(ptr: Pointer?): WithDefault =
        IRadialControllerControlAcquiredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerControlAcquiredEventArgs {
      val address = segment.toRawLongValue()
      return makeIRadialControllerControlAcquiredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerControlAcquiredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__372387563_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerControlAcquiredEventArgs):
        Array<IRadialControllerControlAcquiredEventArgs?> = (elements as
        Array<IRadialControllerControlAcquiredEventArgs?>).castToImpl<IRadialControllerControlAcquiredEventArgs,IRadialControllerControlAcquiredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerControlAcquiredEventArgs?> =
        arrayOfNulls<IRadialControllerControlAcquiredEventArgs_Impl>(size) as
        Array<IRadialControllerControlAcquiredEventArgs?>
  }
}
