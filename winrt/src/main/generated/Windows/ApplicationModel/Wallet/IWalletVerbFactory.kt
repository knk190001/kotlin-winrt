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

@ABIMarker(IWalletVerbFactory.ABI::class)
@Signature("{76012771-be58-4d5e-83ed-58b1669c7ad9}")
@Guid("76012771be584d5e83ed58b1669c7ad9")
@WinRTInterface("76012771be584d5e83ed58b1669c7ad9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletVerbFactory.ByReference::class)
public interface IWalletVerbFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWalletVerb(name: String?): WalletVerb?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletVerbFactory> {
    public override fun getValue() = ABI.makeIWalletVerbFactory(pointer.getPointer(0))

    public fun setValue(value: IWalletVerbFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletVerbFactory {
    public val __1559423596_Ptr: Pointer?

    public val _1559423596_VtblPtr: Pointer?
      get() = __1559423596_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWalletVerb(name: String?): WalletVerb? {
      val fnPtr = _1559423596_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WalletVerb>()
      val hr = fn.invokeHR(arrayOf(__1559423596_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WalletVerb>(result.getValue())
      return resultValue
    }
  }

  public class IWalletVerbFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1559423596_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletVerbFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76012771be584d5e83ed58b1669c7ad9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletVerbFactory(ptr: Pointer?): WithDefault = IWalletVerbFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletVerbFactory {
      val address = segment.toRawLongValue()
      return makeIWalletVerbFactory(Pointer(address))
    }

    public override fun toNative(obj: IWalletVerbFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1559423596_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletVerbFactory): Array<IWalletVerbFactory?> =
        (elements as
        Array<IWalletVerbFactory?>).castToImpl<IWalletVerbFactory,IWalletVerbFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletVerbFactory?> =
        arrayOfNulls<IWalletVerbFactory_Impl>(size) as Array<IWalletVerbFactory?>
  }
}
