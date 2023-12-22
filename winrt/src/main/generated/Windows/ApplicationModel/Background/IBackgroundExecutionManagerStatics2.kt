package Windows.ApplicationModel.Background

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundExecutionManagerStatics2.ABI::class)
@Signature("{469b24ef-9bbb-4e18-999a-fd6512931be9}")
@Guid("469b24ef9bbb4e18999afd6512931be9")
@WinRTInterface("469b24ef9bbb4e18999afd6512931be9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundExecutionManagerStatics2.ByReference::class)
public interface IBackgroundExecutionManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessKindAsync(requestedAccess: BackgroundAccessRequestKind?, reason: String?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundExecutionManagerStatics2> {
    public override fun getValue() =
        ABI.makeIBackgroundExecutionManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IBackgroundExecutionManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundExecutionManagerStatics2 {
    public val __689249631_Ptr: Pointer?

    public val _689249631_VtblPtr: Pointer?
      get() = __689249631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessKindAsync(requestedAccess: BackgroundAccessRequestKind?,
        reason: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _689249631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__689249631_Ptr, marshalToNative(requestedAccess),
          marshalToNative(reason), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundExecutionManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __689249631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundExecutionManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("469b24ef9bbb4e18999afd6512931be9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundExecutionManagerStatics2(ptr: Pointer?): WithDefault =
        IBackgroundExecutionManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundExecutionManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIBackgroundExecutionManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundExecutionManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__689249631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundExecutionManagerStatics2):
        Array<IBackgroundExecutionManagerStatics2?> = (elements as
        Array<IBackgroundExecutionManagerStatics2?>).castToImpl<IBackgroundExecutionManagerStatics2,IBackgroundExecutionManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundExecutionManagerStatics2?> =
        arrayOfNulls<IBackgroundExecutionManagerStatics2_Impl>(size) as
        Array<IBackgroundExecutionManagerStatics2?>
  }
}
