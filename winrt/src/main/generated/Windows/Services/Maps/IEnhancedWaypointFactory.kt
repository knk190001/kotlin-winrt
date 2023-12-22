package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
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

@ABIMarker(IEnhancedWaypointFactory.ABI::class)
@Signature("{af868477-a2aa-46dd-b645-23b31b8aa6c7}")
@Guid("af868477a2aa46ddb64523b31b8aa6c7")
@WinRTInterface("af868477a2aa46ddb64523b31b8aa6c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnhancedWaypointFactory.ByReference::class)
public interface IEnhancedWaypointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(point: Geopoint?, kind: WaypointKind?): EnhancedWaypoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnhancedWaypointFactory> {
    public override fun getValue() = ABI.makeIEnhancedWaypointFactory(pointer.getPointer(0))

    public fun setValue(value: IEnhancedWaypointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnhancedWaypointFactory {
    public val __1222106426_Ptr: Pointer?

    public val _1222106426_VtblPtr: Pointer?
      get() = __1222106426_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(point: Geopoint?, kind: WaypointKind?): EnhancedWaypoint? {
      val fnPtr = _1222106426_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnhancedWaypoint>()
      val hr = fn.invokeHR(arrayOf(__1222106426_Ptr, marshalToNative(point), marshalToNative(kind),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnhancedWaypoint>(result.getValue())
      return resultValue
    }
  }

  public class IEnhancedWaypointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1222106426_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnhancedWaypointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af868477a2aa46ddb64523b31b8aa6c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnhancedWaypointFactory(ptr: Pointer?): WithDefault =
        IEnhancedWaypointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnhancedWaypointFactory {
      val address = segment.toRawLongValue()
      return makeIEnhancedWaypointFactory(Pointer(address))
    }

    public override fun toNative(obj: IEnhancedWaypointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1222106426_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnhancedWaypointFactory):
        Array<IEnhancedWaypointFactory?> = (elements as
        Array<IEnhancedWaypointFactory?>).castToImpl<IEnhancedWaypointFactory,IEnhancedWaypointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnhancedWaypointFactory?> =
        arrayOfNulls<IEnhancedWaypointFactory_Impl>(size) as Array<IEnhancedWaypointFactory?>
  }
}
