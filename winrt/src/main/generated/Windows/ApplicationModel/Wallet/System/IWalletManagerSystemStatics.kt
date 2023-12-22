package Windows.ApplicationModel.Wallet.System

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

@ABIMarker(IWalletManagerSystemStatics.ABI::class)
@Signature("{bee8eb89-2634-4b9a-8b23-ee8903c91fe0}")
@Guid("bee8eb8926344b9a8b23ee8903c91fe0")
@WinRTInterface("bee8eb8926344b9a8b23ee8903c91fe0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletManagerSystemStatics.ByReference::class)
public interface IWalletManagerSystemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(): IAsyncOperation<WalletItemSystemStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletManagerSystemStatics> {
    public override fun getValue() = ABI.makeIWalletManagerSystemStatics(pointer.getPointer(0))

    public fun setValue(value: IWalletManagerSystemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletManagerSystemStatics {
    public val __1171681519_Ptr: Pointer?

    public val _1171681519_VtblPtr: Pointer?
      get() = __1171681519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(): IAsyncOperation<WalletItemSystemStore?>? {
      val fnPtr = _1171681519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WalletItemSystemStore?>>()
      val hr = fn.invokeHR(arrayOf(__1171681519_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WalletItemSystemStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IWalletManagerSystemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1171681519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletManagerSystemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bee8eb8926344b9a8b23ee8903c91fe0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletManagerSystemStatics(ptr: Pointer?): WithDefault =
        IWalletManagerSystemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletManagerSystemStatics {
      val address = segment.toRawLongValue()
      return makeIWalletManagerSystemStatics(Pointer(address))
    }

    public override fun toNative(obj: IWalletManagerSystemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1171681519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletManagerSystemStatics):
        Array<IWalletManagerSystemStatics?> = (elements as
        Array<IWalletManagerSystemStatics?>).castToImpl<IWalletManagerSystemStatics,IWalletManagerSystemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletManagerSystemStatics?> =
        arrayOfNulls<IWalletManagerSystemStatics_Impl>(size) as Array<IWalletManagerSystemStatics?>
  }
}
