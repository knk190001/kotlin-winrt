package Windows.Perception.Spatial

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ISpatialAnchorExporterStatics.ABI::class)
@Signature("{ed2507b8-2475-439c-85ff-7fed341fdc88}")
@Guid("ed2507b82475439c85ff7fed341fdc88")
@WinRTInterface("ed2507b82475439c85ff7fed341fdc88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorExporterStatics.ByReference::class)
public interface ISpatialAnchorExporterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): SpatialAnchorExporter?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(): IAsyncOperation<SpatialPerceptionAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorExporterStatics> {
    public override fun getValue() = ABI.makeISpatialAnchorExporterStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorExporterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorExporterStatics {
    public val __1631931506_Ptr: Pointer?

    public val _1631931506_VtblPtr: Pointer?
      get() = __1631931506_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): SpatialAnchorExporter? {
      val fnPtr = _1631931506_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialAnchorExporter>()
      val hr = fn.invokeHR(arrayOf(__1631931506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialAnchorExporter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(): IAsyncOperation<SpatialPerceptionAccessStatus?>? {
      val fnPtr = _1631931506_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialPerceptionAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1631931506_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpatialPerceptionAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAnchorExporterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1631931506_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorExporterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed2507b82475439c85ff7fed341fdc88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorExporterStatics(ptr: Pointer?): WithDefault =
        ISpatialAnchorExporterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchorExporterStatics {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorExporterStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorExporterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1631931506_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorExporterStatics):
        Array<ISpatialAnchorExporterStatics?> = (elements as
        Array<ISpatialAnchorExporterStatics?>).castToImpl<ISpatialAnchorExporterStatics,ISpatialAnchorExporterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchorExporterStatics?> =
        arrayOfNulls<ISpatialAnchorExporterStatics_Impl>(size) as
        Array<ISpatialAnchorExporterStatics?>
  }
}
