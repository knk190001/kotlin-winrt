package Windows.Perception.Spatial

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(ISpatialAnchorExporter.ABI::class)
@Signature("{9a2a4338-24fb-4269-89c5-88304aeef20f}")
@Guid("9a2a433824fb426989c588304aeef20f")
@WinRTInterface("9a2a433824fb426989c588304aeef20f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorExporter.ByReference::class)
public interface ISpatialAnchorExporter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAnchorExportSufficiencyAsync(anchor: SpatialAnchor?,
      purpose: SpatialAnchorExportPurpose?): IAsyncOperation<SpatialAnchorExportSufficiency?>?

  @InterfaceMethod(1)
  public fun TryExportAnchorAsync(
    anchor: SpatialAnchor?,
    purpose: SpatialAnchorExportPurpose?,
    stream: IOutputStream?
  ): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorExporter> {
    public override fun getValue() = ABI.makeISpatialAnchorExporter(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorExporter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorExporter {
    public val __1048475593_Ptr: Pointer?

    public val _1048475593_VtblPtr: Pointer?
      get() = __1048475593_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAnchorExportSufficiencyAsync(anchor: SpatialAnchor?,
        purpose: SpatialAnchorExportPurpose?): IAsyncOperation<SpatialAnchorExportSufficiency?>? {
      val fnPtr = _1048475593_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialAnchorExportSufficiency?>>()
      val hr = fn.invokeHR(arrayOf(__1048475593_Ptr, marshalToNative(anchor),
          marshalToNative(purpose), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpatialAnchorExportSufficiency?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryExportAnchorAsync(
      anchor: SpatialAnchor?,
      purpose: SpatialAnchorExportPurpose?,
      stream: IOutputStream?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1048475593_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1048475593_Ptr, marshalToNative(anchor),
          marshalToNative(purpose), marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAnchorExporter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1048475593_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorExporter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a2a433824fb426989c588304aeef20f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorExporter(ptr: Pointer?): WithDefault =
        ISpatialAnchorExporter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchorExporter {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorExporter(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorExporter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1048475593_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorExporter): Array<ISpatialAnchorExporter?> =
        (elements as
        Array<ISpatialAnchorExporter?>).castToImpl<ISpatialAnchorExporter,ISpatialAnchorExporter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchorExporter?> =
        arrayOfNulls<ISpatialAnchorExporter_Impl>(size) as Array<ISpatialAnchorExporter?>
  }
}
