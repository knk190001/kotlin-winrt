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

@ABIMarker(IRadialControllerScreenContactStartedEventArgs.ABI::class)
@Signature("{206aa436-e651-11e5-bf62-2c27d7404e85}")
@Guid("206aa436e65111e5bf622c27d7404e85")
@WinRTInterface("206aa436e65111e5bf622c27d7404e85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerScreenContactStartedEventArgs.ByReference::class)
public interface IRadialControllerScreenContactStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Contact(): RadialControllerScreenContact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerScreenContactStartedEventArgs> {
    public override fun getValue() =
        ABI.makeIRadialControllerScreenContactStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerScreenContactStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerScreenContactStartedEventArgs {
    public val __212092385_Ptr: Pointer?

    public val _212092385_VtblPtr: Pointer?
      get() = __212092385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Contact(): RadialControllerScreenContact? {
      val fnPtr = _212092385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerScreenContact>()
      val hr = fn.invokeHR(arrayOf(__212092385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerScreenContact>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerScreenContactStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __212092385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerScreenContactStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("206aa436e65111e5bf622c27d7404e85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerScreenContactStartedEventArgs(ptr: Pointer?): WithDefault =
        IRadialControllerScreenContactStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerScreenContactStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRadialControllerScreenContactStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerScreenContactStartedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__212092385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerScreenContactStartedEventArgs):
        Array<IRadialControllerScreenContactStartedEventArgs?> = (elements as
        Array<IRadialControllerScreenContactStartedEventArgs?>).castToImpl<IRadialControllerScreenContactStartedEventArgs,IRadialControllerScreenContactStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerScreenContactStartedEventArgs?> =
        arrayOfNulls<IRadialControllerScreenContactStartedEventArgs_Impl>(size) as
        Array<IRadialControllerScreenContactStartedEventArgs?>
  }
}
