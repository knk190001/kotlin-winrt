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

@ABIMarker(IGuidanceRoadSegment2.ABI::class)
@Signature("{2474a61d-1723-49f1-895b-47a2c4aa9c55}")
@Guid("2474a61d172349f1895b47a2c4aa9c55")
@WinRTInterface("2474a61d172349f1895b47a2c4aa9c55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceRoadSegment2.ByReference::class)
public interface IGuidanceRoadSegment2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsScenic(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceRoadSegment2> {
    public override fun getValue() = ABI.makeIGuidanceRoadSegment2(pointer.getPointer(0))

    public fun setValue(value: IGuidanceRoadSegment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceRoadSegment2 {
    public val __213426442_Ptr: Pointer?

    public val _213426442_VtblPtr: Pointer?
      get() = __213426442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsScenic(): Boolean {
      val fnPtr = _213426442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__213426442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGuidanceRoadSegment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __213426442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceRoadSegment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2474a61d172349f1895b47a2c4aa9c55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceRoadSegment2(ptr: Pointer?): WithDefault =
        IGuidanceRoadSegment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceRoadSegment2 {
      val address = segment.toRawLongValue()
      return makeIGuidanceRoadSegment2(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceRoadSegment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__213426442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceRoadSegment2): Array<IGuidanceRoadSegment2?> =
        (elements as
        Array<IGuidanceRoadSegment2?>).castToImpl<IGuidanceRoadSegment2,IGuidanceRoadSegment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceRoadSegment2?> =
        arrayOfNulls<IGuidanceRoadSegment2_Impl>(size) as Array<IGuidanceRoadSegment2?>
  }
}
