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

@ABIMarker(IBarcodeScannerCapabilities2.ABI::class)
@Signature("{f211cfec-e1a1-4ea8-9abc-92b1596270ab}")
@Guid("f211cfece1a14ea89abc92b1596270ab")
@WinRTInterface("f211cfece1a14ea89abc92b1596270ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerCapabilities2.ByReference::class)
public interface IBarcodeScannerCapabilities2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsVideoPreviewSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerCapabilities2> {
    public override fun getValue() = ABI.makeIBarcodeScannerCapabilities2(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerCapabilities2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerCapabilities2 {
    public val __1690631169_Ptr: Pointer?

    public val _1690631169_VtblPtr: Pointer?
      get() = __1690631169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsVideoPreviewSupported(): Boolean {
      val fnPtr = _1690631169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1690631169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarcodeScannerCapabilities2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1690631169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerCapabilities2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f211cfece1a14ea89abc92b1596270ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerCapabilities2(ptr: Pointer?): WithDefault =
        IBarcodeScannerCapabilities2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeScannerCapabilities2 {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerCapabilities2(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerCapabilities2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1690631169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerCapabilities2):
        Array<IBarcodeScannerCapabilities2?> = (elements as
        Array<IBarcodeScannerCapabilities2?>).castToImpl<IBarcodeScannerCapabilities2,IBarcodeScannerCapabilities2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeScannerCapabilities2?> =
        arrayOfNulls<IBarcodeScannerCapabilities2_Impl>(size) as
        Array<IBarcodeScannerCapabilities2?>
  }
}
