package Windows.ApplicationModel.Wallet

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

@ABIMarker(IWalletItemFactory.ABI::class)
@Signature("{53e27470-4f0b-4a3e-99e5-0bbb1eab38d4}")
@Guid("53e274704f0b4a3e99e50bbb1eab38d4")
@WinRTInterface("53e274704f0b4a3e99e50bbb1eab38d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemFactory.ByReference::class)
public interface IWalletItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWalletItem(kind: WalletItemKind?, displayName: String?): WalletItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemFactory> {
    public override fun getValue() = ABI.makeIWalletItemFactory(pointer.getPointer(0))

    public fun setValue(value: IWalletItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemFactory {
    public val __215400952_Ptr: Pointer?

    public val _215400952_VtblPtr: Pointer?
      get() = __215400952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWalletItem(kind: WalletItemKind?, displayName: String?): WalletItem? {
      val fnPtr = _215400952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletItem>()
      val hr = fn.invokeHR(arrayOf(__215400952_Ptr, marshalToNative(kind),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletItem>(result.getValue())
      return resultValue
    }
  }

  public class IWalletItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __215400952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53e274704f0b4a3e99e50bbb1eab38d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemFactory(ptr: Pointer?): WithDefault = IWalletItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemFactory {
      val address = segment.toRawLongValue()
      return makeIWalletItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__215400952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemFactory): Array<IWalletItemFactory?> =
        (elements as
        Array<IWalletItemFactory?>).castToImpl<IWalletItemFactory,IWalletItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemFactory?> =
        arrayOfNulls<IWalletItemFactory_Impl>(size) as Array<IWalletItemFactory?>
  }
}
