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

@ABIMarker(ISlipPrinterCapabilities2.ABI::class)
@Signature("{6ff89671-2d1a-5000-87c2-b0851bfdf07e}")
@Guid("6ff896712d1a500087c2b0851bfdf07e")
@WinRTInterface("6ff896712d1a500087c2b0851bfdf07e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlipPrinterCapabilities2.ByReference::class)
public interface ISlipPrinterCapabilities2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReverseVideoSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsStrikethroughSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsSuperscriptSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsSubscriptSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsReversePaperFeedByLineSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsReversePaperFeedByMapModeUnitSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlipPrinterCapabilities2> {
    public override fun getValue() = ABI.makeISlipPrinterCapabilities2(pointer.getPointer(0))

    public fun setValue(value: ISlipPrinterCapabilities2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlipPrinterCapabilities2 {
    public val __2044640063_Ptr: Pointer?

    public val _2044640063_VtblPtr: Pointer?
      get() = __2044640063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReverseVideoSupported(): Boolean {
      val fnPtr = _2044640063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2044640063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsStrikethroughSupported(): Boolean {
      val fnPtr = _2044640063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2044640063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsSuperscriptSupported(): Boolean {
      val fnPtr = _2044640063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2044640063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsSubscriptSupported(): Boolean {
      val fnPtr = _2044640063_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2044640063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsReversePaperFeedByLineSupported(): Boolean {
      val fnPtr = _2044640063_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2044640063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsReversePaperFeedByMapModeUnitSupported(): Boolean {
      val fnPtr = _2044640063_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2044640063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISlipPrinterCapabilities2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2044640063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlipPrinterCapabilities2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ff896712d1a500087c2b0851bfdf07e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlipPrinterCapabilities2(ptr: Pointer?): WithDefault =
        ISlipPrinterCapabilities2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlipPrinterCapabilities2 {
      val address = segment.toRawLongValue()
      return makeISlipPrinterCapabilities2(Pointer(address))
    }

    public override fun toNative(obj: ISlipPrinterCapabilities2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2044640063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlipPrinterCapabilities2):
        Array<ISlipPrinterCapabilities2?> = (elements as
        Array<ISlipPrinterCapabilities2?>).castToImpl<ISlipPrinterCapabilities2,ISlipPrinterCapabilities2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlipPrinterCapabilities2?> =
        arrayOfNulls<ISlipPrinterCapabilities2_Impl>(size) as Array<ISlipPrinterCapabilities2?>
  }
}
