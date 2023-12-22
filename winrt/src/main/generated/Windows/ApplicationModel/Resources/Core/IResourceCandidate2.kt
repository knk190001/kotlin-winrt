package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IResourceCandidate2.ABI::class)
@Signature("{69e5b468-f6fc-4013-aaa2-d53f1757d3b5}")
@Guid("69e5b468f6fc4013aaa2d53f1757d3b5")
@WinRTInterface("69e5b468f6fc4013aaa2d53f1757d3b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceCandidate2.ByReference::class)
public interface IResourceCandidate2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetValueAsStreamAsync(): IAsyncOperation<IRandomAccessStream?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceCandidate2> {
    public override fun getValue() = ABI.makeIResourceCandidate2(pointer.getPointer(0))

    public fun setValue(value: IResourceCandidate2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceCandidate2 {
    public val __1963903860_Ptr: Pointer?

    public val _1963903860_VtblPtr: Pointer?
      get() = __1963903860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetValueAsStreamAsync(): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _1963903860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__1963903860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }
  }

  public class IResourceCandidate2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1963903860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceCandidate2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69e5b468f6fc4013aaa2d53f1757d3b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceCandidate2(ptr: Pointer?): WithDefault = IResourceCandidate2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceCandidate2 {
      val address = segment.toRawLongValue()
      return makeIResourceCandidate2(Pointer(address))
    }

    public override fun toNative(obj: IResourceCandidate2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1963903860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceCandidate2): Array<IResourceCandidate2?> =
        (elements as
        Array<IResourceCandidate2?>).castToImpl<IResourceCandidate2,IResourceCandidate2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceCandidate2?> =
        arrayOfNulls<IResourceCandidate2_Impl>(size) as Array<IResourceCandidate2?>
  }
}
