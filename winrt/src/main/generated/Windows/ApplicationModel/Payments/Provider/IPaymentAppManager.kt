package Windows.ApplicationModel.Payments.Provider

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IPaymentAppManager.ABI::class)
@Signature("{0e47aa53-8521-4969-a957-df2538a3a98f}")
@Guid("0e47aa5385214969a957df2538a3a98f")
@WinRTInterface("0e47aa5385214969a957df2538a3a98f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentAppManager.ByReference::class)
public interface IPaymentAppManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterAsync(supportedPaymentMethodIds: IIterable<String?>?): IAsyncAction?

  @InterfaceMethod(1)
  public fun UnregisterAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentAppManager> {
    public override fun getValue() = ABI.makeIPaymentAppManager(pointer.getPointer(0))

    public fun setValue(value: IPaymentAppManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentAppManager {
    public val __2079169071_Ptr: Pointer?

    public val _2079169071_VtblPtr: Pointer?
      get() = __2079169071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterAsync(supportedPaymentMethodIds: IIterable<String?>?):
        IAsyncAction? {
      val fnPtr = _2079169071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2079169071_Ptr, marshalToNative(supportedPaymentMethodIds),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnregisterAsync(): IAsyncAction? {
      val fnPtr = _2079169071_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2079169071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentAppManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2079169071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentAppManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e47aa5385214969a957df2538a3a98f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentAppManager(ptr: Pointer?): WithDefault = IPaymentAppManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentAppManager {
      val address = segment.toRawLongValue()
      return makeIPaymentAppManager(Pointer(address))
    }

    public override fun toNative(obj: IPaymentAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2079169071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentAppManager): Array<IPaymentAppManager?> =
        (elements as
        Array<IPaymentAppManager?>).castToImpl<IPaymentAppManager,IPaymentAppManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentAppManager?> =
        arrayOfNulls<IPaymentAppManager_Impl>(size) as Array<IPaymentAppManager?>
  }
}
