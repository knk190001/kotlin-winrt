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

@ABIMarker(IProtectedContentRevokedEventArgs.ABI::class)
@Signature("{63686821-58b9-47ee-93d9-f0f741cf43f0}")
@Guid("6368682158b947ee93d9f0f741cf43f0")
@WinRTInterface("6368682158b947ee93d9f0f741cf43f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectedContentRevokedEventArgs.ByReference::class)
public interface IProtectedContentRevokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Identities(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectedContentRevokedEventArgs> {
    public override fun getValue() =
        ABI.makeIProtectedContentRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProtectedContentRevokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectedContentRevokedEventArgs {
    public val __1749137983_Ptr: Pointer?

    public val _1749137983_VtblPtr: Pointer?
      get() = __1749137983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Identities(): IVectorView<String?>? {
      val fnPtr = _1749137983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1749137983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IProtectedContentRevokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1749137983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectedContentRevokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6368682158b947ee93d9f0f741cf43f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectedContentRevokedEventArgs(ptr: Pointer?): WithDefault =
        IProtectedContentRevokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectedContentRevokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIProtectedContentRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProtectedContentRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1749137983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectedContentRevokedEventArgs):
        Array<IProtectedContentRevokedEventArgs?> = (elements as
        Array<IProtectedContentRevokedEventArgs?>).castToImpl<IProtectedContentRevokedEventArgs,IProtectedContentRevokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectedContentRevokedEventArgs?> =
        arrayOfNulls<IProtectedContentRevokedEventArgs_Impl>(size) as
        Array<IProtectedContentRevokedEventArgs?>
  }
}
