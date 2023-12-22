package Windows.ApplicationModel.Resources.Management

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
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

@ABIMarker(IResourceIndexer.ABI::class)
@Signature("{2d4cf9a5-e32f-4ab2-8748-96350a016da3}")
@Guid("2d4cf9a5e32f4ab2874896350a016da3")
@WinRTInterface("2d4cf9a5e32f4ab2874896350a016da3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceIndexer.ByReference::class)
public interface IResourceIndexer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IndexFilePath(filePath: Uri?): IndexedResourceCandidate?

  @InterfaceMethod(1)
  public fun IndexFileContentsAsync(`file`: Uri?):
      IAsyncOperation<IVectorView<IndexedResourceCandidate?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceIndexer> {
    public override fun getValue() = ABI.makeIResourceIndexer(pointer.getPointer(0))

    public fun setValue(value: IResourceIndexer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceIndexer {
    public val __396377826_Ptr: Pointer?

    public val _396377826_VtblPtr: Pointer?
      get() = __396377826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IndexFilePath(filePath: Uri?): IndexedResourceCandidate? {
      val fnPtr = _396377826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IndexedResourceCandidate>()
      val hr = fn.invokeHR(arrayOf(__396377826_Ptr, marshalToNative(filePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IndexedResourceCandidate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IndexFileContentsAsync(`file`: Uri?):
        IAsyncOperation<IVectorView<IndexedResourceCandidate?>?>? {
      val fnPtr = _396377826_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<IndexedResourceCandidate?>?>>()
      val hr = fn.invokeHR(arrayOf(__396377826_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<IndexedResourceCandidate?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceIndexer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396377826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceIndexer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d4cf9a5e32f4ab2874896350a016da3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceIndexer(ptr: Pointer?): WithDefault = IResourceIndexer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceIndexer {
      val address = segment.toRawLongValue()
      return makeIResourceIndexer(Pointer(address))
    }

    public override fun toNative(obj: IResourceIndexer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396377826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceIndexer): Array<IResourceIndexer?> = (elements as
        Array<IResourceIndexer?>).castToImpl<IResourceIndexer,IResourceIndexer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceIndexer?> =
        arrayOfNulls<IResourceIndexer_Impl>(size) as Array<IResourceIndexer?>
  }
}
