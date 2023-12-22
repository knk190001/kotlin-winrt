package Windows.Security.EnterpriseData

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IProtectedAccessResumedEventArgs.ABI::class)
@Signature("{ac4dca59-5d80-4e95-8c5f-8539450eebe0}")
@Guid("ac4dca595d804e958c5f8539450eebe0")
@WinRTInterface("ac4dca595d804e958c5f8539450eebe0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectedAccessResumedEventArgs.ByReference::class)
public interface IProtectedAccessResumedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Identities(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectedAccessResumedEventArgs> {
    public override fun getValue() = ABI.makeIProtectedAccessResumedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProtectedAccessResumedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectedAccessResumedEventArgs {
    public val __1069355095_Ptr: Pointer?

    public val _1069355095_VtblPtr: Pointer?
      get() = __1069355095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Identities(): IVectorView<String?>? {
      val fnPtr = _1069355095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1069355095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IProtectedAccessResumedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1069355095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectedAccessResumedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac4dca595d804e958c5f8539450eebe0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectedAccessResumedEventArgs(ptr: Pointer?): WithDefault =
        IProtectedAccessResumedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectedAccessResumedEventArgs {
      val address = segment.toRawLongValue()
      return makeIProtectedAccessResumedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProtectedAccessResumedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1069355095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectedAccessResumedEventArgs):
        Array<IProtectedAccessResumedEventArgs?> = (elements as
        Array<IProtectedAccessResumedEventArgs?>).castToImpl<IProtectedAccessResumedEventArgs,IProtectedAccessResumedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectedAccessResumedEventArgs?> =
        arrayOfNulls<IProtectedAccessResumedEventArgs_Impl>(size) as
        Array<IProtectedAccessResumedEventArgs?>
  }
}
