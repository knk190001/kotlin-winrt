package Windows.Globalization

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

@ABIMarker(IGeographicRegionFactory.ABI::class)
@Signature("{53425270-77b4-426b-859f-81e19d512546}")
@Guid("5342527077b4426b859f81e19d512546")
@WinRTInterface("5342527077b4426b859f81e19d512546")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeographicRegionFactory.ByReference::class)
public interface IGeographicRegionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateGeographicRegion(geographicRegionCode: String?): GeographicRegion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeographicRegionFactory> {
    public override fun getValue() = ABI.makeIGeographicRegionFactory(pointer.getPointer(0))

    public fun setValue(value: IGeographicRegionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeographicRegionFactory {
    public val __2097439572_Ptr: Pointer?

    public val _2097439572_VtblPtr: Pointer?
      get() = __2097439572_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateGeographicRegion(geographicRegionCode: String?): GeographicRegion? {
      val fnPtr = _2097439572_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeographicRegion>()
      val hr = fn.invokeHR(arrayOf(__2097439572_Ptr, marshalToNative(geographicRegionCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeographicRegion>(result.getValue())
      return resultValue
    }
  }

  public class IGeographicRegionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2097439572_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeographicRegionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5342527077b4426b859f81e19d512546")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeographicRegionFactory(ptr: Pointer?): WithDefault =
        IGeographicRegionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeographicRegionFactory {
      val address = segment.toRawLongValue()
      return makeIGeographicRegionFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeographicRegionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2097439572_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeographicRegionFactory):
        Array<IGeographicRegionFactory?> = (elements as
        Array<IGeographicRegionFactory?>).castToImpl<IGeographicRegionFactory,IGeographicRegionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeographicRegionFactory?> =
        arrayOfNulls<IGeographicRegionFactory_Impl>(size) as Array<IGeographicRegionFactory?>
  }
}
