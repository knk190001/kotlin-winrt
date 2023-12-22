package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopath
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

@ABIMarker(IMapControl4.ABI::class)
@Signature("{068f132a-1817-466d-b7ce-419b3f8e248b}")
@Guid("068f132a1817466db7ce419b3f8e248b")
@WinRTInterface("068f132a1817466db7ce419b3f8e248b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl4.ByReference::class)
public interface IMapControl4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BusinessLandmarksEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_BusinessLandmarksEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TransitFeaturesEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_TransitFeaturesEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun GetVisibleRegion(region: MapVisibleRegionKind?): Geopath?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl4> {
    public override fun getValue() = ABI.makeIMapControl4(pointer.getPointer(0))

    public fun setValue(value: IMapControl4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl4 {
    public val __1767447042_Ptr: Pointer?

    public val _1767447042_VtblPtr: Pointer?
      get() = __1767447042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BusinessLandmarksEnabled(): Boolean {
      val fnPtr = _1767447042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BusinessLandmarksEnabled(value: Boolean): Unit {
      val fnPtr = _1767447042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447042_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TransitFeaturesEnabled(): Boolean {
      val fnPtr = _1767447042_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TransitFeaturesEnabled(value: Boolean): Unit {
      val fnPtr = _1767447042_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447042_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetVisibleRegion(region: MapVisibleRegionKind?): Geopath? {
      val fnPtr = _1767447042_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1767447042_Ptr, marshalToNative(region), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }
  }

  public class IMapControl4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("068f132a1817466db7ce419b3f8e248b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl4(ptr: Pointer?): WithDefault = IMapControl4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl4 {
      val address = segment.toRawLongValue()
      return makeIMapControl4(Pointer(address))
    }

    public override fun toNative(obj: IMapControl4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl4): Array<IMapControl4?> = (elements as
        Array<IMapControl4?>).castToImpl<IMapControl4,IMapControl4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl4?> =
        arrayOfNulls<IMapControl4_Impl>(size) as Array<IMapControl4?>
  }
}
