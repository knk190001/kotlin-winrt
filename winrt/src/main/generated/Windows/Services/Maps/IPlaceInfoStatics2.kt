package Windows.Services.Maps

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlaceInfoStatics2.ABI::class)
@Signature("{730f0249-4047-44a3-8f81-2550a5216370}")
@Guid("730f0249404744a38f812550a5216370")
@WinRTInterface("730f0249404744a38f812550a5216370")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaceInfoStatics2.ByReference::class)
public interface IPlaceInfoStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromAddress(displayAddress: String?): PlaceInfo?

  @InterfaceMethod(1)
  public fun CreateFromAddress(displayAddress: String?, displayName: String?): PlaceInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaceInfoStatics2> {
    public override fun getValue() = ABI.makeIPlaceInfoStatics2(pointer.getPointer(0))

    public fun setValue(value: IPlaceInfoStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaceInfoStatics2 {
    public val __1903686677_Ptr: Pointer?

    public val _1903686677_VtblPtr: Pointer?
      get() = __1903686677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromAddress(displayAddress: String?): PlaceInfo? {
      val fnPtr = _1903686677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1903686677_Ptr, marshalToNative(displayAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromAddress(displayAddress: String?, displayName: String?):
        PlaceInfo? {
      val fnPtr = _1903686677_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaceInfo>()
      val hr = fn.invokeHR(arrayOf(__1903686677_Ptr, marshalToNative(displayAddress),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaceInfo>(result.getValue())
      return resultValue
    }
  }

  public class IPlaceInfoStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1903686677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaceInfoStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("730f0249404744a38f812550a5216370")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaceInfoStatics2(ptr: Pointer?): WithDefault = IPlaceInfoStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaceInfoStatics2 {
      val address = segment.toRawLongValue()
      return makeIPlaceInfoStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPlaceInfoStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1903686677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaceInfoStatics2): Array<IPlaceInfoStatics2?> =
        (elements as
        Array<IPlaceInfoStatics2?>).castToImpl<IPlaceInfoStatics2,IPlaceInfoStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaceInfoStatics2?> =
        arrayOfNulls<IPlaceInfoStatics2_Impl>(size) as Array<IPlaceInfoStatics2?>
  }
}
