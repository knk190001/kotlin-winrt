package Windows.Services.Store

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreSubscriptionInfo.ABI::class)
@Signature("{4189776a-0559-43ac-a9c6-3ab0011fb8eb}")
@Guid("4189776a055943aca9c63ab0011fb8eb")
@WinRTInterface("4189776a055943aca9c63ab0011fb8eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreSubscriptionInfo.ByReference::class)
public interface IStoreSubscriptionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BillingPeriod(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_BillingPeriodUnit(): StoreDurationUnit?

  @InterfaceMethod(2)
  public fun get_HasTrialPeriod(): Boolean

  @InterfaceMethod(3)
  public fun get_TrialPeriod(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_TrialPeriodUnit(): StoreDurationUnit?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreSubscriptionInfo> {
    public override fun getValue() = ABI.makeIStoreSubscriptionInfo(pointer.getPointer(0))

    public fun setValue(value: IStoreSubscriptionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreSubscriptionInfo {
    public val __969713375_Ptr: Pointer?

    public val _969713375_VtblPtr: Pointer?
      get() = __969713375_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BillingPeriod(): WinDef.UINT {
      val fnPtr = _969713375_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__969713375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_BillingPeriodUnit(): StoreDurationUnit? {
      val fnPtr = _969713375_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreDurationUnit>()
      val hr = fn.invokeHR(arrayOf(__969713375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreDurationUnit>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HasTrialPeriod(): Boolean {
      val fnPtr = _969713375_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__969713375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_TrialPeriod(): WinDef.UINT {
      val fnPtr = _969713375_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__969713375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_TrialPeriodUnit(): StoreDurationUnit? {
      val fnPtr = _969713375_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreDurationUnit>()
      val hr = fn.invokeHR(arrayOf(__969713375_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreDurationUnit>(result.getValue())
      return resultValue
    }
  }

  public class IStoreSubscriptionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __969713375_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreSubscriptionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4189776a055943aca9c63ab0011fb8eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreSubscriptionInfo(ptr: Pointer?): WithDefault =
        IStoreSubscriptionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreSubscriptionInfo {
      val address = segment.toRawLongValue()
      return makeIStoreSubscriptionInfo(Pointer(address))
    }

    public override fun toNative(obj: IStoreSubscriptionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__969713375_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreSubscriptionInfo): Array<IStoreSubscriptionInfo?> =
        (elements as
        Array<IStoreSubscriptionInfo?>).castToImpl<IStoreSubscriptionInfo,IStoreSubscriptionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreSubscriptionInfo?> =
        arrayOfNulls<IStoreSubscriptionInfo_Impl>(size) as Array<IStoreSubscriptionInfo?>
  }
}
