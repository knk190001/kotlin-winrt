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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarcodeScannerStatics2.ABI::class)
@Signature("{b8652473-a36f-4007-b1d0-279ebe92a656}")
@Guid("b8652473a36f4007b1d0279ebe92a656")
@WinRTInterface("b8652473a36f4007b1d0279ebe92a656")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerStatics2.ByReference::class)
public interface IBarcodeScannerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerStatics2> {
    public override fun getValue() = ABI.makeIBarcodeScannerStatics2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerStatics2 {
    public val __224285078_Ptr: Pointer?

    public val _224285078_VtblPtr: Pointer?
      get() = __224285078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String? {
      val fnPtr = _224285078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__224285078_Ptr, marshalToNative(connectionTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __224285078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8652473a36f4007b1d0279ebe92a656")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerStatics2(ptr: Pointer?): WithDefault =
        IBarcodeScannerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerStatics2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__224285078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerStatics2): Array<IBarcodeScannerStatics2?>
        = (elements as
        Array<IBarcodeScannerStatics2?>).castToImpl<IBarcodeScannerStatics2,IBarcodeScannerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerStatics2?> =
        arrayOfNulls<IBarcodeScannerStatics2_Impl>(size) as Array<IBarcodeScannerStatics2?>
  }
}
