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

@ABIMarker(IEnhancedWaypoint.ABI::class)
@Signature("{ed268c74-5913-11e6-8b77-86f30ca893d3}")
@Guid("ed268c74591311e68b7786f30ca893d3")
@WinRTInterface("ed268c74591311e68b7786f30ca893d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnhancedWaypoint.ByReference::class)
public interface IEnhancedWaypoint : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point(): Geopoint?

  @InterfaceMethod(1)
  public fun get_Kind(): WaypointKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnhancedWaypoint> {
    public override fun getValue() = ABI.makeIEnhancedWaypoint(pointer.getPointer(0))

    public fun setValue(value: IEnhancedWaypoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnhancedWaypoint {
    public val __364591708_Ptr: Pointer?

    public val _364591708_VtblPtr: Pointer?
      get() = __364591708_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point(): Geopoint? {
      val fnPtr = _364591708_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__364591708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): WaypointKind? {
      val fnPtr = _364591708_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WaypointKind>()
      val hr = fn.invokeHR(arrayOf(__364591708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WaypointKind>(result.getValue())
      return resultValue
    }
  }

  public class IEnhancedWaypoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __364591708_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnhancedWaypoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed268c74591311e68b7786f30ca893d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnhancedWaypoint(ptr: Pointer?): WithDefault = IEnhancedWaypoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnhancedWaypoint {
      val address = segment.toRawLongValue()
      return makeIEnhancedWaypoint(Pointer(address))
    }

    public override fun toNative(obj: IEnhancedWaypoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__364591708_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnhancedWaypoint): Array<IEnhancedWaypoint?> = (elements
        as Array<IEnhancedWaypoint?>).castToImpl<IEnhancedWaypoint,IEnhancedWaypoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnhancedWaypoint?> =
        arrayOfNulls<IEnhancedWaypoint_Impl>(size) as Array<IEnhancedWaypoint?>
  }
}
