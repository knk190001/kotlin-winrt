package Windows.Security.Authentication.Web.Provider

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

@ABIMarker(IWebAccountProviderOperation.ABI::class)
@Signature("{6d5d2426-10b1-419a-a44e-f9c5161574e6}")
@Guid("6d5d242610b1419aa44ef9c5161574e6")
@WinRTInterface("6d5d242610b1419aa44ef9c5161574e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderOperation.ByReference::class)
public interface IWebAccountProviderOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): WebAccountProviderOperationKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderOperation> {
    public override fun getValue() = ABI.makeIWebAccountProviderOperation(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderOperation {
    public val __1287167602_Ptr: Pointer?

    public val _1287167602_VtblPtr: Pointer?
      get() = __1287167602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): WebAccountProviderOperationKind? {
      val fnPtr = _1287167602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountProviderOperationKind>()
      val hr = fn.invokeHR(arrayOf(__1287167602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountProviderOperationKind>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1287167602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d5d242610b1419aa44ef9c5161574e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderOperation(ptr: Pointer?): WithDefault =
        IWebAccountProviderOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderOperation {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1287167602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderOperation):
        Array<IWebAccountProviderOperation?> = (elements as
        Array<IWebAccountProviderOperation?>).castToImpl<IWebAccountProviderOperation,IWebAccountProviderOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderOperation?> =
        arrayOfNulls<IWebAccountProviderOperation_Impl>(size) as
        Array<IWebAccountProviderOperation?>
  }
}
