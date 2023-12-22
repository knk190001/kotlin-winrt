package Windows.ApplicationModel.Wallet

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IWalletItemStore2.ABI::class)
@Signature("{65e682f0-7009-4a15-bd54-4fff379bffe2}")
@Guid("65e682f070094a15bd544fff379bffe2")
@WinRTInterface("65e682f070094a15bd544fff379bffe2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemStore2.ByReference::class)
public interface IWalletItemStore2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ItemsChanged(handler: TypedEventHandler<WalletItemStore?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ItemsChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemStore2> {
    public override fun getValue() = ABI.makeIWalletItemStore2(pointer.getPointer(0))

    public fun setValue(value: IWalletItemStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemStore2 {
    public val __572801853_Ptr: Pointer?

    public val _572801853_VtblPtr: Pointer?
      get() = __572801853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ItemsChanged(handler: TypedEventHandler<WalletItemStore?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _572801853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__572801853_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ItemsChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _572801853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__572801853_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWalletItemStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __572801853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65e682f070094a15bd544fff379bffe2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemStore2(ptr: Pointer?): WithDefault = IWalletItemStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemStore2 {
      val address = segment.toRawLongValue()
      return makeIWalletItemStore2(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__572801853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemStore2): Array<IWalletItemStore2?> = (elements
        as Array<IWalletItemStore2?>).castToImpl<IWalletItemStore2,IWalletItemStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemStore2?> =
        arrayOfNulls<IWalletItemStore2_Impl>(size) as Array<IWalletItemStore2?>
  }
}
