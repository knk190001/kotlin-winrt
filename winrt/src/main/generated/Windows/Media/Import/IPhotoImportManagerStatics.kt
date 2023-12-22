package Windows.Media.Import

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportManagerStatics.ABI::class)
@Signature("{2771903d-a046-4f06-9b9c-bfd662e83287}")
@Guid("2771903da0464f069b9cbfd662e83287")
@WinRTInterface("2771903da0464f069b9cbfd662e83287")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportManagerStatics.ByReference::class)
public interface IPhotoImportManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupportedAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun FindAllSourcesAsync(): IAsyncOperation<IVectorView<PhotoImportSource?>?>?

  @InterfaceMethod(2)
  public fun GetPendingOperations(): IVectorView<PhotoImportOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportManagerStatics> {
    public override fun getValue() = ABI.makeIPhotoImportManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportManagerStatics {
    public val __1208296000_Ptr: Pointer?

    public val _1208296000_VtblPtr: Pointer?
      get() = __1208296000_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupportedAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1208296000_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1208296000_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllSourcesAsync(): IAsyncOperation<IVectorView<PhotoImportSource?>?>? {
      val fnPtr = _1208296000_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PhotoImportSource?>?>>()
      val hr = fn.invokeHR(arrayOf(__1208296000_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PhotoImportSource?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPendingOperations(): IVectorView<PhotoImportOperation?>? {
      val fnPtr = _1208296000_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportOperation?>>()
      val hr = fn.invokeHR(arrayOf(__1208296000_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1208296000_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2771903da0464f069b9cbfd662e83287")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportManagerStatics(ptr: Pointer?): WithDefault =
        IPhotoImportManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPhotoImportManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1208296000_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportManagerStatics):
        Array<IPhotoImportManagerStatics?> = (elements as
        Array<IPhotoImportManagerStatics?>).castToImpl<IPhotoImportManagerStatics,IPhotoImportManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportManagerStatics?> =
        arrayOfNulls<IPhotoImportManagerStatics_Impl>(size) as Array<IPhotoImportManagerStatics?>
  }
}
