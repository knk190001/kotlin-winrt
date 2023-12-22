package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopath
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IMapPolygon2.ABI::class)
@Signature("{96c8a11e-636b-4018-9c2e-acc9122a01b2}")
@Guid("96c8a11e636b40189c2eacc9122a01b2")
@WinRTInterface("96c8a11e636b40189c2eacc9122a01b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapPolygon2.ByReference::class)
public interface IMapPolygon2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Paths(): IVector<Geopath?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapPolygon2> {
    public override fun getValue() = ABI.makeIMapPolygon2(pointer.getPointer(0))

    public fun setValue(value: IMapPolygon2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapPolygon2 {
    public val __1398790717_Ptr: Pointer?

    public val _1398790717_VtblPtr: Pointer?
      get() = __1398790717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Paths(): IVector<Geopath?>? {
      val fnPtr = _1398790717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Geopath?>>()
      val hr = fn.invokeHR(arrayOf(__1398790717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Geopath?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapPolygon2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1398790717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapPolygon2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96c8a11e636b40189c2eacc9122a01b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapPolygon2(ptr: Pointer?): WithDefault = IMapPolygon2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapPolygon2 {
      val address = segment.toRawLongValue()
      return makeIMapPolygon2(Pointer(address))
    }

    public override fun toNative(obj: IMapPolygon2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1398790717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapPolygon2): Array<IMapPolygon2?> = (elements as
        Array<IMapPolygon2?>).castToImpl<IMapPolygon2,IMapPolygon2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapPolygon2?> =
        arrayOfNulls<IMapPolygon2_Impl>(size) as Array<IMapPolygon2?>
  }
}
