package Windows.Services.TargetedContent

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITargetedContentContainerStatics.ABI::class)
@Signature("{5b47e7fb-2140-4c1f-a736-c59583f227d8}")
@Guid("5b47e7fb21404c1fa736c59583f227d8")
@WinRTInterface("5b47e7fb21404c1fa736c59583f227d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentContainerStatics.ByReference::class)
public interface ITargetedContentContainerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAsync(contentId: String?): IAsyncOperation<TargetedContentContainer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentContainerStatics> {
    public override fun getValue() = ABI.makeITargetedContentContainerStatics(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentContainerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentContainerStatics {
    public val __949283080_Ptr: Pointer?

    public val _949283080_VtblPtr: Pointer?
      get() = __949283080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAsync(contentId: String?): IAsyncOperation<TargetedContentContainer?>? {
      val fnPtr = _949283080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<TargetedContentContainer?>>()
      val hr = fn.invokeHR(arrayOf(__949283080_Ptr, marshalToNative(contentId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<TargetedContentContainer?>>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentContainerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __949283080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentContainerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b47e7fb21404c1fa736c59583f227d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentContainerStatics(ptr: Pointer?): WithDefault =
        ITargetedContentContainerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentContainerStatics {
      val address = segment.toRawLongValue()
      return makeITargetedContentContainerStatics(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentContainerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__949283080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentContainerStatics):
        Array<ITargetedContentContainerStatics?> = (elements as
        Array<ITargetedContentContainerStatics?>).castToImpl<ITargetedContentContainerStatics,ITargetedContentContainerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentContainerStatics?> =
        arrayOfNulls<ITargetedContentContainerStatics_Impl>(size) as
        Array<ITargetedContentContainerStatics?>
  }
}
