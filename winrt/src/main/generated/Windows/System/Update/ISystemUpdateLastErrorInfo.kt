package Windows.System.Update

import Windows.Foundation.HResult
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemUpdateLastErrorInfo.ABI::class)
@Signature("{7ee887f7-8a44-5b6e-bd07-7aece4116ea9}")
@Guid("7ee887f78a445b6ebd077aece4116ea9")
@WinRTInterface("7ee887f78a445b6ebd077aece4116ea9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemUpdateLastErrorInfo.ByReference::class)
public interface ISystemUpdateLastErrorInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): SystemUpdateManagerState?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(2)
  public fun get_IsInteractive(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemUpdateLastErrorInfo> {
    public override fun getValue() = ABI.makeISystemUpdateLastErrorInfo(pointer.getPointer(0))

    public fun setValue(value: ISystemUpdateLastErrorInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemUpdateLastErrorInfo {
    public val __1995472508_Ptr: Pointer?

    public val _1995472508_VtblPtr: Pointer?
      get() = __1995472508_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): SystemUpdateManagerState? {
      val fnPtr = _1995472508_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemUpdateManagerState>()
      val hr = fn.invokeHR(arrayOf(__1995472508_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemUpdateManagerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1995472508_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1995472508_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsInteractive(): Boolean {
      val fnPtr = _1995472508_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1995472508_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISystemUpdateLastErrorInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1995472508_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemUpdateLastErrorInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ee887f78a445b6ebd077aece4116ea9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemUpdateLastErrorInfo(ptr: Pointer?): WithDefault =
        ISystemUpdateLastErrorInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemUpdateLastErrorInfo {
      val address = segment.toRawLongValue()
      return makeISystemUpdateLastErrorInfo(Pointer(address))
    }

    public override fun toNative(obj: ISystemUpdateLastErrorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1995472508_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemUpdateLastErrorInfo):
        Array<ISystemUpdateLastErrorInfo?> = (elements as
        Array<ISystemUpdateLastErrorInfo?>).castToImpl<ISystemUpdateLastErrorInfo,ISystemUpdateLastErrorInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemUpdateLastErrorInfo?> =
        arrayOfNulls<ISystemUpdateLastErrorInfo_Impl>(size) as Array<ISystemUpdateLastErrorInfo?>
  }
}
