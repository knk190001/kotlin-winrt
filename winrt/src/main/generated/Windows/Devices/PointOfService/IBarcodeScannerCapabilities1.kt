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

@ABIMarker(IBarcodeScannerCapabilities1.ABI::class)
@Signature("{8e5ab3e9-0e2c-472f-a1cc-ee8054b6a684}")
@Guid("8e5ab3e90e2c472fa1ccee8054b6a684")
@WinRTInterface("8e5ab3e90e2c472fa1ccee8054b6a684")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerCapabilities1.ByReference::class)
public interface IBarcodeScannerCapabilities1 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSoftwareTriggerSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerCapabilities1> {
    public override fun getValue() = ABI.makeIBarcodeScannerCapabilities1(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerCapabilities1_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerCapabilities1 {
    public val __1690631170_Ptr: Pointer?

    public val _1690631170_VtblPtr: Pointer?
      get() = __1690631170_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSoftwareTriggerSupported(): Boolean {
      val fnPtr = _1690631170_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1690631170_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarcodeScannerCapabilities1_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1690631170_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerCapabilities1, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e5ab3e90e2c472fa1ccee8054b6a684")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerCapabilities1(ptr: Pointer?): WithDefault =
        IBarcodeScannerCapabilities1_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerCapabilities1 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerCapabilities1(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerCapabilities1): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1690631170_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerCapabilities1):
        Array<IBarcodeScannerCapabilities1?> = (elements as
        Array<IBarcodeScannerCapabilities1?>).castToImpl<IBarcodeScannerCapabilities1,IBarcodeScannerCapabilities1_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerCapabilities1?> =
        arrayOfNulls<IBarcodeScannerCapabilities1_Impl>(size) as
        Array<IBarcodeScannerCapabilities1?>
  }
}
