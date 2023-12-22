package Windows.Perception.Spatial

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(ISpatialEntityFactory.ABI::class)
@Signature("{e1f1e325-349f-4225-a2f3-4b01c15fe056}")
@Guid("e1f1e325349f4225a2f34b01c15fe056")
@WinRTInterface("e1f1e325349f4225a2f34b01c15fe056")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityFactory.ByReference::class)
public interface ISpatialEntityFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithSpatialAnchor(spatialAnchor: SpatialAnchor?): SpatialEntity?

  @InterfaceMethod(1)
  public fun CreateWithSpatialAnchorAndProperties(spatialAnchor: SpatialAnchor?,
      propertySet: ValueSet?): SpatialEntity?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityFactory> {
    public override fun getValue() = ABI.makeISpatialEntityFactory(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityFactory {
    public val __1492224134_Ptr: Pointer?

    public val _1492224134_VtblPtr: Pointer?
      get() = __1492224134_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithSpatialAnchor(spatialAnchor: SpatialAnchor?): SpatialEntity? {
      val fnPtr = _1492224134_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntity>()
      val hr = fn.invokeHR(arrayOf(__1492224134_Ptr, marshalToNative(spatialAnchor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithSpatialAnchorAndProperties(spatialAnchor: SpatialAnchor?,
        propertySet: ValueSet?): SpatialEntity? {
      val fnPtr = _1492224134_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntity>()
      val hr = fn.invokeHR(arrayOf(__1492224134_Ptr, marshalToNative(spatialAnchor),
          marshalToNative(propertySet), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntity>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntityFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492224134_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1f1e325349f4225a2f34b01c15fe056")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityFactory(ptr: Pointer?): WithDefault =
        ISpatialEntityFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityFactory {
      val address = segment.toRawLongValue()
      return makeISpatialEntityFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492224134_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityFactory): Array<ISpatialEntityFactory?> =
        (elements as
        Array<ISpatialEntityFactory?>).castToImpl<ISpatialEntityFactory,ISpatialEntityFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityFactory?> =
        arrayOfNulls<ISpatialEntityFactory_Impl>(size) as Array<ISpatialEntityFactory?>
  }
}
