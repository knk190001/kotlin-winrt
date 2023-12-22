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

@ABIMarker(IGuidanceNavigatorStatics2.ABI::class)
@Signature("{54c5c3e2-7784-4c85-8c95-d0c6efb43965}")
@Guid("54c5c3e277844c858c95d0c6efb43965")
@WinRTInterface("54c5c3e277844c858c95d0c6efb43965")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceNavigatorStatics2.ByReference::class)
public interface IGuidanceNavigatorStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseAppProvidedVoice(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceNavigatorStatics2> {
    public override fun getValue() = ABI.makeIGuidanceNavigatorStatics2(pointer.getPointer(0))

    public fun setValue(value: IGuidanceNavigatorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceNavigatorStatics2 {
    public val __558238349_Ptr: Pointer?

    public val _558238349_VtblPtr: Pointer?
      get() = __558238349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseAppProvidedVoice(): Boolean {
      val fnPtr = _558238349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__558238349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGuidanceNavigatorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558238349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceNavigatorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54c5c3e277844c858c95d0c6efb43965")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceNavigatorStatics2(ptr: Pointer?): WithDefault =
        IGuidanceNavigatorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceNavigatorStatics2 {
      val address = segment.toRawLongValue()
      return makeIGuidanceNavigatorStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceNavigatorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558238349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceNavigatorStatics2):
        Array<IGuidanceNavigatorStatics2?> = (elements as
        Array<IGuidanceNavigatorStatics2?>).castToImpl<IGuidanceNavigatorStatics2,IGuidanceNavigatorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceNavigatorStatics2?> =
        arrayOfNulls<IGuidanceNavigatorStatics2_Impl>(size) as Array<IGuidanceNavigatorStatics2?>
  }
}
