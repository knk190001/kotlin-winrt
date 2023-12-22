package Windows.Services.Maps.Guidance

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

@ABIMarker(IGuidanceLaneInfo.ABI::class)
@Signature("{8404d114-6581-43b7-ac15-c9079bf90df1}")
@Guid("8404d114658143b7ac15c9079bf90df1")
@WinRTInterface("8404d114658143b7ac15c9079bf90df1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceLaneInfo.ByReference::class)
public interface IGuidanceLaneInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LaneMarkers(): GuidanceLaneMarkers?

  @InterfaceMethod(1)
  public fun get_IsOnRoute(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceLaneInfo> {
    public override fun getValue() = ABI.makeIGuidanceLaneInfo(pointer.getPointer(0))

    public fun setValue(value: IGuidanceLaneInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceLaneInfo {
    public val __52843375_Ptr: Pointer?

    public val _52843375_VtblPtr: Pointer?
      get() = __52843375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LaneMarkers(): GuidanceLaneMarkers? {
      val fnPtr = _52843375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceLaneMarkers>()
      val hr = fn.invokeHR(arrayOf(__52843375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceLaneMarkers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsOnRoute(): Boolean {
      val fnPtr = _52843375_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__52843375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGuidanceLaneInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __52843375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceLaneInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8404d114658143b7ac15c9079bf90df1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceLaneInfo(ptr: Pointer?): WithDefault = IGuidanceLaneInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceLaneInfo {
      val address = segment.toRawLongValue()
      return makeIGuidanceLaneInfo(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceLaneInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__52843375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceLaneInfo): Array<IGuidanceLaneInfo?> = (elements
        as Array<IGuidanceLaneInfo?>).castToImpl<IGuidanceLaneInfo,IGuidanceLaneInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceLaneInfo?> =
        arrayOfNulls<IGuidanceLaneInfo_Impl>(size) as Array<IGuidanceLaneInfo?>
  }
}
