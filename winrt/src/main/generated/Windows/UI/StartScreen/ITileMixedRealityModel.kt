package Windows.UI.StartScreen

import Windows.Foundation.IReference
import Windows.Foundation.Uri
import Windows.Perception.Spatial.SpatialBoundingBox
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

@ABIMarker(ITileMixedRealityModel.ABI::class)
@Signature("{b0764e5b-887d-4242-9a19-3d0a4ea78031}")
@Guid("b0764e5b887d42429a193d0a4ea78031")
@WinRTInterface("b0764e5b887d42429a193d0a4ea78031")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileMixedRealityModel.ByReference::class)
public interface ITileMixedRealityModel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Uri(value: Uri?): Unit

  @InterfaceMethod(1)
  public fun get_Uri(): Uri?

  @InterfaceMethod(2)
  public fun put_BoundingBox(value: IReference<SpatialBoundingBox?>?): Unit

  @InterfaceMethod(3)
  public fun get_BoundingBox(): IReference<SpatialBoundingBox?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileMixedRealityModel> {
    public override fun getValue() = ABI.makeITileMixedRealityModel(pointer.getPointer(0))

    public fun setValue(value: ITileMixedRealityModel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileMixedRealityModel {
    public val __1920083228_Ptr: Pointer?

    public val _1920083228_VtblPtr: Pointer?
      get() = __1920083228_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _1920083228_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920083228_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1920083228_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1920083228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_BoundingBox(value: IReference<SpatialBoundingBox?>?): Unit {
      val fnPtr = _1920083228_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1920083228_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BoundingBox(): IReference<SpatialBoundingBox?>? {
      val fnPtr = _1920083228_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SpatialBoundingBox?>>()
      val hr = fn.invokeHR(arrayOf(__1920083228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SpatialBoundingBox?>>(result.getValue())
      return resultValue
    }
  }

  public class ITileMixedRealityModel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1920083228_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileMixedRealityModel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0764e5b887d42429a193d0a4ea78031")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileMixedRealityModel(ptr: Pointer?): WithDefault =
        ITileMixedRealityModel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileMixedRealityModel {
      val address = segment.toRawLongValue()
      return makeITileMixedRealityModel(Pointer(address))
    }

    public override fun toNative(obj: ITileMixedRealityModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1920083228_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileMixedRealityModel): Array<ITileMixedRealityModel?> =
        (elements as
        Array<ITileMixedRealityModel?>).castToImpl<ITileMixedRealityModel,ITileMixedRealityModel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileMixedRealityModel?> =
        arrayOfNulls<ITileMixedRealityModel_Impl>(size) as Array<ITileMixedRealityModel?>
  }
}
