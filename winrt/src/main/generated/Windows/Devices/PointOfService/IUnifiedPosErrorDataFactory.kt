package Windows.Devices.PointOfService

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUnifiedPosErrorDataFactory.ABI::class)
@Signature("{4b982551-1ffe-451b-a368-63e0ce465f5a}")
@Guid("4b9825511ffe451ba36863e0ce465f5a")
@WinRTInterface("4b9825511ffe451ba36863e0ce465f5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnifiedPosErrorDataFactory.ByReference::class)
public interface IUnifiedPosErrorDataFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    message: String?,
    severity: UnifiedPosErrorSeverity?,
    reason: UnifiedPosErrorReason?,
    extendedReason: WinDef.UINT
  ): UnifiedPosErrorData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUnifiedPosErrorDataFactory> {
    public override fun getValue() = ABI.makeIUnifiedPosErrorDataFactory(pointer.getPointer(0))

    public fun setValue(value: IUnifiedPosErrorDataFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnifiedPosErrorDataFactory {
    public val __1177186489_Ptr: Pointer?

    public val _1177186489_VtblPtr: Pointer?
      get() = __1177186489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      message: String?,
      severity: UnifiedPosErrorSeverity?,
      reason: UnifiedPosErrorReason?,
      extendedReason: WinDef.UINT
    ): UnifiedPosErrorData? {
      val fnPtr = _1177186489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosErrorData>()
      val hr = fn.invokeHR(arrayOf(__1177186489_Ptr, marshalToNative(message),
          marshalToNative(severity), marshalToNative(reason), extendedReason, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosErrorData>(result.getValue())
      return resultValue
    }
  }

  public class IUnifiedPosErrorDataFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1177186489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnifiedPosErrorDataFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b9825511ffe451ba36863e0ce465f5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnifiedPosErrorDataFactory(ptr: Pointer?): WithDefault =
        IUnifiedPosErrorDataFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnifiedPosErrorDataFactory {
      val address = segment.toRawLongValue()
      return makeIUnifiedPosErrorDataFactory(Pointer(address))
    }

    public override fun toNative(obj: IUnifiedPosErrorDataFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177186489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnifiedPosErrorDataFactory):
        Array<IUnifiedPosErrorDataFactory?> = (elements as
        Array<IUnifiedPosErrorDataFactory?>).castToImpl<IUnifiedPosErrorDataFactory,IUnifiedPosErrorDataFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnifiedPosErrorDataFactory?> =
        arrayOfNulls<IUnifiedPosErrorDataFactory_Impl>(size) as Array<IUnifiedPosErrorDataFactory?>
  }
}
