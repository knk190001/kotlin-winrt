package Windows.Perception.Spatial

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

@ABIMarker(ISpatialLocatorStatics.ABI::class)
@Signature("{b76e3340-a7c2-361b-bb82-56e93b89b1bb}")
@Guid("b76e3340a7c2361bbb8256e93b89b1bb")
@WinRTInterface("b76e3340a7c2361bbb8256e93b89b1bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialLocatorStatics.ByReference::class)
public interface ISpatialLocatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): SpatialLocator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialLocatorStatics> {
    public override fun getValue() = ABI.makeISpatialLocatorStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialLocatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialLocatorStatics {
    public val __28677808_Ptr: Pointer?

    public val _28677808_VtblPtr: Pointer?
      get() = __28677808_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): SpatialLocator? {
      val fnPtr = _28677808_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialLocator>()
      val hr = fn.invokeHR(arrayOf(__28677808_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialLocator>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialLocatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __28677808_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialLocatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b76e3340a7c2361bbb8256e93b89b1bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialLocatorStatics(ptr: Pointer?): WithDefault =
        ISpatialLocatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialLocatorStatics {
      val address = segment.toRawLongValue()
      return makeISpatialLocatorStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialLocatorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__28677808_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialLocatorStatics): Array<ISpatialLocatorStatics?> =
        (elements as
        Array<ISpatialLocatorStatics?>).castToImpl<ISpatialLocatorStatics,ISpatialLocatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialLocatorStatics?> =
        arrayOfNulls<ISpatialLocatorStatics_Impl>(size) as Array<ISpatialLocatorStatics?>
  }
}
