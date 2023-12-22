package Windows.Media.Editing

import Windows.Foundation.IAsyncOperation
import Windows.Storage.StorageFile
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

@ABIMarker(IMediaCompositionStatics.ABI::class)
@Signature("{87a08f04-e32a-45ce-8f66-a30df0766224}")
@Guid("87a08f04e32a45ce8f66a30df0766224")
@WinRTInterface("87a08f04e32a45ce8f66a30df0766224")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCompositionStatics.ByReference::class)
public interface IMediaCompositionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadAsync(`file`: StorageFile?): IAsyncOperation<MediaComposition?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCompositionStatics> {
    public override fun getValue() = ABI.makeIMediaCompositionStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaCompositionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCompositionStatics {
    public val __1813927737_Ptr: Pointer?

    public val _1813927737_VtblPtr: Pointer?
      get() = __1813927737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadAsync(`file`: StorageFile?): IAsyncOperation<MediaComposition?>? {
      val fnPtr = _1813927737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaComposition?>>()
      val hr = fn.invokeHR(arrayOf(__1813927737_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaComposition?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCompositionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813927737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCompositionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87a08f04e32a45ce8f66a30df0766224")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCompositionStatics(ptr: Pointer?): WithDefault =
        IMediaCompositionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCompositionStatics {
      val address = segment.toRawLongValue()
      return makeIMediaCompositionStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaCompositionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813927737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCompositionStatics):
        Array<IMediaCompositionStatics?> = (elements as
        Array<IMediaCompositionStatics?>).castToImpl<IMediaCompositionStatics,IMediaCompositionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCompositionStatics?> =
        arrayOfNulls<IMediaCompositionStatics_Impl>(size) as Array<IMediaCompositionStatics?>
  }
}
