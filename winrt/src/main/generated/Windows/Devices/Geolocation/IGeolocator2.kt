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

@ABIMarker(IGeolocator2.ABI::class)
@Signature("{d1b42e6d-8891-43b4-ad36-27c6fe9a97b1}")
@Guid("d1b42e6d889143b4ad3627c6fe9a97b1")
@WinRTInterface("d1b42e6d889143b4ad3627c6fe9a97b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeolocator2.ByReference::class)
public interface IGeolocator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AllowFallbackToConsentlessPositions(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeolocator2> {
    public override fun getValue() = ABI.makeIGeolocator2(pointer.getPointer(0))

    public fun setValue(value: IGeolocator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeolocator2 {
    public val __179457074_Ptr: Pointer?

    public val _179457074_VtblPtr: Pointer?
      get() = __179457074_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AllowFallbackToConsentlessPositions(): Unit {
      val fnPtr = _179457074_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__179457074_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeolocator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __179457074_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeolocator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1b42e6d889143b4ad3627c6fe9a97b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeolocator2(ptr: Pointer?): WithDefault = IGeolocator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeolocator2 {
      val address = segment.toRawLongValue()
      return makeIGeolocator2(Pointer(address))
    }

    public override fun toNative(obj: IGeolocator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__179457074_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeolocator2): Array<IGeolocator2?> = (elements as
        Array<IGeolocator2?>).castToImpl<IGeolocator2,IGeolocator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeolocator2?> =
        arrayOfNulls<IGeolocator2_Impl>(size) as Array<IGeolocator2?>
  }
}
