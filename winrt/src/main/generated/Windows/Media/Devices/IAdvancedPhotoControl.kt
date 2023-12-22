package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAdvancedPhotoControl.ABI::class)
@Signature("{c5b15486-9001-4682-9309-68eae0080eec}")
@Guid("c5b1548690014682930968eae0080eec")
@WinRTInterface("c5b1548690014682930968eae0080eec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedPhotoControl.ByReference::class)
public interface IAdvancedPhotoControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Supported(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedModes(): IVectorView<AdvancedPhotoMode?>?

  @InterfaceMethod(2)
  public fun get_Mode(): AdvancedPhotoMode?

  @InterfaceMethod(3)
  public fun Configure(settings: AdvancedPhotoCaptureSettings?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedPhotoControl> {
    public override fun getValue() = ABI.makeIAdvancedPhotoControl(pointer.getPointer(0))

    public fun setValue(value: IAdvancedPhotoControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedPhotoControl {
    public val __51137874_Ptr: Pointer?

    public val _51137874_VtblPtr: Pointer?
      get() = __51137874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Supported(): Boolean {
      val fnPtr = _51137874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__51137874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedModes(): IVectorView<AdvancedPhotoMode?>? {
      val fnPtr = _51137874_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AdvancedPhotoMode?>>()
      val hr = fn.invokeHR(arrayOf(__51137874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AdvancedPhotoMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Mode(): AdvancedPhotoMode? {
      val fnPtr = _51137874_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdvancedPhotoMode>()
      val hr = fn.invokeHR(arrayOf(__51137874_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdvancedPhotoMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Configure(settings: AdvancedPhotoCaptureSettings?): Unit {
      val fnPtr = _51137874_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__51137874_Ptr, marshalToNative(settings),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdvancedPhotoControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __51137874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedPhotoControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5b1548690014682930968eae0080eec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedPhotoControl(ptr: Pointer?): WithDefault =
        IAdvancedPhotoControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedPhotoControl {
      val address = segment.toRawLongValue()
      return makeIAdvancedPhotoControl(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedPhotoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__51137874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedPhotoControl): Array<IAdvancedPhotoControl?> =
        (elements as
        Array<IAdvancedPhotoControl?>).castToImpl<IAdvancedPhotoControl,IAdvancedPhotoControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedPhotoControl?> =
        arrayOfNulls<IAdvancedPhotoControl_Impl>(size) as Array<IAdvancedPhotoControl?>
  }
}
