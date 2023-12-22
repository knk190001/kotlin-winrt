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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialControllerRotationChangedEventArgs.ABI::class)
@Signature("{206aa435-e651-11e5-bf62-2c27d7404e85}")
@Guid("206aa435e65111e5bf622c27d7404e85")
@WinRTInterface("206aa435e65111e5bf622c27d7404e85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerRotationChangedEventArgs.ByReference::class)
public interface IRadialControllerRotationChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RotationDeltaInDegrees(): Double

  @InterfaceMethod(1)
  public fun get_Contact(): RadialControllerScreenContact?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerRotationChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIRadialControllerRotationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerRotationChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerRotationChangedEventArgs {
    public val __1305791766_Ptr: Pointer?

    public val _1305791766_VtblPtr: Pointer?
      get() = __1305791766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RotationDeltaInDegrees(): Double {
      val fnPtr = _1305791766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1305791766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Contact(): RadialControllerScreenContact? {
      val fnPtr = _1305791766_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerScreenContact>()
      val hr = fn.invokeHR(arrayOf(__1305791766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerScreenContact>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerRotationChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1305791766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerRotationChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("206aa435e65111e5bf622c27d7404e85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerRotationChangedEventArgs(ptr: Pointer?): WithDefault =
        IRadialControllerRotationChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerRotationChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRadialControllerRotationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerRotationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1305791766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerRotationChangedEventArgs):
        Array<IRadialControllerRotationChangedEventArgs?> = (elements as
        Array<IRadialControllerRotationChangedEventArgs?>).castToImpl<IRadialControllerRotationChangedEventArgs,IRadialControllerRotationChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerRotationChangedEventArgs?> =
        arrayOfNulls<IRadialControllerRotationChangedEventArgs_Impl>(size) as
        Array<IRadialControllerRotationChangedEventArgs?>
  }
}
