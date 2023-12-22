package Windows.ApplicationModel.Wallet

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

@ABIMarker(IWalletManagerStatics.ABI::class)
@Signature("{5111d6b8-c9a4-4c64-b4dd-e1e548001c0d}")
@Guid("5111d6b8c9a44c64b4dde1e548001c0d")
@WinRTInterface("5111d6b8c9a44c64b4dde1e548001c0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletManagerStatics.ByReference::class)
public interface IWalletManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(): IAsyncOperation<WalletItemStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletManagerStatics> {
    public override fun getValue() = ABI.makeIWalletManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWalletManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletManagerStatics {
    public val __1283440695_Ptr: Pointer?

    public val _1283440695_VtblPtr: Pointer?
      get() = __1283440695_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(): IAsyncOperation<WalletItemStore?>? {
      val fnPtr = _1283440695_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WalletItemStore?>>()
      val hr = fn.invokeHR(arrayOf(__1283440695_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WalletItemStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IWalletManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1283440695_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5111d6b8c9a44c64b4dde1e548001c0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletManagerStatics(ptr: Pointer?): WithDefault =
        IWalletManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWalletManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWalletManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1283440695_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletManagerStatics): Array<IWalletManagerStatics?> =
        (elements as
        Array<IWalletManagerStatics?>).castToImpl<IWalletManagerStatics,IWalletManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletManagerStatics?> =
        arrayOfNulls<IWalletManagerStatics_Impl>(size) as Array<IWalletManagerStatics?>
  }
}
