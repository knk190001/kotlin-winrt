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

@ABIMarker(IGeovisitStateChangedEventArgs.ABI::class)
@Signature("{ceb4d1ff-8b53-4968-beed-4cecd029ce15}")
@Guid("ceb4d1ff8b534968beed4cecd029ce15")
@WinRTInterface("ceb4d1ff8b534968beed4cecd029ce15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeovisitStateChangedEventArgs.ByReference::class)
public interface IGeovisitStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Visit(): Geovisit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeovisitStateChangedEventArgs> {
    public override fun getValue() = ABI.makeIGeovisitStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGeovisitStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeovisitStateChangedEventArgs {
    public val __918961499_Ptr: Pointer?

    public val _918961499_VtblPtr: Pointer?
      get() = __918961499_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Visit(): Geovisit? {
      val fnPtr = _918961499_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geovisit>()
      val hr = fn.invokeHR(arrayOf(__918961499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geovisit>(result.getValue())
      return resultValue
    }
  }

  public class IGeovisitStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918961499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeovisitStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ceb4d1ff8b534968beed4cecd029ce15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeovisitStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IGeovisitStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeovisitStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGeovisitStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGeovisitStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918961499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeovisitStateChangedEventArgs):
        Array<IGeovisitStateChangedEventArgs?> = (elements as
        Array<IGeovisitStateChangedEventArgs?>).castToImpl<IGeovisitStateChangedEventArgs,IGeovisitStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeovisitStateChangedEventArgs?> =
        arrayOfNulls<IGeovisitStateChangedEventArgs_Impl>(size) as
        Array<IGeovisitStateChangedEventArgs?>
  }
}
