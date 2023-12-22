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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceNavigatorStatics.ABI::class)
@Signature("{00fd9513-4456-4e66-a143-3add6be08426}")
@Guid("00fd951344564e66a1433add6be08426")
@WinRTInterface("00fd951344564e66a1433add6be08426")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceNavigatorStatics.ByReference::class)
public interface IGuidanceNavigatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrent(): GuidanceNavigator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceNavigatorStatics> {
    public override fun getValue() = ABI.makeIGuidanceNavigatorStatics(pointer.getPointer(0))

    public fun setValue(value: IGuidanceNavigatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceNavigatorStatics {
    public val __2096217669_Ptr: Pointer?

    public val _2096217669_VtblPtr: Pointer?
      get() = __2096217669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrent(): GuidanceNavigator? {
      val fnPtr = _2096217669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceNavigator>()
      val hr = fn.invokeHR(arrayOf(__2096217669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceNavigator>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceNavigatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2096217669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceNavigatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00fd951344564e66a1433add6be08426")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceNavigatorStatics(ptr: Pointer?): WithDefault =
        IGuidanceNavigatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceNavigatorStatics {
      val address = segment.toRawLongValue()
      return makeIGuidanceNavigatorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceNavigatorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2096217669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceNavigatorStatics):
        Array<IGuidanceNavigatorStatics?> = (elements as
        Array<IGuidanceNavigatorStatics?>).castToImpl<IGuidanceNavigatorStatics,IGuidanceNavigatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceNavigatorStatics?> =
        arrayOfNulls<IGuidanceNavigatorStatics_Impl>(size) as Array<IGuidanceNavigatorStatics?>
  }
}
