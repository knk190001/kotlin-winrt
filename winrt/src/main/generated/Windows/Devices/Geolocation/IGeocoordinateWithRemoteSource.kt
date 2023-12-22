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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeocoordinateWithRemoteSource.ABI::class)
@Signature("{397cebd7-ee38-5f3b-8900-c4a7bc9cf953}")
@Guid("397cebd7ee385f3b8900c4a7bc9cf953")
@WinRTInterface("397cebd7ee385f3b8900c4a7bc9cf953")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocoordinateWithRemoteSource.ByReference::class)
public interface IGeocoordinateWithRemoteSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRemoteSource(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeocoordinateWithRemoteSource> {
    public override fun getValue() = ABI.makeIGeocoordinateWithRemoteSource(pointer.getPointer(0))

    public fun setValue(value: IGeocoordinateWithRemoteSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocoordinateWithRemoteSource {
    public val __2024105359_Ptr: Pointer?

    public val _2024105359_VtblPtr: Pointer?
      get() = __2024105359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRemoteSource(): Boolean {
      val fnPtr = _2024105359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2024105359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGeocoordinateWithRemoteSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2024105359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocoordinateWithRemoteSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("397cebd7ee385f3b8900c4a7bc9cf953")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocoordinateWithRemoteSource(ptr: Pointer?): WithDefault =
        IGeocoordinateWithRemoteSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeocoordinateWithRemoteSource {
      val address = segment.toRawLongValue()
      return makeIGeocoordinateWithRemoteSource(Pointer(address))
    }

    public override fun toNative(obj: IGeocoordinateWithRemoteSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2024105359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocoordinateWithRemoteSource):
        Array<IGeocoordinateWithRemoteSource?> = (elements as
        Array<IGeocoordinateWithRemoteSource?>).castToImpl<IGeocoordinateWithRemoteSource,IGeocoordinateWithRemoteSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocoordinateWithRemoteSource?> =
        arrayOfNulls<IGeocoordinateWithRemoteSource_Impl>(size) as
        Array<IGeocoordinateWithRemoteSource?>
  }
}
