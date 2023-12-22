package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IShareTargetInfo.ABI::class)
@Signature("{385be607-c6e8-4114-b294-28f3bb6f9904}")
@Guid("385be607c6e84114b29428f3bb6f9904")
@WinRTInterface("385be607c6e84114b29428f3bb6f9904")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareTargetInfo.ByReference::class)
public interface IShareTargetInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppUserModelId(): String?

  @InterfaceMethod(1)
  public fun get_ShareProvider(): ShareProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareTargetInfo> {
    public override fun getValue() = ABI.makeIShareTargetInfo(pointer.getPointer(0))

    public fun setValue(value: IShareTargetInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareTargetInfo {
    public val __579319532_Ptr: Pointer?

    public val _579319532_VtblPtr: Pointer?
      get() = __579319532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppUserModelId(): String? {
      val fnPtr = _579319532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__579319532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShareProvider(): ShareProvider? {
      val fnPtr = _579319532_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareProvider>()
      val hr = fn.invokeHR(arrayOf(__579319532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareProvider>(result.getValue())
      return resultValue
    }
  }

  public class IShareTargetInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __579319532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareTargetInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("385be607c6e84114b29428f3bb6f9904")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareTargetInfo(ptr: Pointer?): WithDefault = IShareTargetInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareTargetInfo {
      val address = segment.toRawLongValue()
      return makeIShareTargetInfo(Pointer(address))
    }

    public override fun toNative(obj: IShareTargetInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__579319532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareTargetInfo): Array<IShareTargetInfo?> = (elements as
        Array<IShareTargetInfo?>).castToImpl<IShareTargetInfo,IShareTargetInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareTargetInfo?> =
        arrayOfNulls<IShareTargetInfo_Impl>(size) as Array<IShareTargetInfo?>
  }
}
