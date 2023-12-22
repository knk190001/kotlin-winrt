package Windows.Services.Maps

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IMapRouteDrivingOptions2.ABI::class)
@Signature("{35dc8670-c298-48d0-b5ad-825460645603}")
@Guid("35dc8670c29848d0b5ad825460645603")
@WinRTInterface("35dc8670c29848d0b5ad825460645603")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteDrivingOptions2.ByReference::class)
public interface IMapRouteDrivingOptions2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DepartureTime(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun put_DepartureTime(value: IReference<DateTime?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteDrivingOptions2> {
    public override fun getValue() = ABI.makeIMapRouteDrivingOptions2(pointer.getPointer(0))

    public fun setValue(value: IMapRouteDrivingOptions2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteDrivingOptions2 {
    public val __515883135_Ptr: Pointer?

    public val _515883135_VtblPtr: Pointer?
      get() = __515883135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DepartureTime(): IReference<DateTime?>? {
      val fnPtr = _515883135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__515883135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DepartureTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _515883135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515883135_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapRouteDrivingOptions2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __515883135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteDrivingOptions2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35dc8670c29848d0b5ad825460645603")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteDrivingOptions2(ptr: Pointer?): WithDefault =
        IMapRouteDrivingOptions2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteDrivingOptions2 {
      val address = segment.toRawLongValue()
      return makeIMapRouteDrivingOptions2(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteDrivingOptions2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__515883135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteDrivingOptions2):
        Array<IMapRouteDrivingOptions2?> = (elements as
        Array<IMapRouteDrivingOptions2?>).castToImpl<IMapRouteDrivingOptions2,IMapRouteDrivingOptions2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteDrivingOptions2?> =
        arrayOfNulls<IMapRouteDrivingOptions2_Impl>(size) as Array<IMapRouteDrivingOptions2?>
  }
}
