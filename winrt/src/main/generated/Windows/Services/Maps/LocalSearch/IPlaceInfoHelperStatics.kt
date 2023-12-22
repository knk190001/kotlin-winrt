package Windows.Services.Maps.LocalSearch

import Windows.Services.Maps.PlaceInfo
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

@ABIMarker(IPlaceInfoHelperStatics.ABI::class)
@Signature("{dd1ca9a7-a9c6-491b-bc09-e80fcea48ee6}")
@Guid("dd1ca9a7a9c6491bbc09e80fcea48ee6")
@WinRTInterface("dd1ca9a7a9c6491bbc09e80fcea48ee6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaceInfoHelperStatics.ByReference::class)
public interface IPlaceInfoHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromLocalLocation(location: LocalLocation?): PlaceInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaceInfoHelperStatics> {
    public override fun getValue() = ABI.makeIPlaceInfoHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IPlaceInfoHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaceInfoHelperStatics {
    public val __13609302_Ptr: Pointer?

    public val _13609302_VtblPtr: Pointer?
      get() = __13609302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromLocalLocation(location: LocalLocation?): PlaceInfo? {
      val fnPtr = _13609302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__13609302_Ptr, marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }
  }

  public class IPlaceInfoHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __13609302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaceInfoHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd1ca9a7a9c6491bbc09e80fcea48ee6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaceInfoHelperStatics(ptr: Pointer?): WithDefault =
        IPlaceInfoHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaceInfoHelperStatics {
      val address = segment.toRawLongValue()
      return makeIPlaceInfoHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlaceInfoHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__13609302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaceInfoHelperStatics): Array<IPlaceInfoHelperStatics?>
        = (elements as
        Array<IPlaceInfoHelperStatics?>).castToImpl<IPlaceInfoHelperStatics,IPlaceInfoHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaceInfoHelperStatics?> =
        arrayOfNulls<IPlaceInfoHelperStatics_Impl>(size) as Array<IPlaceInfoHelperStatics?>
  }
}
