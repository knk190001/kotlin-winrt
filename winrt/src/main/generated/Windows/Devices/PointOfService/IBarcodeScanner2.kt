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

@ABIMarker(IBarcodeScanner2.ABI::class)
@Signature("{89215167-8cee-436d-89ab-8dfb43bb4286}")
@Guid("892151678cee436d89ab8dfb43bb4286")
@WinRTInterface("892151678cee436d89ab8dfb43bb4286")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScanner2.ByReference::class)
public interface IBarcodeScanner2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoDeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScanner2> {
    public override fun getValue() = ABI.makeIBarcodeScanner2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScanner2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScanner2 {
    public val __21436011_Ptr: Pointer?

    public val _21436011_VtblPtr: Pointer?
      get() = __21436011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoDeviceId(): String? {
      val fnPtr = _21436011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__21436011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScanner2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __21436011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScanner2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("892151678cee436d89ab8dfb43bb4286")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScanner2(ptr: Pointer?): WithDefault = IBarcodeScanner2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScanner2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScanner2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScanner2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__21436011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScanner2): Array<IBarcodeScanner2?> = (elements as
        Array<IBarcodeScanner2?>).castToImpl<IBarcodeScanner2,IBarcodeScanner2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScanner2?> =
        arrayOfNulls<IBarcodeScanner2_Impl>(size) as Array<IBarcodeScanner2?>
  }
}
