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

@ABIMarker(IWalletItemCustomPropertyFactory.ABI::class)
@Signature("{d0046a44-61a1-41aa-b259-a5610ab5d575}")
@Guid("d0046a4461a141aab259a5610ab5d575")
@WinRTInterface("d0046a4461a141aab259a5610ab5d575")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemCustomPropertyFactory.ByReference::class)
public interface IWalletItemCustomPropertyFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWalletItemCustomProperty(name: String?, value: String?):
      WalletItemCustomProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemCustomPropertyFactory> {
    public override fun getValue() = ABI.makeIWalletItemCustomPropertyFactory(pointer.getPointer(0))

    public fun setValue(value: IWalletItemCustomPropertyFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemCustomPropertyFactory {
    public val __1504594382_Ptr: Pointer?

    public val _1504594382_VtblPtr: Pointer?
      get() = __1504594382_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWalletItemCustomProperty(name: String?, value: String?):
        WalletItemCustomProperty? {
      val fnPtr = _1504594382_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletItemCustomProperty>()
      val hr = fn.invokeHR(arrayOf(__1504594382_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletItemCustomProperty>(result.getValue())
      return resultValue
    }
  }

  public class IWalletItemCustomPropertyFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1504594382_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemCustomPropertyFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0046a4461a141aab259a5610ab5d575")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemCustomPropertyFactory(ptr: Pointer?): WithDefault =
        IWalletItemCustomPropertyFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemCustomPropertyFactory {
      val address = segment.toRawLongValue()
      return makeIWalletItemCustomPropertyFactory(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemCustomPropertyFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1504594382_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemCustomPropertyFactory):
        Array<IWalletItemCustomPropertyFactory?> = (elements as
        Array<IWalletItemCustomPropertyFactory?>).castToImpl<IWalletItemCustomPropertyFactory,IWalletItemCustomPropertyFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemCustomPropertyFactory?> =
        arrayOfNulls<IWalletItemCustomPropertyFactory_Impl>(size) as
        Array<IWalletItemCustomPropertyFactory?>
  }
}
