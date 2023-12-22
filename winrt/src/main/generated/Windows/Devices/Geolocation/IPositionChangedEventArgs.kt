package Windows.Devices.Geolocation

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

@ABIMarker(IPositionChangedEventArgs.ABI::class)
@Signature("{37859ce5-9d1e-46c5-bf3b-6ad8cac1a093}")
@Guid("37859ce59d1e46c5bf3b6ad8cac1a093")
@WinRTInterface("37859ce59d1e46c5bf3b6ad8cac1a093")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPositionChangedEventArgs.ByReference::class)
public interface IPositionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): Geoposition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPositionChangedEventArgs> {
    public override fun getValue() = ABI.makeIPositionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPositionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPositionChangedEventArgs {
    public val __138159093_Ptr: Pointer?

    public val _138159093_VtblPtr: Pointer?
      get() = __138159093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): Geoposition? {
      val fnPtr = _138159093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geoposition>()
      val hr = fn.invokeHR(arrayOf(__138159093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geoposition>(result.getValue())
      return resultValue
    }
  }

  public class IPositionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __138159093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPositionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37859ce59d1e46c5bf3b6ad8cac1a093")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPositionChangedEventArgs(ptr: Pointer?): WithDefault =
        IPositionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPositionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPositionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPositionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__138159093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPositionChangedEventArgs):
        Array<IPositionChangedEventArgs?> = (elements as
        Array<IPositionChangedEventArgs?>).castToImpl<IPositionChangedEventArgs,IPositionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPositionChangedEventArgs?> =
        arrayOfNulls<IPositionChangedEventArgs_Impl>(size) as Array<IPositionChangedEventArgs?>
  }
}
