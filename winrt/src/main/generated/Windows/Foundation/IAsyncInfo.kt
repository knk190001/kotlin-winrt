package Windows.Foundation

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAsyncInfo.ABI::class)
@Signature("{00000036-0000-0000-c000-000000000046}")
@Guid("0000003600000000c000000000000046")
@WinRTInterface("0000003600000000c000000000000046")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAsyncInfo.ByReference::class)
public interface IAsyncInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Status(): AsyncStatus?

  @InterfaceMethod(2)
  public fun get_ErrorCode(): HResult?

  @InterfaceMethod(3)
  public fun Cancel(): Unit

  @InterfaceMethod(4)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAsyncInfo> {
    public override fun getValue() = ABI.makeIAsyncInfo(pointer.getPointer(0))

    public fun setValue(value: IAsyncInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAsyncInfo {
    public val __1646648641_Ptr: Pointer?

    public val _1646648641_VtblPtr: Pointer?
      get() = __1646648641_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): WinDef.UINT {
      val fnPtr = _1646648641_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1646648641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Status(): AsyncStatus? {
      val fnPtr = _1646648641_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AsyncStatus>()
      val hr = fn.invokeHR(arrayOf(__1646648641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AsyncStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ErrorCode(): HResult? {
      val fnPtr = _1646648641_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1646648641_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Cancel(): Unit {
      val fnPtr = _1646648641_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1646648641_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Close(): Unit {
      val fnPtr = _1646648641_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1646648641_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAsyncInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1646648641_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAsyncInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0000003600000000c000000000000046")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAsyncInfo(ptr: Pointer?): WithDefault = IAsyncInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAsyncInfo {
      val address = segment.toRawLongValue()
      return makeIAsyncInfo(Pointer(address))
    }

    public override fun toNative(obj: IAsyncInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1646648641_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAsyncInfo): Array<IAsyncInfo?> = (elements as
        Array<IAsyncInfo?>).castToImpl<IAsyncInfo,IAsyncInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAsyncInfo?> = arrayOfNulls<IAsyncInfo_Impl>(size)
        as Array<IAsyncInfo?>
  }
}
