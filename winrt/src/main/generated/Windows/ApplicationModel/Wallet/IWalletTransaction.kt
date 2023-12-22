package Windows.ApplicationModel.Wallet

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWalletTransaction.ABI::class)
@Signature("{40e1e940-2606-4519-81cb-bff1c60d1f79}")
@Guid("40e1e9402606451981cbbff1c60d1f79")
@WinRTInterface("40e1e9402606451981cbbff1c60d1f79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletTransaction.ByReference::class)
public interface IWalletTransaction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Description(): String?

  @InterfaceMethod(1)
  public fun put_Description(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayAmount(): String?

  @InterfaceMethod(3)
  public fun put_DisplayAmount(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IgnoreTimeOfDay(): Boolean

  @InterfaceMethod(5)
  public fun put_IgnoreTimeOfDay(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_DisplayLocation(): String?

  @InterfaceMethod(7)
  public fun put_DisplayLocation(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_TransactionDate(): IReference<DateTime?>?

  @InterfaceMethod(9)
  public fun put_TransactionDate(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(10)
  public fun get_IsLaunchable(): Boolean

  @InterfaceMethod(11)
  public fun put_IsLaunchable(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletTransaction> {
    public override fun getValue() = ABI.makeIWalletTransaction(pointer.getPointer(0))

    public fun setValue(value: IWalletTransaction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletTransaction {
    public val __312520097_Ptr: Pointer?

    public val _312520097_VtblPtr: Pointer?
      get() = __312520097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): String? {
      val fnPtr = _312520097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Description(value: String?): Unit {
      val fnPtr = _312520097_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayAmount(): String? {
      val fnPtr = _312520097_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayAmount(value: String?): Unit {
      val fnPtr = _312520097_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IgnoreTimeOfDay(): Boolean {
      val fnPtr = _312520097_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IgnoreTimeOfDay(value: Boolean): Unit {
      val fnPtr = _312520097_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DisplayLocation(): String? {
      val fnPtr = _312520097_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_DisplayLocation(value: String?): Unit {
      val fnPtr = _312520097_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TransactionDate(): IReference<DateTime?>? {
      val fnPtr = _312520097_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TransactionDate(value: IReference<DateTime?>?): Unit {
      val fnPtr = _312520097_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsLaunchable(): Boolean {
      val fnPtr = _312520097_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsLaunchable(value: Boolean): Unit {
      val fnPtr = _312520097_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__312520097_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWalletTransaction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __312520097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletTransaction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40e1e9402606451981cbbff1c60d1f79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletTransaction(ptr: Pointer?): WithDefault = IWalletTransaction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletTransaction {
      val address = segment.toRawLongValue()
      return makeIWalletTransaction(Pointer(address))
    }

    public override fun toNative(obj: IWalletTransaction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__312520097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletTransaction): Array<IWalletTransaction?> =
        (elements as
        Array<IWalletTransaction?>).castToImpl<IWalletTransaction,IWalletTransaction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletTransaction?> =
        arrayOfNulls<IWalletTransaction_Impl>(size) as Array<IWalletTransaction?>
  }
}
