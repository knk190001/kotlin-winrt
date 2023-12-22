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

@ABIMarker(IBarcodeScannerErrorOccurredEventArgs.ABI::class)
@Signature("{2cd2602f-cf3a-4002-a75a-c5ec468f0a20}")
@Guid("2cd2602fcf3a4002a75ac5ec468f0a20")
@WinRTInterface("2cd2602fcf3a4002a75ac5ec468f0a20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerErrorOccurredEventArgs.ByReference::class)
public interface IBarcodeScannerErrorOccurredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PartialInputData(): BarcodeScannerReport?

  @InterfaceMethod(1)
  public fun get_IsRetriable(): Boolean

  @InterfaceMethod(2)
  public fun get_ErrorData(): UnifiedPosErrorData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerErrorOccurredEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerErrorOccurredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerErrorOccurredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerErrorOccurredEventArgs {
    public val __1130441625_Ptr: Pointer?

    public val _1130441625_VtblPtr: Pointer?
      get() = __1130441625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PartialInputData(): BarcodeScannerReport? {
      val fnPtr = _1130441625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerReport>()
      val hr = fn.invokeHR(arrayOf(__1130441625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeScannerReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsRetriable(): Boolean {
      val fnPtr = _1130441625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1130441625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ErrorData(): UnifiedPosErrorData? {
      val fnPtr = _1130441625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosErrorData>()
      val hr = fn.invokeHR(arrayOf(__1130441625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosErrorData>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerErrorOccurredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1130441625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerErrorOccurredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2cd2602fcf3a4002a75ac5ec468f0a20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerErrorOccurredEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerErrorOccurredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerErrorOccurredEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerErrorOccurredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerErrorOccurredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1130441625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerErrorOccurredEventArgs):
        Array<IBarcodeScannerErrorOccurredEventArgs?> = (elements as
        Array<IBarcodeScannerErrorOccurredEventArgs?>).castToImpl<IBarcodeScannerErrorOccurredEventArgs,IBarcodeScannerErrorOccurredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerErrorOccurredEventArgs?> =
        arrayOfNulls<IBarcodeScannerErrorOccurredEventArgs_Impl>(size) as
        Array<IBarcodeScannerErrorOccurredEventArgs?>
  }
}
