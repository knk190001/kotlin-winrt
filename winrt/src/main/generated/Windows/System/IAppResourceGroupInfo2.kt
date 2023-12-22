package Windows.System

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

@ABIMarker(IAppResourceGroupInfo2.ABI::class)
@Signature("{ee9b236d-d305-4d6b-92f7-6afdad72dedc}")
@Guid("ee9b236dd3054d6b92f76afdad72dedc")
@WinRTInterface("ee9b236dd3054d6b92f76afdad72dedc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupInfo2.ByReference::class)
public interface IAppResourceGroupInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartSuspendAsync(): IAsyncOperation<AppExecutionStateChangeResult?>?

  @InterfaceMethod(1)
  public fun StartResumeAsync(): IAsyncOperation<AppExecutionStateChangeResult?>?

  @InterfaceMethod(2)
  public fun StartTerminateAsync(): IAsyncOperation<AppExecutionStateChangeResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupInfo2> {
    public override fun getValue() = ABI.makeIAppResourceGroupInfo2(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupInfo2 {
    public val __1679318181_Ptr: Pointer?

    public val _1679318181_VtblPtr: Pointer?
      get() = __1679318181_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartSuspendAsync(): IAsyncOperation<AppExecutionStateChangeResult?>? {
      val fnPtr = _1679318181_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppExecutionStateChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1679318181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppExecutionStateChangeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartResumeAsync(): IAsyncOperation<AppExecutionStateChangeResult?>? {
      val fnPtr = _1679318181_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppExecutionStateChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1679318181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppExecutionStateChangeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartTerminateAsync(): IAsyncOperation<AppExecutionStateChangeResult?>? {
      val fnPtr = _1679318181_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppExecutionStateChangeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1679318181_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppExecutionStateChangeResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppResourceGroupInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1679318181_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee9b236dd3054d6b92f76afdad72dedc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupInfo2(ptr: Pointer?): WithDefault =
        IAppResourceGroupInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupInfo2 {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1679318181_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupInfo2): Array<IAppResourceGroupInfo2?> =
        (elements as
        Array<IAppResourceGroupInfo2?>).castToImpl<IAppResourceGroupInfo2,IAppResourceGroupInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupInfo2?> =
        arrayOfNulls<IAppResourceGroupInfo2_Impl>(size) as Array<IAppResourceGroupInfo2?>
  }
}
