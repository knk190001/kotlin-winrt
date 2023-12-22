package Windows.Perception.Spatial

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IInputStream
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialAnchorTransferManagerStatics.ABI::class)
@Signature("{03bbf9b9-12d8-4bce-8835-c5df3ac0adab}")
@Guid("03bbf9b912d84bce8835c5df3ac0adab")
@WinRTInterface("03bbf9b912d84bce8835c5df3ac0adab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorTransferManagerStatics.ByReference::class)
public interface ISpatialAnchorTransferManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryImportAnchorsAsync(stream: IInputStream?): IAsyncOperation<IMapView<String?,
      SpatialAnchor?>?>?

  @InterfaceMethod(1)
  public fun TryExportAnchorsAsync(anchors: IIterable<IKeyValuePair<String?, SpatialAnchor?>?>?,
      stream: IOutputStream?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun RequestAccessAsync(): IAsyncOperation<SpatialPerceptionAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorTransferManagerStatics> {
    public override fun getValue() =
        ABI.makeISpatialAnchorTransferManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorTransferManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorTransferManagerStatics {
    public val __17309305_Ptr: Pointer?

    public val _17309305_VtblPtr: Pointer?
      get() = __17309305_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryImportAnchorsAsync(stream: IInputStream?):
        IAsyncOperation<IMapView<String?, SpatialAnchor?>?>? {
      val fnPtr = _17309305_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMapView<String?, SpatialAnchor?>?>>()
      val hr = fn.invokeHR(arrayOf(__17309305_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMapView<String?,
          SpatialAnchor?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryExportAnchorsAsync(anchors: IIterable<IKeyValuePair<String?,
        SpatialAnchor?>?>?, stream: IOutputStream?): IAsyncOperation<Boolean>? {
      val fnPtr = _17309305_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__17309305_Ptr, marshalToNative(anchors),
          marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestAccessAsync(): IAsyncOperation<SpatialPerceptionAccessStatus?>? {
      val fnPtr = _17309305_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpatialPerceptionAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__17309305_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SpatialPerceptionAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAnchorTransferManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __17309305_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorTransferManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03bbf9b912d84bce8835c5df3ac0adab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorTransferManagerStatics(ptr: Pointer?): WithDefault =
        ISpatialAnchorTransferManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchorTransferManagerStatics {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorTransferManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorTransferManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__17309305_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorTransferManagerStatics):
        Array<ISpatialAnchorTransferManagerStatics?> = (elements as
        Array<ISpatialAnchorTransferManagerStatics?>).castToImpl<ISpatialAnchorTransferManagerStatics,ISpatialAnchorTransferManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchorTransferManagerStatics?> =
        arrayOfNulls<ISpatialAnchorTransferManagerStatics_Impl>(size) as
        Array<ISpatialAnchorTransferManagerStatics?>
  }
}
