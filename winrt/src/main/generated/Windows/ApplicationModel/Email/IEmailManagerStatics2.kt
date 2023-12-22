package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailManagerStatics2.ABI::class)
@Signature("{ac052da3-b194-425d-b6d9-d0f04135eda2}")
@Guid("ac052da3b194425db6d9d0f04135eda2")
@WinRTInterface("ac052da3b194425db6d9d0f04135eda2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailManagerStatics2.ByReference::class)
public interface IEmailManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(accessType: EmailStoreAccessType?): IAsyncOperation<EmailStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailManagerStatics2> {
    public override fun getValue() = ABI.makeIEmailManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IEmailManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailManagerStatics2 {
    public val __1419544395_Ptr: Pointer?

    public val _1419544395_VtblPtr: Pointer?
      get() = __1419544395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(accessType: EmailStoreAccessType?):
        IAsyncOperation<EmailStore?>? {
      val fnPtr = _1419544395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EmailStore?>>()
      val hr = fn.invokeHR(arrayOf(__1419544395_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EmailStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1419544395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac052da3b194425db6d9d0f04135eda2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailManagerStatics2(ptr: Pointer?): WithDefault =
        IEmailManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIEmailManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IEmailManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1419544395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailManagerStatics2): Array<IEmailManagerStatics2?> =
        (elements as
        Array<IEmailManagerStatics2?>).castToImpl<IEmailManagerStatics2,IEmailManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailManagerStatics2?> =
        arrayOfNulls<IEmailManagerStatics2_Impl>(size) as Array<IEmailManagerStatics2?>
  }
}
