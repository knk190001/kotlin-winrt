package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IClaimedBarcodeScanner1.ABI::class)
@Signature("{f61aad0c-8551-42b4-998c-970c20210a22}")
@Guid("f61aad0c855142b4998c970c20210a22")
@WinRTInterface("f61aad0c855142b4998c970c20210a22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedBarcodeScanner1.ByReference::class)
public interface IClaimedBarcodeScanner1 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartSoftwareTriggerAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun StopSoftwareTriggerAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedBarcodeScanner1> {
    public override fun getValue() = ABI.makeIClaimedBarcodeScanner1(pointer.getPointer(0))

    public fun setValue(value: IClaimedBarcodeScanner1_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedBarcodeScanner1 {
    public val __1237950185_Ptr: Pointer?

    public val _1237950185_VtblPtr: Pointer?
      get() = __1237950185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartSoftwareTriggerAsync(): IAsyncAction? {
      val fnPtr = _1237950185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1237950185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StopSoftwareTriggerAsync(): IAsyncAction? {
      val fnPtr = _1237950185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1237950185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedBarcodeScanner1_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237950185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedBarcodeScanner1, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f61aad0c855142b4998c970c20210a22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedBarcodeScanner1(ptr: Pointer?): WithDefault =
        IClaimedBarcodeScanner1_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedBarcodeScanner1 {
      val address = segment.toRawLongValue()
      return makeIClaimedBarcodeScanner1(Pointer(address))
    }

    public override fun toNative(obj: IClaimedBarcodeScanner1): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237950185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedBarcodeScanner1): Array<IClaimedBarcodeScanner1?>
        = (elements as
        Array<IClaimedBarcodeScanner1?>).castToImpl<IClaimedBarcodeScanner1,IClaimedBarcodeScanner1_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedBarcodeScanner1?> =
        arrayOfNulls<IClaimedBarcodeScanner1_Impl>(size) as Array<IClaimedBarcodeScanner1?>
  }
}
