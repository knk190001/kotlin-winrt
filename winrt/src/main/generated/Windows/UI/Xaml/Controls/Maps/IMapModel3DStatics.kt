package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IMapModel3DStatics.ABI::class)
@Signature("{4834a480-8e56-4b0f-872d-7ead103187cd}")
@Guid("4834a4808e564b0f872d7ead103187cd")
@WinRTInterface("4834a4808e564b0f872d7ead103187cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapModel3DStatics.ByReference::class)
public interface IMapModel3DStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFrom3MFAsync(source: IRandomAccessStreamReference?):
      IAsyncOperation<MapModel3D?>?

  @InterfaceMethod(1)
  public fun CreateFrom3MFAsync(source: IRandomAccessStreamReference?,
      shadingOption: MapModel3DShadingOption?): IAsyncOperation<MapModel3D?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapModel3DStatics> {
    public override fun getValue() = ABI.makeIMapModel3DStatics(pointer.getPointer(0))

    public fun setValue(value: IMapModel3DStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapModel3DStatics {
    public val __1496048214_Ptr: Pointer?

    public val _1496048214_VtblPtr: Pointer?
      get() = __1496048214_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFrom3MFAsync(source: IRandomAccessStreamReference?):
        IAsyncOperation<MapModel3D?>? {
      val fnPtr = _1496048214_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapModel3D?>>()
      val hr = fn.invokeHR(arrayOf(__1496048214_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapModel3D?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFrom3MFAsync(source: IRandomAccessStreamReference?,
        shadingOption: MapModel3DShadingOption?): IAsyncOperation<MapModel3D?>? {
      val fnPtr = _1496048214_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapModel3D?>>()
      val hr = fn.invokeHR(arrayOf(__1496048214_Ptr, marshalToNative(source),
          marshalToNative(shadingOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapModel3D?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapModel3DStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1496048214_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapModel3DStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4834a4808e564b0f872d7ead103187cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapModel3DStatics(ptr: Pointer?): WithDefault = IMapModel3DStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapModel3DStatics {
      val address = segment.toRawLongValue()
      return makeIMapModel3DStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapModel3DStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1496048214_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapModel3DStatics): Array<IMapModel3DStatics?> =
        (elements as
        Array<IMapModel3DStatics?>).castToImpl<IMapModel3DStatics,IMapModel3DStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapModel3DStatics?> =
        arrayOfNulls<IMapModel3DStatics_Impl>(size) as Array<IMapModel3DStatics?>
  }
}
