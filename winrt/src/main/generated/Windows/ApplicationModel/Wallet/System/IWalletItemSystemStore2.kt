package Windows.ApplicationModel.Wallet.System

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

@ABIMarker(IWalletItemSystemStore2.ABI::class)
@Signature("{f98d3a4e-be00-4fdd-9734-6c113c1ac1cb}")
@Guid("f98d3a4ebe004fdd97346c113c1ac1cb")
@WinRTInterface("f98d3a4ebe004fdd97346c113c1ac1cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletItemSystemStore2.ByReference::class)
public interface IWalletItemSystemStore2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ItemsChanged(handler: TypedEventHandler<WalletItemSystemStore?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ItemsChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletItemSystemStore2> {
    public override fun getValue() = ABI.makeIWalletItemSystemStore2(pointer.getPointer(0))

    public fun setValue(value: IWalletItemSystemStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletItemSystemStore2 {
    public val __1600312229_Ptr: Pointer?

    public val _1600312229_VtblPtr: Pointer?
      get() = __1600312229_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ItemsChanged(handler: TypedEventHandler<WalletItemSystemStore?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1600312229_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1600312229_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ItemsChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1600312229_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600312229_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWalletItemSystemStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1600312229_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletItemSystemStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f98d3a4ebe004fdd97346c113c1ac1cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletItemSystemStore2(ptr: Pointer?): WithDefault =
        IWalletItemSystemStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletItemSystemStore2 {
      val address = segment.toRawLongValue()
      return makeIWalletItemSystemStore2(Pointer(address))
    }

    public override fun toNative(obj: IWalletItemSystemStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1600312229_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletItemSystemStore2): Array<IWalletItemSystemStore2?>
        = (elements as
        Array<IWalletItemSystemStore2?>).castToImpl<IWalletItemSystemStore2,IWalletItemSystemStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletItemSystemStore2?> =
        arrayOfNulls<IWalletItemSystemStore2_Impl>(size) as Array<IWalletItemSystemStore2?>
  }
}
